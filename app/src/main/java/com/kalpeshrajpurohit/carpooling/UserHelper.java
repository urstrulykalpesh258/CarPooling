package com.kalpeshrajpurohit.carpooling;

public class UserHelper {

            String uname,email,phone,passwrd;

    public UserHelper() {
    }

    public UserHelper(String uname, String email, String phone, String passwrd) {
        this.uname = uname;
        this.email = email;
        this.phone = phone;
        this.passwrd = passwrd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }
}
