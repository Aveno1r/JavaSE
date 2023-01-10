package day_02.d14_成员内部类;

public class Person {
    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public class Heart {
        private int blood = 100;

        public int getBlood() {
            return blood;
        }

        public void setBlood(int blood) {
            this.blood = blood;
        }

        public void jump() {
            //成员内部类可以直接访问外部类的私有成员
            if (live) {
                System.out.println("嘭嘭嘭...");
            } else {
                System.out.println("哔.......");
            }
        }

        public void print() {
            System.out.println(this);
            System.out.println(Person.this);
        }
    }


    public void show() {
        //外部类不能直接访问内部类的成员
        //System.out.println(blood);//error
        Heart h = new Heart();
        System.out.println("h.getBlood() = " + h.getBlood());
    }
}
