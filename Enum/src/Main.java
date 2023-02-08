public class Main {
    Direction direction;

    public Main(Direction direction) {
        this.direction = direction;
    }

    public static void main(String[] args) {
    for (Direction direction1 : Direction.values()){
        System.out.println("Direction name :" + direction1.name());
    }
        Direction direction1 = Direction.SOUTH;


        Main MyDirection = new Main(direction1);
        switch (MyDirection.direction){
            case EAST :
                System.out.println("EAST case matched.");
                break;
            case WEST:
                System.out.println("WESt case matched.");
                break;
            case NORTH:
                System.out.println("NORTH case matched.");
                break;
            case SOUTH:
                System.out.println("SOUTH case matched.");
                break;
            default:
                System.out.println("case is not matched.");
        }
    }
}