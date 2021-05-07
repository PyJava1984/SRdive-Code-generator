package com.rana;

import java.util.Scanner;


public class MySQLDB {

    JDBCUtil jdbcUtil ;
    String className ;

    public MySQLDB()
    {
        this.className = "com.mysql.cj.jdbc.Driver";
        this.jdbcUtil = null;
    }

    public void initiateConnection()
    {
        Scanner scanner = new Scanner(System.in);

        //Fetching server details for connection
        System.out.println("Enter the MySQL server address: ");
        String hostname = scanner.nextLine();


        System.out.println("Enter the MySQL server port: ");
        String port = scanner.nextLine();


        System.out.println("Enter your Username: ");
        String userName = scanner.nextLine();


        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Enter your DatabaseName that you would like to connect to");
        String dbName = scanner.nextLine();

        StringBuffer URL = new StringBuffer();
        URL.append("jdbc:mysql://");
        //URL.append(hostname + ":" + port + "/" + dbName);
        URL.append("64.225.31.160" + ":" + "3306" + "/" + dbName);

        jdbcUtil = new JDBCUtil(className,URL.toString(), userName, new String(password));
        jdbcUtil.getConnection();

    }







}
