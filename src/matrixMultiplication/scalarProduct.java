package matrixMultiplication;

public class scalarProduct implements Runnable{

	private int row[],column[],n;
	private int sum,i,j;
	
	public scalarProduct(int r[],int c[]){
		
		row = r;
		column = c;
		
		n = r.length;
		sum=0;
		
	}
	
	// getters
	public int getr() {
		return i;
	}

	public int getc() {
		return j;
	}
	public int getSum() {
		return sum;
	}
	
	// setters
	public void setRow(int r) {
		this.i=r;
	}
	
	public void setColumn(int c) {
		this.j=c;
	}

	
	@Override
	public void run() {
		
		for(int i=0;i<n;i++) {
			sum+=row[i]*column[i];
		}
	
	}
	
}
