package com.example.task1;

import java.time.LocalDate;


public class MyFacebookUser implements MyUser{
    private FacebookUser facebookUser;
    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getUserActiveTime().toLocalDate();
    }
}