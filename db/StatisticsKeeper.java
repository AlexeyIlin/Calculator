package com.skillsup.calculator.db;
import java.sql.*;
import java.time.LocalDateTime;

/**
 * Created by Aleksey on 06.11.2017.
 */
public class StatisticsKeeper {


    private StatisticsKeeper(){
    }

    private static StatisticsKeeper instance = null;

    public static synchronized StatisticsKeeper getInstance() {

        if (instance == null){
            instance = new StatisticsKeeper();

        }
        return instance;
    }


        public static Connection openDB(){

            try{
                Class.forName("org.postgresql.Driver");

            }catch (ClassNotFoundException e) {
                System.out.println("Where is your PostgreSQL JDBC Driver? "
                        + "Include in your library path!");
                e.printStackTrace();
                return null;
            }

            Connection connection = null;

            try{
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://127.0.0.1:5432/CalculatorDBstatistic", "postgres",
                        "pfs222");



            } catch (SQLException e) {

                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return null;
            }

            if (connection != null) {
                System.out.println("You made it, take control your database now!");
                return connection;



            } else {
                System.out.println("Failed to make connection!");
                return null;
            }

        }


        public static void addResult(Connection connection){

            LocalDateTime time = LocalDateTime.now();
            try{
                Statement st = connection.createStatement();
                DatabaseMetaData meta = connection.getMetaData();
                //if (meta.getTables(null, null, "OPERATIONS_STATISTICS" , new String[] {"TABLE"}) != "OPERATIONS_STATISTICS"){
                    st.executeQuery("CREATE TABLE OPERATIONS_STATISTICS (Date DATE , STATUS VARCHAR )");
                //}

                st.executeUpdate("INSERT INTO OPERATIONS_STATISTICS (Date , STATUS) VALUES(CURRENT_DATE , successful)");
                connection.close();

            }catch (SQLException sqle){
                System.out.println("Could not connect");
            }finally{
                try {
                    connection.close();
                }catch (SQLException sqle){

                }
            }

        }

}
