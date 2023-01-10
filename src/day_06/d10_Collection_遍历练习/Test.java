package day_06.d10_Collection_遍历练习;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Movie> movies= new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》", 9.7 ,  "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6 ,  "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5 ,  "汤姆.汉克斯"));

        //增强for
        for(Movie movie:movies){
            System.out.println("电影名:"+movie.getName());
            System.out.println("电影打分:"+movie.getScore());
            System.out.println("电影主演:"+movie.getActor());
        }
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        //普通for循环   (List)集合名.fori 数组名.fori
        //增强for循环   集合名.for
        //for (Movie movie : movies) {
        //
        //}

    }
}
