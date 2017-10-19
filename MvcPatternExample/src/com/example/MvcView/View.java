package com.example.MvcView;

import com.example.MvcModel.Model;
import com.example.com.example.MvcListener.Listener;

/**
 * Created by indix on 19/10/17.
 */
public class View {
    private Model model;
    private Listener listener;

    public View(Model model) {
        this.model = model;
    }

    public void clickMethod() {
        System.out.println("Click Method");
        onClickEvent();
    }

    public void addListener(Listener listener) {
        System.out.println("adding Listener");
        this.listener = listener;
    }

    public void onClickEvent() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
