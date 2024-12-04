import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Quantos alunos há na sala? ");
        int numeroDeAlunos = scanner.nextInt();
        
        double somaDasNotas = 0; 
        int contador = 0; 

    
        while (contador < numeroDeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble(); 
            somaDasNotas += nota; 
            contador++;
        }

        
        double media = somaDasNotas / numeroDeAlunos;

        
        System.out.println("A média aritmética da turma é: " + media);
        scanner.close(); 
    }
}