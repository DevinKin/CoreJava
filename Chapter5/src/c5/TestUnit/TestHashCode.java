package c5.TestUnit;

import org.junit.Test;

public class TestHashCode {
    @Test
    public void testHashCode() {
        String s ="OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " "  + tb.hashCode());
    }
}
