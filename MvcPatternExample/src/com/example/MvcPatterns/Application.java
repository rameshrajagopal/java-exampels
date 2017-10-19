package com.example.MvcPatterns;

import com.example.MvcController.Controller;
import com.example.MvcModel.Model;
import com.example.MvcView.View;

/**
 * Created by indix on 19/10/17.
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("Hello Application, Welcome");

        Model model = new Model();
        View  view  = new View(model);
        Controller controller = new Controller(model, view);

        view.addListener(controller);
        view.clickMethod();
        model.clickMethod();
        model.addListener(controller);
        model.clickMethod();
    }
}
