package whf.easy.boot.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import whf.easy.boot.anno.LengthCheck;

/**
 * @ClassName DemoData
 * @Description TODO
 * @Author whf
 * @Date 2023/9/25 14:08
 * @Version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemoData {
    @ExcelProperty("年龄")
    @LengthCheck(length = "changdu")
    private int age;
    @ExcelProperty("时间")
    @LengthCheck(length = "hah")
    private String date;
    @ExcelProperty("姓名")
    @LengthCheck(length = ":jj")
    private String name;
}
