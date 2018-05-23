/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Gabriel Guimarães
 */
public class Warnings {

    public static void wrngEmptyFields() {
        JOptionPane.showMessageDialog(null, "Fill in the fields.");
    }

    public static void wrngNoSelection() {
        JOptionPane.showMessageDialog(null, "No selection.");
    }

    public static void wrngPasswordDiff() {
        JOptionPane.showMessageDialog(null, "Passwords are not the same");
    }

    static void wrngLogPasExist() {
        JOptionPane.showMessageDialog(null, "Login and(or) password already exists.");
    }

    static void wrngAddAccountSuccess() {
        JOptionPane.showMessageDialog(null, "Account created!");
    }

    static void wrngAddAccountFail() {
        JOptionPane.showMessageDialog(null, "Account create fail!");
    }

    static void wrngAccountDontExist() {
        JOptionPane.showMessageDialog(null, "Account  doesn't exists.");
    }

    public static int wrngConfirmLogout() {
        return JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?");
    }

    public static void wrngNotLogged() {
        JOptionPane.showMessageDialog(null, "You can't do this!\n You aren't logged..");
    }

    static void wrngAddBoxFail() {
        JOptionPane.showMessageDialog(null, "Box create fail!");
    }

    static void wrngBoxAccountSuccess() {
        JOptionPane.showMessageDialog(null, "Box created!");
    }

    public static void wrngAddDocumentFail() {
        JOptionPane.showMessageDialog(null, "Document create fail!");
    }

    public static void wrngAddDocumentSucces() {
        JOptionPane.showMessageDialog(null, "Document created!");
    }

    public static int wrngConfirmDelete() {
        return JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?");
    }

    public static String wrngTypeYourPassword() {
        JLabel label = new JLabel("To delete, type your password:");
        JPasswordField jpf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, new Object[]{label, jpf}, "Password:", JOptionPane.OK_CANCEL_OPTION);
        String senha = jpf.getText();
        return senha;
    }

    public static void wrngCannotDeleteBoxCauseDocs() {
        JOptionPane.showMessageDialog(null, "You can't delete this box, because it have at leat one document in!");
    }

    public static void wrngIncorrectPassword() {
        JOptionPane.showMessageDialog(null, "Incorrect password!");
    }

    public static void wrngDeleteDocumentSuccess() {
        JOptionPane.showMessageDialog(null, "Box deleted!");
    }

    public static void wrngDeleteDocumentFail() {
        JOptionPane.showMessageDialog(null, "Box delete fail!");
    }

    public static void wrngDeleteDocumentFailByBox() {
        JOptionPane.showMessageDialog(null, "You can't delete this document, because it is in a box!");
    }

    public static ArrayList<Boolean> wrngOptions() {
        ArrayList<Boolean> boos = new ArrayList<>();
        JLabel label = new JLabel("What do you want to do:");
        JCheckBox cb1 = new JCheckBox();
        cb1.setText("Generate cape to this box.");

        JCheckBox cb2 = new JCheckBox();
        cb2.setText("Generate a list of the documents on this box");

        JCheckBox cb3 = new JCheckBox();
        cb3.setText("Generate a list of all boxes.");

        JOptionPane.showMessageDialog(null, new Object[]{label, cb1, cb2, cb3}, "Select:", JOptionPane.OK_OPTION);
        boos.add(cb1.isSelected());
        boos.add(cb2.isSelected());
        boos.add(cb3.isSelected());

        return boos;
    }

    public static void wrngSomethingWentWrong(Exception ex) {
        JOptionPane.showMessageDialog(null, "Something went wrong: "+ex.getLocalizedMessage());
    }

    public static void wrngNoBoxes() {
        JOptionPane.showMessageDialog(null, "There's no box!");
    }
}
