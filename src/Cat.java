public class Cat extends Animal implements Printable{
    private String breed;

    public Cat(int age , String breed) {
        super(age);
        this.breed=breed;
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge()+ "Breed: "+this.breed);
    }
}
