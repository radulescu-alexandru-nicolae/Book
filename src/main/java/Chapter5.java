import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chapter5 {
    //todo:sorting an array
    public int[] sortingArray(int[] a){
   Arrays.sort(a);
        return a;
    }


    //todo:find an element in an array
    public boolean findingElement(int[ ]a,int element){
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                return true;
            }
        }
        int index=Arrays.binarySearch(a,element);
        System.out.println(index);
        return false;

    }
    //todo:find an object
    public boolean findObject(Car[] cars ,Car car){
    for(Car c:cars){
        if(c.equals(car)){
            return true;
        }
    }
    return false;
    }
    //todo:check if two arrays are the same
    public boolean checkEqualsArrays(int[] a,int[] b){
    return Arrays.equals(a,1,4,b,1,4);
    }
    public boolean equalsArrays(int[] a,int[] b){
        HashMap<Integer,Integer> first=new HashMap<>();
        HashMap<Integer,Integer> second=new HashMap<>();
        for(int A:a){
            first.compute(A,(k,v)->(v==null)?1:++v);
        }
        for(int B:b){
            second.compute(B,(k,v)->(v==null)?1:++v);
        }


        return first.equals(second);
    }
    //todo:compare 2 arrays lexicographically
    public boolean lexicographicallyComparation(int[] a,int[] b){
   int result=Arrays.compare(a,b);
   if(result==0){
       return true;
   }
   return false;

    }

    //todo:creating a stream from an array
    public void creatingStreamFromArray(String[] elemente){
        Stream<String> stream=Arrays.stream(elemente);
     stream.forEach(System.out::println);

    }

    //todo:lambada
    public void sortString(String[] a){
        List<String> lista=Arrays.asList(a);
        Collections.sort(lista, (String c, String d) -> c.compareTo(d));
        System.out.println(lista);
    }

    //todo:min max and average of an array
    public void arrayEx(int[] a){

        Arrays.stream(a).sorted().findFirst().ifPresent(System.out::println);
        Arrays.stream(a).sorted().average().ifPresent(System.out::println);
        Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);
    }
    //todo:fill the array
    public void arrayFill(int[] a){
      Arrays.fill(a,1);
      int aux[]=a;
      for(int i=0;i<aux.length;i++){
          aux[i]=1;

      }
        System.out.println(aux);


    }

    //todo:next grater element
    public void nextGraterElement(int[] a){

        for(int i=0;i<a.length;i++){
            int nge=-1;
            for(int j=i+1;j<a.length;j++){
               if(a[i]<a[j]){
                   nge=a[j];
                   break;
               }
           }
            System.out.println(a[i]+":"+nge);
        }
    }
//todo:map
    public void map(){
        Map<String,String> map=new HashMap<>();
        map.put("qwer","127.0.0.1");
        map.put("mysql","102.168.0.50");
    }



}
