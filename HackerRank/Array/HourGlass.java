import java.util.Scanner;

public class HourGlass {
	static int count=1;
	static int max=0,sum=0;
	
	static int maxValue(int[][]matrix,int r,int c) {
		if(r<3 ||c<3)
			return -1;
		for(int i=0;i<r-2;i++) {
			for(int j=0;j<c-2;j++) {
				sum = (matrix[i][j]+matrix[i][j+1]+matrix[i][j+2])+
						(matrix[i+1][j+1])+
						(matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2]);
				if(sum>max)
					max = sum;				
			}
		}
		return max;
		
	}
	
	static void printHourGlass(int[][]matrix,int r,int c) {
		for(int i=0;i<r-2;i++) {
			for(int j=0;j<c-2;j++) {
				System.out.println("---------"+(count++)+"---------");
				System.out.printf("%d %d %d\n",matrix[i][j],matrix[i][j+1],matrix[i][j+2]);
				System.out.printf("%s %d %s\n"," ", matrix[i+1][j+1]," ");
				System.out.printf("%d %d %d\n", matrix[i+2][j],matrix[i+2][j+1],matrix[i+2][j+2]);
				System.out.println(" ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int [][]matrix = new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix [i][j] = sc.nextInt();
			}
		}
		
		printHourGlass(matrix,rows,columns);
		int max =maxValue(matrix, rows, columns);
		System.out.println("max value is: "+max);

	}

}
