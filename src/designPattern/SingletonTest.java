package designPattern;

class ST{
	/* Eager initialization */
/*	private static final ST instance = new ST();
	private void ST() {}
	public static ST getInstance() {
		return instance;
	}*/
	
	/*static block initialization*/
	/*private static ST instance;
	private void ST() {}
	static {
		try {
			instance = new ST();
		}catch (Exception e) {
			System.out.println(e);
		}
	}*/
	/*Lazy loading */ 
/*	private static ST instance;
	private void ST() {}
	public static ST getInstance() {
		if(instance == null) instance = new ST();
		return instance;
	}*/
	/* synchronized */
	/*private static ST instance;
	private void ST() {}
	public synchronized static ST getInstance() {
		if(instance == null) instance = new ST();
		return instance;
	}*/
	/* double checking */
	/*private static ST instance;
	private void ST() {}
	public static ST getInstance() {
		if(instance == null) {
			synchronized (ST.class) {
				if(instance == null) {
					instance = new ST();
				}
			}
		}
		return instance;
	}*/
	/* volatile */
	private static volatile ST instance;
	private void ST() {}
	public static ST getInstance() {
		if(instance == null) {
			synchronized (ST.class) {
				if(instance == null) {
					instance = new ST();
				}
			}
		}
		return instance;
	}
	
	
}
public class SingletonTest {

	public static void main(String[] args) {
		
		System.out.println(ST.getInstance().hashCode());
		System.out.println(ST.getInstance().hashCode());
		System.out.println(ST.getInstance().hashCode());
		System.out.println(ST.getInstance().hashCode());
	}

}
