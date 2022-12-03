import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перевод римского числа в арабское!");
        System.out.println("Введите арабское число:");
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int result = solution.romanToInt(scanner.nextLine());
        System.out.println("Арабское число: " + result);
    }
}