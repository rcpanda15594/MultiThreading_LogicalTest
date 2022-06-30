package thread.test;

public class CreateThreadExtendingThreadClass {

	public static void main(String[] args) {

		System.out.println("Thread Name------------>"+Thread.currentThread().getName());
		Mythread t = new Mythread();
		System.out.println(t.isAlive());
		System.out.println("Thread Name------------>"+t.getName());
		t.start();
		System.out.println(t.isAlive());

		Thread.currentThread().setName("Checking Thread");
		t.setName("Check Child Thread name");
		System.out.println("Thread Name------------>"+Thread.currentThread().getName());
		System.out.println("Thread Name------------>"+t.getName());
		System.out.println("NORM_PRIORITY------------>"+t.NORM_PRIORITY);
		System.out.println("MIN_PRIORITY------------>"+t.MIN_PRIORITY);
		System.out.println("MAX_PRIORITY------------>"+t.MAX_PRIORITY);
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}

}
