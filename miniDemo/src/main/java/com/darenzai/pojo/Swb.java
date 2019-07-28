package com.darenzai.pojo;

public class Swb {
	
	private int id;
	private int dorm;
	private String demo;
	private String reason;
	private String tongbao;
	private String dengji;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDorm() {
		return dorm;
	}


	public void setDorm(int dorm) {
		this.dorm = dorm;
	}


	public String getDemo() {
		return demo;
	}


	public void setDemo(String demo) {
		this.demo = demo;
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


	public String getDengji() {
		return dengji;
	}


	public void setDengji(String dengji) {
		this.dengji = dengji;
	}


	@Override
	public String toString() {
		return "swb [id=" + id + ", dorm=" + dorm + ", demo=" + demo + ", reason=" + reason + ", tongbao=" + tongbao
				+ ", dengji=" + dengji + "]";
	}
}
