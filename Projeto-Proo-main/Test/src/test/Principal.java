package test;

import java.sql.*;

public class Principal {
    public static void main(String args[]){
        
       Connection conexao = new Conexao().getConexao();   
       
       Pessoa p = new Pessoa("Camila","123.345.678-33", "camilalima@gmail.com", 18, "Arapiraca", "camilalima","evell233" );
    
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Pessoa(nome, cpf, email,idade,cidade, usuario, senha) values(?,?,?,?,?,?,?)");
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getEmail());
            ps.setInt(4, p.getIdade());
            ps.setString(5, p.getCidade());
            ps.setString(6, p.getUsuario());
            ps.setString(7, p.getSenha());

  
            ps.executeUpdate();
            System.out.println("\n Pessoa inserida com sucesso");
        }catch(SQLException e){
            System.out.println("Erro:"+e);
        }
        
        
        
        Dog d = new Dog("camila","viralata",1,"feminino" );
    
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Dog(nome,raca, idade, sexo) values(?,?,?,?)");
           ps.setString(1, d.getNome());
            ps.setString(2, d.getRaca());
            ps.setInt(3, d.getIdade());
            ps.setString(4, d.getSexo());
            ps.executeUpdate();
            System.out.println("\n Doguinho inserido com sucesso!!");
        }catch(SQLException e){
            System.out.println("Erro:"+e);
        }
        
        
        
        

            
            
    }
}
    
   
