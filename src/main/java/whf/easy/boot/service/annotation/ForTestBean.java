package whf.easy.boot.service.annotation;

@ForTestAnnotation
public class ForTestBean {
    public ForTestBean() {
        System.out.println(ForTestBean.class.getSimpleName() + " init");
    }
}
