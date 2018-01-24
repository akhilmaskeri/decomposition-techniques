package mathematicalFunction;

public class tangent implements Runnable{
	
	private double x;
	
	public tangent(double x){
		this.x = x;
	}
	
	@Override
	public void run() {

		Result.add(Math.tan(x));
		
	}
}