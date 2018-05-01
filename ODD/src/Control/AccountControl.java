/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Account;

/**
 *
 * @author Gabriel Guimarães
 */
public class AccountControl {

    public static boolean addAccount(Account acc) {
        boolean boo = false;
        DatabaseManager dbm = new DatabaseManager();
        if (dbm.checkLoginPasswordCreating(acc.getLogin(), acc.getPassword()) == 0) {
            boo = dbm.addAccount(acc);
        } else {
            Warnings.wrngLogPasExist();
            boo =true;
        }
        return boo;
    }

    public static boolean checkLogin(String login, String password) {
        boolean boo = false;
        DatabaseManager dbm = new DatabaseManager();
        int i = dbm.checkLoginPasswordLog(login, password);
        if (i == 0) {
            Warnings.wrngAccountDontExist();
            boo = true;
        }else if(i>1){
            boo = true;
        } else {
            boo =false;
        }
        return boo;
    }

    public static Account makeLogin(String login, String password) {
        DatabaseManager dbm = new DatabaseManager();
        Account acc = new Account();
        acc = dbm.makeLogin(login, password);
        return acc;
    }

    public static Account getAccountById(int id) {
        DatabaseManager dbm = new DatabaseManager();
        Account acc = new Account();
        acc = dbm.getAccountById(id);
        return acc;
    }
}
