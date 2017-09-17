package myStrutsHelloWorld;

public class UserService {

	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean validation(String name, String pass) {
		boolean result = false;
		User user = userDao.findByNameAndPass(name, pass);
		if(user!=null){
			result = true;
		}else{
			result = false;
		}
		return result;
	}
}
