package com.h.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDB {

    private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/usermanager?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong";
    private final static String DB_USER = "root";
    private final static String DB_PASSWD = "wcx1223";

    public Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
        }  catch (SQLException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
