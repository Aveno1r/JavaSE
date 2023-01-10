package day_07.d11_斗地主案例;

//public class Card implements Comparable<Card> {
public class Card {
    private String color;
    private String number;
    private int size;//0,1,2....53

    public Card() {
    }

    public Card(String color, String number, int size) {
        this.color = color;
        this.number = number;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    //public String toString() {
    //    return "Card{" +
    //            "color='" + color + '\'' +
    //            ", number='" + number + '\'' +
    //            ", size=" + size +
    //            '}';
    //}
    public String toString() {
        return color + number;
    }
}
