package constructor.reference_dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("constructor/reference_dependency/springconfig.xml");
		Vehicle c2 = (Vehicle) c1.getBean("vehicle");
		System.out.println(c2);

	}

}
