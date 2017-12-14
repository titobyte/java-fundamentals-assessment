import Greet.Greeter;

public class Person implements Greeter {
    protected String firstName;
    protected String lastName;

    public String Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        String IllegalArgumentException = "You've made an error";

        if(firstName.equals(null) || lastName.equals(null)) {

        }
        return IllegalArgumentException;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
}
