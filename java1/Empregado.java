import java.util.Scanner;

public class Empregado {

  Empregado(){

// Variáveis locais
    Scanner scanner1 = new Scanner(System.in);

    Scanner scanner2 = new Scanner(System.in);

    Scanner scanner3 = new Scanner(System.in);
    
    String nome = "Nome Completo";

    int idade = 0;
    
    String cargo = "Cargo";

    double salario = 0.0;

    String carga_horaria = "Carga horária";

// Chamada da função dos dados do usuário
    preenchimento(scanner1, scanner2, scanner3, nome, idade, cargo, salario, carga_horaria);
    
  }

// Função de preenchimento dos dados de usuários
  void preenchimento(Scanner scanner1, Scanner scanner2, Scanner scanner3, String nome, int idade, String cargo, double salario, String carga_horaria){

    System.out.print("Nome Completo do Funcionário: ");

    nome = scanner1.nextLine();

    System.out.print("Idade: ");

    idade = scanner2.nextInt();

    System.out.print("Cargo Ocupado: ");

    cargo = scanner1.nextLine();

    System.out.print("Salário: ");

    salario = scanner3.nextDouble();

    System.out.print("Carga Horária Semanal: ");

    carga_horaria = scanner1.nextLine();

    System.out.println("Nome Completo: " + nome);

    System.out.println("Idade: " + idade);

    System.out.println("Cargo: " + cargo);

    System.out.println("Salário: " + salario);

    System.out.println("CHS: " + carga_horaria);
    
  }
      
}
