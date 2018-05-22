/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Account;
import Model.Box;
import Model.Document;
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
    private static final String DB_URL = "jdbc:h2:~/oddSystem3";
    private static final String DB_USERNAME = "oddeveloper";
    private static final String DB_PASSWORD = "dev2018fga18gga";
    private Connection connection;
    private Statement stmt;

    private static final String CREATE_TABLES = ""
            + "CREATE TABLE IF NOT EXISTS account "
            + "(accId bigint auto_increment NOT NULL PRIMARY KEY, "
            + " accName VARCHAR(255),"
            + " accPhoto BLOB, "
            + " accLogin TEXT,"
            + " accPassword TEXT);"
            + " "
            + "CREATE TABLE IF NOT EXISTS document "
            + "(docId bigint auto_increment NOT NULL PRIMARY KEY,"
            + "docName TEXT,"
            + "docType VARCHAR(50),"
            + "doc_accId bigint,"
            + "doc_boxId bigint);"
            + " "
            + "CREATE TABLE IF NOT EXISTS box "
            + "(boxId bigint auto_increment NOT NULL PRIMARY KEY,"
            + "boxName VARCHAR(50),"
            + "boxDescription TEXT,"
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
            String sql = "INSERT INTO account (accName, accPhoto, accLogin, accPassword) "
                    + "VALUES "
                    + "('" + acc.getName() + "',"
                    + "FILE_READ('" + acc.getPhotoPath() + "'),"
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
            String sql = "SELECT * FROM account WHERE accLogin = '" + login + "' AND accPassword = '" + password + "';";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                acc.setId(rs.getInt("accId"));
                acc.setName(rs.getString("accName"));
                acc.setPassword(rs.getString("accPassword"));
                acc.setPhoto(rs.getBlob("accPhoto"));
                acc.setLogin(rs.getString("accLogin"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;
    }

    public Account getAccountById(int id) {
        Account acc = new Account();
        try {
            String sql = "SELECT * FROM account WHERE accId = " + id + ";";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                acc.setId(rs.getInt("accId"));
                acc.setName(rs.getString("accName"));
                acc.setPassword(rs.getString("accPassword"));
                acc.setPhoto(rs.getBlob("accPhoto"));
                acc.setLogin(rs.getString("accLogin"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;
    }

    public boolean addBox(Box box) {
        boolean boo = false;
        try {
            String sql = "INSERT INTO box (boxName, boxDescription, box_accId) "
                    + "VALUES "
                    + "('" + box.getName() + "',"
                    + "'" + box.getDescription() + "',"
                    + "'" + box.getAccount_id() + "'"
                    + ");";
            stmt.execute(sql);
        } catch (SQLException ex) {
            boo = true;
            ex.printStackTrace();
        }

        if ((box.getDocuments().size() != 0) && (boo == false)) {
            boo = this.createRalationBoxDoc(box);
        }

        if (boo == false) {
            Warnings.wrngBoxAccountSuccess();
        } else {
            Warnings.wrngAddBoxFail();
        }

        return boo;
    }

    boolean deleteBox(int id) {
        boolean boo = false;
        try {
            String sql = "DELETE FROM box WHERE boxId = '"+id+"';";
            stmt.execute(sql);
        } catch (SQLException ex) {
            boo = true;
            ex.printStackTrace();
        }
        
        return boo;
    }

    private boolean createRalationBoxDoc(Box box) {
        ArrayList<Box> boxes = new DatabaseManager().listBoxByIdAcc(box.getAccount_id());
        Box tBox = new Box();
        Document tDoc = new Document();

        for (Box bx : boxes) {
            if (bx.getName().equals(box.getName()) && bx.getDescription().equals(box.getDescription())) {
                tBox = bx;
            }
        }
        boolean boo = false;
        for (Document doc : box.getDocuments()) {
            DatabaseManager dbm = new DatabaseManager();
            if (dbm.makeRalationBoxDoc(tBox, doc) == true) {
                boo = true;
            }
        }

        return boo;
    }

    private boolean makeRalationBoxDoc(Box tBox, Document doc) {
        boolean boo = false;
        try {
            String sql = "UPDATE document "
                    + "SET doc_boxId = " + tBox.getId() + " "
                    + "WHERE docId = " + doc.getId() + ";";
            stmt.execute(sql);
        } catch (SQLException ex) {
            boo = true;
            ex.printStackTrace();
        }
        return boo;
    }

    public ArrayList<Box> listBoxByIdAcc(int id) {
        ArrayList<Box> boxes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM box WHERE box_accId = " + id + ";";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Box box = new Box();
                box.setId(rs.getInt("boxId"));
                box.setName(rs.getString("boxName"));
                box.setDescription(rs.getString("boxDescription"));
                box.setDocuments(new DatabaseManager().getDocumentsByBoxId(box.getId()));
                box.setAccount_id(id);
                boxes.add(box);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return boxes;
    }

    public ArrayList<Document> getDocumentsByBoxId(int id) {
        ArrayList<Document> docs = new ArrayList<>();

        try {
            String sql = "SELECT * FROM document WHERE doc_boxId = " + id + ";";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Document doc = new Document();
                doc.setId(rs.getInt("docId"));
                doc.setName(rs.getString("docName"));
                doc.setType(rs.getString("docType"));
                doc.setBox_id(rs.getInt("doc_boxId"));
                doc.setAccount_id(rs.getInt("doc_accId"));
                docs.add(doc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return docs;
    }

    public boolean addDocument(Document doc) {
        boolean boo = false;
        try {
            String sql = "INSERT INTO document (docName, docType, doc_accId, doc_boxId)"
                    + " VALUES("
                    + "'" + doc.getName() + "',"
                    + "'" + doc.getType() + "',"
                    + "'" + doc.getAccount_id() + "'";
            if (doc.getBox_id() != 0) {
                sql += ", '" + doc.getBox_id() + "'";
            } else {

                sql += ", '0'";
            }

            sql += ");";
            stmt.execute(sql);
        } catch (SQLException ex) {
            boo = true;
            ex.printStackTrace();
        }
        return boo;
    }

    public ArrayList<Document> listDocsByAccIdToAddBox(int id) {
        ArrayList<Document> docs = new ArrayList<>();

        try {
            String sql = "SELECT * FROM document WHERE doc_accId = " + id + " AND doc_boxId = 0;";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Document doc = new Document();
                doc.setId(rs.getInt("docId"));
                doc.setName(rs.getString("docName"));
                doc.setType(rs.getString("docType"));
                doc.setBox_id(rs.getInt("doc_boxId"));
                doc.setAccount_id(rs.getInt("doc_accId"));
                docs.add(doc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return docs;
    }

    /*   private boolean relationBoxDoc(Box box) {
            
    }*/
 /*
    
    (boxId bigint auto_increment NOT NULL PRIMARY KEY,"
            + "boxName VARCHAR(50),"
            + "boxDescription TEXT,"
            + "dboxFolderName TEXT,"
            + "boxAbsoluthPath TEXT,"
            + "box_accId bigint)
    
     */

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
    public void deletall() {
        try {
            String sql = "DELETE FROM account WHERE accId > 0;";
            stmt.execute(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void drop() {
        try {
            String sql = "DROP ALL OBJECTS";
            stmt.execute(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
