package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import board.entity.Board;
import board.service.BoardService;
import comment.entity.Comment;
import comment.service.CommentService;

@Controller
public class BoardController {
	@Autowired
	BoardService bsr;
	@Autowired
	CommentService csr;
	
	//게시글 목록
	@RequestMapping("/BoardList")
	public String GetBoardList (Model model,@RequestParam(value="page",defaultValue="1") int page,HttpServletRequest req) {
		System.out.println("게시판리스트 콘트롤러 실행");
		Page<Board> BoardList=bsr.getBoardList(page);
		model.addAttribute("boardList",BoardList);
		model.addAttribute("pageCnt",bsr.count_page());
		HttpSession session=req.getSession();
		String id=(String)session.getAttribute("id");
		if(id!=null) {
			return "board/BoardList";
		}else {
			return "redirect:login";
		}
		
	}
	
	//게시글 검색
	@RequestMapping("/search_board")
	public String searchBoard(Model model,@RequestParam(value="Conditon",required=false) String Condition,@RequestParam(value="Keyword",required=false) String Keyword,@RequestParam(value="page",defaultValue="1") int page,HttpServletRequest req) {
		HttpSession session=req.getSession();
		
		System.out.println("게시글 찾기 서비스");		
		if(session.getAttribute("Condition") == null) {
			session.setAttribute("Condition", Condition);
		}else {
			if(Condition==null) {
				Condition=(String) session.getAttribute("Condition");
			}
		}
		
		if(session.getAttribute("Keyword")==null) {
			session.setAttribute("Keyword", Keyword);
		}else {
			if(Keyword==null) {
				Keyword=(String)session.getAttribute("Keyword");
			}
		}
		System.out.println(Condition+" "+Keyword);
		
		Page<Board> boardList=bsr.search_Board(Condition, Keyword, page);
		long size=boardList.getTotalElements()-(page*15);
		model.addAttribute("boardList", boardList);
		
		System.out.println(size);
		
		if(size<=0) {
			model.addAttribute("pageCnt",page);
		}else {
			model.addAttribute("pageCnt",page+1);
		}
		
		return "board/BoardSearchList";
	}
	
	//게시글
	@RequestMapping("/getBoard")
	public String GetBoard(Model model,@RequestParam("num") int num) {
		System.out.println("글 확인 컨트롤러");
		model.addAttribute("board",bsr.getBoard(num));
		model.addAttribute("comment",csr.get_comment(num));
		return "board/getBoard";
	}
	
	//게시글 작성창
	@RequestMapping("/insertBoard")
	public String InsertBoard(Model model) {
		System.out.println("게시글 작성 컨트롤러");
		return "board/insertBoard";
	}
	//게시글 등록
	@RequestMapping("/insert_service")
	public String insert_board(Model model,Board board,HttpServletRequest req) {
		System.out.println("글 등록 서비스");
		bsr.insert_board(board,req);
		return "redirect:BoardList";
	}
	
	//게시글 수정
	@RequestMapping("/updateBoard")
	public String UpdateBoard(Model model,@RequestParam("num") int num) {
		System.out.println("게시글 업데이트");
		model.addAttribute("board",bsr.getBoard(num));
		return "board/updateBoard";
	}
	
	//게시글 수정 서비스
	@RequestMapping("/update_service")
	public String update_board(Model model,Board board,@RequestParam("num") int num) {
		System.out.println("게시글 수정 서비스");
		bsr.update_board(board);
		return "redirect:BoardList";
	}
		
	//게시글 삭제 서비스
	@RequestMapping("/deleteBoard")
	public String delete_board(Model model,@RequestParam("num") int num) {
		System.out.println("게시글 삭제 서비스");
		bsr.delete_board(num);
		return "redirect:BoardList";
	}
}
