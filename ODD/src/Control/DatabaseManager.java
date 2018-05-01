/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Account;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filippo-TheAppExpert
 */
public class DatabaseManager {

    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/oddSystem";
    private static final String DB_USERNAME = "oddeveloper";
    private static final String DB_PASSWORD = "dev2018fga18gga";
    private Connection connection;
    private Statement stmt;

    private static final String CREATE_TABLES = ""
            + "CREATE TABLE IF NOT EXISTS account "
            + "(accId bigint auto_increment NOT NULL PRIMARY KEY, "
            + " accName VARCHAR(255),"
            + " accPhoto BLOB, "
            + " accFolderName TEXT, "
            + " accAbsoluthPath TEXT,"
            + " accLogin TEXT,"
            + " accPassword TEXT);"
            + " "
            + "CREATE TABLE IF NOT EXISTS document "
            + "(docId bigint auto_increment NOT NULL PRIMARY KEY,"
            + "docType VARCHAR(50),"
            + "docFileName TEXT,"
            + "docAbsoluthPath TEXT,"
            + "doc_accId bigint,"
            + "box_docId bigint);"
            + " "
            + "CREATE TABLE IF NOT EXISTS box "
            + "(boxId bigint auto_increment NOT NULL PRIMARY KEY,"
            + "boxName VARCHAR(50),"
            + "boxDescription TEXT,"
            + "dboxFolderName TEXT,"
            + "boxAbsoluthPath TEXT,"
            + "box_accId bigint);";

    public DatabaseManager() {
        openConnection();
    }

    public void openConnection() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            stmt = connection.createStatement();
            stmt.execute(CREATE_TABLES);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public boolean addAccount(Account acc) {
        boolean boo = false;
        try {
            String sql = "INSERT INTO account (accName, accPhoto, accFolderName, accAbsoluthPath, accLogin, accPassword) "
                    + "VALUES "
                    + "('" + acc.getName() + "',"
                    + "FILE_READ('" + acc.getPhotoPath() + "'),"
                    + "'" + acc.getFolder_name() + "',"
                    + "'" + acc.getAbsolut_path() + "',"
                    + "'" + acc.getLogin() + "',"
                    + "'" + acc.getPassword() + "'"
                    + ");";
            stmt.execute(sql);
            Warnings.wrngAddAccountSuccess();
        } catch (SQLException ex) {
            boo = true;
            Warnings.wrngAddAccountFail();
        }
        return boo;
    }

    public void deletall() {
        try {
            String sql = "DELETE FROM account WHERE accId > 0;";
            stmt.execute(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> accs = new ArrayList<>();

        try {
            String sql = "SELECT * FROM account;";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getInt("accId"));
                acc.setName(rs.getString("accName"));
                acc.setPassword(rs.getString("accPassword"));
                acc.setPhoto(rs.getBlob("accPhoto"));
                acc.setFolder_name(rs.getString("accFolderName"));
                acc.setAbsolut_path(rs.getString("accAbsoluthPath"));
                acc.setLogin(rs.getString("accLogin"));
                accs.add(acc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accs;
    }

    public int checkLoginPasswordCreating(String login, String password) {
        int count = 0;
        try {
            String sql = "SELECT COUNT(accId) FROM account WHERE accLogin = '" + login + "' OR accPassword =  '" + password + "';";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Account acc = new Account();
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(count);
        return count;
    }

    public int checkLoginPasswordLog(String login, String password) {
        int count = 0;
        try {
            String sql = "SELECT COUNT(accId) FROM account WHERE accLogin = '" + login + "' AND accPassword =  '" + password + "';";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Account acc = new Account();
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public Account makeLogin(String login, String password) {
        Account acc = new Account();
        try {
            String sql = "SELECT * FROM account WHERE accLogin = '"+login+"' AND accPassword = '"+password+"';";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                acc.setId(rs.getInt("accId"));
                acc.setName(rs.getString("accName"));
                acc.setPassword(rs.getString("accPassword"));
                acc.setPhoto(rs.getBlob("accPhoto"));
                acc.setFolder_name(rs.getString("accFolderName"));
                acc.setAbsolut_path(rs.getString("accAbsoluthPath"));
                acc.setLogin(rs.getString("accLogin"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;
    }

    /*
    public void removeBook(String keyword) {
        try {
            String sql = "DELETE FROM BOOKS  where bookid =  '" + keyword + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    


    public void updateBook(Book book) {
        try {
            String sql = "UPDATE BOOKS set booktitle = '" + book.getBookTitle() + "', bookauthor = '" + book.getBookAuthor() + "',"
                    + " editiondate = '" + book.getEditionDate() + "' where bookid =  '" + book.getBookId() + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public boolean search(String keyword) {
        try {
            String sql = "SELECT * FROM BOOKS WHERE bookid = '" + keyword + "'";
            ResultSet rs = stmt.executeQuery(sql);
            int size = 0;
            if (rs != null) {
                rs.beforeFirst();
                rs.last();
                size = rs.getRow();
            }

            return size > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }*/
}
