public class HW2 {
	public static void main(String[] args) {

		// You should Write test code here for each method!
		// Each test should display (1) input, (2) Expected result, (3) actual result and (4) PASS or FAIL message	

		//   
		// The instructor will run this method to see the result and grade it accordingly.
		//


		// input for orderedSubRectangles 
		int[][] output = orderedSubRectangles(3,2);

		//Expected result
		// If (m,n) = (3,2), then R ={{3,2}, {2,2}, {3,1},{2,1},{1,2},{1,1}}
		//Acutal result
		// {3,2} {2,2} {3,1} {1,2} {2,1} {1,1}

		// Program to show results
		for(int i = 0; i < output.length; i++) {
			String toshow = "{";
			toshow += output[i][0];
			toshow += ",";
			toshow += output[i][1];
			toshow += "}";
			System.out.print(toshow);
		}
		// PASS
		System.out.println("\n-------------");
		
		//findMaxBlock
		// input
		int[][] inputfind = {
			{0,0,0,0},
			{1,0,0,0},
			{0,0,1,1},
			{0,1,1,1}
		};
		//Expected result (2,2,2)
		//Actual result (2,2,2)
		//Program to show
		int[] outputfind = findMaxBlock(inputfind);
		System.out.print(outputfind[0]);
		System.out.print(outputfind[1]);
		System.out.print(outputfind[2]);
		// PASS
		
		System.out.println("\n-------------");
		//input for smallestCircle
		int[][] inputsmall = {{1,3},{10,10},{5,5}}; 
		//Except output 5,5,8
		//Actual result 5,5,8
		int[] outputsmall = smallestCircle(inputsmall);
		System.out.print(outputsmall[0]);
		System.out.print(outputsmall[1]);
		System.out.println(outputsmall[2]);
		// PASS

		System.out.println("\n-------------");
		
		//input for toHTMLTable
		int[][] inputhtml =  { {3,4,5}, {1,7,9} };
		// //Excepted output 
		// <table>
		// <tr><th>_</th><th>0</th><th>1</th><th>2</th></tr>
		// <tr><th>0</th><td>3</td><td>4</td><td>5</td></tr>
		// <tr><th>1</th><td>1</td><td>7</td><td>9</td></tr>
		// </table>

		//Actual output
		// <table>
		// <tr><th>_</th><th>0</th><th>1</th><th>2</th></tr>
		// <tr><th>0</th><th>3</th><th>4</th><th>5</th></tr>
		// <tr><th>1</th><th>1</th><th>7</th><th>9</th></tr>
		// </table>
		String outputhtml = toHTMLTable(inputhtml);
		System.out.println(outputhtml);
		//PASS

		System.out.println("\n-------------");
		
		//input for nCombinations
		int outputnc = nCombinations(5,3);
		//Expect output 10
		//Actual output 10
		System.out.println(outputnc);
		//PASS

		System.out.println("\n-------------");

		//intput for multimatric
		double[][] A = { { 4.00, 3.00 }, { 2.00, 1.00 } };
	    double[][] B = { { -0.500, 1.500 }, { 1.000, -2.0000 } };
		//Expect output 1,0
		//				0,1
		// Actual output 1.0 0.0 
		//				 0.0 1.0 

		double[][] outputmulti = multiply(A, B);
		for(int i = 0;i < outputmulti.length; i++) {
			for(int j = 0; j < outputmulti[i].length; j++) {
				System.out.print(outputmulti[i][j]);
				System.out.print(" ");
				
			}
			System.out.print('\n');
		}
		//PASS
	}

	// utility class for implementing following method orderedSubRectangles() 
	public static class Rect {
		int r, c;

		public Rect(int row, int col) {
			r = row;
			c = col;
		}

		public int area() {
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
	public static int[][] orderedSubRectangles(int m, int n) {
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
		Rect[] S = new Rect[m * n];

		int count = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				// Rect a = new Rect(i, j);
				// System.out.println(a.area());
				S[count] = new Rect(i, j);
				count++;
			}
		}
		//    System.out.println(S[0].area());

		// for(int i = 0;i < count; i++) {
		// if(S[i].area() < S[i+1].area())
		// System.out.println(1);
		// }

		count = 0;
		for (int i = 1; i < S.length; i++) {
			for (int j = 0; j < S.length - i; j++) {
				//    int first = S[j].area();
				//    int second = S[j+1].area();
				//    System.out.println(second);

				if (S[j].area() < S[j + 1].area()) {
					Rect store = new Rect(S[j].r, S[j].c);
					S[j].r = S[j + 1].r;
					S[j].c = S[j + 1].c;

					S[j + 1].r = store.r;
					S[j + 1].c = store.c;
				}
				//    System.out.println(S[count++].area());
			}
		}

		//    System.out.println(S[0].area());
		// ....

		// next sort S 
		// content of S should be now { Rect(3,2), Rect(2,2), Rect(3,1), Rect(2,1), Rect(1,2), Rect(1,1) }


		// fnially return the (r,c) part of S as a 2d array

		int[][] R = new int[m * n][2];
		//  fill in R ...

