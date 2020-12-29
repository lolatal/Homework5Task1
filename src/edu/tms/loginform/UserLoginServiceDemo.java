package edu.tms.loginform;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        while (true) {
            String login = InputData.getString("Введите логин");
            String password = InputData.getString("Введите пароль");
            System.out.println(UserLoginService.authenticateUser(userInfo, login, password));

        }

    }
        private static User[] userInfo = {
                new User("Olga", "qwerty"),
                new User("Company", "123456"),
                new User("Mary", "0987")};
        public static User[] get(){
            return userInfo;
        }
}
