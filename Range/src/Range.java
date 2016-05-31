public class Range {
    private int x;
    private int y;

    public Range(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isInside(int a) {
        int from = getX();
        int to = getY();
        if (a >= x && a <= y) {
            return true;
        } else {
            return false;
        }
    }

    public int calcLength() {
        return y - x;
    }
//
}
