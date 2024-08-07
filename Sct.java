// Importando a biblioteca Scanner
import java.util.Scanner;

public class Sct {

  public static void main(String[] args) {

    int contador = 0;

//Condicional para manter o sistema funcionando até ser encerrado devidamente
    do{
        
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Olá, esse é o SCT(Sistema de Conversão de Temperaturas)!");
      
      System.out.print("Ele converte temperaturas entre: ");
      
      System.out.println("Kelvin, Fahrenheit e Celsius.");
      
      System.out.println("Digite o número equivalente a uma das opções a seguir.");
      
      System.out.println("(1) - Fornecer temperatura em Celsius");
      
      System.out.println("(2) - Fornecer temperatura em Fahrenheit");
      
      System.out.println("(3) - Fornecer temperatura em Kelvin");
      
      System.out.println("(4) - Encerrar o SCT");
      
      System.out.print("Digite a operação desejada: ");
      
      int operacao = scanner.nextInt();
      
      System.out.println(" ");
      
// Administrar a opção selecionada
      switch (operacao) {
        
// Ler e converter Celsius, enquanto trata erros
        case 1:
            
          System.out.print("Temperatura(em Celsius): ");
          
          double temperatura1 = scanner.nextDouble();
          
          try {
          
            if (temperatura1 < -273.15) {
                  
              System.out.println("Temperatura fora do limite inferior teórico!");
              
              System.out.println(" ");
                  
            } else {
                
              System.out.println(temperatura1 + " Celsius é equivalente:");
                  
              caso_celsius(temperatura1);
                  
            }
              
          } 
          
          catch (NumberFormatException e) {
              
            System.out.println("Dados de temperatura inválidos!");
            
            System.out.println(" ");
              
          }
          
          break;

// Ler e converter Fahrenheits, enquanto trata erros           
        case 2:
            
          System.out.print("Temperatura(em Fahrenheit): ");
            
          double temperatura2 = scanner.nextDouble(); 
          
          try {
          
            if (temperatura2 < -459.67) {
                  
              System.out.println("Temperatura fora do limite inferior teórico!");
              
              System.out.println(" ");
                  
            } else {
                
              System.out.println(temperatura2 + " Fahrenheits é equivalente:");
                  
              caso_fahrenheit(temperatura2);
                  
            }
              
          }
          
          catch (NumberFormatException e) {
              
            System.out.println("Dados de temperatura inválidos!");
            
            System.out.println(" ");
              
          }
          
          break; 
          
// Ler e converter Kelvins, enquanto trata erros
        case 3:
          
          System.out.print("Temperatura(Kelvin): ");
          
          double temperatura3 = scanner.nextDouble();
          
          try {

          
            if (temperatura3 < 0) {
                  
              System.out.println("Temperatura fora do limite inferior teórico!");
              
              System.out.println(" ");
                  
            } else {
                
              System.out.println(temperatura3 + " Kelvins é equivalente:");
                  
              caso_kelvin(temperatura3);
                  
            }
              
          }
          
          catch (NumberFormatException e){
              
            System.out.println("Dados de temperatura inválidos!");
            
            System.out.println(" ");
              
          }
        
          break;
        
// Encerrar o programa totalmente
        case 4:
            
          System.out.println("Obrigado por usar o SCT!");
            
          System.out.println("Até a próxima!");
            
          contador = 4;
          
          break;
       
// Tratar em caso de valor de opção inválida  
        default:
        
          System.out.println("O valor que você digitou é inválido!");
          
          System.out.println(" ");
        
      }
        
    } while(contador != 4);
    
  }
  
// Função de converter Kelvin para Celsius e Fahrenheit
  static void caso_kelvin(double ke) {
      
    double ce = ke - 273.15;
    
    System.out.println(ce + " Celsius");
    
    double fa = (ke - 273.15) * (9 / 5) + 32;
    
    System.out.println(fa + " Fahrenheits");
    
    System.out.println(" ");
      
  }
  
// Função de converter Celsius para Fahrenheit e Kevin
  static void caso_celsius(double ce) {
      
    double ke = ce + 273.15;
    
    System.out.println(ke + " Kelvins");
    
    double fa = (ce * (9 / 5)) + 32;
    
    System.out.println(fa + " Fahrenheits");
    
    System.out.println(" ");
      
  }
  
// Função de converter Fahrenheit para Celsius e Kevin
  static void caso_fahrenheit(double fa) {
      
    double ce = (fa - 32) * (5 / 9);
    
    System.out.println(ce + " Celsius");
    
    double ke = (fa - 32) * (5 / 9) + 273.15;
    
    System.out.println(ke + " Kelvins");
    
    System.out.println(" ");
      
  }
    
}