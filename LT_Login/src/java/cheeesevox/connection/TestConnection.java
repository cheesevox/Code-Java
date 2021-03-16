/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.connection;

import cheeesevox.dto.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.catalina.tribes.util.Logs;

/**
 *
 * @author cheeese vox
 */
public class TestConnection {
    public static void main(String[] args) {
        try {
            ArrayList<Student> listStudent = new ArrayList<>();
            Connection con = null;
            MyConnection db = new MyConnection();
            con = db.getMyConnection();
            if(con!= null){
                System.out.println("connected");
                Statement stmt  = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from Registration");
                while(rs.next()){
                    Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setDob(rs.getDate("BOD"));
                    student.setImage(rs.getString("image"));
                    listStudent.add(student);
                }
                rs.close();
                stmt.close();
                con.close();
                for (Student student : listStudent) {
                    System.out.println("Student: " + student.getName()+" "+student.getId()+" " + student.getImage()+" " +student.getDob());
                }
                
            }else { 
                        System.out.println("fail connected");
                        }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
