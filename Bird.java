package BTVNday10;

public class Bird extends Animal{

    @Override
    public void eat() {
        System.out.println("ngon ngon...");

    }

    @Override
    public void makeSound() {
        System.out.println("ec ec ....");
    }
    public void fly(){
        System.out.println("bay bang canh");
    }
}
