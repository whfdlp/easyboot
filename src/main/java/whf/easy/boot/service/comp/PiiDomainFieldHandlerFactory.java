package whf.easy.boot.service.comp;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 处理器工厂
 */
public class PiiDomainFieldHandlerFactory {

    /**
     * 创建领域处理器
     *
     * @return
     */
    public static List<PiiDomainFieldHandler> createPiiDomainFieldHandler() {
        List<PiiDomainFieldHandler> piiDomainFieldHandlerList = Lists.newArrayList();

        //
        piiDomainFieldHandlerList.add(new ForTestSupportFieldHandler());
        piiDomainFieldHandlerList.add(new ForTestNotSupportFieldHandler());

        return piiDomainFieldHandlerList;
    }
}