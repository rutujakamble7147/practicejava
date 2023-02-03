public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("rutuja");
        System.out.println(stringBuffer);
        stringBuffer.append(" kamble");
        System.out.println(stringBuffer);
        stringBuffer.insert(6, " "+"santosh");
        System.out.println(stringBuffer);
    }
}