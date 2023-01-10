package day_07.d15Map集合练习;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //准备80个学生的景点选择结果
        String[] chooses = {"A", "B", "C", "D"};

        //80个同学随机选择4个选项中的1个,每个同学的选项需要被记录下来
        ArrayList<String> allChoose = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(chooses.length);
            allChoose.add(chooses[index]);
        }

        //计算每种选择的人数
        //键:四种选项  值:每种选项选择的同学的人数
        HashMap<String, Integer> hm = new HashMap<>();
        //遍历80个选择的结果,获取每个同学对景点的选择
        for (String choose : allChoose) {
            //判断该选择在map集合的键列是否存在
            if (!hm.containsKey(choose)) {
                //a.不存在,代表该选项第1次出现,直接存储该选项,次数为1
                hm.put(choose, 1);
            } else {
                //b.存在,先获取之前记录的次数,将次数+1,再放回到map集合的值中
                Integer count = hm.get(choose);
                count++;
                hm.put(choose, count);
            }
        }

        //打印结果
        System.out.println("hm = " + hm);

        //打印最大数据
        String best = "";
        int max = hm.get("A");
        for (String key : chooses) {
            Integer value = hm.get(key);
            if (value > max) {
                max = value;
                best = key;
            }
        }
        System.out.println("大家最想去的地方是:" + best);

    }
}
