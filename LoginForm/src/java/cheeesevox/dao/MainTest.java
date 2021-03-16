/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import cheeesevox.entity.Account;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class MainTest {
    public static void main(String[] args) {
        LoginDAO accountdao = new LoginDAO();
        List<Account> list = accountdao.getAccounts();
         for (Account a : list) {
             System.out.println("name : "+a.getUsername()+", password: "+a.getPassword());
             
        }
    }
}
