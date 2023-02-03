package day_11.demo3_dom4j练习;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws Exception {
        // 需求:利用Dom4J框架，将contacts.xml文件中的联系人数据，解析出来，封装成List集合，并遍历输出
        // 1.创建Dom4j解析器对象---SAXReader
        SAXReader sr = new SAXReader();

        // 2.读xml文件,得到Document对象
        Document document = sr.read("day11\\src\\contacts.xml");

        // 3.根据Document对象获取根标签
        Element rootE = document.getRootElement();

        // 4.通过根标签,获取根标签下的所有子标签
        List<Element> list = rootE.elements();

        // 5.创建ArrayList集合,指定集合元素类型为Contact类型
        ArrayList<Contact> contactList = new ArrayList<>();

        // 6.循环遍历根标签下的所有子标签
        for (Element e : list) {
            // 7.在循环中,获取contact标签的id属性和vip属性
            int id = Integer.parseInt(e.attributeValue("id"));
            boolean vip = Boolean.parseBoolean(e.attributeValue("vip"));

            // 7.在循环中,获取contact标签的name,gender,email子标签的文本
            String name = e.elementText("name");
            String gender = e.elementText("gender");
            String email = e.elementText("email");

            // 7.在循环中,创建Contact联系人对象
            Contact contact = new Contact();

            // 7.在循环中,把获取到的数据封装到Contact联系人对象中
            contact.setId(id);
            contact.setVip(vip);
            contact.setName(name);
            contact.setGender(gender);
            contact.setEmail(email);

            // 7.在循环中,把联系人对象添加到集合中
            contactList.add(contact);
        }

        // 8.循环遍历集合,打印输出
        for (Contact contact : contactList) {
            System.out.println("contact = " + contact);
        }


    }
}
