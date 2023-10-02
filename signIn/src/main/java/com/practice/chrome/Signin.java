package com.practice.chrome;
import com.practice.signIn.chromeSignIn;

public class Signin {
    public static void main(String[] args) {
        try {
            chromeSignIn.signin();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
