/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
    private static final String DB_URL = "jdbc:h2:~/ODDSystem";
    private static final String DB_USERNAME = "ODDDeveloper";
    private static final String DB_PASSWORD = "dev2018fga18gga";
    private Connection connection;
    private Statement stmt;

    private static final String CREATE_TABLES = ""
            + "CREATE TABLE IF NOT EXISTS account "
            + "(accId bigint auto_increment NOT NULL PRIMARY KEY, "
            + " accName VARCHAR(255), "
            + " accFolderName TEXT, "
            + " accAbsoluthPath TEXT);"
            
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
            + "box_accId big);";

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
        }
    }

/*
    public void addBook(Book boook) {
        try {
            String sql = "INSERT INTO BOOKS (booktitle, bookauthor, editiondate) VALUES ('" + boook.getBookTitle() + "',"
                    + " '" + boook.getBookAuthor() + "', '" + boook.getEditionDate() + "')";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void removeBook(String keyword) {
        try {
            String sql = "DELETE FROM BOOKS  where bookid =  '" + keyword + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList<>();

        try {
            String sql = "SELECT * FROM BOOKS";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Book book = new Book();
                book.setBookId(rs.getString("bookid"));
                book.setBookTitle(rs.getString("booktitle"));
                book.setBookAuthor(rs.getString("bookauthor"));
                book.setEditionDate(rs.getString("editiondate"));
                books.add(book);
            }
            return books;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
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
