package primeiro_exemplo.modelos;

 public class Pessoa {
     //Atributo
    public String nome;
    public int idade;

      
    //Método 
    public boolean verificarMarioridade() {
        return this.idade >= 18;
        
    }
}
