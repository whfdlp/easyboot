package whf.easy.boot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Service
public class Pig {
    private static List<Integer> integers = new ArrayList<Integer>();
    private static String MULTI_VALUE_ATTRIBUTE_DELIMITERS =",; ";
    public static void main(String[] args) {
       integers.add(1);
       integers.add(2);
       integers.add(3);
       integers.add(4);
       Integer i = 1;
       con(list -> {
           list.remove(i);
           System.out.println(list);
       } ,list -> list.contains(i));
    }

    public static void con(Consumer<List<Integer>> consumer,Predicate<List<Integer>> condition){
        if (condition.test(integers)){
            consumer.accept(integers);
        }
    }

   // @Override
    String printIntel() {
        return "pig";
    }
}
