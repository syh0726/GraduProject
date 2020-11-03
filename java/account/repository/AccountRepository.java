package account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import account.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {
	public Account findByid(String id);				//로그인 ,회원가입 중복체크 사용
	public Account findByphone(String phone);		//아이디 찾기,회원가입 중복체크 사용
	public Account findByemail(String email);		//아이디 찾기,회원가입 중복체크 사용
}
