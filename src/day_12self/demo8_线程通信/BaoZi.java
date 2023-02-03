package day_12self.demo8_线程通信;

public class BaoZi {
    private String xian;// 馅儿
    private boolean flag;// 是否存在

    public BaoZi() {
    }

    public BaoZi(String xian, boolean flag) {
        this.xian = xian;
        this.flag = flag;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "BaoZi{" +
                "xian='" + xian + '\'' +
                ", flag=" + flag +
                '}';
    }
}
