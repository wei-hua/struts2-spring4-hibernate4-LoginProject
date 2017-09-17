package myStrutsHelloWorld;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by aiamj on 2017/7/23.
 */
public class Manager extends Employee implements Serializable{
    private static final long serialVersionUID = 48L;
    //璇ョ粡鐞嗙鐞嗙殑閮ㄩ棬
    private String dept;
    //璇ョ粡鐞嗗搴旂殑鎵�鏈夊憳宸�
    private Set<Employee> employees = new HashSet<Employee>();


    public Manager() {
    }

    public Manager(String dept, Set<Employee> employees) {
        this.dept = dept;
        this.employees = employees;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}
