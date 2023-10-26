public class Tables {
    public static void main(String[] args) {
        // Define the dimensions of the tables
        int rows = 3;
        int columns = 4;
        
        // Create the first table using a nested for loop
        int[][] table1 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table1[i][j] = i * columns + j + 1;
            }
        }
        
        // Print the first table
        System.out.println("Table 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(table1[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Create the second table using a similar nested for loop
        int[][] table2 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table2[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Print the second table
        System.out.println("\nTable 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(table2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
