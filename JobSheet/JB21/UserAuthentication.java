import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserAuthentication {
    private ArrayList<User> userDatabase = new ArrayList<>();
    private User currentUser = null;

    public String registration(int id, String name, String email, String number, String pin) {
        // Validation logic here...
        userDatabase.add(new User(id, name, email, number, pin));
        return "User Registered.";
    }

    public Integer login(String number, String pin) {
        // Search logic here...
        return null; 
    }
    
    // changePin and logout methods...
}