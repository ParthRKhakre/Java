public class JumpStatement {

    public static void main(String[] args) {
        
                                                                        /*
        Jump statement are :
        break and continue
        
        break means to jump out of the loop block it is mostly used 
        when we want to exit loop when a condition is reached.

        continue means take the flow of control to starting of loop 
        by skipping all the code below continue.
        
        Labels in Java
        In Java loops can be named as outer or inner loop               */

        outer: for(int i = 0; i < 10 ; i++){
            inner: for(int j = 0; j <=  i ;j++){
                System.out.print("Value ");

                if(j >= 5){
                    break outer;
                }
            } 
            System.out.println(" ");
        }


        // In Java without loop we can create code block with custom name 
        first:{
            second:{
                System.out.println("Used Labels");
                break first;
            }
        }
    }
}
