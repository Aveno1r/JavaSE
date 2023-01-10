package day_03.d17_常用API_StringBuilder练习;

public class Test {
    public static void main(String[] args) {
        //需求:通过方法，获取指定数组内容的字符串形式
        int[] arr={11,22,33};
        System.out.println("getStringByArray(arr) = " + getStringByArray(arr));
    }

    public static String getStringByArray(int[] arr){
        StringBuilder sb = new StringBuilder();//""
        sb.append("[");
        //遍历数组,获取数组内容
        for (int i = 0; i < arr.length; i++) {
            //arr[i] 数组的内容

            //如果是最后一个元素,只拼接元素,不拼接逗号和空格
            //最大索引:表示最后一个元素的索引位置  最大索引=数组长度-1
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else{
                //s=s+arr[i];
                //s=s+", ";
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
   /* public static String getStringByArray(int[] arr){
        String s="";
        s=s+"[";
        //遍历数组,获取数组内容
        for (int i = 0; i < arr.length; i++) {
            //arr[i] 数组的内容

            //如果是最后一个元素,只拼接元素,不拼接逗号和空格
            //最大索引:表示最后一个元素的索引位置  最大索引=数组长度-1
            if (i==arr.length-1){
                s=s+arr[i];
            }else{
                s=s+arr[i];
                s=s+", ";
            }
        }
        s=s+"]";

        return s;
    }*/
}
