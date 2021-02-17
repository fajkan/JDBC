package model;

import java.sql.*;

public class City {

    ResultSet resultSet;

    public City(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public City() {
    }
}
