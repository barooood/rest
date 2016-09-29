package Controller;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	static int london_id=2221;
	int new_york_id;
	int tokyo_id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		Repo london = (Repo) container.getBean("london_bean");
		//Repo new_york = (Repo) container.getBean("new_york_bean");
		//Repo tokyo = (Repo) container.getBean("tokyo_bean");
		
		Assert.assertNotNull(london);
		int amount = london.getAmount(london_id);
		
		System.out.println(amount);
		
	}

}
