// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int kg = 70;
        double meter = 1.68;
        int bmi = service.calculate(kg, meter);
        System.out.println(bmi);
        // индекс массы тела 24
    }
}