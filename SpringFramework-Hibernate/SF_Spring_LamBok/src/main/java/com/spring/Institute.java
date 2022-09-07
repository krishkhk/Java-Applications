package com.spring;

import java.util.List;
import java.util.Set;

import lombok.Setter;

@Setter
public class Institute {
	private String name;
	private List<String>courses;
	private Set<String>faculties;
	private List<Student>students;
	public void display()
	{
		System.out.println("InstituteName:"+name);
		System.out.println("course Information:");
		courses.forEach(c->System.out.println(c));
		System.out.println("Faculty Information");
		faculties.stream().forEachOrdered(f->System.out.println(f));
		System.out.println("Student Info");
		for(Student stu:students) {
			System.out.println(stu);
		}
		
		
	}
	

	
}
