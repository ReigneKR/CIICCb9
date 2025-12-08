public class GcashApp {
    public static void main(String[] args) {
        UserAuthentication auth = new UserAuthentication();

        // Test Registration
        System.out.println(auth.registration(1, "Juan Dela Cruz", "juan@mail.com", "09123456789", "123456"));

        // Test Login
        Integer userId = auth.login("09123456789", "123456");
        if (userId != null) {
            System.out.println("Welcome! Your ID is: " + userId);
        }
    }
}