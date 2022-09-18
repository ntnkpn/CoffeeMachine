package EspressoMachine;


import java.util.Scanner;

public class ServicePassword {

    private String servicePassword = "0000";
    private String enteredPassword;
    private String newPassword;
    Scanner scanner = new Scanner(System.in);

    public boolean setServicePassword (){
        newPassword = scanner.nextLine();
        if (passwordValidation(newPassword)){
            servicePassword = newPassword;
            return true;
        }else{
            return false;
        }
    }

    public boolean passwordValidation(String password) {
        boolean flag = false;

        if (password.length() == 4) {
            flag = true;
        }
    return flag;
    }


    public boolean checkPassword(){
        boolean flag = false;
        enteredPassword = scanner.nextLine();
        if(enteredPassword.equals(servicePassword)){
            flag = true;
        }
        return flag;
    }
}



