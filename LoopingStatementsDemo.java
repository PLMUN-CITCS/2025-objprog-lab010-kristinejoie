public class LoopingStatementsDemo{
    public static void main(String[] args) {

        // While Loop
        System.out.println("While Loop Output: ");
        int count = 1;
        while(count <= 5 ) {
            System.out.println("Count: "+ count);
            count++;
        }
        System.out.println();

        // Do While Loop
        System.out.println("Do While Loop Output: ");
        count = 1;
        do {
            System.out.println("Count: "+ count ); 
            count++;
        } while (count <=5);
        System.out.println();

        // For Loop - Corrected for Even Numbers
        System.out.println("\nFor Loop Output (Even Numbers): ");
        for(int i = 2; i <= 10; i+=2) {
            System.out.println("Even: " + i);
        }

        // Nested Loop
        System.out.println("\nNested Loops Output (3x3 Grid):");
        for (int row= 1; row <=3 ; row++){
            for(int col = 1; col <=3 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Break and Continue
        System.out.println("\nLoop with Break and Continue; ");
        for (int i = 1; i <= 10; i++){
            if (i == 7){
                continue;
            }
            if (i > 8){
                break;
            }
            System.out.println("Number: "+ i);
        }
    }
}