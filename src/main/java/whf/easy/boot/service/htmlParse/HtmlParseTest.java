package whf.easy.boot.service.htmlParse;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HtmlParseTest {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://ggzy.hzctc.hangzhou.gov.cn/AfficheShow/Home?AfficheID=24c6fe2c-42fb-490b-b947-fb0e3724dc30&IsInner=0&IsHistory=0&ModuleID=22").get();
        Elements table = doc.select("table");
        int i = 0;
        for (Element element : table) {
            Elements select = element.select("tr").select("td");
            for (Element element1 : select) {
                System.out.println(i++ +"         "+ element1.text());
            }

        }
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
