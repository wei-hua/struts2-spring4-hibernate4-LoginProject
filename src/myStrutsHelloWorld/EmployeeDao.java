package myStrutsHelloWorld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by aiamj on 2017/8/13.
 */
public class EmployeeDao {
    public Employee findById(Integer id){
        SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction trx = session.beginTransaction();

        String sql = "Select e from "+ Employee.class.getName() + " e " + "where e.id=:id";
        Query<Employee> query = session.createQuery(sql);
        query.setParameter("id",id);
        List<Employee> employeeList = query.getResultList();
        trx.commit();
        sessionFactory.close();
        return employeeList.get(0);
    }
}
