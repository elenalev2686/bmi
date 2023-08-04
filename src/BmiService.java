public class BmiService {
    public int calculate(int kg, Double meter) {
        int result;
        result = (int) (kg / (meter * meter));
        return result;
    }
}

