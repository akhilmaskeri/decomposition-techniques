package matrixMultiplication;

import java.util.Random;

public class matrixMultiplication {

	public static void unmain(String arg[]) {
		
		// cij = ∑ aik + bkj
		
		// dimensions of a b c
		int ar=4,ac=6;
		int br=6,bc=3;
		int cr=4,cc=3;
		
		
		int a[][] = new int[ar][ac];
		int b[][] = new int[br][bc];
		int c[][] = new int[cr][cc];
		
		// assigning with random 
		for(int i=0;i<ar;i++)
			for(int j=0;j<ac;j++)
				a[i][j] = (new Random()).nextInt(100);
		
		for(int i=0;i<br;i++)
			for(int j=0;j<bc;j++)
				b[i][j] = (new Random()).nextInt(100);
		
		// direct multiplication
		for(int i=0;i<ar;i++) {
			for(int j=0;j<bc;j++) {
				c[i][j]=0;
				for(int k=0;k<ac;k++) {					
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("a :");
		display(a, ar, ac);
		
		System.out.println("b :");
		display(b, br, bc);
		
		System.out.println("c :");
		display(c, cr, cc);
		
	
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
