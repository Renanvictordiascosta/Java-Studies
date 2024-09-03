// Importando a biblioteca Scanner
import java.util.Scanner;

public class Main {

// Criando a função principal
  public static void main(String[] args) {

// Declarando as variáveis
    Scanner scanner1 = new Scanner(System.in);
    
    Scanner scanner2 = new Scanner(System.in);
    
    Scanner scanner3 = new Scanner(System.in);

// Chamada dos dados do empregado 1
    Empregado empregado1 = new Empregado(scanner1.nextLine(), scanner1.nextLine(),                        scanner2.nextInt(),                          scanner1.nextLine(),                         scanner3.nextDouble());

// Chamada dos dados do empregado 2
    Empregado empregado2 = new Empregado(scanner1.nextLine(), scanner1.nextLine(),                        scanner2.nextInt(),                          scanner1.nextLine(),                         scanner3.nextDouble());

// Print dos dados registrados do empregado 1
    System.out.println(empregado1.id);
    
    System.out.println(empregado1.nome);

    System.out.println(empregado1.idade);

    System.out.println(empregado1.cargo);
    
    System.out.println(empregado1.salario);

// Print dos dados registrados do empregado 2
    System.out.println(empregado2.id);

    System.out.println(empregado2.nome);

    System.out.println(empregado2.idade);

    System.out.println(empregado2.cargo);

    System.out.print(empregado2.salario);

  }
    
}
  
