
package LO2_Multidimensionalarrays;


public class Multidimensionalarrays {
        public static void main(String[] args) {
    
            int[][] matrix = {
	 {3, 4, 5},
         {6, 7, 8},
         {9, 10, 11}
};

// Printing the 2D array
System.out.println("Matrix:");
for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
      }
System.out.println(); // Move to the next line after printing each row
}
}
}