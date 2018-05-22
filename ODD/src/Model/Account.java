/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.sql.Blob;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Guimarães
 */
public class Account {
    private int id;
    private String login;
    private String password;
    private String name;
    private String photoPath;
    private Blob photo;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
    
}
