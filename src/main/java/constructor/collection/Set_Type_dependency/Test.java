package constructor.collection.Set_Type_dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("constructor/collection/Set_Type_dependency/springconfig.xml");
		Ipl c2 = (Ipl)c1.getBean("ipl");
		System.out.println(c2);

	}

}
