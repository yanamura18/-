public BinaryHeap(boolean isMax)
{
elts = (T[])new Comparable[2];
elts[0] = null;
elts[1] = null;
last = 0;
this.isMax = isMax;
}

class BinomialHeap<T extends Comparable<T>> {
    private List<BinomialTree<T>> trees;
}

public class Fibonacci {
public static long fibonacci(long n) {
if (n == 0) { return 0; }
else if (n == 1) { return 1; }
else { return fibonacci(n - 1) + fibonacci(n - 2); }
}
