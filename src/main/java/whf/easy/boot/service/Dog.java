package whf.easy.boot.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import reactor.tuple.Tuple;
import reactor.tuple.Tuple3;

import java.util.List;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Service
public class Dog extends AbractAnimal {

    private String name;

    private int age;

    private Person master;

    private List<Integer> numbers;

    private List<Person> maps;

    @Override
    String printIntel() {
        return "dog";
    }

    public static void main(String[] args) {
        List<String> sgs = Lists.newArrayList("a","b","c","d");
        List<Integer> its = Lists.newArrayList(1,2,3,4);
        List<Double> dbs = Lists.newArrayList(1.0,2.0,3.0,4.0);
        Tuple3<List<String>, List<Integer>, List<Double>> tuple3 = Tuple.of(sgs, its, dbs);
        System.out.println(tuple3.getT1());
        System.out.println(tuple3.getT2());
        System.out.println(tuple3.getT3());
    }

}
