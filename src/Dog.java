public class Dog extends Animal implements Printable{
    private String color;

    public Dog(int age, String color ) {
        super(age); this.color=color;
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge()+"Color: " + this.color);;
    }
}
