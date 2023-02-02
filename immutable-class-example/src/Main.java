public class Main {
    public static void main(String[] args) {
        Compony compony = new Compony("SII",40);
        Employee employee = new Employee("rutuja",30,new Compony("SII",50));
        System.out.println("Object :" + employee);
    }
}