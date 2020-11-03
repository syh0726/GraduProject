package afk.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: afk
 *
 */
@Entity
@Table(name="afk")
public class Afk implements Serializable {
	@Id
	private int lv;
	private int gold;
	private int exp;
	private int essence;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getEssence() {
		return essence;
	}

	public void setEssence(int essence) {
		this.essence = essence;
	}

	private static final long serialVersionUID = 1L;

	public Afk() {
		super();
	}
   
}
