package whf.easy.boot.service.strategy;

/**
 * @ClassName Tigger
 * @Description TODO
 * @Author whf
 * @Date 2023/3/16 19:31
 * @Version 1.0
 */
public class Tiger {
    public static void main(String[] args) {
      //  String replace = StringUtils.replace(null, ",", "");
        //System.out.println(replace);
       // String replace1 = StringUtils.replace(",2002,", ",", "");
        String ss = ",2002, ,1001, ,0000,";
        String sss = ",2, ,1, ,0,";


        String[] employeeIds = org.springframework.util.StringUtils.tokenizeToStringArray(ss, ",", false, false);
        String[] orgIds = org.springframework.util.StringUtils.tokenizeToStringArray(sss, ",", false, false);
       // System.out.println(ss.contains(",1001,"));
        int i = indexOf(employeeIds, "1001");
        System.out.println(orgIds[-1]);
        //System.out.println(StringUtils.replace(ss,",0000,",","));
       // System.out.println(replace1);
    }

    public static int indexOf(String arr[], String t){

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            if (arr[j].equals(t)) {
                return j;
            }
        }
        return -1;
    }
}
