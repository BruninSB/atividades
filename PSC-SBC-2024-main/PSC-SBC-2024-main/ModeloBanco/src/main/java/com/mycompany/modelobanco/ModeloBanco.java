/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modelobanco;

import DAO.ConnectionFactory;

/**
 *
 * @author erica
 */
public class ModeloBanco {
    

    public static void main(String[] args) {
        
        ConnectionFactory factory = new ConnectionFactory();
        factory.obtemConexao();
        
        System.out.println("Hello World!");
    }
}
