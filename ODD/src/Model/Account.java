/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Guimarães
 */
public class Account {
    private int id;
    private String name;
    private String folder_name;
    private String absolut_path;
    //Relationship between tables   
    private ArrayList<Box> boxes = new ArrayList<Box>();
    private ArrayList<Document> documents = new ArrayList<Document>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFolder_name() {
        return folder_name;
    }

    public void setFolder_name(String folder_name) {
        this.folder_name = folder_name;
    }

    public String getAbsolut_path() {
        return absolut_path;
    }

    public void setAbsolut_path(String absolut_path) {
        this.absolut_path = absolut_path;
    }

    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }
    
}
