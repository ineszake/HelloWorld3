package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat Muris =new Cat();
        Dog Reksis = new Dog(10);
        Cow Gauja =new Cow();
        Fish Zivs= new Fish();

        Muris.breathe();
        Reksis.breathe();
        Zivs.breathe();

        Muris.makeSound();
        Reksis.makeSound();
        Gauja.makeSound();

        Muris.age=6;
        Muris.canClimbTrees =true;

        Reksis.age= 10;
        Reksis.canClimbTrees = false;
        Muris.eat();
        Reksis.eat();

        Muris.printClimbing();

        Reksis.rej();
        Muris.naguAsinasana();

House house=new House( 1,5,6,"Tallinas iela 10",
        4,10000,true);

house.setKadastralaVertiba(15000);
house.getAdrese("Malpils iela");

Calculator kalkulators= new Calculator();
        System.out.println(kalkulators.add(5,6));
        System.out.println(kalkulators.add(4.3,5.3));
        System.out.println(kalkulators.add(5,6, 7));

    }
}
