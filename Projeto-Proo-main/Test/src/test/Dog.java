package test;

public class Dog {
    private String nome;
    private String raca;
    private int idade;
    private String sexo;
   
    

    public Dog(String nome, String raca,int idade, String sexo){
        this.nome = nome;
        this.raca =raca;
        this.idade = idade;
        this.sexo= sexo;
       
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome =nome;
    }
    
     public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
     public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    
}
