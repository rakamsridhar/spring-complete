package com.springdemo.springComplete.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="employeecomplete")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Max(value=2000,message="please proper id")
	private int id;
	
	@NotEmpty(message="please enter username")
	@Pattern(regexp="[a-z]{4,6}", message="Please enter 4-6 small case character")
	private String name;
	private float salary;
	private int age;
	
}
