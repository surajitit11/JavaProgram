package programJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator{
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
}
class IdCompare implements Comparator<EmployeeComparator>{
	@Override
	public int compare(EmployeeComparator e1, EmployeeComparator e2) {		
		return e1.getId() - e2.getId();
	}	
}
class NameCompare implements Comparator<EmployeeComparator>{
	@Override
	public int compare(EmployeeComparator e1, EmployeeComparator e2) {		
		return e1.getName().compareTo(e2.getName());
	}	
}
public class ComparatorTest {

	public static void main(String[] args) {
		EmployeeComparator e1 = new EmployeeComparator();
		e1.setId(78);
		e1.setName("ssss");

		EmployeeComparator e2 = new EmployeeComparator();
		e2.setId(1);
		e2.setName("sdfs");

		EmployeeComparator e3 = new EmployeeComparator();
		e3.setId(90);
		e3.setName("kjjk");

		EmployeeComparator e4 = new EmployeeComparator();
		e4.setId(8);
		e4.setName("bngt");
		
		List<EmployeeComparator> objList = new ArrayList<EmployeeComparator>();
		
		objList.add(e1);
		objList.add(e2);
		objList.add(e3);
		objList.add(e4);
		
		//Collections.sort(objList, new IdCompare());
		Collections.sort(objList, new NameCompare());
		
		objList.forEach((obj)->{
			EmployeeComparator e= (EmployeeComparator)obj;
			System.out.println(e.getId()+"===="+e.getName());
		});

	}

}
