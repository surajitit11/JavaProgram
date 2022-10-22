package programJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee e) {
//		int flag = 0;
//		if (this.getId() == e.getId()) flag = 0;
//		if (this.getId() > e.getId()) flag = 1;
//		if (this.getId() < e.getId()) flag = -1;
//		return flag;
		//return this.getId() - e.getId();
		return (this.getName()).compareTo(e.getName());  		
	}
}

public class ComparableTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(78);
		e1.setName("ssss");

		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("sdfs");

		Employee e3 = new Employee();
		e3.setId(90);
		e3.setName("kjjk");

		Employee e4 = new Employee();
		e4.setId(8);
		e4.setName("bngt");
		
		List<Employee> objList = new ArrayList<Employee>();
		
		objList.add(e1);
		objList.add(e2);
		objList.add(e3);
		objList.add(e4);
		
		Collections.sort(objList);
		
		objList.forEach((obj)->{
			Employee e= (Employee)obj;
			System.out.println(e.getId()+"===="+e.getName());
		});
	}
}
