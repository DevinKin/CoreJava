package c5.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a={1,2,3};
        a = (int[])goodCopy(a,10);
        System.out.println(Arrays.toString(a));

        String[] b={"Tom", "Dick", "Harry"};
        b = (String[])goodCopy(b,10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }

    /**
     * This method attempts to grow an array by allocating a new array and copying all elements
     * @param a
     * @param newLength
     * @return
     */
    private static Object goodCopy(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        int length = Array.getLength(a);
        Class componmentType = cl.getComponentType();
        Object newArray = Array.newInstance(componmentType, newLength);
        System.arraycopy(a, 0, newArray,0,Math.min(length, newLength));
        return newArray;
    }

    private static Object badCopyOf(Object[] b, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(b,0,newArray,0,Math.min(b.length, newLength));
        return newArray;
    }
}
