public class MultiDimensional {
                                                                                        /*
    MultiDimensional is array of arrays
    1) 2D Array
    2) 3D Array 
    3) nD Array
                                                                                        */
    
    public static void main(String[] args) {
        int[][] Students = new int[3][3];
        // Student array is of 3 x 3 dimension.

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                Students[i][j] = (i + j);
            }
        }

        for(int i = 0;i<Students.length;i++){
            for(int j = 0;j < Students[i].length;j++){
                System.out.print(Students[i][j] + " ");
            }
            System.out.println();
        }
                                                                                        /* 
        Providing a row size is compulsory in array 
        but it is optional to provide the column size          
                                                                                        */
       int[][] Marks = new int[5][];
       Marks[0] = new int[2];
       Marks[1] = new int[5];
       Marks[2] = new int[9];

       // Marks 
       // [{1,2},
       // {1,2,3,4,5},
       // {1,2,3,4,5,6,7,8,9}]

       int Ages[][] = {{1,2,3},
                       {3,4,5},
                       {5,6,7}};
    }
}
