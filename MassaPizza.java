import java.util.Scanner;

public class MassaPizza {
    
    public static void main(String[] args) {
        double farinha;
        double agua;
        double fermento;
        double sal; 
        double acucar;
        double peso;       
        double pesoTotal;
        int quantidade;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantas pizzas você quer? ");
        quantidade = teclado.nextInt();
        
        System.out.println("Qual peso em gramas de cada pizza?");
        peso = teclado.nextDouble();
            
               
        pesoTotal = peso * quantidade;
        
        farinha = pesoTotal / 1.6; 
        agua = farinha * 0.6;
        fermento = farinha * 0.02;
        sal = farinha * 0.02;
        acucar = farinha * 0.01;
        
        System.out.println("O peso total da massa será de " + pesoTotal);
        System.out.printf("%.1f gramas de farinha\n", farinha);
        System.out.printf("%.1f ml de agua\n", agua);
        System.out.printf("%.1f gramas de fermento\n", fermento);
        System.out.printf("%.1f gramas de sal\n", sal);
        System.out.printf("%.1f gramas de açucar\n", acucar);
        
        teclado.close();
   
    }
}
