package learning.framework.springhibernate.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Student")
public class Student {

	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String name;
	
	private String emailid;

    private int age;

    private String address;

    private Date addmissiondate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAddmissionDate() {
        return addmissiondate;
    }

    public void setAddmissionDate(Date addmissiondate) {
        this.addmissiondate = addmissiondate;
    }

	@Override
	public String toString() {
        return "Student [id=" + id + ", name=" + name + ", emailid=" + emailid + " , age= " + age + " , address = "
                + address + "addmissiondate=" + addmissiondate + "  ";
	}
	
}
