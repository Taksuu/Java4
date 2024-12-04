import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0; 
        int maior1 = Integer.MIN_VALUE; 
        int maior2 = Integer.MIN_VALUE; 

        
        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            int numero = scanner.nextInt(); 

            
            if (numero > maior1) {
                maior2 = maior1; 
                maior1 = numero; 
            } else if (numero > maior2) { 
                maior2 = numero; 
            }

            contador++; 
        }

        
        System.out.println("Os dois maiores números digitados são: " + maior1 + " e " + maior2);
        scanner.close(); 
    }
}