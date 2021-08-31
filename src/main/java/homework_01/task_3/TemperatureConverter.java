package homework_01.task_3;

public class TemperatureConverter {
    public static double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }
}
