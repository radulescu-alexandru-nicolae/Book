import com.sun.tools.jconsole.JConsoleContext;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Chapter5Test {
    private Chapter5 chapter5=new Chapter5();
    private final MutableCar mutableCar1=new MutableCar("BMW",1999);
    private final MutableCar mutableCar2=new MutableCar("AUDI",1999);
    private final List<MutableCar> list=Collections.unmodifiableList(Arrays.asList(mutableCar1,mutableCar2));


    @Test
    void sortIng(){
        int a[]={3,15,64,31,67};
        a=chapter5.sortingArray(a);
        for(int b:a){
            System.out.println(b);
        }
    }
    @Test
    void sortingobj() throws CustomeExceptions {
        Car car1=new Car("BMW",2009);
        Car car2=new Car("Opel",1999);
        Car car3=new Car("Audi",2020);
        Car car4=new Car("Mercedes",2015);
        Car car5=new Car("Dacia",1900);
        Set<Car> lista=new TreeSet<>(new CompareYear());
        lista.add(car1);
        lista.add(car2);
        lista.add(car3);
        lista.add(car4);
        lista.add(car5);
        System.out.println(lista);

    }
    @Test
    void sortingCar() throws CustomeExceptions {
        Car car1=new Car("BMW",2009);
        Car car2=new Car("Opel",1999);
        Car car3=new Car("Audi",2020);
        Car car4=new Car("Mercedes",2015);
        Car car5=new Car("Dacia",1900);
        Car cars[]={car1,car2,car3,car4,car5};
    Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
    for(Car c:cars){
        System.out.println(c);
    }
    }
    @Test
    void findObject() throws CustomeExceptions {
        Car car1=new Car("BMW",2009);
        Car car2=new Car("Opel",1999);
        Car car3=new Car("Audi",2020);
        Car car4=new Car("Mercedes",2015);
        Car car5=new Car("Dacia",1900);
        Car car6=new Car("Daciaa",1900);
        Car cars[]={car1,car2,car3,car4,car5};
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
        assertEquals(true,chapter5.findObject(cars,car6));
    }
    @Test
    void checkEqualArray(){
        int a[]={1,5,4,6,7};
        int b[]={1,5,4,6,7};
        int c[]={1,5,4,7,6};

        assertEquals(true,chapter5.checkEqualsArrays(a,b));
        assertEquals(true,chapter5.equalsArrays(a,c));

    }
    @Test
    void streamArray(){
        String[ ] a={"Mancare","Mana","Picior"};
        chapter5.creatingStreamFromArray(a);
    }
    @Test
    void sortString(){
        String[ ] a={"peter", "anna", "mike", "xenia"};
        chapter5.sortString(a);
    }
    @Test
    void arrayEx(){
        int a[]={3,6,2,68,345,1};
        chapter5.arrayEx(a);
    }

    @Test
    void nextGraterElement(){
    int a[]={1,2,3,5,7,12,1,65,4};
    chapter5.nextGraterElement(a);
    }

    @Test
    void mutableCar(){
    }

}