package capa_datos;
import java.sql.*;
public class conexion {
    private final String url="jdbc:mysql://localhost:3306/BarTheTapRoom";
    private final String user="root";
    private final String pwd="";
    public conexion(){}
    public ResultSet Listar(String Cad){
        try{
            Connection cn = DriverManager.getConnection(url,user,pwd);
            PreparedStatement da= cn.prepareStatement(Cad);
            ResultSet tbl = da.executeQuery();
        }
        catch (SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
        return null;
    }
    public String Ejecutar(String Cad){
        try {
            Connection cn = DriverManager.getConnection(url,user,pwd);
            PreparedStatement da= cn.prepareStatement(Cad);
            int r = da.executeUpdate();
            return "Se afectaron "+ r + " filas";
        }
        catch (SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return "Error "+e.getMessage();
        }
    }

}
