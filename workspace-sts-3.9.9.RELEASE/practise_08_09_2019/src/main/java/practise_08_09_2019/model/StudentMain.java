package practise_08_09_2019.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practise_08_09_2019.configuration.bean.StudentBean;

public class StudentMain {
 
	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	StudentBean stObj = (StudentBean) context.getBean("studentObj");
	System.out.println(stObj.getId());
//	Student sObj = context.getBean("theStudent",Student.class);
//	System.out.println(sObj.getId());
//	System.out.println(sObj.getName());
	}
}
