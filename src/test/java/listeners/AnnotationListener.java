package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
//		get group
		String arr[] = annotation.getGroups();
		for(String grp: arr)
			System.out.println(grp);
//		update/set group
		String grp[] = {"partial"};
		annotation.setGroups(grp);
//		
	}

}
