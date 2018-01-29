import java.util.Random;

public class Counter {

    Random randomGenAndCount = new Random();

    public Integer startGen() {
        return randomGenAndCount.nextInt(100);
    }

    public Integer startCounting() {
        int num = 0;
        num = startGen();

        for(int i = 0; i < num;i++ ) {
            System.out.println(i);
        }
        return num;
    }

}
