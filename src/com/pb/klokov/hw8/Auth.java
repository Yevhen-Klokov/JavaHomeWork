package com.pb.klokov.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    //метод проверки логина и пароля на соответствие
    public static boolean confirmPassword(String conf){
        Pattern pattern = Pattern.compile("\\w{5,20}");
        Matcher matcher = pattern.matcher(conf);
        return matcher.matches();
    }

    public void signUp(String login, String password) {
        boolean logConf = confirmPassword(login);
        boolean pasConf = confirmPassword(password);
        System.out.println("Валидация логина: " + logConf);
        System.out.println("Валидация пароля: " + pasConf);
    }
}
//        login = this.login;
//            System.out.println(this.login);