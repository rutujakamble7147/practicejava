public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("rutuja");
        System.out.println(stringBuilder);
        stringBuilder.append( " "+" kamble");
        System.out.println(stringBuilder);
        stringBuilder.insert(7, "santosh");
        System.out.println(stringBuilder);
    }
}