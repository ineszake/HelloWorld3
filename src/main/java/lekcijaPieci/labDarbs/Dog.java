package lekcijaPieci.labDarbs;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Vau, vau, vau" );
    }
    public void rej(){
        System.out.println("VRRRRRRRRRRr" );
    }
// konstruktors
public Dog(int age){
        super.age=age;
}

}

