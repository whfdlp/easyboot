package whf.easy.boot.service.htmlParse;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import whf.easy.boot.service.http.HttpClient;

import java.io.IOException;
import java.util.Map;

public class HtmlParseTest {
    public static void main(String[] args) throws IOException {
        Map formData = Maps.newHashMap();
        formData.put("area","");
        formData.put("afficheType","22");
        formData.put("IsToday","");
        formData.put("title","1");
        formData.put("proID","");
        formData.put("number","");
        formData.put("IsHistory","");
        formData.put("TenderNo","");
        formData.put("_search","false");
        formData.put("nd","1700494104885");
        formData.put("rows","10");
        formData.put("page","2");
        formData.put("sidx","PublishStartTime");
        formData.put("sord","desc");
        JSONObject jsonObject = HttpClient.doPostFormData("", formData);
        System.out.println(jsonObject);
//        Document doc = Jsoup.connect("").get();
//        Elements table = doc.select("table");
//        int i = 0;
//        for (Element element : table) {
//            Elements select = element.select("tr").select("td");
//            for (Element element1 : select) {
//                System.out.println(i++ +"         "+ element1.text());
//            }
//
//        }
//        for (int i = 0;i<=table.size();i++){
//            Elements font = table.select("font");
//            System.out.println(font.text());
//        }
//        String html =doc.html();  //转化成String格式
////使用Htmlcleaner解析数据
//        HtmlCleaner cleaner = new HtmlCleaner(); //初始化对象
////System.out.println(html);
//        TagNode node = cleaner.clean(html); //解析HTML文件


    }

}
