final public class Compony {
   private String componyName;
  private int componySize;

    public Compony(String componyName, int componySize) {
        this.componyName = componyName;
        this.componySize = componySize;
    }

    public String getComponyName() {
        return componyName;
    }

    public void setComponyName(String componyName) {
        this.componyName = componyName;
    }

    public int getComponySize() {
        return componySize;
    }

    public void setComponySize(int componySize) {
        this.componySize = componySize;
    }

    @Override
    public String toString() {
        return "Compony{" +
                "componyName='" + componyName + '\'' +
                ", componySize=" + componySize +
                '}';
    }
}
