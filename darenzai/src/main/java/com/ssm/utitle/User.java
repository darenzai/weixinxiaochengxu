package com.ssm.utitle;

public class User {
	private int dorm;
	private String time;
	private String reason;
	private String tongbao;
	private String rang;
	
	
	
	
	
	public User(int dorm, String time, String reason, String tongbao, String rang) {
		super();
		this.dorm = dorm;
		this.time = time;
		this.reason = reason;
		this.tongbao = tongbao;
		this.rang = rang;
	}
	public String getRang() {
		return rang;
	}
	public void setRang(String rang) {
		this.rang = rang;
	}
	@Override
	public String toString() {
		return "User [dorm=" + dorm + ", time=" + time + ", reason=" + reason + ", tongbao=" + tongbao + ", rang="
				+ rang + "]";
	}
	public int getDorm() {
		return dorm;
	}
	public void setDorm(int dorm) {
		this.dorm = dorm;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTongbao() {
		return tongbao;
	}
	public void setTongbao(String tongbao) {
		this.tongbao = tongbao;
	}
;
}
