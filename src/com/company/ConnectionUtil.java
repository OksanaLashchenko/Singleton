package com.company;

import java.util.HashMap;
import java.util.Map;

public class ConnectionUtil {

    private static final Map<DataBaseConnection, ConnectionUtil> instances = new HashMap<>();

    private ConnectionUtil() {
    }

    public static ConnectionUtil getInstance(DataBaseConnection dataBaseConnection) {
        if (instances.get(dataBaseConnection) == null) {
            instances.put(dataBaseConnection, new ConnectionUtil());
        }
        return instances.get(dataBaseConnection);
    }

}
