package whf.easy.boot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Service
public class Pig implements Animal{
    private static List<Integer> integers = new ArrayList<Integer>();
    private static String MULTI_VALUE_ATTRIBUTE_DELIMITERS =",; ";
    public static void main(String[] args) {
       integers.add(1);
       integers.add(2);
       integers.add(3);
       integers.add(4);
       con(list -> list.contains(1));
    }

    public static void con(Predicate<List<Integer>> condition){
        if (condition.test(integers)){
            System.out.println("存在");
        }
    }

    @Override
    public Animal getInstance() {
        return new Pig();
    }
}
