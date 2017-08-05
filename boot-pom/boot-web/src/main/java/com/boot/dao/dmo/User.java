package com.boot.dao.dmo;

import java.util.List;

public class User {
	 private int age;
	 
	 private List<Integer> books;

	 private int sex;
	 public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public List<Integer> getBooks() {
		return books;
	}
	public void setBooks(List<Integer> books) {
		this.books = books;
	}
	private int high;

}
