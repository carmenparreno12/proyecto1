
package proyecto1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion{
public  Connection con;
public conexion(){
   try{
     Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/datosprueba","root","");

    }catch(ClassNotFoundException e){
     System.err.println("Driver no encontrado:"+ e.getMessage());
    
     }catch(SQLException e){
      System.err.println("error de conexión:" +e.getMessage());      
    }
}
   public void close(){
       try {
           if(con!=null&&!con.isClosed()){
               con.close();
           }
       } catch (SQLException e){
        System.err.println("Error al cerrar la conexión");
       }
}
public static void main(String[] args) {
    conexion cn = new conexion();
    cn.close();
    }
    
    }
    
   
    

