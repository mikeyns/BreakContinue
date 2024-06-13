public class BreakContinue {
    
    public static void main( String [] args ) {

        for( int i = 0 ; i < 10 ; i++ ) {

            if( i % 2 == 0) {
                continue; // Se o número for par, pula para a próxima iteração
            }

            System.out.println("The number is " + i );

            if( i == 7 ) {
                break; // Se o número for 7, interrompe o loop
            }
        }
    }
}