/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Box;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Guimarães
 */
public class BoxControl {
    public static boolean addBox(Box box){
        DatabaseManager dbm = new DatabaseManager();
        return dbm.addBox(box);
    }
    
    public static ArrayList<Box> listBoxByIdAcc(int id){
        DatabaseManager dbm = new DatabaseManager();
        return dbm.listBoxByIdAcc(id);
    }
}
