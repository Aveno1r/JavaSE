package day_10self.demo6_字符缓冲流的练习;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args)  {
        // 需求:把文件中的《出师表》的文章顺序进行恢复
        // 2.创建ArrayList集合,指定集合元素类型为String
        ArrayList<String> list = new ArrayList<>();

                // 1.创建字符缓冲输入流对象,关联数据源文件

        try (
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\t.txt"));
        ){


            // 3.定义一个String变量,用来存储读取到的行数据
            String str ;

            // 4.循环读行数据
            while ((str = br.readLine()) != null){
                list.add(str);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


                // 5.在循环中,把读取到的行数据作为元素存储到集合中

        // 6.遍历集合
        for (String s : list) {
            System.out.println(s);
        }

         // 7.对集合中的元素按照默认规则排序
        Collections.sort(list);

               // 8.创建字符缓冲输出流对象,关联目的地文件

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\t.txt"));
        ){
            // 9.循环遍历排序好的集合元素
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
               } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("=====================");
        for (String s : list) {
            System.out.println(s);
        }
                // 10.在循环中,写出集合元素

            // 写行数据
           // 换行


    }
}
