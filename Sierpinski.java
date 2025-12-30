/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
		public static void main(String[] args) {
			sierpinski(Integer.parseInt(args[0]));
		}
		
		// Draws a Sierpinski triangle of depth n on the standard canvass.
		public static void sierpinski (int n) {
			double s = 1.0; 
        double h = Math.sqrt(3) / 2.0;
        
        double x1 = 0.0, y1 = 0.0;
        double x2 = 1.0, y2 = 0.0;
        double x3 = 0.5, y3 = h;

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(x1, y1, x2, y2); 
        StdDraw.line(x2, y2, x3, y3); 
        StdDraw.line(x3, y3, x1, y1); 

        sierpinski(n, x1, x2, x3, y1, y2, y3);
		}
		
		// Does the actual drawing, recursively.
		private static void sierpinski(int n, double x1, double x2, double x3,
											double y1, double y2, double y3) {
		if (n == 0 ) return;
		double x12 = (x1+x2)/2;
		double y12 = (y1+y2)/2;
		double x22 = (x2+x3)/2;
		double y22 = (y2+y3)/2;
		double x32 = (x1+x3)/2;
		double y32 = (y1+y3)/2;
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(x12, y12, x22, y22);
		StdDraw.line(x22, y22, x32, y32);
		StdDraw.line(x32, y32, x12, y12);
		sierpinski(n-1, x1, x32, x12, y1, y32, y12);
		sierpinski(n-1, x2, x12, x22, y2, y12, y22);
		sierpinski(n-1, x3, x32, x22, y3, y32, y22);
		}
}
