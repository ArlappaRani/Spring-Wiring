package com.spring.wiring.SpringProject5Wiring;

public class Trainer {
	
	int t_id;
	String t_Name;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int t_id, String t_Name) {
		super();
		this.t_id = t_id;
		this.t_Name = t_Name;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_Name() {
		return t_Name;
	}
	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}
	@Override
	public String toString() {
		return "Trainer [t_id=" + t_id + ", t_Name=" + t_Name + "]";
	}
	
	

}
