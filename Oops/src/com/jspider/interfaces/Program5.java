package com.jspider.interfaces;

interface Translator{
	void translate();
}

class Kanada implements Translator{
	@Override
	public void translate() {
		System.out.println("converted to kananda");
	}
}

class English implements Translator{
	@Override
	public void translate() {
		System.out.println("converted to English");
	}
}

class Engine{
	static void convert(Translator t) {
		if(t !=null){
			t.translate();
		}
	}
}


public class Program5 {

	public static void main(String[] args) {
		Kanada ref=new Kanada();
		Engine.convert(ref);
		English obj=new English();
		Engine.convert(obj);

	}

}
