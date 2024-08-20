import java.util.ArrayList;
import java.util.Scanner;
public class Signup {
	static class User {
		String username;
	    String password;
	    String email;
	    User(String username, String password, String email) {
	    	this.username = username;
	        this.password = password;
	        this.email = email;
	        }

	        @Override
	        public String toString() {
	            return "Username: " + username + ", Email: " + email;
	        }
	    }

	    // List to store users
	    private static ArrayList<User> users = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Account Creation System!");

	        // Get user input
	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();

	        // Check if username already exists
	        if (isUsernameTaken(username)) {
	            System.out.println("Username is already taken. Please choose a different username.");
	        } else {
	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();

	            System.out.print("Enter email: ");
	            String email = scanner.nextLine();

	            // Create a new account
	            User newUser = new User(username, password, email);
	            users.add(newUser);
	            System.out.println("Account created successfully!");
	            System.out.println("Registered Users: " + users);
	        }

	        scanner.close();
	    }

	    // Check if a username is already taken
	    private static boolean isUsernameTaken(String username) {
	        for (User user : users) {
	            if (user.username.equals(username)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

