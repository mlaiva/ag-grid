package com.SpringManagmentSystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Employee")
public class Employee {
	
	@Id
	private String id;
	private String activity;
	private String first;
	private String last;
	private String start;
	private String finish;
	private String status;
	
	
	public Employee(String activity,String first, String last,String start,String finish,String status){
		
		this.activity=activity;
		this.first=first;
		this.last= last;
		this.start=start;
		this.finish=finish;
		this.status=status;
		
	}
	public Employee() {
		
		
	}
	public String getActivity() {
		return activity;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getStart() {
		return start;
	}

	public String getFinish() {
		return finish;
	}

	public String getStatus() {
		return status;
	}

	public String getID(){
		return id;
	} 
}
