import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Створюємо список з рандомними числами
        List<Integer> numbers = new Random().ints(10, 1, 100).boxed().collect(Collectors.toList());

        System.out.println("Список з рандомними числами: " + numbers);

        // Використовуємо метод map() для зведення квадратів кожного елемента
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());

        System.out.println("Квадрати елементів списку: " + squares);

        // Використовуємо метод reduce() для згортки всіх елементів в одне число (сума квадратів)
        int sumOfSquares = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);

        System.out.println("Сума квадратів елементів списку: " + sumOfSquares);
    }
}
