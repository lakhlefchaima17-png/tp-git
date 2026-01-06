package com.l3.gl.controller;

import com.l3.gl.model.User;
import com.l3.gl.view.Ui;

public class AppController {

    private Ui ui;

    public AppController() {
        ui = new Ui();
    }

    public void start() {
        System.out.println("Controller started");
    }
}