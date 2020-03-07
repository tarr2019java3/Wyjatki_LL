package pl.sda.wyjatki;


import pl.sda.wyjatki.exceptions.EmailException;

public class User {

    private String email ;
    private String login ;

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }
    public User() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)  throws EmailException{
        if (!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email;
        }
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public boolean checkEmail(String email) {
        return email.contains("@") ;
    }
}
