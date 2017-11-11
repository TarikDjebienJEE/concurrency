package main;

public class TestThread implements Runnable {


	String name;
	
	public TestThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name+" begin run.");
		try {
			Thread.sleep(5000);
			System.out.println(name+" End run.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
