package com.tz.learning.march.designpatterns.TemplatePatternOfficial;

public class GoogleService extends LoginService{
    @Override
    public boolean Verification(String name, String pwd) {
        System.out.printf("验证Google账号密码%n");
        return true;
    }

    @Override
    public void CheckLogin() {
        System.out.printf("验证Google登陆%n");
    }

    @Override
    public void CheckError() {
        System.out.printf("验证Google失败%n");
    }
}
