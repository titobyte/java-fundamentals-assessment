public class User extends Person{
    protected boolean admin;

    public User(String firstName, String lastName, boolean admin) {
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }
}
