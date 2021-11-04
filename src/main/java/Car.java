import java.util.Objects;

public class Car {
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
}
