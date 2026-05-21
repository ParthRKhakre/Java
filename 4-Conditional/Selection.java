public class Selection {
    public static void main(String[] args) {

        // Selection Statement
        // if(condition)
        // if-else(condition)
        // switch(condition)


        // if-else ladder
        int j = 2;
        if(j % 2 == 0){
            System.out.println("Even Value");
        }else if(j == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Odd Value");
        }
       
        // Switch condition is more optimize than if-else ladder
        // switch(condition){
        //       case 1:
        //            System.out.println();
        //       ....
        //       ....
        //      default:
        //            break;
        // }

        int i = 3;
        switch(i){
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");    
                break;
            case 3:
                System.out.println("i is 3");    
                break;
            default:
                System.out.println("Default");
                break;        
        }

        // switch have limited use case as the switch(expression) must evaluate to byte,int,short,char,Enumeration.
        // No duplicate cases allowed
        // After JDK-7 Strings can also be used as switch expression
        // After JDK-14 switch case was enhanace alot

    }
    
}
