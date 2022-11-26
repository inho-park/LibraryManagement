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
        int num;
        while(true){
            System.out.println("1) 책 목록보기\t 2) 책 검색\t 3) 책 대여 \t 4) 책 반납\t 5) 로그 아웃");
            num = sc.nextInt();
            switch(num) {
                case 1:
                {

                }
                case 2:
                {

                }
                case 3:
                {

                }
                case 4:
                {

                }
                case 5:
                {

                }
                default:
                    System.out.println("두 눈 똑바로 뜨고 다시봐라");

            }
        }
    }

    public static void signupPage(Scanner sc){
        
    }
}
