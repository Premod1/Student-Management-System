/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mod;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author premod
 */
public class Db {
    public static Connection createConnetion() throws Exception{
       String url = "jdbc:mysql://localhost:3306/schoolmanagement";
       Connection con = DriverManager.getConnection(url,"root","");
       return con;
    }
}
