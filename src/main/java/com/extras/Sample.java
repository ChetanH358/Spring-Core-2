package com.extras;

public class Sample {
	public Sample(double d1, double d2) {
		System.out.println("double-type arguments");
	}

	public Sample(int a, int b) {
		System.out.println("integer-type arguments");
		System.out.println("a : "+a+" b: "+b);
	}

	public Sample(String s1, String s2) {
		System.out.println("string-type arguments");
	}

}
