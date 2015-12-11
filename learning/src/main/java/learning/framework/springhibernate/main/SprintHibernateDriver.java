package learning.framework.springhibernate.main;

import java.sql.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.framework.springhibernate.dao.StudentDao;
import learning.framework.springhibernate.entity.Student;

public class SprintHibernateDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml"); 

		StudentDao studentDao = context.getBean(StudentDao.class);
		
		
		Student student = new Student();
		student.setEmailid("nitin.kk.upadhyay@gmail.com");
		student.setName("Nitin Upadhyay");
        student.setAge(21);
        student.setAddress("Gawde Colony Mahidpur");
        student.setAddmissionDate(new Date(System.currentTimeMillis()));
		studentDao.save(student );
		
		Student student1 = new Student();
		student1.setEmailid("naveenk.upadhyay@gmail.com");
		student1.setName("Naveen Upadhyay");
        student1.setAge(24);
        student1.setAddress("Vivekanand Colony Ujjain");
        student1.setAddmissionDate(new Date(System.currentTimeMillis()));
		studentDao.save(student1 );
		
        student1.setName("Updated name");
        studentDao.update(student1);
        List<Student> list = studentDao.list();
		for(Student entity : list) {
			System.out.println(entity);
            studentDao.delete(entity.getId());
		}

	}

}