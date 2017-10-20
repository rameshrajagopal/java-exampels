package com.example.MvcModel;

/**
 * Created by indix on 20/10/17.
 */
public class Database {
    private static Database instance = new Database();

    private Database() {}

    public static Database getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database");
    }

    public void disconnect() {
        System.out.println("Disconnecting to the database");
    }
 }
