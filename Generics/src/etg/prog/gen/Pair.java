package etg.prog.gen;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(){

    }

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
    public String toString(){
        return String.format("[%s,%s]", first,second);
    }
    public void setFirst(K first, V second){
        this.first = first;
    }

    public void setSecond(V second){
        this.second = second;
    }

}
