/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Document;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Guimarães
 */
public class DocumentControl {
    public static boolean addDocument(Document doc){
        DatabaseManager dbm = new DatabaseManager();
        return dbm.addDocument(doc);
    }

    public static ArrayList<Document> listDocsByAccIdToAddBox(int id) {
        DatabaseManager dbm = new DatabaseManager();
        return dbm.listDocsByAccIdToAddBox(id);
    }

    public static ArrayList<Document> listDocsByAccId(int id) {
        DatabaseManager dbm = new DatabaseManager();
        return dbm.listDocsByAccId(id);
    }

    public static boolean delete(int id) {
        DatabaseManager dbm = new DatabaseManager();
        return dbm.deleteDocument(id);
    }
}
