class UserAuthentication {
    private static String USERNAME = "a";
    private static String PASSWORD = "a";

    public static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

    public static void changeCredinate(String username, String password) {
        USERNAME = username;
        PASSWORD = password;
        System.out.println("Username & Password Changed Successfully...!");
    }
}
