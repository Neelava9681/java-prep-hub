package com.jspider.treeset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable{
	int id;
	boolean emp;
	String name;
	Employee(int id,boolean emp,String name){
		this.id=id;
		this.emp=emp;
		this.name=name;
		
	}
	@Override
	public int compareTo(Object e) {
		Employee ee=(Employee)e;
		if(this.id>ee.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
//	@Override
//	public String toString() {
//		return "[id=" + id + ", emp=" + emp + ", name=" + name + "]"+"\n";
//	}
//	
	@Override
	public String toString() {
		
		return this.id+"\t\t"+this.name+"\t\t"+this.emp+"\n";
	}
	
	
	
	
}
public class Program1 {

	public static void main(String[] args) {
		SortedSet<Employee> ss= new TreeSet();
		
		
		Employee e1= new Employee(1, false, "Neel");
		Employee e2= new Employee(2, true, "jot");
		Employee e3= new Employee(3, false, "soham");
		
		TreeSet ts=new TreeSet(ss);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
//		for(Object e:ts) {
//			
//			System.out.println(e);
//		}
//		
		TreeSet t2=new TreeSet();
		
	
		System.out.println(t2);
		

	}

}
