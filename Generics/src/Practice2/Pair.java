package Practice2;

public class Pair<T> implements Comparable {

    private T t1;

    public void add(T t1) {
        this.t1 = t1;

    }

    public T getT() {
        return t1;
    }


    @Override
    public int compareTo(Object o) {
        Pair<T> t2 = (Pair<T>) o;
        if (t1.equals(t2.t1))
            return 0;
        return 1;
    }

    public static boolean compare(Object p1, Object p2) {
        if(p1.getClass() != p2.getClass())
            return  false;
        return ((Comparable)p1).compareTo(p2) == 0 ? true : false;
    }
}
