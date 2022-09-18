package EspressoMachine;


import java.util.Scanner;

public class ServicePassword {

    private String servicePassword = "0000";  // Default password
    private String enteredPassword;   // Entered service password to check
    private String newPassword;  // New service password
    Scanner scanner = new Scanner(System.in);

    public boolean setServicePassword() {
        newPassword = scanner.nextLine();
        if (passwordValidation(newPassword)) {  // Validating password
            servicePassword = newPassword;  // Setting new password if validation is true
            return true;
        } else {
            return false;
        }
    }

    public boolean passwordValidation(String password) {
        boolean flag = false;

        if (password.length() == 4) {  // If password length is 4 symbols returns true // TODO: Add logic to set password only from digits
            flag = true;
        }
        return flag;
    }


    public boolean checkPassword() {  // Checking entered password and service password. Returns true if yes
        boolean flag = false;
        enteredPassword = scanner.nextLine();
        if (enteredPassword.equals(servicePassword)) {
            flag = true;
        }
        return flag;
    }
}



