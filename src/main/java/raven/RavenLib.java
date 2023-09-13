package raven;

public class RavenLib {

    public Number sumNumber(Number... num) {
        double sum = 0;
        for (Number n : num) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
