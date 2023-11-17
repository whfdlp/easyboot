package whf.easy.boot.service.strategy;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Service
public class Cat implements Animal {
    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Animal getInstance() {
        return new Cat();
    }

//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.setDesc("1");
//        Cat cat1 = new Cat();
//        cat1.setDesc("1");
//        List<Cat> cats = Lists.newArrayList(cat,cat1);
//        Cat cat3 = new Cat();
//        cat3.setDesc(cats.stream().map(x -> x.getDesc()).collect(Collectors.joining(",")));
//
//        System.out.println(cat3);
//    }

    public static boolean isValid(Object value,int total,int precision,boolean hasPrecision,String min,String max) {
        if (total == 0) {
            return true;
        }

        if (value == null) {
            return true;
        }

        String val = value.toString();

        Pattern pattern = Pattern.compile("^(-|\\+)?\\d+(\\.\\d+)?$");
        boolean match = pattern.matcher(val).matches();
        if (!match) {
            return false;
        }

        if (StringUtils.length(val) > total) {
            return false;
        }

        if (precision > 0) {
            if (!val.contains(".")) {
                return false;
            }
            return precision == val.split("\\.")[1].length();
        }

        if (hasPrecision) {
            return val.contains(".");
        }

        if(StringUtils.isNotBlank(min)){
            //小于最小值
            if(new BigDecimal(val).compareTo(new BigDecimal(min))==-1){
                return false;
            }
        }

        if(StringUtils.isNotBlank(max)){
            //小于最小值
            if(new BigDecimal(val).compareTo(new BigDecimal(max))==1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String val = "-1234.5";
        BigDecimal bigDecimal = new BigDecimal(val);
        System.out.println(bigDecimal);
    }

//    public static void main(String[] args) {
//        List<String> strings = Lists.newArrayList("0.00", "0", "0.00", "0.01", "0.03", "0.04", "0.05", "0.06", "0.09", "0.13", "0.17");
////        String str = "9%";
////      str = str.replace("%","");
////        BigDecimal  goodsTaxRate = new BigDecimal("0.01");
////        BigDecimal bigDecimal = goodsTaxRate.divide(BigDecimal.valueOf(100)).setScale(2);
////        System.out.println(strings.contains(bigDecimal.toString()));
//        Cat cat = new Cat();
//        cat.setDesc(null);
//        cat.setCode("1");
//        Cat cat1 = new Cat();
//        cat1.setDesc("a");
//        cat1.setCode("1");
//        Cat cat2 = new Cat();
//        cat2.setDesc("b");
//        cat2.setCode("1");
//        Cat cat3 = new Cat();
//        cat3.setDesc("c");
//        cat3.setCode("1");
//        Cat cat4 = new Cat();
//        cat4.setDesc(null);
//        cat4.setCode("1");
//        ArrayList<Cat> cats = Lists.newArrayList(cat, cat4, cat2, cat3, cat1);
//        Map<String, List<Cat>> collect = cats.stream().peek(catt -> {
//            if (StringUtils.isEmpty(catt.getDesc())) {
//                catt.setDesc("");
//            }
//        }).collect(Collectors.groupingBy(Cat::getDesc));
//        System.out.println(collect);
//
//
//        System.out.println(StringUtils.isNumeric("123t"));
//    }

}
