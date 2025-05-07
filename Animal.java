public class Animal{

     // ATRIBUTOS
     private String nome;
     private String tipo;
     private int idade;
     private int energia;
     private int felicidade;


     // MÉTODO CONSTRUTOR
     public Animal(String nome, String tipo,int idade){
          this.nome = nome;
          this.tipo = tipo;
          this.idade = idade;
          this.setEnergia(100);
          this.setFelicidade(100);
     }

  

     public void mostrarStatus(){
          System.out.println("-----------------------------");
          System.out.println("NOME: " + getNome());
          System.out.println("TIPO DO ANIMAL: " + getTipo());
          System.out.println("ENERGIA: " + getEnergia());
          System.out.println("FELICIDADE: " + getFelicidade());
          System.out.println("----------------------------");
     }

     public void alimentar(){
          System.out.println(getNome() + " FOI ALIMENTADO!");
          this.energia = this.energia + 10;
          
     }

     public void brincar(){
          System.out.println(getNome() + " ESTÁ BRINCANDO E ESTÁ MAIS FELIZ!");
          this.felicidade = this.felicidade + 10;
          this.energia = this.energia - 5;
     }

     public void dormir(){
          System.out.println(getNome() + " DORMIU E ESTÁ COM A ENERGIA MÁXIMA!");
          this.energia = 100;

     }
     public String getNome(){
          return nome;
     }
     public void setNome(String nome){
          this.nome = nome;
     }
     public String getTipo(){
          return tipo;
     }
     public void setTipo(String tipo){
          this.tipo = tipo;
     }
     public int getIdade(){
          return idade;
     }
     public void setIdade(int idade){
          this.idade = idade;
     }
     public int getEnergia(){
          return energia;
     }
     public void setEnergia(int energia){
          this.energia = energia;
     }
     public int getFelicidade(){
          return felicidade;
     }
     public void setFelicidade(int felicidade){
          this.felicidade = felicidade;
     }


}