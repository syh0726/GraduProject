package account.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import account.entity.Account;
import account.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	AccountService as;
	//로그인 페이지
	@RequestMapping("login")
	public String Login(Model model,Account account,HttpServletRequest req) {
		System.out.println("로그인 컨트롤러");
		String result=as.login_service(account,req);
		System.out.println(result);
		HttpSession session=req.getSession();
		String id=(String)session.getAttribute("id");
		if(id==null) {
		if(result.equals("YES")) {
				return "redirect:BoardList";
			}else {
				return "account/login";
			}
		}else {
			return "redirect:BoardList";
		}
	}
	
	//아이디 찾기 페이지
	@RequestMapping("/id_found")
	public String id_found(Model model,Account account) {
		System.out.println("아이디 찾기 컨트롤러");
		return "account/id_found";
	}
	
	//이메일로 아이디 찾기
	@RequestMapping("/id_found_email")
	public String id_found_email(Model model,Account account) {
		System.out.println("이메일로 아이디 찾기");
		String id=as.id_found_email(account);
		model.addAttribute("user_id",id);
		return "account/id_result";
	}
	//휴대폰으로 아이디 찾기
	@RequestMapping("/id_found_phone")
	public String id_found_phone(Model model,Account account) {
		System.out.println("휴대폰번호로 아이디 찾기");
		String id=as.id_found_phone(account);
		model.addAttribute("user_id",id);
		return "account/id_result";
	}
	//비밀번호 찾기 페이지
	@RequestMapping("/pw_found")
	public String pw_found(Model model) {
		System.out.println("비밀번호 찾기 컨트롤러");
		return "account/pw_found";
	}
	
	//비밀번호 찾기 서비스
	@RequestMapping("/pwd_service")
	public String pwd_find(Model model,Account account) {
		System.out.println("비밀번호 찾기 서비스");
		String result=as.pw_found_service(account);
		model.addAttribute("pw",result);
		return "account/pwd_result";
	}
	//회원가입 페이지
	@RequestMapping("/regist")
	public String regist(Model model) {
		System.out.println("회원가입 컨트롤러");
		return "account/regist";
	}
	
	//회원가입 서비스
	@RequestMapping("/regist_service")
	public String regist_service(Model model,Account act) {
		as.regist_service(act);
		return "account/login";
	}
	
	//아이디 중복체크
	@RequestMapping("idCheck")
	public @ResponseBody String id_check(Model model,Account account) {
		System.out.println("아이디 중복 체크");
		String str=as.id_check(account);
		System.out.println(str);
		return str;
	}
	//이메일 중복체크
	@RequestMapping("emailCheck")
	public @ResponseBody String email_check(Model model,Account account) {
		System.out.println("이메일 중복 체크");
		String str=as.email_check(account);
		System.out.println(str);
		return str;
	}
	
	//휴대폰번호 중복체크
	@RequestMapping("phoneCheck")
	public @ResponseBody String phone_check(Model model,Account account) {
		System.out.println("휴대폰 중복 체크");
		String str=as.phone_check(account);
		System.out.println(str);
		return str;
	}
	
	//로그아웃
	@RequestMapping("/logOut")
	public String logOut(Model model,HttpServletRequest req) {
		HttpSession session=req.getSession();
		session.invalidate();
		return "redirect:login";
	}
	
	
}
