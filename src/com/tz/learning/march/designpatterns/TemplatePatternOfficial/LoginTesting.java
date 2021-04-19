package com.tz.learning.march.designpatterns.TemplatePatternOfficial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginTesting {
    public static void main(String[] args){
        while(true){
            Scanner scanner =  new Scanner(System.in);
            System.out.printf("请输入要显示的登陆类型:%n");
            String type = scanner.nextLine();
            if(type.equals("quit")){
                break;
            }

            Map<String, LoginService> service = new HashMap();
            service.put("google",  new GoogleService());
            service.put("office",  new OfficeService());

            LoginService loginService = service.get(type);
            loginService.Login("123", "abc");

        }
    }
}
