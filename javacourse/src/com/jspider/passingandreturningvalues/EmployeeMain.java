package com.jspider.passingandreturningvalues;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = Manager.createEmp();
		Manager.disp(e1);
		Employee e2 = Manager.createEmp();
		Manager.disp(e2);

	}

}
