
package com.myrh.open.rh.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ModuloConexao {
    
    public static Connection conector() {  // Criando método com nome de: conector
       java.sql.Connection conexao = null; //variável com nome de: conexao
       
       
       String driver = "jdbc:postgresql://ec2-44-194-92-192.compute-1.amazonaws.com:5432/d59tcg1a3vbhli [rlvjntajlafogt on public]"; //chamando o driver 
       
       String url=" jdbc:postgresql://localhost:5432/postgres"; //Armazenando informações referente ao banco
       String user="rlvjntajlafogt";
       String password ="38c701d922891214e109a82421c203322a0649b5054792dcf395b05b59bd527e";
 
            try {
            Class.forName(driver); //tratamento de conexão ao banco de dados
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception erro ) {
            return null; 
        }
       
    }
}

    

