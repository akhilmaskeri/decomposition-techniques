package mathematicalFunction;

//class to hold the result
public class Result {
	
		// the final result 
		private static double result=0;
		
		// getters
		public static double getResult() {
			return result;
		}
		
		// operation functions : add subtract ...
		public static void add(double x) {
			result += x;
		}
}
