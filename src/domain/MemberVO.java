package domain;

import java.sql.Date;

public class MemberVO {
    private String name;
    private String id;
    private String pw;
    private String phone;

    private String bno_list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBno_list() {
        return bno_list;
    }

    public void setBno_list(String bno_list) {
        this.bno_list = bno_list;
    }
}
