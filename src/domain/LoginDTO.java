package domain;

public class LoginDTO {
    private String id;
    private String password;
    private String name = "";

    public LoginDTO(){};
    public LoginDTO(String id,String password){
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
