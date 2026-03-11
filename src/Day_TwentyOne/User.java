package Day_TwentyOne;

public class User {
    private String username;
    private String passward;
    private String idCard;
    private String phone;

    public User(){};
    public User(String username, String passward, String idCard, String phone) {
        this.username = username;
        this.passward = passward;
        this.idCard = idCard;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
