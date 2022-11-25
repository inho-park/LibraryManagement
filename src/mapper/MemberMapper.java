package mapper;

import domain.LoginDTO;
import domain.MemberVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberMapper {
    public static Connection con;
    private static PreparedStatement pstmt;


    public LoginDTO read(LoginDTO dto) {
        try {
            pstmt = con.prepareStatement("select password,name from t_member where id=?");
            pstmt.setString(1,dto.getId());
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            if(dto.getPassword().equals(rs.getString("password")))
                dto.setName(rs.getString("name"));
            pstmt.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("mapper : read(LoginDTO) 에러");
        }
        return dto;
    }
    
    public List<MemberVO> read() {
        List<MemberVO> list = new ArrayList<>();
        try {
            pstmt = con.prepareStatement("select * from t_member");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                MemberVO vo = new MemberVO();
                vo.setName(rs.getString("name"));
                vo.setId(rs.getString("id"));
                vo.setPassword(rs.getString("password"));
                vo.setPhone(rs.getString("phone"));
                vo.setBno_list(rs.getString("bnoList"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("mapper : read() 에러");
        }
        return list;
    }
}
