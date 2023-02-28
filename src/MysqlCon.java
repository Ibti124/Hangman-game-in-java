import javax.swing.*;
import java.sql.*;
class MysqlCon{
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","0000");
        }catch(Exception e){System.out.println(e);
            JOptionPane.showMessageDialog(null,"connection failed+");
        }
	return con;

    }

}
