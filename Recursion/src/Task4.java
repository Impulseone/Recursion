public class Task4 {
    public static boolean isPalindrom(String s) {
        boolean isFirstAndLastSymbolEqual = s.charAt(0) == s.charAt(s.length() - 1);
        if (s.length() <= 2 && isFirstAndLastSymbolEqual) return true;
        if (!isFirstAndLastSymbolEqual) return false;
        return isPalindrom(s.substring(1, s.length() - 1));
    }
}
