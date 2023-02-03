package day_11self.demo2_dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test {
    public static void main(String[] args) throws DocumentException {
         /*
            Dom4j的api介绍:
                SAXReader类:
                    public SAXReader();创建dom4j的解析器对象
                    public Document read(String filePath);读xml文件,生成Document对象

                Document接口:
                    Element getRootElement();获取根标签
                Node接口: Element,Document都继承Node接口
                    String getName();获取标签的名称

               Element接口:
                    List<Element> elements();获取当前元素下所有子元素


         */
        // 需求: 解析day11\src\helloworld.xml文件
        // 1.创建dom4j的解析器对象---SAXReader
        SAXReader sr = new SAXReader();
       // public Document read(String filePath);读xml文件,生成Document对象
        Document document = sr.read("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\src\\helloworld.xml");

        Element rootElement = document.getRootElement();
       // String getName();获取标签的名称
        System.out.println("rootElement = " + rootElement.getName());
      //  List<Element> elements();获取当前元素下所有子元素
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println("element = " + element.getName());
        }
//        List<Element> elements(String var1);得到当前元素下指定名字的子元素返回集合
        List<Element> user1 = rootElement.elements("user");
        for (Element element : user1) {
            System.out.println("element = " + element.getName());
        }



        //        Element element(String var1);得到当前元素下指定名字的子元素,如果有很多名字相同的返回第一个
        // 4.获取users根标签下的所有user子标签
        Element user = rootElement.element("user");
        String name1 = user.getName();
        System.out.println(name1);
        //        String attributeValue(String var1);通过属性名直接得到属性值
        String id = user.attributeValue("id");
        System.out.println("id = " + id);

        //        String getText();获取标签的文本
        Element peopleE = rootElement.element("people");
        String text = peopleE.getText();
        System.out.println("text = " + text);
        //        String elementText(String var1);得到指定名称的子元素的文本
    }
}
