package com.mycodefu.ai.builder;

public class thought {
	private String s;
	public thought(String thought) {
		s = thought;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		return s;
	}
}
