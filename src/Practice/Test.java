package Practice;

public class Test {
    public static void main(String[] args) {
        String sx = "shenxiaoshinidie";
        System.out.println(sx);
        for (int i = 0; i < sx.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(sx);
        String s = sx.replaceAll(".", "=");
        System.out.println(s);

    }
}
