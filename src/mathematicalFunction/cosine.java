package mathematicalFunction;

public class cosine implements Runnable{
	
	private double x;
	
	public cosine(double x){
		this.x = x;
	}
	
	@Override
	public void run() {

		Result.add(Math.cos(x));
		
	}
}
