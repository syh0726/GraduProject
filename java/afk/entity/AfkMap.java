package afk.entity;

import javax.persistence.Transient;

public class AfkMap {

	private String start;
	private String end;
	private String n_exp;
	private String n_gold;
	private String n_essence;
	private String m_exp;
	private String m_gold;
	private String h_essence;
	
	private int max_hour;
	private int max_min;
	private int max_sec;
		
	public int getMax_hour() {
		return max_hour;
	}
	public void setMax_hour(int max_hour) {
		this.max_hour = max_hour;
	}
	public int getMax_min() {
		return max_min;
	}
	public void setMax_min(int max_min) {
		this.max_min = max_min;
	}
	public int getMax_sec() {
		return max_sec;
	}
	public void setMax_sec(int max_sec) {
		this.max_sec = max_sec;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getN_exp() {
		return n_exp;
	}
	public void setN_exp(String n_exp) {
		this.n_exp = n_exp;
	}
	public String getN_gold() {
		return n_gold;
	}
	public void setN_gold(String n_gold) {
		this.n_gold = n_gold;
	}
	public String getN_essence() {
		return n_essence;
	}
	public void setN_essence(String n_essence) {
		this.n_essence = n_essence;
	}
	
	
	public String getM_exp() {
		return m_exp;
	}
	public void setM_exp(String m_exp) {
		this.m_exp = m_exp;
	}
	public String getM_gold() {
		return m_gold;
	}
	public void setM_gold(String m_gold) {
		this.m_gold = m_gold;
	}
	
	public String getH_essence() {
		return h_essence;
	}
	public void setH_essence(String h_essence) {
		this.h_essence = h_essence;
	}
	public AfkMap() {
		super();
	}
		
}
