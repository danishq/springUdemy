import javax.xml.transform.Result;
import java.sql.*;
public class demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       String url="jdbc:postgresql://localhost:5432/demo";
       String username="myuser";
       String pass="12345";
       String query = "select * from users";
       
       Class.forName("org.postgresql.Driver");
       Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println(
                    rs.getInt("id")+ " "+rs.getString("name")+" "+rs.getString("email")
            );
        }
       System.out.println("Connection Established");
    }
}
