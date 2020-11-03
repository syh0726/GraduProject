package account.entity;

import java.io.Serializable;
import java.util.Objects;

public class AccountId implements Serializable{
	private String id;
	private String email;
	private String phone;
	
	public AccountId() {
	}
	
	public AccountId(String id,String email,String phone) {
		this.id=id;
		this.email=email;
		this.phone=phone;
	}
	

	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null||getClass()!=o.getClass())return false;
		AccountId accountid=(AccountId)o;
		return 	id.equals(accountid.id)&&email.equals(accountid.email)&&phone.equals(accountid.phone);
	}
	
	public int hashCode() {
		return Objects.hash(id,email,phone);
	}
}
