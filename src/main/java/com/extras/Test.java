package com.extras;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* -------------->>>> CONSTRUCTOR AMBIQUITY <<<<------------------*/

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("com/extras/springconfig.xml");
		Sample c2 = (Sample)c1.getBean("sample_1");
		System.out.println(c2);
//		we can change the index postion's of the element's by using index attribute (starts from 0)
//		in get bean call any one of the bean object
//		contructor ambiquty concept 
//		-->> type attribute is used to overcome from the constructor amibiquty
//		spring constructor will execute the constructor of string type -> 1-st priority
//		spring constructor will execute the constructor of integer type -> 2-nd priority
//		spring constructor will execute the constructor of double type -> 3-rd priority

	}

}
