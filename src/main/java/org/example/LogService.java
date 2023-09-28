package org.example;

import static spark.Spark.*;

public class LogService {
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");

        get("log", (req, res) -> {
            String msg ="";
            return logMessage(msg);
        });
        }

    private static String logMessage(String msg) {
        return "";
    }

    private static int getPort() {
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }
}