package registration;

//importing the JOptionPane to prompt the user for input
import javax.swing.JOptionPane;

public class Registration {
    //declaring variables
    public String firstName;
    public String lastName;
    public String password;
    public String username;
    public String phoneNumber;
     
    public static void main(String[] args) { 
        //instantiating the registration class
        Registration registration = new Registration();
        //instantiating the login class
        Login login = new Login ();
        registration.startRegistration();
        login.LoginUser(registration);
    }
    
    //registering the user using the startRegistration method
    public void startRegistration() {
        //prompt the user to enter their details
        firstName = JOptionPane.showInputDialog("Please enter your first name");
        lastName = JOptionPane.showInputDialog("Please enter your last name");
        username = getValidUsername();
        password = getValidPassword();
        phoneNumber = getValidPhoneNumber();
        
        //displaying the user's details after they register
        JOptionPane.showMessageDialog(null, 
            "Registration Successful!\n" +
            "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n" +
            "Username: " + username + "\n" +
            "Phone: " + phoneNumber);
    }
    
    //retrieving a valid username using getValidUsername method
    private String getValidUsername() {
        String username;
        do {
            username = JOptionPane.showInputDialog(
                "Enter username (must be ≤5 characters and contain '_'):");
        } while (!isValidUsername(username));
        return username;
    }
    
    //testing whether the user name is valid or not
    private boolean isValidUsername(String username) {
        if (username.length() > 5 || !username.contains("_")) {
            JOptionPane.showMessageDialog(null,
                "Username must be ≤5 characters and contain '_'");
            return false;
        }
        return true;
    }
 
    //retrieving a valid password using the getValidPassword method
    private String getValidPassword() {
        String password;
        do {
            password = JOptionPane.showInputDialog(
                "Enter password (must be ≥8 characters with:\n" +
                "- 1 capital letter\n- 1 number\n- 1 special character):");
        } while (!isValidPassword(password));
        return password;
    }
    
    //testing whether the password is valid or not
    private boolean isValidPassword(String password) {
        boolean hasNumber = false;
        boolean hasCapital = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            showPasswordError();
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasNumber = true;
            if (Character.isUpperCase(c)) hasCapital = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        if (!(hasNumber && hasCapital && hasSpecial)) {
            showPasswordError();
            return false;
        }
        return true;
    }

    private void showPasswordError() {
        JOptionPane.showMessageDialog(null,
            "Password must contain:\n" +
            "- At least 8 characters\n" +
            "- 1 capital letter\n" +
            "- 1 number\n" +
            "- 1 special character");
    }

    private String getValidPhoneNumber() {
        String phone;
        do {
            phone = JOptionPane.showInputDialog(
                "Enter phone number (must start with +27 and be 9 digits long):");
        } while (!isValidPhoneNumber(phone));
        return phone;
    }

    private boolean isValidPhoneNumber(String phone) {
       
        phone=phone.replace(" " , "");
        if (phone == null) {
            return false;
        }
        if (!phone.matches("^\\+27\\d{9}$")) {
            JOptionPane.showMessageDialog(null,
                "Phone number must start with +27 followed by 9 digits\n" +
                "Example: +27821234567");
            return false;
        }
        return true;
    }
}