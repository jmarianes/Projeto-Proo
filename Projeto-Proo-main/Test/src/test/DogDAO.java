package test;
import java.sql.*;

public class DogDAO {
    Connection conexao;
    public DogDAO(){
        conexao= new Conexao().getConexao();
    }
    public void inserirDog(Dog d){
            try{
    PreparedStatement ps = conexao.prepareStatement("insert into Dog(nome,raca,idade,sexo) values(?,?,?,?)");
            ps.setString(1, d.getNome());
            ps.setString(2, d.getRaca());
            ps.setInt(3, d.getIdade());
            ps.setString(4, d.getSexo());
            ps.executeUpdate();
            System.out.println("\n Doguinho inserido com sucesso!!");
        }catch(Exception e){
            System.out.println("Erro:"+e);
        }
}
}
    

