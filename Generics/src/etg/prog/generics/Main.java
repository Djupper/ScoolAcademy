package etg.prog.generics;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<Integer, String>(2,"weet" );
        Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(100,123 );
        Pair< NullPointerException, NullPointerException >pair = Pair<>("","");

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
