package thread.test;

public class InlineThread_OR_AnonymousThread {

	public static void main(String[] args) {
		
		
		// Inline/Anonymous Thread using Thread class
		/*
		 * new Thread(){ public void run() { for (int i = 1; i <=10; i++) {
		 * System.out.println("run:"+i); } };
		 * 
		 * }.start();
		 */

		// Inline/Anonymous Thread using Runnable Interface

	/*new Thread(
		new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("run:" + i);
				}
			};
		}

		).start();*/

		/*new Thread( () -> System.out.println("Lambda")
				).start();
		String name =Thread.currentThread().getName();
		System.out.println(name);*/
	}

}
