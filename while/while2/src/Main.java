import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        
        int contador = 1; 

       
        while (contador <= N) {
            System.out.println(contador); 
            contador++; 
        }

        scanner.close(); 
    }
}