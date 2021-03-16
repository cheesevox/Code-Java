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
public class Department {
private int did;
private String dname;

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Department() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

}
