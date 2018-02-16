package characterGen;

public class NullWürfel {


    private int number;
    private int side;


    public NullWürfel(int number, int side) {
            this.number = number;
            this.side = side;
    }

    public int roll() { return (number * (int) (Math.random() * side ));     }

    public static void main(String[] args) {
        NullWürfel neu = new NullWürfel(  1, 1);
        System.out.println(neu.roll());
    }


}