		for (int i = 0; i < S.length; i++) {
			int[] store = {
				S[i].r,
				S[i].c
			};
			R[i] = store;
		}
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
		int i ,j;
		int[] rlt = new int[3];
		// System.out.println(m.length);
		int[][] s = new int[m.length][m.length];
 		int max_of_s, max_i, max_j; 
		
		/* Set first column of S[][]*/
		for (i = 0; i < m.length; i++)
			s[i][0] = m[i][0];

		/* Set first row of S[][]*/
		for (j = 0; j < m.length; j++)
			s[0][j] = m[0][j];

		/* Construct other entries of S[][]*/
		for (i = 1; i < m.length; i++) {
			for (j = 1; j < m.length; j++) {
				if (m[i][j] == 1)
					s[i][j] = minimum(s[i][j - 1], s[i - 1][j], s[i - 1][j - 1]) + 1;
				else
					s[i][j] = 0;
			}
		}

		/* Find the maximum entry, and indexes of maximum entry 
		   in S[][] */
		max_of_s = s[0][0];
		max_i = 0;
		max_j = 0;
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m.length; j++) {
				if (max_of_s < s[i][j]) {
					max_of_s = s[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		// System.out.println(max_of_s);
		rlt[0] = max_i - max_of_s+1;
		rlt[1] = max_j - max_of_s+1;
		rlt[2] = max_of_s;
		return rlt;
	}
	public static int minimum(int a, int b, int c)
	{
		int m = a;
		if (m > b) 
			m = b;
		if (m > c) 
			m = c;
		return m;
	}



	/**
	 * Given a set of points (x1,y1),...,(xn,yn), represented as an int array of size int[n][2],
	 * Find a point (xk,yk) among the input points and a radius r, such that the circle described by (xk,rk, r)
	 * encloses all points in the input and r is the least length among all circles which encloses all input points and has some point in the inptu as its center.
	 * 
	 * @param points  an array of 2d points.
	 * @return an array {x,y,r} representing the smallest circle enclosing all input points with a point (x,y) in the input as its center.
	 */
	public static int[] smallestCircle(int[][] points) {
		int[] result = new int[3];
		// put your code here ...
		int x = points[0][0], y = points[0][1], z = 0;
		double test = 0;
		
		for(int i = 0; i < points.length; i++) {
			int[] maxpoint = {0,0};
			double maxofbase = 0.0;
			double minofall = 2000.0;
			for(int j = 0; j < points.length; j++) {
				if( i!=j ) {
					int[] a = {points[i][0], points[i][1]};
					int[] b = {points[j][0], points[j][1]};
					double d = getlength(a, b);
					if(d > maxofbase) {
						
						maxofbase = d;
					}
					// System.out.println(d);
				}
				x = points[i][0];
				y = points[i][1];
			}

			if(maxofbase < minofall) {
				minofall = maxofbase;
				result[0] = x;
				result[1] = y;
			}
			
			test = Math.ceil(minofall);
			result[2] = (int) test;	
		}
		
		return result;

	}

	public static double getlength(int[] a, int[] b) {
		int x = Math.abs(a[0] - b[0]);
		int y = Math.abs(a[1] - b[1]);
		double l = Math.sqrt(x*x + y*y);
		return l;
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
	public static String toHTMLTable(int[][] m) {
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

		String output = "<table>\n";
		String head = "<tr><th>_</th>";
		for(int i = 0; i < m[0].length; i++) {
			String combine = "";
			combine += "<th>";
			combine += i;
			combine += "</th>";
			head += combine;
		}
		head += "</tr>\n";
		output += head;
		for(int i = 0; i < m.length; i++) {
			String combine = "<tr>";
			combine += "<th>";
			combine += i;
			combine += "</th>";
			
			for(int j = 0; j < m[i].length; j++) {
				combine += "<th>";
				combine += m[i][j];
				combine += "</th>";
			}
			combine += "</tr>\n";
			output += combine;
		}

		output += "</table>\n";
		return output;
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
	public static int nCombinations(int m, int n) {
		int rlt = -1;
		int uppart = 1;
		//m! part 
		for(int i = n+1;i <= m; i++) {
			uppart *= i;
		}
		int under = 1;
		for(int i = 1; i <= m-n; i++) {
			under *= i;
		}

		int output = uppart/under;
		return output;
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

		int arow = a.length;
        int acol = a[0].length;
        int brow = b.length;
        int bcol = b[0].length;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                rlt[i][j] = 0.0;
            }
        }

        for (int i = 0; i < arow; i++) { // aRow
            for (int j = 0; j < bcol; j++) { // bColumn
                for (int k = 0; k < acol; k++) { // aColumn
                    rlt[i][j] += a[i][k] * b[k][j];
				// System.out.print("new\n");
				// System.out.println(a[i][k]);
				// System.out.println(b[k][j]);
				// System.out.println(a[i][k] * b[k][j]);	
				}
				// System.out.print("result\n");
				// System.out.println(rlt[i][j]);
            }

        }

		return rlt;
	}


}