package myStrutsHelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestforUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
    	User user = userDao.findByNameAndPass("mysql", "mysqlpass");
    	System.out.println("user name is:"+user.getUsername());
    	System.out.println("user pass is:"+user.getPass());
        context.close();
//		UserService userService = new UserService();
//		boolean result = userService.validation("mysql", "mysql");
//		System.out.println("the search result is :"+ result);
	}

}
