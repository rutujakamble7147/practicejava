public class Main {
    public static void main(String[] args) {
        String name1 = "rutuja";
        String name2 = "anjali";
        String name3 = name1;
        String name4 = new String();

        System.out.println(name1==name2);

        System.out.println(name1==name3);

        System.out.println(name3==name4);


        System.out.println(name3==name2);

        System.out.println("name 1 :" +name1 + "  " +" name 2 :" + name2);
    }
}