public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("LOL");
    }

    public void greets(Dog another) {
        System.out.println("LOLOLOLOL");
    }
}
