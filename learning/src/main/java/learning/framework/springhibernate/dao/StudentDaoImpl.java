package learning.framework.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import learning.framework.springhibernate.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Student student) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(student);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> list() {
		Session session = sessionFactory.openSession();
		List<Student> students = session.createQuery(" from Student").list();
		session.close();
		return students;
	}


    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Student student = (Student) session.createQuery(" from Student where id= " + id + "").list().get(0);
        session.delete(student);
        tx.commit();
        session.close();
    }

    @Override
    public void update(Student student) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(student);
        tx.commit();
        session.close();
    }

}
