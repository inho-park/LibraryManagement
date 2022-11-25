import controller.BookController;
import controller.MemberController;
import domain.LoginDTO;
import mapper.MemberMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static final String[] genre_list = {"SF","다큐","개그/코미디","공포","액션"};
    private static Scanner sc = new Scanner(System.in);
    private static Connection con;
    private static BookController bookController;
    public static void main(String[] args) {
        System.out.println("다니합작시 램그로프 리관 서도");
        // ConnectionPool 생성
        getConnectionPool();
        MemberMapper.con = con;
        // 입력값
        int num1;
        while(true) {
            System.out.println("1) Login \t2) Join \t3) Exit");
            System.out.print(">> ");
            num1 = sc.nextInt();
            if (num1 == 1){
                String name = MemberController.loginPage(sc);
                if (name.equals("")) {
                    System.out.println("없는 아이디임다");
                }else {
                    MemberController.homePage(sc);
                }
            }else if (num1 == 2) {

            }else if (num1 == 3) {
                System.out.println("ㅓㅏㄴㅁㅇ러;미ㅑㄷ러;ㅐ뫃ㄴ맣ㅁㄴ하ㅓ");
                freeConnectionPool();
                break;
            }
            else System.out.println("잘 보고 골라봐요");
        }
    }


    public static void getConnectionPool() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookdb",
                    "root",
                    "wnstjd99!"
            );
        }catch(ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 에러");
            e.printStackTrace();
        }catch(SQLException e) {
            System.out.println("DB 연결 에러");
        }
    }
    public static void freeConnectionPool() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}