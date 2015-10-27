package learning;

public class Employee implements Comparable {
	
	private String empid;
	private String empname;
	
	public Employee(String empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.empname.toLowerCase().compareTo(e.getEmpname().toLowerCase());
		// 0
		// +1 its big one
		// -1 its small one
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}
}
