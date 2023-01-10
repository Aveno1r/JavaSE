package day_01.d16_继承_访问父类构造器_应用场景;

public class Teacher extends People {
    private String skill;

    public Teacher() {
    }

    public Teacher(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
