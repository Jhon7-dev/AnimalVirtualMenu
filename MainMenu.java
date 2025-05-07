import java.util.Scanner;

public class MainMenu {
     public static void main(String[] args) {
          
          Scanner scanner = new Scanner(System.in);
          Animal animal = new Animal(null, null, 0);
          char opcao ;
          boolean cadastrado = false;
 
          do{
               System.out.println("===== MENU =====");
               System.out.println("1 - Cadastrar Animal");
               System.out.println("2 - Alimentar");
               System.out.println("3 - Brincar");
               System.out.println("4 - Dormir");
               System.out.println("5 - Mostar Status");
               System.out.println("6 - Sair");
               opcao = scanner.nextLine().charAt(0);
               
               switch (opcao) {
                    case '1':{
                         System.out.println("=== CADASTRO ===");
                         System.out.println("NOME: " );
                         animal.setNome(scanner.nextLine());
                         System.out.println("TIPO: ");
                         animal.setTipo(scanner.nextLine());
                         System.out.println("IDADE: ");
                         animal.setIdade(scanner.nextInt());
                         scanner.nextLine();
                         System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                         System.out.println("O ANIMAL DE NOME " + animal.getNome() + " É DO TIPO " + animal.getTipo() + " E TEM A IDADE  " + animal.getIdade() + " ANOS." );
                         break;
                    }
                    case '2':{
                         if(animal!=null){

                              animal.alimentar();
                              animal.mostrarStatus();
                         }else{
                              System.out.println("PRECISA CADASTRAR O ANIMAL!");
                         }
                         break;
                    }
                    case '3':{
                         if(animal!=null){

                              animal.brincar();
                              animal.mostrarStatus();
                         }else{
                              System.out.println("PRECISA CADASTRAR O ANIMAL!");
                         }
                         break;
                    }
                    case '4':{
                         if(animal!=null){
                              animal.dormir();
                              animal.mostrarStatus();
                         }else{
                              System.out.println("PRECISA CADASTRAR O ANIMAL!");
                         }
                         break;
                    }
                    case '5':{
                         if (animal != null) {
                              animal.mostrarStatus();
                         }else{
                              System.out.println("PRECISA CADASTAR O ANIMAL!");
                         }
                         break;
                    }
                    case '6':{

                        // System.out.println("PROGRAMA ENCERRADO!");
                         break;
                    }
                    default:
                    System.out.println("OPCÃO INVÁLIDA.");
                    break;
               }
               
               
          }while(opcao != '6');
          System.out.println("PROGRAMA ENCERRADO!");
          
     }
}
