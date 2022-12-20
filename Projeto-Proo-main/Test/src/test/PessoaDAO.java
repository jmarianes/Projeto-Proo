package test;

import java.sql.*;
        
public class PessoaDAO {
    Connection conexao;
    public PessoaDAO(){
        conexao= new Conexao().getConexao();
    }
    public void inserirPessoa(Pessoa p){
            try{
    PreparedStatement ps = conexao.prepareStatement("insert into Pessoa(nome, email, cpf, idade, cidade, usuario, senha) values(?,?,?,?,?,?,?)");
            ps.setString(1, p.getNome());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getCpf());
            ps.setInt(4, p.getIdade());
            ps.setString(5, p.getCidade());
            ps.setString(6, p.getUsuario());
            ps.setString(7, p.getSenha());
            ps.executeUpdate();
            System.out.println("\n Pessoa inserida com sucesso");
        }catch(Exception e){
            System.out.println("Erro:"+e);
        }
}
}
    
    
    

