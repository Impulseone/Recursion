public class Task2 {
    static int sumOfDigit(int num) {
        return num < 10 ? num : (num % 10) + sumOfDigit(num / 10);
    }
}
