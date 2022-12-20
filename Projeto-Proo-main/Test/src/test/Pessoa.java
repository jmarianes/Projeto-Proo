package test;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    private int idade;
    private String cidade;
    private String usuario;
    private String senha;
    

    public Pessoa(String nome,String email, String cpf, int idade,String cidade, String usuario, String senha){
        this.cidade = cidade;
        this.idade = idade;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

   public void setCidade(String cidade) {
        this.cidade= cidade;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = usuario;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}


