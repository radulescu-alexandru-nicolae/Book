import java.util.Comparator;
import java.util.Objects;

public class Car  {
    private String name;
    private int year;

    public Car(String name, int year) throws CustomeExceptions {
        this.name = name;
        this.year = year;


        if(Objects.isNull(name)){
            throw new NullPointerException("Name cannot be null");
        }
        if(Objects.isNull(year)){
            throw new NullPointerException("Year cannot be null");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        return this.year==car.year&&this.name.equals(car.name);
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
