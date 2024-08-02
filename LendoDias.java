// Importando a biblioteca Scanner
import java.util.Scanner;

public class LendoDias {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Dia atual: ");

    String dia = scanner.nextLine();

    // Colocando opções com base na leitura da variável dia
    switch (dia) {

      case "Domingo":
        System.out.print("1");
        break;
        
      case "Segunda":
        System.out.print("2");
        break;

      case "Terça":
        System.out.print("3");
        break;

      case "Quarta":
        System.out.print("4");
        break;

      case "Quinta":
        System.out.print("5");
        break;

      case "Sexta":
        System.out.print("6");
        break;

      case "Sábado":
        System.out.print("7");
        break;
        
    }
    
    }
    
  }
  
