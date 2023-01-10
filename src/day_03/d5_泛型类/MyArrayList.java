package day_03.d5_泛型类;

public class MyArrayList<T> {
    //不支持
    //public T[] bojs = new T[10];
    //存储数据的数组
    private Object[] objs = new Object[10];
    //代表要存储的位置
    private int index = 0;


    public void add(T t) {
        objs[index] = t;
        index++;
    }

    public T get(int index){
        return (T)objs[index];
    }
}
