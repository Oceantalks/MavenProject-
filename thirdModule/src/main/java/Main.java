import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(2,4,5,6,4);

        stream.forEach(System.out::println);
    }

}
