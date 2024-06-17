
package com.mycompany.modelobanco;

import DAO.ConnectionFactory;

public class ModeloBanco {

    public static void main(String[] args) {
        System.out.println("Teste de Conexao...");
        
        ConnectionFactory factory = new ConnectionFactory();
        factory.obtemConexao();
    }
}
