package com.example.finalexam07590503.Model;

public class Auth_Register {
    private  static final String FULLNAME = "Theeranop";
    private  static final String USERNAME = "Nuchnum";
    private  static final String PASSWORD = "1234";

    private String mFullname ;
    private String mUsername ;
    private String mPassword ;

    public Auth_Register(String fullname, String username, String password) {
        this.mFullname = fullname;
        this.mUsername = username;
        this.mPassword = password;
    }

    public boolean check()
    {
        if(mFullname.equals(FULLNAME)&& mUsername.equals(USERNAME) && mPassword.equals(PASSWORD)){
            return true ;
        } else {
            return false ;
        }
    }
}
