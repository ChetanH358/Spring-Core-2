package constructor.primitive_dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("constructor/primitive_dependency/sprinfconfig2.xml");
		Employee c2 = (Employee) c1.getBean("abc");
		Employee c3 = (Employee) c1.getBean("pqr");
		System.out.println(c2);
		System.out.println(c3);

//		interface try to create object for multiple employee as interface donot create object internally it create 
//		object for implementation classe of set interface

//		System.out.println(c2.getEmployees().getClass());
	}

}
