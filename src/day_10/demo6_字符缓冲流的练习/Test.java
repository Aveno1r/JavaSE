package day_10.demo6_字符缓冲流的练习;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // 需求:把文件中的《出师表》的文章顺序进行恢复
        ArrayList<String> list = null;
        try (
                // 1.创建字符缓冲输入流对象,关联数据源文件
                BufferedReader br = new BufferedReader(new FileReader("day10\\ddd\\t.txt"));
              ){


            // 2.创建ArrayList集合,指定集合元素类型为String
            list = new ArrayList<>();

            // 3.定义一个String变量,用来存储读取到的行数据
            String line;

            // 4.循环读行数据
            while ((line = br.readLine()) != null) {
                // 5.在循环中,把读取到的行数据作为元素存储到集合中
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 6.遍历集合
        for (String s : list) {
            System.out.println("s = " + s);
        }

        System.out.println("-------------排序------------------");
        // 7.对集合中的元素按照默认规则排序
        Collections.sort(list);

        try (
                // 8.创建字符缓冲输出流对象,关联目的地文件
                BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\ddd\\t.txt"));
            ){

            // 9.循环遍历排序好的集合元素
            for (String s : list) {
                // 10.在循环中,写出集合元素
                bw.write(s);// 写行数据
                bw.newLine();// 换行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
