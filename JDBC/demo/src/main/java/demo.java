/*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
*/

// IMPORT PACKAGE
import java.sql.*;

class read {
  void show(ResultSet rs) throws SQLException {
    while (rs.next()) {
        
      System.out.println(
          rs.getInt(1) + " " +
              rs.getString(2) + " " +
              rs.getString(3) + " " +
              rs.getString(4));
    }
    System.out.println("-----------------------");
  }
}

public class demo {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    int x = 101;
    String team = "Sacramento Kings";
    String city = "Sacramento";
    String abbr = "SAC";
    String var_sql = "insert into nba.teams values(?,?,?,?)";
    // -----------CONNECT TO POSTGRESQL--------------------
    // LOAD AND REGISTER
    String url = "jdbc:postgresql://localhost:5432/basketball";
    String username = "danish";
    String pass = "12345";
    Class.forName("org.postgresql.Driver");

    // --------------------CREATE CONNECTION----------------------
    Connection con = DriverManager.getConnection(url, username, pass);

    // --------------------CREATE STATEMENT----------------------
    Statement st = con.createStatement();
    PreparedStatement pst = con.prepareStatement(var_sql);
    pst.setInt(1, x);
    pst.setString(2, team);
    pst.setString(3, city);
    pst.setString(4, abbr);
    pst.execute();

    // --------------------CRUD IS execute STATEMENT----------------------
    // C R U D ---> Read uses executeQuery and create, update, delete uses execute
    // or executeUpdate

    // CREATE
    /*
     * String sqlInsert =
     * "insert into nba.teams values( 5,'Toronto Raptors','Chicago','TOR')";
     */
    // st.execute(sqlInsert);

    // -------------------READ------------------
    String sqlQuery = "select * from nba.teams";
    ResultSet rs = st.executeQuery(sqlQuery);
    read rd = new read();
    rd.show(rs);

    // --------------UPDATE -------------------
    // String sqlUpdate = "update nba.teams set abbreviation='NYK' where team_id=3";
    // st.execute(sqlUpdate);

    // --------------DELETE-------------------
    // String sqlDelete = "delete from nba.teams where team_id=2";
    // st.execute(sqlDelete);

    // ---------------CLOSE----------------------
    con.close();
    System.out.println("Connection Established");
  }
}

/*
 * sudo -u postgres psql
 * \c basketball
 * \dn list all the schema of db for eg basketball
 * \dt list all the table of a schema eg: \dt nba.*
 */
