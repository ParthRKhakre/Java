public class Iterations {
    public static void main(String[] args){
        
        

        for(int i = 0;i < 10;i++){
            System.out.println(i);
        }

        /*
        Flow of control of for loop 
        1. First assignment statement is executed(Variable definition).
        2. Then second conditional statement is evaluted.(True/False)
        3. If true, control flow will evaluted the body of the loop.
        4. Once loop body is finished, control will go back to the statement, and third increment
        statement will be evaluated. 
        5. Again conditional statement is evaluated.
        6. Repeat 2-5.
        */

        // Variations 

        // 1. Infinite loop 
        int i = 0;
        while(i < 10){

        }
        System.out.println("Hello");

        // 2.Infinite For-Loop 
        for(int j = 0; j < 10;  ){
            // No Increament/Decrement
            System.out.println("Hello");
        }
                                                                    /* 
        for(int j = 0;  ;j++){
            System.out.println(j);
        }
                                                            
        
        for loop doesnt requires conditional statements                                                    
        for( ; ; ){
            System.out.println("Hello");
        }                                                   

        Multiple variable can be declared in the for loop
        along with multiple conditions and multiple increament 
        and decrements are possible
        
        for(int a = 0,b = 10; a < 10 && b < 10;a++){
            System.out.println(b);
        }                                                            */
        
       // We alway declare the datatype as int as even if we tried
       // to declare byte,short in for loop it automatically gets type 
       // Promoted into int    
        for(int x = 0; x < 10 ; x++){
            System.out.println(x);
        }
    
        // Nested Loops 
        


    }
}
