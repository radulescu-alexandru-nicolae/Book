import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Chapter2Test {

    private Chapter2 chapter2=new Chapter2();


    @Test
    void nullReferences(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        assertEquals(true,chapter2.nullReferences(list));
        assertEquals(true,chapter2.nullReferencesBook(list));
    }
    @Test
    void nullPointerExceptions() throws CustomeExceptions {
        Car masina=new Car("Masina",2009);

    }
    @Test
    void checkingIndexOutOfRange(){
        Function function=new Function(11);
//        function.xMinusY(7);

    }
    @Test
    void equalTest(){
        Player player1=new Player(1,"Alexandr");
        Player player2=new Player(1,"Alexandr");
        assertEquals(true,player1.equals(player2));
        HashSet<Player> players=new HashSet<>();

        players.add(player1);
        players.add(player2);
        System.out.println(players.size());

        Iterator iterator=players.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    @Test
    void immutabelClass(){
        Radius radius=new Radius(9,135);
        Point point = new Point(1,2,radius);
    }
    @Test
    void immutabelUser(){


    }

}