package thread.test;

public class CheckSingleAndMultipleThreadExecutionTime {

	public static void main(String[] args) {
		PrintNumbers pn = new PrintNumbers();
		long time = System.currentTimeMillis();
		pn.print50to1();
		System.out.println();
		pn.print1to50();
		
		long time2 = System.currentTimeMillis();
		System.out.println("Time to complete both task"+((time2-time)/1000)+ "sec");
	}

}
