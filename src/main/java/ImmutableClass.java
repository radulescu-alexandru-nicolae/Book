import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableClass {
    private static final List<Integer> list= Collections.unmodifiableList(Arrays.asList(1,2,3,4,5));
    private static final List<Integer> LIST=List.of(1,2,3,4,5);


}
