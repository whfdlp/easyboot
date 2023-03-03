package whf.easy.boot.service;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Data
public class Dog {

    private String name;

    private int age;

    private Person master;

    private List<Integer> numbers;

    private List<Person> maps;


    public static void main(String[] args) {
        Map<String,Boolean> map = new HashMap<>();
        map.put("1234",true);
        Boolean s = map.get("1234");
        if (s != null && s){
            System.out.println("进来啦");
        }
    }

}
