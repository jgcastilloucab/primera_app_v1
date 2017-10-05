package edu.ucab.controller;

import edu.ucab.model.User;

public class MainFrameController {

    public User getCurrentUser() {
        return (User) Context.getInstance().getContext().get("user");
    }    
}
