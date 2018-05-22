/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
        JOptionPane.showConfirmDialog(null, new Object[]{label, jpf}, "Senha:", JOptionPane.OK_CANCEL_OPTION);
        String senha = jpf.getText();
        return senha;
    }

    public static void wrngCannotDeleteBoxCauseDocs() {
        JOptionPane.showMessageDialog(null, "You can't delete this box, because it have at leats one document in!");
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
}
