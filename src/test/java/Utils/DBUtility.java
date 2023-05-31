package Utils;

import java.sql.*;

public class DBUtility {
    static Connection conn = null;
    static Statement statement = null;
    private static ResultSet rset;
    private static ResultSetMetaData rSetMetaData;
    //this method create connection to DB, execute query and return object for resultset
    public static ResultSet getResultSet(String sqlQuery){
        try {
            conn = DriverManager.getConnection(
                    ConfigReader.getPropertyValue("urldb"),
                    ConfigReader.getPropertyValue("usernamedb"),
                    ConfigReader.getPropertyValue("passworddb"));
            statement = conn.createStatement();
            rset = statement.executeQuery(sqlQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rset;
    }
    //this method will return the object of rsetmetadata
    public static ResultSetMetaData getrSetMetaDa(String query){
        rset = getResultSet(query);
        rSetMetaData = null;
        //we use this line to get the data in tabular format so that
        //we can use these in column keys and values for retrieval operation
        try {
            rSetMetaData = rset.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rSetMetaData;
    }
    //close resultset
    //close statement
    //close connection
    public static void closeResultSet(ResultSet rset){
        if(rset!=null){
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement statement){
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeConnection(Connection conn) {
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
