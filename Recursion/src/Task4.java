public class Task4 {
    public static boolean isPalindrom(String s) {
        if (s.length() == 1 || (s.length() == 2 && s.charAt(0) == s.charAt(1))) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrom(s.substring(1, s.length() - 1));
        return false;
    }
}
