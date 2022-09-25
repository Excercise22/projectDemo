public class SwapValue {
    public static void swapValues(int a, int b)
    {
        System.out.println("before swap value of a is " + a + " and b is " + b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("after swap value of a is " + a + " and b is " + b);
    }

    public static void main(String[] args) {

        swapValues(5, 15);
    }
}
