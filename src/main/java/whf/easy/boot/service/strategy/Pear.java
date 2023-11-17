package whf.easy.boot.service.strategy;

import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @ClassName Pear
 * @Description TODO
 * @Author whf
 * @Date 2023/3/13 10:32
 * @Version 1.0
 */
public class Pear {

    public static void main(String[] args) {
        String sss = "";
        String[] strings = StringUtils.tokenizeToStringArray(sss, ",", true, true);
        System.out.println(strings.length);
        boolean c = Arrays.stream(strings).noneMatch(s -> s.contains("4"));
        System.out.println("c"+c);
        String[] ss = new String[]{"1","2","3","4"};
        boolean b = Arrays.stream(ss).noneMatch(s -> s.contains("4"));
        System.out.println(b);
    }
}
