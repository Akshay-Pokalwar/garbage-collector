package com.project.core.dto;

public class Ping {
	private String k;
	private String v;
	
	public Ping() {
		// TODO Auto-generated constructor stub
	}
	
	public Ping(String k, String v) {
		super();
		this.k = k;
		this.v = v;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
	
	
}
