package com.jspider.hasarelationship;
class Dep{
	void test() {
		
	}
}
class Teacher{
	void teach() {
		
	}
}

class College{
	Dep d1=new Dep();
	Teacher t1=new Teacher();
}

public class Program3 {
	public static void main(String[] args) {
		College c1=new College();
		c1.d1.test();
		c1.t1.teach();

	}

}
