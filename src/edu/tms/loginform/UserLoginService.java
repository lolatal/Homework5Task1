package edu.tms.loginform;

public class UserLoginService {

    public static boolean validatePassword (User user, String inputPassword){
        return user.getPassword().equals(inputPassword);
    }

    public static User getLogin (User[] userInfo, String inputLogin){
        for(int i=0; i< userInfo.length; i++){
            if(userInfo[i].getLogin().equals(inputLogin)) {
                return userInfo[i];
            }
        }
        return null;
    }
    public static boolean authenticateUser(User[] userInfo, String inputLogin, String inputPassword){
        User user = getLogin(userInfo, inputLogin);
        boolean statusBlocked = user.isStatusBlocked();
        if (!statusBlocked) {
            boolean isPasswordValid = validatePassword(user, inputPassword);
            if (isPasswordValid) {
                user.resetAttempts();
                System.out.println("Логин и пароль верны");
                return true;
            }
            else {
                user.reduceNumberOfAttempts();
                if (user.numberOfAttempts==0){
                    user.isStatusBlocked();
                    System.out.println("Эта учетная запись заблокирована");
                }
                System.out.println("Логин или пароль неверны");
                return false;
            }
        } else {
            return false;
        }
    }
}


