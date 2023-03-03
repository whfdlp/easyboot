package whf.easy.boot.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author whf
 * @Date 2022/12/10 下午8:53
 * @Version 1.0
 */
@Service
public class Cat implements Animal{
    @Override
    public Animal getInstance() {
        return new Cat();
    }


    public static void main(String[] args) {
        int rows = 11; //180000
        int columns = 3;
        String sql = "insert into student values (";
        for (int r = 1; r <= rows; r++) {//1,2,3,4,5,6...11;
            for (int c = 0; c <columns; c++) {//1,2,3
                sql += c + ",";
                if (c == 2){
                   sql =  sql.substring(0,sql.lastIndexOf(","));
                   sql +=  "),(";
                }
            }
            if (r%5==0){
                sql = sql.substring(0,sql.lastIndexOf(",("));
                System.out.println("执行sql"+sql);
                sql = "";
            }
        }
        if (sql.length() > 1){
            sql = sql.substring(0,sql.lastIndexOf(",("));
            System.out.println("执行sql"+sql);
        }

    }
}
