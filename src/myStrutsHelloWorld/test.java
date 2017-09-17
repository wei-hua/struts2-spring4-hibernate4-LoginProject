package myStrutsHelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by aiamj on 2017/8/13.
 */
public class test {

        public static void main(String[] args) {

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

            EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

            Employee employee = employeeDao.findById(1);

            System.out.println("Employee::"+employee.getId()+"  "+employee.getName());

            //close resources
            context.close();
        }

}
