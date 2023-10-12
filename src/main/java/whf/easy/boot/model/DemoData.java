package whf.easy.boot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private int age;
    private String date;
    private String name;
}
