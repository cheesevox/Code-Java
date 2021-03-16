/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.entity;

/**
 *
 * @author cheeese vox
 */
public class Account {
    private String username;
    private String password;
//    private String role;
    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
//        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
