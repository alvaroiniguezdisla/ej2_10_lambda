package dominio;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ej2_10_lambda {
    public static ArrayList listapares(int n){
        return Stream.iterate(0,i->i+1).limit(n).filter(i->i%2==0).collect(Collectors.toCollection(ArrayList::new));
    }
}
