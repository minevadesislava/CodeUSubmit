package arrays.and.matrix;

import java.util.Random;

public class SparseMatrix {
	
	static void sparse(int[][] matrix){
		for(int i = 0; i<matrix.length;i++){
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] != 0) System.out.println("[" + i + "," + j + "]: " + matrix[i][j]);

	}}}
	static int[][] generate_matrix(){
		int min = 0;
		int max = 10;
		Random r = new Random();
		int n = r.nextInt((max - min) + 1) + min;
		int m = r.nextInt((max - min) + 1) + min;
		int[][] matrix = new int[n][m];
		for(int i = 0; i<matrix.length;i++){
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] =  r.nextInt((max - min) + 1) + min;
			}}
		return matrix;
		
	}
	static public void main(String[] args){
		int[][] m1 = generate_matrix();
		int[][] m2 = generate_matrix();
		int[][] m3 = generate_matrix();
		int[][] m4 = {
          {0, 0, 0, 0},
          {0, 6, 0, 0 },
          {8, 0, 0, 4}
	    };
		System.out.println("matrix1 result: ");
		sparse(m1);
		System.out.println("matrix2 result: ");
		sparse(m2);
		System.out.println("matrix3 result: ");
		sparse(m3);
		System.out.println("matrix4 result: ");
		sparse(m4);
	}
}
