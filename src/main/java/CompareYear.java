import java.util.Comparator;

public class CompareYear implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Car car1=(Car)o1;
        Car car2=(Car)o2;
        return Integer.compare(car1.getYear(), car2.getYear());
    }
}
