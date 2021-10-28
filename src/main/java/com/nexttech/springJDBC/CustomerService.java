package com.nexttech.springJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public CustomerService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public String checkDatabaseConnectivity() {
        try {
            jdbcTemplate.execute("SHOW TABLES");
            return "JDBC connection established successfully.";
        } catch (Exception e){
            return "Failed to establish JDBC connection.";
        }
    }
}
