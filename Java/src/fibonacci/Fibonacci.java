package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        long g = 1;
        long h = 0;
        int b = 0;
        int s = 0;
        int i = 0;
        int l = 0;
        
        
        for (int j = 0; j < 200; j++) { 
            h = (long)(g - h);
            g = (long)(g + h);
            if ( h > Byte.MAX_VALUE && b == 0){
                System.out.println("Al calcular el Fibonacci(n) de n = "+ (j+1) + " se produce overflow "
                        + "en la variable de tipo byte.");
                b = 1;
            }
            if ( h > Short.MAX_VALUE && s == 0){
                System.out.println("Al calcular el Fibonacci(n) de n = "+ (j+1) + " se produce overflow "
                        + "en la variable de tipo short.");
                s = 1;
            }
            if ( h > Integer.MAX_VALUE && i == 0){
                System.out.println("Al calcular el Fibonacci(n) de n = "+ (j+1) + " se produce overflow "
                        + "en la variable de tipo int.");
                i = 1;
            }
            if ( h < 0 && l == 0){
                System.out.println("Al calcular el Fibonacci(n) de n = "+ (j+1) + " se produce overflow "
                        + "en la variable de tipo long.");
                l = 1;
                break;
           
            }
        }
           
    }
    
}
