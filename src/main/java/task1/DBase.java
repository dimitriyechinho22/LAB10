package task1;

import java.sql.*;
import java.util.Objects;

public class DBase {
    private static DBase instance;
    private  Connection c;

    private DBase() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:one.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");

        try {
            Statement stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS USER" +
                    "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " NAME           TEXT, " +
                    " EMAIL            TEXT, " +
                    " AGE         INTEGER)";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static DBase creation() {
        instance = Objects.requireNonNullElseGet(instance, DBase::new);
        return instance;
    }

    public void add_one_user(User user) {
        try {
            Statement stmt = c.createStatement();
            String sql = "INSERT INTO USER (NAME,EMAIL,AGE) " +
                    "VALUES ('"+user.getName()+"', '"+user.getEmail()+"', "+user.getAge()+" );";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("User saved successfully");
    }


}