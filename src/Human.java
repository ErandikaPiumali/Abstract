abstract class Human {
    Human(){
        System.out.println("Constructor is running! ");
    }
abstract void eat();
abstract void walk();
 void breathing(){
     System.out.println("Breathing!");
}

}
class Man extends Human{
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }

    @Override
    void walk() {
        System.out.println("Any kind of walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lap Dup");
    }
}
class Gawesh extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Gawesh Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating food!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}
class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Gawesh();
        Man m = new Gawesh();
        h.breathing();
        h.eat();
        h.walk();
        h1.eat();
        h1.breathing();

        h1.walk();
        m.breathing();
        m.eat();
        m.walk();
    }


}