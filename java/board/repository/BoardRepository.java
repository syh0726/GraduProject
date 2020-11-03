package board.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {
	public Page<Board> findAll(Pageable page);	//게시물 목록 불러오기
	
	public Board findBynum(int num);		//게시물 조회
	public Page<Board> findBycontentContainingOrderByNumDesc(String content,Pageable pageable);	//본문 검색
	public Page<Board> findBytitleContainingOrderByNumDesc(String title,Pageable pageable);	//제목 검색
	public Page<Board> findBytitleContainingOrContentContainingOrderByNumDesc(String title,String content,Pageable pageable);	//전체 검색
	
	@Transactional 
	public void deleteAllBynum(int num);		//글 삭제
}
	