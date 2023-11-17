package whf.easy.boot.service.pipelline;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @ClassName StandardPipelineContext
 * @Description TODO
 * @Author whf
 * @Date 2023/11/17 13:58
 * @Version 1.0
 */
public class StandardPipelineContext implements PipelineContext{
    private Map<String, Object> contentMap = Maps.newConcurrentMap();

    @Override
    public void set(String contextKey, Object contextValue) {
        contentMap.put(contextKey, contextValue);
    }

    @Override
    public Object get(String contextKey) {
        return contentMap.get(contextKey);
    }
}
