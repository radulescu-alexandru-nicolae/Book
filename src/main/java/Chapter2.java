import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class Chapter2 {

//todo:check null references
    public boolean nullReferences(Object obj){
        if(obj!=null){
            return false;
        }
        return true;
    }

    //todo:book solution
    public boolean nullReferencesBook(Object obj){
        if(Objects.isNull(obj)){
           return true;
        }
        return false;
    }

    //todo:checking null referencfes and throwing a exceptions
    public void nullWithException(Object obj) throws CustomeExceptions{
        if(Objects.isNull(obj)){
            throw new CustomeExceptions("Acest obiect este null");
        }else{
            throw new CustomeExceptions("Acest obiect nu este null");
        }
    }

    //todo:checking null references and throwing illegalargumentexceptions
    public <T>T requireNonNullEsleThrowIAE(T obj, String messageSupplier) throws IllegalAccessException {
        if(obj==null){
            throw new IllegalAccessException(messageSupplier);
        }

        return obj;
    }
    //todo:checking the index in the range from 0 to length


}



