package mathematicalFunction;

public class sine implements Runnable{
	
	private double x;
	
	public sine(double x){
		this.x = x;
	}
	
	@Override
	public void run() {

		Result.add(Math.sin(x));
		
	}

}
