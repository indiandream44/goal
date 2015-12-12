package learning.framework.springhibernate.main;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.framework.springhibernate.dao.StudentDao;
import learning.framework.springhibernate.entity.Student;

public class SprintHibernateDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml"); 

		StudentDao studentDao = context.getBean(StudentDao.class);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 4, 25);
        Date date1 = new Date(calendar.getTime().getTime());

        calendar.set(2012, 5, 13);
        Date date2 = new Date(calendar.getTime().getTime());
		Student student = new Student();
		student.setEmailid("nitin.kk.upadhyay@gmail.com");
		student.setName("Nitin Upadhyay");
        student.setAge(21);
        student.setAddress("Gawade Colony Mahidpur");
        student.setAddmissionDate(date1);
		studentDao.save(student );

		Student student1 = new Student();
		student1.setEmailid("naveenk.upadhyay@gmail.com");
		student1.setName("Naveen Upadhyay");
        student1.setAge(24);
        student1.setAddress("Vivekanand Colony Ujjain");
        student1.setAddmissionDate(date2);
		studentDao.save(student1 );
        student1.setName("Updated name");
        studentDao.update(student1);
        List<Student> list = studentDao.list();
		for(Student entity : list) {
			System.out.println(entity);
            studentDao.delete(entity.getId());
		}
        System.out.println(list);
	}
}
