package com.example.MvcModel;

import com.example.com.example.MvcListener.Listener;

/**
 * Created by indix on 19/10/17.
 */
public class Model {
    private Listener listener;

    public Model() {
    }

    public void clickMethod() {
        System.out.println("Model click Method");
        onClickMethod();
    }

    private void onClickMethod() {
        if (listener != null) {
            listener.onClick();
        }
    }

    public void addListener(Listener listener) {
        this.listener = listener;
    }
}
