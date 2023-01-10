package day_03.d12_常用API_Object_clone方法;

public class User /*extends Object*/ implements Cloneable {
    private String id;
    private String username;
    private String password;
    private double[] scores;

    public User() {
    }

    public User(String id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    //想要使用Object中的方法,需要自己重写一下该方法。
    @Override
    public Object clone() throws CloneNotSupportedException {

        //浅克隆 : 得到一个新的对象,新对象的内容和原来的对象是一样的。
        //return super.clone();//java.lang.CloneNotSupportedException

        //深克隆 : 得到一个新的对象,新对象的内容 跟据原对象的内容,克隆出一份新的,赋值给新对象。
        User u = (User) super.clone();
        u.scores = u.scores.clone();
        return u;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }


}
