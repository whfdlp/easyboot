package whf.easy.boot.mytest;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;

import org.joda.time.LocalDate;
import reactor.tuple.Tuple2;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @ClassName MyJoin
 * @Description TODO
 * @Author whf
 * @Date 2023/4/4 16:21
 * @Version 1.0
 */
public class MyJoin {
    private static String strFormat(String str) {
        StringBuilder target = new StringBuilder("、：- — .（ ） ()  / | \\ & * #");
        target.append(":-()/\\|、");
        target.append("+《 》 @ ！· ； “” < > ？?");
        if (StringUtils.isBlank(str)) {
            return null;
        }
        char[] chars = target.toString().toCharArray();
        for (char aChar : chars) {
            str = str.replace(String.valueOf(aChar), "");
        }
        return str.replace(" ", "").toLowerCase();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, ParseException {
//        CompletableFuture<String> fut = CompletableFuture.supplyAsync(() -> "步骤一");
//        CompletableFuture<String> fut2 = fut.thenApply(result -> "步骤二");
//        System.out.println(fut2.get());
//        System.out.println(fut.get());
//        ArrayList<String> strings = Lists.newArrayList("1", "2", "3");
//        System.out.println(String.format(",%s,",String.join(",", strings)));


//        List<Integer> ints = Lists.newArrayList(1,2,3,4,5,6,7);
//        List<Integer> rev = Lists.newArrayList(1,2,3);
//        ints.removeAll(rev);
//        System.out.println(ints);
//        ints.addAll(rev);
//        System.out.println(ints);

//     List<Integer> ints = Lists.newArrayList(1,2,3,4,5);
//     Set<Integer>  intsets = Sets.newHashSet(1,2,3);
//        ints.removeAll(intsets);
//        System.out.println(ints);

        try {
            Tuple2<Object, Object> of = Tuple2.of(null, null);
            System.out.println(of.getT1());
            //System.out.println(LocalDate.parse("2023052314:07:33", DateTimeFormat.forPattern("yyyyMMdd HH:mm:ss")).toString("yyyy-MM-dd"));
        }catch (IllegalArgumentException e){
            System.out.println("出错啦");
        }
     //        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH:mm:ss");
//        sdf.parse("2023052314:07:33").toString();
//        Date date = new Date("20230523 14:07:33");
//        System.out.println(date.getTime());

    }

}