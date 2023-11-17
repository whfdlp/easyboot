package whf.easy.boot.service.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.google.common.collect.Maps;
import org.springframework.util.CollectionUtils;
import reactor.tuple.Tuple3;
import whf.easy.boot.model.DemoData;


import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DemoDataListener
 * @Description TODO
 * @Author whf
 * @Date 2023/9/25 14:03
 * @Version 1.0
 */
public class DemoDataListener implements ReadListener<DemoData> {

    private static final int BATCH_COUNT = 1;
    private List<DemoData> dataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
    private static Map<String,Integer> rowMapping = Maps.newHashMap();
    private Map<String,List<String>> ecsRowMapping = Maps.newHashMap();
    public int headRowNumber;
    private int headCounter;
    private String taskId;

    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(1000000000000L);
        System.out.println(bigDecimal);

    }

    public DemoDataListener(int headRowNumber,String taskId) {
        this.headRowNumber = headRowNumber;
        this.taskId = taskId;
    }

    @Override
    public void invoke(DemoData demoData, AnalysisContext analysisContext) {
        //根据映射校验和组装数据
        try {
         if (demoData.getAge() == 11){
             return;
         }
            dataList.add(checkThenConvertData(rowMapping,demoData));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        if (dataList.size() > BATCH_COUNT){
            //保存数据
            saveData(dataList);
            //初始化数组大小
            dataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }

    }

    private void saveData(List<DemoData> dataList) {

    }

    private DemoData checkThenConvertData(Map<String, Integer> rowMapping, DemoData demoData) throws IllegalAccessException {
//        DemoData data = new DemoData();
//        for (Field field : data.getClass().getDeclaredFields()) {
//            field.set(data,demoData.get(rowMapping.get(field.getName())));
//        }
//        DemoData data = DemoData.builder().age((Integer) demoData.get(rowMapping.get("age"))).build();
        return null;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
       if (!CollectionUtils.isEmpty(dataList)){
           //保存数据
           saveData(dataList);
       }
       //根据taskId更新缓存
    }

    @Override
    public void invokeHead(Map<Integer, ReadCellData<?>> headMap, AnalysisContext context) {
        headCounter++;
        //拿到所有的头数据，遍历生成系统映射
        if (headCounter == headRowNumber) {
//            if (headMap.size()!=20){
//               throw new RuntimeException("字段列不匹配");
//            }
            for (Map.Entry<Integer, ReadCellData<?>> entry : headMap.entrySet()) {
                //模糊匹配
                for (Map.Entry<String, List<String>> stringListEntry : ecsRowMapping.entrySet()) {
                    if (stringListEntry.getValue().contains(entry.getValue().getStringValue())) {
                        //字段名：列位置
                        rowMapping.put(stringListEntry.getKey(),entry.getKey());
                        break;
                    }
                }
            }
        }
    }

}
