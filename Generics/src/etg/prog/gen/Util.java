package etg.prog.gen;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getFirst().equals(p2.getSecond()) && p1.getFirst().equals(p2.getSecond());
    }
}
