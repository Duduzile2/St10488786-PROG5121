package registration ;
import javax.swing.JOptionPane;

public class Login {
    public boolean checkUserName(String userName) {
        return userName.length() <= 5 && userName.contains("_");
    }

    public boolean checkPasswordComplexity(String password) {
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasSchar = false;

        if (password.length() >= 8) {
            for (char current : password.toCharArray()) {
                if (Character.isUpperCase(current)) hasCap = true;
                if (Character.isDigit(current)) hasNum = true;
                if (!Character.isLetterOrDigit(current)) hasSchar = true;
            }
            return hasNum && hasSchar && hasCap;
        }
        return false;
    }

    public String registerUser(String username, String password, String Number) {
        String passMessage = "Password successfully captured";
        String nameMessage = "Username successfully captured";
        String phoneMessage = "Phone number successfully captured";
        return passMessage + "\n" + nameMessage + "\n" + phoneMessage;
    }

    public void LoginUser( Registration registration) {
        String uSER = JOptionPane.showInputDialog("Enter your username:");
        while (!(uSER.matches(registration.username))) {
        JOptionPane.showMessageDialog(null, "User not found");
        uSER = JOptionPane.showInputDialog("Enter your username:");
        }
        
        String pASS = JOptionPane.showInputDialog("Enter your password:");
        while (!(pASS.matches(registration.password))) {
        JOptionPane.showMessageDialog(null, "Incorrect password");
        pASS= JOptionPane.showInputDialog("Enter your password");
        }
        String logStatus = null;
                  
                    JOptionPane.showMessageDialog(null,returnLoginStatus(registration, logStatus));
       
            }

   
    public static String returnLoginStatus(Registration registration, String logStatus) {
         logStatus = "Welcome " + registration.firstName + " " + registration.lastName + ", it is great to see you again!";
        return logStatus;
    }

    public boolean checkPhoneNumber(String num) {
        return num.matches("^\\+27\\d{9}$");
    }
}
