public class Info {
    private int id;
    private String infor;
    private String email;
    private String password;

    public Info(int id, String infor, String email, String password) {
        this.id = id;
        this.infor = infor;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Info " +"\n"+
                "ID-" + id +"\n"+
                "Info : " + infor + '\n' +
                "Email : " + email + '\n' +
                "Password : " + password + '\n';
    }
}
