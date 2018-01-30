package se.addo.playground.output;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(2,4,5,6,4);
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("    HELLO, I AM CREATED BY APACHE MAVEN AND HERE ARE SOME RANDDOM NUMBERS AND SOME ARGUMENTS");
        stream.forEach(System.out::println);
        for (int i = 0; i < args.length; i++) {
            System.out.println("ARGS..........." + args[i]);
        }
        System.out.println("++++++++++++++++++++++++++++");
    }

}
