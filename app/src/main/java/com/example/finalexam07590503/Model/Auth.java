package com.example.finalexam07590503.Model;

public class Auth {

    private  static final String EMAIL = "theeranop17@gmail.com";
    private  static final String PASSWORD = "1234";

    private String mEmail ;
    private String mPassword ;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }

    public boolean check()
    {
        if(mEmail.equals(EMAIL)&& mPassword.equals(PASSWORD)){
            return true ;
        } else {
            return false ;
        }
    }
}
