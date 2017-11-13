package com.skillsup.calculator.db;
import java.sql.*;

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


        public static void openDB(){

            try{
                Class.forName("org.postgresql.Driver");

            }catch (ClassNotFoundException e) {
                System.out.println("Where is your PostgreSQL JDBC Driver? "
                        + "Include in your library path!");
                e.printStackTrace();
                return;
            }

            Connection connection = null;

            try{
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://127.0.0.1:5432/CalculatorDBstatistic", "postgres",
                        "pfs222");



            } catch (SQLException e) {

                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return;
            }

            if (connection != null) {
                System.out.println("You made it, take control your database now!");




            } else {
                System.out.println("Failed to make connection!");
            }

        }


        public static void addResult(){

        }

}
