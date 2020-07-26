import java.util.*; 
import java.util.stream.IntStream; 
public class StreamDemoTwo 
{
    public static void main( String[] args )
    {
    	IntStream stream = IntStream.of(25, 30, 12, 90, 56, 20, 10); 
    	   OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) 
            System.out.println(obj.getAsDouble());  
        else 
            System.out.println("-1"); 
    }
}
