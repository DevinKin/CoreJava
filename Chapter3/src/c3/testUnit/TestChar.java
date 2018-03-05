package c3.testUnit;

import org.junit.Test;

public class TestChar {
    @Test
    public void Testchar() {
        String greeting="Hello 测试";
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0,greeting.length());
        System.out.println(n);
        System.out.println(cpCount);
    }

}
