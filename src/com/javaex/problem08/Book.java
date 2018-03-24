package com.javaex.problem08;

public class Book {

	int bookNo;
	String title;
	String author;
	int stateCode;

	Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode=1;
	}

	public void setbookNo() {
		this.bookNo = bookNo;
	}

	public void setTitle() {
		this.title = title;
	}

	public void setAuthor() {
		this.author = author;
	}

	public int getbookNo() {
		return bookNo;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void rent() { //대여기능을  수행하는 메소드로
        stateCode=0;
        System.out.println(title+"이/(가) 대여 됐습니다.");
	}

	public void print() {
		
		if(stateCode==1) {
			 System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+" , 유무: 재고 있음");
		}else if(stateCode==0) {
			 System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+" , 유무: 대여중");
		}
	}

}
