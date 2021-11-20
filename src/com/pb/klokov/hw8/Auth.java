package com.pb.klokov.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;
    private String confirmPassword;

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(Pattern.matches("[a-zA-Z0-9]{5,20}", login)){
            this.login = login;
        } else {
            throw new WrongLoginException();
        }
        if((Pattern.matches("[a-zA-Z0-9+_]{5,}", password)) && (password.equals(confirmPassword))){
            this.password = password;
            this.confirmPassword = confirmPassword;
        } else {
            throw new WrongPasswordException();
        }

    }

    public void signIn(String login,String password) throws WrongLoginException {
        if(login != this.login || password != this.password){
            throw new WrongLoginException();
        }
    }
}
