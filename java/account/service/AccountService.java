package account.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.entity.Account;
import account.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository ar;
	
	//로그인 서비스
	public String login_service(Account act,HttpServletRequest req) {
		Account account=ar.findByid(act.getId());
		if(account!=null) {
			if(account.getPwd().equals(act.getPwd())) {
				HttpSession session=req.getSession();
				session.setAttribute("id", account.getId());
				return "YES"; 
			}
		}
		return "NO";
		
	}
	
	//아이디 이메일로 찾기 서비스
	public String id_found_email(Account act) {
		Account account=ar.findByemail(act.getEmail());
		if(account!=null) {
			if(account.getName().equals(act.getName())) {
				return account.getId();
			}else {
				return "정보를 다시 확인해 주세요.";
			}
		}else {
			return "아이디가 존재하지 않습니다.";
		}
	}
	
	//아이디 휴대폰 번호로 찾기 서비스
	public String id_found_phone(Account act) {
		Account account=ar.findByphone(act.getPhone());
		if(account!=null) {
			if(account.getName().equals(act.getName())) {
				return account.getId();
			}else {
				return "정보를 다시 확인해 주세요.";
			}
		}else {
			return "아이디가 존재하지 않습니다.";
		}
	}
	
	//비밀번호 찾기 서비스
	public String pw_found_service(Account act) {
		Account account=ar.findByid(act.getId());
		
		if(account!=null) {
			if(account.getName().equals(act.getName())&&account.getEmail().equals(act.getEmail())) {
				return account.getPwd();
			}else {
				return "입력 정보가 틀립니다.";
			}
		}else {
			return "아이디가 존재하지 않습니다.";
		}
	}
	
	//회원가입 서비스
	public void regist_service(Account act) {
		ar.save(act);
	}
	
	//아이디 중복 체크
	public String id_check(Account act) {
		Account account=ar.findByid(act.getId());
		if(account!=null) {
			return "NO";
		}else {
			return "YES";
		}
	}
	//휴대폰 번호 중복 체크
	public String phone_check(Account act) {
		Account account=ar.findByphone(act.getPhone());
		if(account!=null) {
			System.out.println(account.getPhone());
			return "NO";
		}else {
			return "YES";
		}
	}
	//이메일 중복 체크
	public String email_check(Account act) {
		Account account=ar.findByemail(act.getEmail());
		if(account!=null) {
			System.out.println(account.getEmail());
			return "NO";
		}else {
			return "YES";
		}
	}
}
