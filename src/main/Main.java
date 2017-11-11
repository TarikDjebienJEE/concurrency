package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new TestThread("t1"));
		System.out.println("Statut "+t1.getName()+ " : "+ t1.getState() + " group : "+t1.getThreadGroup());
		t1.start();
		System.out.println("Statut "+t1.getName()+ " : "+ t1.getState() + " group : "+t1.getThreadGroup());
	}

}
