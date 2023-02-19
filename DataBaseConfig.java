package com.omniacademy.config;

/**
 * @author Wijdane KHATTAT
 */
public class DataBaseConfig {
    private String dbName = "Postgresql";
    private String dbUrl = "localhost:3121/formation";
    private String dbPassword ="123456";

    public String getDbName() {
        return dbName;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public String getDbPassword() {
        return dbPassword;
    }
}
