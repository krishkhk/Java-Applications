package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	public int Id;
	public String Name;
	public double Salary;
	public int salary;
	public Employee(int id, String name, double salary) {
		Id = id;
		Name = name;
		Salary = salary;
	}
	
	
	public String toString() {
		return "\t" + Id + "\t" + Name + "\t" + Salary ;
	}
	
}
public class StreamObjects {

	public static void main(String[] args) {
		
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101, "jhon", 11000));
		emp.add(new Employee(102, "steve", 28000));
		emp.add(new Employee(121, "ruby", 310000));
		emp.add(new Employee(141, "kane", 5000));
		emp.add(new Employee(141, "kane", 100000));
		
		for(Employee e:emp){
			System.out.println(e);
		}
		
		List<Employee> MaxSal=emp.stream().filter(i ->(i.Salary>28000)).collect(Collectors.toList());
		System.out.println(MaxSal);
		
		
		List<Double> SalList=emp.stream().filter(i ->(i.Salary>28000)).map(i ->i.Salary).collect(Collectors.toList());
		System.out.println("---------");
		System.out.println(SalList);
		
		
		
		
		

	}

}
