package controller;


import Service.MemberService;
import domain.LoginDTO;

import java.util.Scanner;

public class MemberController {
    private static MemberService service = new MemberService();

    public static String loginPage(Scanner sc) {
        sc.nextLine();
        System.out.println("아이디 및 비밀번호 입력");
        System.out.print("id : ");
        String id = sc.nextLine();
        System.out.print("password : ");
        String password = sc.nextLine();
        LoginDTO dto = new LoginDTO(id,password);
        return service.login(dto).getName();
    }

    public static void homePage(Scanner sc) {

    }
}
