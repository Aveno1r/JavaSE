package day_11.demo2_dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
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
                    List<Element> elements(String var1);得到当前元素下指定名字的子元素返回集合
                    Element element(String var1);得到当前元素下指定名字的子元素,如果有很多名字相同的返回第一个
                    String attributeValue(String var1);通过属性名直接得到属性值
                    String getText();获取标签的文本
                    String elementText(String var1);得到指定名称的子元素的文本

         */
        // 需求: 解析day11\src\helloworld.xml文件
        // 1.创建dom4j的解析器对象---SAXReader
        SAXReader sr = new SAXReader();

        // 2.读xml文件,生成Document对象
        Document document = sr.read("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\src\\helloworld.xml");

        // 3.获取根标签
        Element rootE = document.getRootElement();
        System.out.println("根标签的名称 " + rootE.getName());

        // 4.获取users根标签下的所有子标签
        List<Element> list1 = rootE.elements();
        for (Element e : list1) {
            System.out.println("users根标签下的子标签名: " + e.getName());
        }

        System.out.println("--------------------");

        // 4.获取users根标签下的所有user子标签
        List<Element> list2 = rootE.elements("user");
        for (Element e : list2) {
            System.out.println("users根标签下的user子标签名: " + e.getName());
        }

        System.out.println("--------------------");

        // 5.获取users根标签下的people子标签
        Element peopleE = rootE.element("people");
        System.out.println("users根标签下的people子标签: " + peopleE.getName());

        Element userE = rootE.element("user");

        System.out.println("users根标签下的user子标签: " + userE.getName());

        System.out.println("--------------------");

        // 6.获取标签的属性值
        String id = userE.attributeValue("id");
        String desc = userE.attributeValue("desc");
        System.out.println("id = " + id);
        System.out.println("desc = " + desc);
        System.out.println("--------------------");

        // 7.获取people标签的文本
        String text = peopleE.getText();
        System.out.println("people标签的文本: " + text);

        System.out.println("--------------------");

        // 第一种方式: 获取user标签下的子标签,再通过子标签获取文本
        List<Element> userList = userE.elements();
        for (Element e : userList) {
            System.out.println("第一个user标签的子标签"+e.getName()+"的文本: " + e.getText());
        }

        System.out.println("--------------------");
        // 第二种方式: 直接获取指定名称的子标签的文本
        String name = userE.elementText("name");
        String sex = userE.elementText("sex");
        // ....
        System.out.println("name = " + name);
        System.out.println("sex = " + sex);
    }
}
