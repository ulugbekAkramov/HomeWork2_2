public class Cow extends Animal implements Printable{
    private int height;

    public Cow(int age, int height) {
        super(age); this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge()+ " Height: "+ this.height );
    }
}
