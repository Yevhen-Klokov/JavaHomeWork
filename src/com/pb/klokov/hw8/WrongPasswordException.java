package com.pb.klokov.hw8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException(){

    }
}
