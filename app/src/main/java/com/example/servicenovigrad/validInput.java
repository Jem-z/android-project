package com.example.servicenovigrad;

public class validInput {
    private static final int minpass = 1;
    private static final int minemail = 5;
    private static final int phonenum = 10;

    public boolean isValidpassword(String password){
        return password.length() >= minpass;
    }

    public boolean isValidusername(String username){
        return username != null;
    }

    public boolean isValidemail(String email){
        return email.contains("@") && email.contains(".") && email.length() > minemail;
    }

    public boolean isValidphonenumber(String phonenumber){
        return phonenumber.length() == phonenum;
    }

    public boolean isValidname(String name){
        return name != null;
    }
}
