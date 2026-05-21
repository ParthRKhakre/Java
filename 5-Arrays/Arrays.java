public class Arrays {                                                                                       /*
    Arrays 
    Is a container that holds a fixed number of values of single type of data.
    Contigous slot of memory is provided to the array

                                                                                                            */

    public static void main(String[] args) {
        // Defining arrays
        // int[]  Persons; Create a reference but here array was not created.
        
        // 1.Declare array
        int Marks[][] = new int[3][3];

        // 2.Way to declare array                 
        int[]  rollNumbers = new int[3]; // Fixed size

        int x = 101;

        // .length is the property that is predefined by Java that provides 
        // the size of array
        for(int i = 0; i < rollNumbers.length ; i++){
            rollNumbers[i] = x;
            x++;
        }

        for(int i = 0;i < 3; i++){
            System.out.println(rollNumbers[i]);
        }

//     System.out.println(rollNumbers[3]); Will throw Array Index Out Of Bounds Exception

    }
    
}
