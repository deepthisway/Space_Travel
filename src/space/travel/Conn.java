package space.travel;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn()  {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///SpaceTravel", "root", "Deep@3574");
            s = c.createStatement();
        } catch(exception e)    {
//            System.out.println(e);

        }
    }

}


// we have used JDBC here for the database connectivity
