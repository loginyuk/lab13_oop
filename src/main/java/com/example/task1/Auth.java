package com.example.task1;

public class Auth {
    public MyUser login() {
        int random = 10;
        if (random > 1) {
            // some code
            return new MyTwitterUser(new TwitterUser());
        } else {
        // some other code
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void doSomething(MyUser user) {
        // some code
    }
}
