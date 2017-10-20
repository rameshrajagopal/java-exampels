package com.example.MvcModel;

/**
 * Created by indix on 20/10/17.
 */
public class DAOFactory {
    public static PersonDAO getPersonDAO() {
        return new PersonDAO();
    }
}
