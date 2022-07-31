public class Task1 {
    public static int exponentiation(int number, int degree) {
        if (degree == 1) return number;
        else return number * exponentiation(number, degree - 1);
    }
}
