package learning.framework.springhibernate.dao;

import java.util.List;

import learning.framework.springhibernate.entity.Student;

public interface StudentDao {

	public void save(Student student);
	
	public List<Student> list();

    public void delete(int id);
}
