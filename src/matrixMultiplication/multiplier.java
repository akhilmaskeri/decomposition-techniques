package matrixMultiplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class multiplier {

	public static void main(String arg[]){
		
		Map<Thread,scalarProduct> m = new HashMap<Thread,scalarProduct>();
		
		// dimensions of a b c
		int ar=4,ac=6;
		int br=6,bc=3;

		int a[][] = new int[ar][ac];
		int b[][] = new int[br][bc];
		int c[][] = new int[ar][bc];

		// ar * bc threads
		Thread nodes[] = new Thread[ar*bc];
		
		// assigning a,b with random number 
		for(int i=0;i<ar;i++)
			for(int j=0;j<ac;j++)
				a[i][j] = (new Random()).nextInt(100);
				
		for(int i=0;i<br;i++)
			for(int j=0;j<bc;j++)
				b[i][j] = (new Random()).nextInt(100);
		
		int k=0;
	
		for(int i=0;i<ar;i++) {
			for(int j=0;j<bc;j++) {
				
				// preparing the column 
				int col[]=new int[br];
				for(int l=0;l<br;l++) {
					col[l]=b[l][j];
				}
				
				// scalarProduct 
				scalarProduct s = new scalarProduct(a[i],col);
				s.setRow(i);
				s.setColumn(j);
				
				// initializing thread and start
				nodes[k++] = new Thread(s);
				nodes[k-1].start();
				
				
				// mapping to its obj
				m.put(nodes[k-1],s);
			
			}
		}
		
		try {
			for(Thread t:nodes) {
				
				// wait till the thread executes 
				t.join();
	
				// get its scalar object 
				scalarProduct product = m.get(t);
				
				// get scalarProducts corresponding
				// row and column
				int x = product.getr();
				int y = product.getc();
				
				// assigning
				c[x][y]=product.getSum();	
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		display(c, ar, bc);
		
	}
	
	// utility function
	static void display(int a[][],int r,int c) {
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	
}
