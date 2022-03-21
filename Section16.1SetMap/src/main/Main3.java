package main;

public class Main3 {
	public static void main(String[] args) {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("Hello trung tam java");
		stringbuilder.append("I am java");
		stringbuilder.append("I am joining javacore 19");
		String s = stringbuilder.toString();
		System.out.println(s);

		System.out.println("-----");

		StringBuffer stringbuffer = new StringBuffer("Hello trung tam java");
		stringbuffer.append("I am java");
		stringbuffer.append("I am joining javacore 19");
		System.out.println(stringbuffer.toString());
	}

}
