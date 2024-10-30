package emp.dao;

import static org.mockito.ArgumentMatchers.intThat;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import emp.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Employee_Dao {

	public void insert() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your details");
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address");
		String address=sc.next();
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmp_id(id);
		e.setEmp_name(name);
		e.setAddress(address);
		e.setSalary(salary);

		ss.persist(e);
		System.out.println("data is inserted....");

		tr.commit();
		ss.close();

	}

	public void delete() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int emp_id = 1;
		Employee e1 = ss.get(Employee.class, emp_id);
		ss.remove(e1);
		ss.close();
		System.out.println("data is deleted....");

	}

	public void update() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int emp_id = 1;
		Employee e2 = ss.get(Employee.class, emp_id);

		e2.setEmp_name("gaei");
		e2.setAddress("haier");
		e2.setSalary(50000);

		ss.merge(e2);
		tr.commit();
		ss.close();
	}

	public void fletch() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		CriteriaBuilder br = ss.getCriteriaBuilder();
		CriteriaQuery cq = br.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		cq.select(root);

		Query q = ss.createQuery(cq);
		List<Employee> list = q.getResultList();

		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
