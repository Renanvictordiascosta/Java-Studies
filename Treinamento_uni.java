import java.util.Scanner;

public class Treinamento_uni {
    

// Treino de Arrays unidimensionais
  public static void main(String[] args) {
      
    String[] lista_de_veiculos = new String[3];
      
    Scanner scanner = new Scanner(System.in);
      
    for(int i = 0; i <= 2; i++) {
        
      System.out.print("Veículo armazenado: ");
     
      String veiculo = scanner.nextLine();
     
      lista_de_veiculos[i] = veiculo;
      
    }
    
    for(int j = 0; j <= 2; j++){
    
      int i = j + 1;
    
      System.out.println("Carro na posição " + i + ": " + lista_de_veiculos[j]);
        
    }
      
  }
    
}
