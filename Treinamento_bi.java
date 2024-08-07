import java.util.Scanner;

public class Treinamento_bi {
    
// Treino de Arrays bidimensionais
  public static void main(String[] args) {
      
    String[][] lista = new String[2][3];
      
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Sistema de Cadastro de Funcionários");
     
    for(int i = 0; i < 2; i++) {
        
      int z = i + 1;
        
      for(int j = 0; j < 3; j++) {
        
        if(j == 0) {
        
          System.out.print("Nome da pessoa " + z + ": ");
        
          String nome = scanner.nextLine();
          
          lista[i][j] = nome;
        
        } else
        
        if(j == 1) {
        
          System.out.print("Idade da pessoa " + z + ": ");
        
          String idade = scanner.nextLine();
          
          lista[i][j] = idade;
        
        } else
        
        if(j == 2) {
        
          System.out.print("Cargo da pessoa " + z + ": ");
        
          String cargo = scanner.nextLine();
          
          lista[i][j] = cargo;
        
        }
          
      }
      
    }
    
    for(int i = 0; i < 2; i++) {
        
      System.out.print("Nome: " + lista[i][0] + "|");
      
      System.out.print("Idade: " + lista[i][1] + "|");
      
      System.out.println("Cargo: " + lista[i][2]);
        
    }
      
  }
    
}
