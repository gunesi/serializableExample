package com.serialization.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

public class SerialClass implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date time;
	private List<String> testList;
	private List<Person> personList;

	private TreeNode treeNode;
	private Student student;
	
	private Book book;
	
	
    public SerialClass() {
        time = Calendar.getInstance().getTime();
        
        testList = new ArrayList<String>();
        testList.add("ismail");
        
        personList = new ArrayList<>();
        Person person = new Person();
        person.setName("ismail");
        person.setSurname("güneþ");
        personList.add(person);
        
        treeNode = new DefaultTreeNode("root Node");
        
        student = new Student();
        student.setSchoolNumber("10L919212");
        
        book = new BookImp();
    }

	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public List<String> getTestList() {
		return testList;
	}
	public void setTestList(List<String> testList) {
		this.testList = testList;
	}

	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public TreeNode getTreeNode() {
		return treeNode;
	}
	public void setTreeNode(TreeNode treeNode) {
		this.treeNode = treeNode;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
