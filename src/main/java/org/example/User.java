import java.util.ArrayList;

/**
 * Represents a user
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String profession;
    private ArrayList<User> children;

    /**
     * Creates a new user with the given details
     *
     * @param id The ID of the user
     * @param firstName The first name of the user
     * @param lastName The last name of the user
     * @param age The age of the user
     */
    public User(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    /**
     * Gets the name of the child
     *
     * @param child The child of the user
     * @return The name of the child
     * @throws IllegalArgumentException if the child is not part of the user's children
     */
    public String getChildName(User child) {
        if (!this.children.contains(child)) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        String name = child.getFirstName();
        if (name != null && name.equals("Harry")) {
            name = name.replace('r', 'p');
        }

        if (name != null && !name.isEmpty()) {
            name = name.concat(child.getLastName());
        }

        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
