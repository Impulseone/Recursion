public class Task4 {
    public static boolean isPalindrom(String s) {
        boolean isFirstAndLastSymbolEquals = s.charAt(0) == s.charAt(s.length() - 1);
        if ((s.length() == 1 || s.length() == 2) && isFirstAndLastSymbolEquals) return true;
        if (!isFirstAndLastSymbolEquals) return false;
        return isPalindrom(s.substring(1, s.length() - 1));
    }
}
