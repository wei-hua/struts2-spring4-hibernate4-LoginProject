package myStrutsHelloWorld;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by aiamj on 2017/7/23.
 */
@Entity
@Table(name = "emp_table")
public class Employee implements Serializable {
    private static final long serialVersionUID = 48L;
    //鏍囪瘑灞炴��
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Integer id;
    //鍛樺伐濮撳悕
    @Column(name="emp_name")
    private String name;
    //鍛樺伐瀵嗙爜
    @Column(name="emp_pass")
    private String pass;
    //鍛樺伐宸ヨ祫
    @Column(name="emp_salary")
    private double salary;
    //鍛樺伐瀵瑰簲鐨勭粡鐞�
    @Column(name="mgr_id")
    private Manager manager;

    public Employee() {
    }

    public Employee(Integer id, String name, String pass, double salary, Manager manager) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.salary = salary;
        this.manager = manager;

    }
    public Employee(Integer id){
            this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    //rewrite the equals() method, if the name is the same then employee is the same
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj!=null&&obj.getClass()==Employee.class){
            Employee employee=(Employee)obj;
            return this.getName().equals(employee.getName());
        }
        return false;
    }

    public  int hashCode(){
        return name.hashCode();
    }
}
