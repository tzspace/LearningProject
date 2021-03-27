package com.tz.learning.march.designpatterns.TemplatePatternOfficial;

public abstract class LoginService {

    public void Login(String name, String pwd){
        boolean isPass = Verification(name, pwd);
        if(isPass){
            CheckLogin();
        }else{
            CheckError();
        }
    }


    public abstract boolean Verification(String name, String pwd);

    public abstract void CheckLogin();

    public abstract void CheckError();
}
