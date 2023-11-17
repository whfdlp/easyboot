package whf.easy.boot.service.strategy;

import com.google.common.collect.Lists;
import whf.easy.boot.service.stream.Person;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */

public class Dog extends AbractAnimal {

    private String name;

    private int age;

    private Person master;

    private List<Integer> numbers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    //
//    private List<Person> maps;

    @Override
    String printIntel() {
        return "dog";
    }

    public static void main(String[] args) {
//        List<Tuple2<String,List<Integer>>> reimUserInvoiceIds = Lists.newArrayList();
//        reimUserInvoiceIds.add(Tuple2.of("a",Lists.newArrayList(1,2,3)));
//        reimUserInvoiceIds.add(Tuple2.of("a",Lists.newArrayList(4,5,6)));
////        reimUserInvoiceIds.add(Tuple2.of("b",Lists.newArrayList(1,2,3)));
////        reimUserInvoiceIds.add(Tuple2.of("c",Lists.newArrayList(1,2,3)));
//        Map<String, List<Tuple2<String, List<Integer>>>> invoiceUserMap = reimUserInvoiceIds.stream().collect(Collectors.groupingBy(Tuple2::getT1));
//        for (Map.Entry<String, List<Tuple2<String, List<Integer>>>> entry : invoiceUserMap.entrySet()) {
//            List<Integer> collect = entry.getValue().stream().map(Tuple2::getT2).flatMap(Collection::stream).collect(Collectors.toList());
//            System.out.println(collect);
//        }
//
//        Map<String,Integer> map = Maps.newHashMap();
//        map.put("a",1);
//        map.put("b",2);
//        System.out.println(map.size());
       Integer x = 1;
       Integer y = null;
        System.out.println(Objects.equals(x,y));
        

    }

    private static List<Integer> copyList(List<Integer> ints) {
       List<Integer> copy =  Lists.newArrayList();
        copy.addAll(ints);
       return copy;
    }

}
