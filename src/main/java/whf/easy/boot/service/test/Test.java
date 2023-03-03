package whf.easy.boot.service.test;

import java.math.BigDecimal;

/**
 * @ClassName Test
 * @Description TODO
 * @Author whf
 * @Date 2023/1/29 15:06
 * @Version 1.0
 */
public class Test {
    private static final Abc abc = (a,b,c) -> Test1.in(a,b,c);

    static boolean conf(Abc abc) {
        int a = 10;
        int b = 20;
        int c = 15;
        boolean in = abc.in(a, b, c);
        System.out.println(in);
        return in;
    }

    public static void main(String[] args) {
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.ZERO.setScale(2));
    }
}
