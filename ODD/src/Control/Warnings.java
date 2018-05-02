/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Guimarães
 */
public class Warnings {
    public static void wrngEmptyFields(){
        JOptionPane.showMessageDialog(null, "Fill in the fields.");
    }
    public static void wrngNoSelection(){
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
}
