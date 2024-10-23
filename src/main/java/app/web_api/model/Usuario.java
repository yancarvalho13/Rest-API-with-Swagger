package app.web_api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;


    public Usuario(){

    }

    public Usuario (String login, String password){
        this.login = login;
        this.password = password;
    }

    public Usuario(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String toString(){
        return "User {" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
