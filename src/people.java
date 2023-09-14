public class people {
    private String name;
    private int id;
    private String person;
    private String email;

    public people(String name, int id, String person, String email) {
        this.name = name;
        this.id = id;
        this.person = person;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", person='" + person + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
