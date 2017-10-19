package com.example.MvcController;

import com.example.MvcModel.Model;
import com.example.MvcView.View;
import com.example.com.example.MvcListener.Listener;

/**
 * Created by indix on 19/10/17.
 */
public class Controller implements Listener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onClick() {
        System.out.println("On controller onClick Method");
    }
}
