package myStrutsHelloWorld;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDao{
	SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
	Session session = sessionFactory.getCurrentSession();
	Transaction trx = session.beginTransaction();
	
 User findByNameAndPass(String name, String pass){
	 //String sql = "Select e from "+ User.class.getName()+" e " + "where e.username= :username"+" and"+" e.pass= :pass";
	 String sql = "Select e from "+ User.class.getName() + " e " + "where e.username=:name"+" and"+ " e.pass= :pass";
	 Query<User> query = session.createQuery(sql);
	 query.setParameter("name", name);
	 query.setParameter("pass", pass);
	 List<User> results = query.getResultList();
	 trx.commit();
     sessionFactory.close();
     return results.get(0);
 }
}
