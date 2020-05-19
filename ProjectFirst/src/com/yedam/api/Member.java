package com.yedam.api;

public class Member {//extends Object{
	public String id;
	
	public Member() {
		//기본생성자
	}
	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		return id.hashCode();
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		Member m = (Member) obj;
		return this.id.equals(m.id);
		
	}
	@Override
	public String toString() {
//		return super.toString();
		return "id값은"+this.id;
	}
	
	
}
