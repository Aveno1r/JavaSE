package day_11.demo3_dom4j练习;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        // 需求: 把数据写到xml文件中
        // 分析: 不建议使用Dom4j来完成,建议使用IO流来完成
        // 步骤: 1.把数据按照xml格式进行拼接   2.把拼接好的数据写到xml文件中
        // 1.创建StringBuilder对象,用来拼接xml格式的数据
        StringBuilder sb = new StringBuilder();

        // 2.拼接xml格式数据
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("\r\n");
        sb.append("<books>");
        sb.append("\r\n");
        sb.append("    <book id=\"0001\">");
        sb.append("\r\n");
        sb.append("        <name>JavaWeb开发教程</name>");
        sb.append("\r\n");
        sb.append("        <author>张孝祥</author>");
        sb.append("\r\n");
        sb.append("        <sale>100.00元</sale>");
        sb.append("\r\n");
        sb.append("    </book>");
        sb.append("\r\n");
        sb.append("</books>");

        //System.out.println(sb);

        try (
                // 3.创建字符输出流对象,关联目的地文件
                FileWriter fw = new FileWriter("day11\\src\\books.xml");
        ){
            // 4.写拼接好xml格式数据
            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
