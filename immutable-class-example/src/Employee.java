public class Employee {
    private String name;
    private int id ;
    private Compony compony;

    public Employee(String name, int id, Compony compony) {
        this.name = name;
        this.id = id;
        this.compony = compony;

        this.compony = new Compony(compony.getComponyName(),compony.getComponySize());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Compony getCompony() {
        return new Compony("SII",40);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", compony=" + compony +
                '}';
    }
}

