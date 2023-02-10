public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Dog"),createObject("Cat"),createObject("Cow")};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

        }

         public static Printable createObject (String name){
        switch (name){
            case "Dog":
                Dog dog=new Dog(12,"Black");
                return dog;
            case "Cat":
                Cat cat=new Cat(7,"Brown");
                return cat;
            case "Cow":
                Cow cow=new Cow(55,2);
                return cow;

         }
         return null;
}
}