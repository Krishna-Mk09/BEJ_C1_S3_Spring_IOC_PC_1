/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The `ApplicationContext` is created using the `AnnotationConfigApplicationContext` class. The
 * `AnnotationConfigApplicationContext` class takes a Java configuration class as an argument. The `EmployeeConfig` class
 * is a Java configuration class. The `EmployeeConfig` class is used to create the `ApplicationContext`. The
 * `ApplicationContext` is used to get the `Employee` bean
 */
public class EmployeeImpl {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee1 = (Employee) context.getBean("empBean1");
        System.out.println(employee1);
    }
}
