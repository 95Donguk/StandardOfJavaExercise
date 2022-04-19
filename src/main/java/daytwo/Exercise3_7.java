package daytwo;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ((int) (((5.0F / 9.0F * (fahrenheit - 32)) + 0.005F) * 100)) / 100F;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
