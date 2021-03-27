package com.tz.learning.march.designpatterns.TemplatePatternOfficial;

import sun.rmi.runtime.Log;

public class OfficeService extends LoginService {
    @Override
    public boolean Verification(String name, String pwd) {
        System.out.printf("验证Office账号密码%n");
        return true;
    }

    @Override
    public void CheckLogin() {
        System.out.printf("验证Office登陆%n");
    }

    @Override
    public void CheckError() {
        System.out.printf("验证Office登陆%n");
    }
}
