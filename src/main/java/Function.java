import java.util.Objects;

public class Function {
    private static final int X_UPPER_BOUND=11;
    private static final int Y_UPPER_BOUND=16;
    private  int x;

//    public Function(int x){
//        if(x<0||x>=X_UPPER_BOUND){
//            throw new IndexOutOfBoundsException("..");
//        }
//
//        this.x=x;
//    }
    public Function(int x){
        this.x= Objects.checkIndex(x,X_UPPER_BOUND);
    }
    public int xMinusY(int y){
        if(y<0||y>=x){
            throw new IndexOutOfBoundsException("...");
        }
        return x-y;
    }








}
