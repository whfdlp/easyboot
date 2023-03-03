package whf.easy.boot.web.vo;

import java.io.Serializable;

/**
 * @ClassName NihaoVO
 * @Description TODO
 * @Author whf
 * @Date 2023/1/28 15:13
 * @Version 1.0
 */

public class NihaoVO  implements Serializable {

    private String name;

    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    @Override
    public String toString() {
        return "NihaoVO{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", age=" + age +
                '}';
    }
}
