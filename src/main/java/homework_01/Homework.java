package homework_01;

import homework_01.task_1.Sort;
import homework_01.task_2.*;
import homework_01.task_3.TemperatureConverter;

import java.util.*;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {

        bubbleSortExample();

        inheritanceExample();

        temperatureConverterExample();
    }

    private static void bubbleSortExample() {
        List<Integer> list = new Random().ints(20, -100, 100)
                        .boxed().collect(Collectors.toList());

        System.out.println(list);
        Sort.bubbleSort(list);
        System.out.println(list);
    }

    private static void inheritanceExample() {
        List<Shape> shapes = Arrays.asList(new Circle(), new Circle(), new Square(), new Triangle(), new Rect());

        shapes.forEach(Shape::printShapeType);
    }

    private static void temperatureConverterExample() {
        Scanner in = new Scanner(System.in);
        String scales;

        while (true) {
            System.out.println("Выберите температурную шкалу:");
            System.out.println("K - шкала Кельвина");
            System.out.println("F - шкала Фаренгейта");
            System.out.println("Q - выход");

            scales = in.next().toLowerCase();

            if (scales.equals("q")) {
                break;
            } else {
                double celsius;

                System.out.println("Введите значения в шкале Цельсия:");

                try {
                    celsius = in.nextDouble();
                }
                catch (InputMismatchException e) {
                    System.out.println("Введенное значение должно быть числом!");
                    continue;
                }

                switch (scales) {
                    case "k": {
                        System.out.println(celsius + "°C = " + TemperatureConverter.toKelvin(celsius) + "К");
                        break;
                    }
                    case "f": {
                        System.out.println(celsius + "°C = " + TemperatureConverter.toFahrenheit(celsius) + "°F");
                        break;
                    }
                    default: {
                        System.out.println("Выберите шкалу из списка или выход");
                    }
                }
            }
        }

        in.close();
    }
}
