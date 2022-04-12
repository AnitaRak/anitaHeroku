/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class Connexion {
    public static Connection getConnexion()
    {
        Connection con = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://ec2-63-32-248-14.eu-west-1.compute.amazonaws.com:5432/de491rhrke04bb","etooqettshrwfl","f2f7a63f8b216378c842e04f07af3417150aa8495db5ab0f82dc8606691cd897");
            System.out.println("hello world");
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
            System.out.println(e1.getMessage());
        }
        return con;
    }
}
