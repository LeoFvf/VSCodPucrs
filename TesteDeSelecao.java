import java.util.Scanner;

public class TesteDeSelecao{
    public static void main (String[] args){
       
        int A;
        int B;
        int C;
        int D; 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite valor para A: " );
        A = teclado.nextInt();

        System.out.println("Digite valor para B: " );
        B = teclado.nextInt();
        
        System.out.println("Digite valor para C: " );
        C = teclado.nextInt();
        
        System.out.println("Digite valor para D: " );
        D = teclado.nextInt();

        if(B > C && D > A){
            if(C + D > A + B){
                if(C >= 0 && D >= 0){
                    if( (A % 2) == 0){
                        System.out.println("Valores aceitos");
                    }                                       
                }
            }       
        }

        else{
            System.out.println("Valores nao aceitos");
        }
    }
}