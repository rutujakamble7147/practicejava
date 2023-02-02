import javax.swing.event.ListSelectionEvent;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> guestList = new LinkedList<>();
        guestList.add("swati");
        guestList.add("Sarika");
        guestList.add("Seema");

        guestList.forEach(name-> System.out.println(name));
        System.out.println("print second element : " + guestList.get(1));
        System.out.println("remove third element : " + guestList.remove(2));


        List<String> newGuestList = new LinkedList<>();
        newGuestList.add("Aryan");
        newGuestList.add("Atharv");
        newGuestList.add("Vedant");
        newGuestList.add("Vrushabh");

        guestList.addAll(newGuestList);
        System.out.println("List before sorting : ");
        guestList.forEach(name-> System.out.println(name));
        Collections.sort(guestList);
        System.out.println("List after sorting : ");
        guestList.forEach(name-> System.out.println(name));

        List immutableList = List.of(newGuestList);
    }
}