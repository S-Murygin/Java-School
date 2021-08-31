package homework_02;

import homework_02.task_1.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {

        carListExample();
    }

    private static void carListExample() {
        List<Car> cars = Arrays.asList(
                new Car("Лада", "седан"),
                new Car("Лада", "хэтчбек"),
                new Car("Мерседес", "седан"),
                new Car("Бмв", "кроссовер"),
                new Car("Форд", "хэтчбек"),
                new Car("Пежо", "кроссовер"),
                new Car("Тойота", "седан"));

        Map<String, List<Car>> byType = cars.stream().collect(Collectors.groupingBy(Car::getType));

        byType.forEach((k, v) -> {
            System.out.println(k + ": ");
            v.forEach(e -> System.out.println("\t" + e.getModel()));
        });
    }
}
