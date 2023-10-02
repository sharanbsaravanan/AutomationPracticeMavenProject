package com.practice.chrome;
import com.practice.signup.chromeSignUp;
public class Signup {
    public static void main(String[] args) {
        int i=0;
        try {
            chromeSignUp.signup(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
