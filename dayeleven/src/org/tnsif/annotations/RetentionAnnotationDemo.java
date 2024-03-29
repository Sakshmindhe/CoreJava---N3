package org.tnsif.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepratedAnnoDemo.class)
@interface CustomAnnotation{
	//abstract method
	String print() default "Welcome to M23 Batch";
	int value() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepratedAnnoDemo{
	CustomAnnotation[] value();
}
public class RetentionAnnotationDemo {
	
	@CustomAnnotation(print="Retention Annotation Test", value=1)
	@CustomAnnotation(print="testing annotaion", value=2)
	
	/*public static void main(String[] args) {
		RetentionAnnotationDemo c = new RetentionAnnotationDemo();
		*/
	public static void testMethod()
	{	
		RetentionAnnotationDemo d = new RetentionAnnotationDemo();
		try 
		{
			Class<?>c=d.getClass();
			Method m = c.getMethod("testMethod");
			Annotation a = m.getAnnotation(MyRepratedAnnoDemo.class);
			System.out.println(a);
		}
		catch(NoSuchMethodException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		testMethod();
	}

}

