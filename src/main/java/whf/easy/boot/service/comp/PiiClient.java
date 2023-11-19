package whf.easy.boot.service.comp;

import java.util.Map;

/**
 * 入口的测试类
 */
public class PiiClient {

    public static void main(String[] args) {
        PiiHandlerRegistry.init();

        // 遍历处理器
        for (Map.Entry<String, PiiDomainFieldHandler> entryHandler :  PiiHandlerRegistry.getPiiDomainFieldHandlerMap().entrySet()) {
            System.out.println(entryHandler.getKey() + "\t" + entryHandler.getValue().getPiiDomainMeta());
        }

        //
        PiiContent piiContent = new PiiContent();
        piiContent.putPiiContext(PiiContent.FORTEST, PiiContent.FORTEST);

        // 请求处理
        System.out.println("ForTestSupportFieldHandler start");
        PiiHandlerRegistry.handlerRead(new ForTestSupportFieldHandler(), null, piiContent);
        System.out.println("ForTestSupportFieldHandler end");

        // 请求处理
        System.out.println("ForTestNotSupportFieldHandler start");
        PiiHandlerRegistry.handlerRead(new ForTestNotSupportFieldHandler(), null, piiContent);
        System.out.println("ForTestNotSupportFieldHandler end");

    }
}
