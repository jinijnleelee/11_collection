package edu.kh.collection.model.vo;

import java.util.Objects;

public class Member {

	private String id;
	private String pw;
	private int age;
	
	
	
	public Member() {}
	
	public Member(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	//Object.equals() 오버라이딩
	// - 현재 객체와 매개변수로 전달 받은 객체의 필드가 같은지 
	//	 비교하는 형태로 오버라이딩
	
	@Override
	public int hashCode(){
		return Objects.hash(id,pw,age);
	} //아니 이거 왜안되는거야?
	
	//알트 + 쉬프트 + s + 제너레이트 헤쉬코드 이퀄스
	public boolean equals(Object obj) {
		Member other = (Member)obj; //다운캐스팅
		//뭘받을지 모르니까 최상위 Object로 받고 이  obj를 (Member)로
		//다운캐스팅해야 other
		return this.id.equals(other.id) && 
				this.pw.equals(other.pw) && 
				this.age == other.age;
		
		
	}

	
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}
	
	
	

	
	
	
	//Object.hashCode() 오버라이딩
	
	
}
