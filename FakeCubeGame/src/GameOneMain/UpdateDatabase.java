package GameOneMain;

import java.sql.*;
import java.sql.ResultSet;

public class UpdateDatabase {
    //https://www.sqlitetutorial.net/sqlite-java/update/
    //https://www.sqlitetutorial.net/sqlite-java/sqlite-jdbc-driver/
    //Queries: https://www.w3schools.blog/delete-query-sqlite

    public UpdateDatabase() {
    }

    public static void main(String[] args) {
        //UpdateDatabase upDB = new UpdateDatabase();
        //updateDB.addData("SQLite My Love");
        //updateDB.dataSyso();
        //updateDB.deleteData(2);
        //upDB.addScore(2);
        addScore(99999999);
    }

    private static Connection connect() {
        String url = "jdbc:sqlite:D:/Workspaces/WS_Main_GitHub/FakeCubeGame/src/GameOneMain/OfficialGameDatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to Database.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }

    public static void deleteData(int id) {
        String sql = "DELETE FROM namesOfPeople WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted Successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getScores() {
        String sql = "SELECT nameColumn FROM namesOfPeople";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("nameColumn"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addScore(int intInput) {
        //String sql = "ALTER TABLE namesOfPeople RENAME TO namesOfPeople1";
        //String sql = "SELECT * FROM namesOfPeople";

        String sql = "INSERT INTO scores(daten) VALUES(?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, intInput);
            pstmt.executeUpdate();
            System.out.println("Added your Score of: " + intInput);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
