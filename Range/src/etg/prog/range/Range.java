package etg.prog.range;

class Range {
    private double begin;
    private double end;

    Range(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    boolean isInside(int num) {

        return num >= begin && num <= end;
    }

     double calcLength() {
        return end - begin;
    }
}
