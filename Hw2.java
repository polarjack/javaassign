public class HW2 {
	public static void main(String[] args) {
		 
		// You should Write test code here for each method!
		// Each test should display (1) input, (2) Expected result, (3) actual result and (4) PASS or FAIL message	

		//   
		// The instructor will run this method to see the result and grade it accordingly.
		//

	}
	
	// utility class for implementing following method orderedSubRectangles() 
	public static class Rect {
		int r, c ;
		
		public Rect(int row, int col){
			r = row;
			c = col;
		}
		
		public int area(){
			return r * c;
		}
		
	}
	
	/**
	 * Given m rows and n columns, let Rect[] S = { new Rect(row,col) | 1 <= r <= m, 
	 *   1 <= r <= n } be the set of all rectangles with 1 <= row <= m and 1 <= col <= n.
	 *   You now (1) first generate the Rect array S, and then (2) sort it according to their areas in DESCENDING order,
	 *   and finally return an array R of size[mxn][2] s.t. R[k][0] = S[k].r and R[k][1] = S[k].c.
	 *      
	 * @param m
	 * @param n
	 * @return
	 */
	public static int[][] orderedSubRectangles(int m , int n){
	 /*
	  * If m = 3 and n = 2, then S =
	  * 
	  *  { new Rect(1,1), new Rect(1,2),
	  *    new Rect(2,1), new Rect(2,2),
	  *    new Rect(3,1), new Rect(3,2)  }
	  *  
	  * 	
	  */
		
 	   // first generate S 
	   Rect[] S = new Rect[ m * n];
	   
	   // ....
	   
	   // next sort S 
	   // content of S should be now { Rect(3,2), Rect(2,2), Rect(3,1), Rect(2,1), Rect(1,2), Rect(1,1) }
	   
	   
	   // fnially return the (r,c) part of S as a 2d array
	   
	   int[][] R = new int[m*n][2] ;
	   //  fill in R ...
	   
  	   // If (m,n) = (3,2), then R ={{3,2}, {2,2}, {3,1},{2,1},{1,2},{1,1}}.
	   return R;
	   
	   
	}
		

	
	/**
	 * Given a nxn 0-1 square matrix m, find a maximum squre submatrix sm whose elements are all 1s.
	 * The return value are the index (i,j, k) where  (i,j) is the left-upper corner of the matrix and
	 * k is the width (and height) of the submatrix
	 *  	
	 * @param m : a 0-1 2d array with the same number of rows and columns. 
	 * @return any array rlt with 3 values where rlt[0],rlt[1] are the row and column indices for the top-left corner of the submatrix
	 *   and rlt[2] is the number of rows of the submatrix.
	 */
		
		public static int[] findMaxBlock(int[][] m) {
			int[] rlt = new int[3] ;		
			
				
			
			return rlt ;
		}
		
		
		
	
		
		/**
		 * Given a set of points (x1,y1),...,(xn,yn), represented as an int array of size int[n][2],
		 * Find a point (xk,yk) among the input points and a radius r, such that the circle described by (xk,rk, r)
		 * encloses all points in the input and r is the least length among all circles which encloses all input points and has some point in the inptu as its center.
		 * 
		 * @param points  an array of 2d points.
		 * @return an array {x,y,r} representing the smallest circle enclosing all input points with a point (x,y) in the input as its center.
		 */
		public static int[] smallestCircle(int[][] points ){
			
			int[] result = new int[3] ;
			// put your code here ...
			
			
			return result ;
			
		}
		
		
		/**
		 * Given a 2d array m, return a string representing an HTML table element encoding the content of this array.
		 * The first column should contains the index of current row and the first row of the result should contains
		 * the index of current column. You can google the term 'HTML table' to find the detail format of 
		 * HTML Table. W3Schools.com (https://www.w3schools.com/html/html_tables.asp) has simple
		 * tutorial on HTML table. 
		 * @param  m is a regular 2d array.
		 * @return a String representing an HTML Table   
		 */
		public static String toHTMLTable(int[][] m ){
			/*
			 * if input is { {3,4,5}, {1,7,9} }, then the returned string
			 * should be :
			 * 
			 * <table>
			 * <tr><th>_</th><th>0</th><th>1</th><th>2</th></tr>
			 * <tr><th>0</th><td>3</td><td>4</td><td>5</td></tr>
			 * <tr><th>1</th><td>1</td><td>7</td><td>9</td></tr>
			 * </table>			 		 
			 * 
			 */
						
			
			return "";
		}
		
		/**
		 * Compute C(m,n) where m >= n >= 0. Note: C(m,n) =  m!/(n! * (m-n)!).
		 * A trivial implementation(e.g., compute m! first ) would very easily produce overflow. Your
		 * method should try to avoid it and be able to handle large C(m,n).  
		 * 
		 * @param m
		 * @param n
		 * @return
		 */
		static int nCombinations(int m, int n) {
			int rlt = -1;
		

			return rlt;
		}
		
		
		/**
		 * Multiplication of two matrix a and b. If a is a mxk matrix (i.e.,
		 * a.length = m and a[j].length = n for all j in [0, a.length-1]) and b is a
		 * k x n matrix, then the result should be a mxn matrix.
		 * 
		 * @param a
		 *            2d double mxk array for some m and k >0 .
		 * @param b
		 *            2d double kXn array for some k and n > 0.
		 * @return a double mxn double array
		 */
		public static double[][] multiply(double[][] a, double[][] b) {

			double[][] rlt = new double[a.length][b[0].length];

			
			return rlt;
		}
		

}