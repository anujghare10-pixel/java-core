package com.service;

import com.dao.Studentdao;
import com.entities.Student;

public class Studentservice {

	public void insertData(Student s) throws Exception {
		Studentdao sd = new Studentdao();
		sd.insertData(s);
	}

	public void getallrecord()throws Exception
	{
		Studentdao sd=new Studentdao();
		sd.getallrecord();
	}
	public void updaterecord() throws Exception
	{
		Studentdao sd=new Studentdao();
		sd.updaterecord();
	}
	public void deleterecord() throws Exception
	{
		Studentdao sd=new Studentdao();
		sd.deleterecord();
	}
}