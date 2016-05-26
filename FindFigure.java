import java.util.Scanner;
public class FindFigure {
	
	private static int row = 3;
	private static int col = 3;
	private static int count = 0;
	private static int average = 0;
		
	private static double[][] array = new double[row][col];
	private static double[][] newArray = new double[row][col];
	
	private static void buildArray(double[][] a) {
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter 9 doubles please.");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				a[r][c] = keys.nextDouble();
				}
			}
		showArray(a);	
		}
	
	private static void showArray(double[][] any) {
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.print(any[r][c] + " ");
				}
			System.out.println();	
			}
		}
	
	private static int getSum(double[][] a) {
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				count += a[x][y];
				}
			}
		return count;	
		}
	private static int getAverage(int c) {
		average = c / (row * col);
		return average;
		}
		
	private static double[][] findFigure(double[][] a, double thresh) {
		getSum(a);
		getAverage(count);
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				if (a[r][c] > thresh) {
					newArray[r][c] = 1.0;
					}
				else {
					newArray[r][c] = 0.0;
					}	
				}
			}
		return newArray;
		}					
	
	public static void main(String[] args) {
		FindFigure demo = new FindFigure();
		demo.buildArray(array);
		demo.findFigure(array, 5);
		demo.showArray(newArray);		
		}
	}
