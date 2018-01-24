package mathematicalFunction;

public class program {
	
	public static void main(String arg[]) {
		
		double x = Math.PI/2;
		
		// create a new thread for each 
		// functional operation
		Thread sin = new Thread(new sine(x));
		Thread cos = new Thread(new cosine(x));
		Thread tan = new Thread(new tangent(x));
		
		// start the execution
		sin.start();
		cos.start();
		tan.start();
		
		try { 
			
			// wait till all threads get executed
			
			sin.join();
			cos.join();
			tan.join();
			
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(Result.getResult());
		
	}
	
}