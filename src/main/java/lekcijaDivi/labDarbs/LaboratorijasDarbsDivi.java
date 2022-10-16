package lekcijaDivi.labDarbs;


public class LaboratorijasDarbsDivi {
    public static void main(String[] args) {
        //Salīdzināšanas izteiksmes
        //Lielāks
        int x =3;
        int y=2;
        //Šeit būs true
        System.out.println(x>y);
        y =3;
        //Šeit būs false
        System.out.println(x>y);
        //Mazāks
        x=5;
        y=3;
        System.out.println(x<y);
        y=10;
        System.out.println(x<y);
        //vienāds
        System.out.println(x==y);
        System.out.println(5==5);
        String luksaforaKrasa ="green";
        System.out.println(luksaforaKrasa.equals("green")); // vai luksafora krāsa ir vienāda ar zaļa

        //Nav vienāds

        System.out.println(x!=y);
        System.out.println(!luksaforaKrasa.equals("red"));// vai luksafora krāsa nav vienāda ar sarkanu
        // loģiskais operators nē

        //mazāks vienāds
        x=5;
        y=4;
        int z=2;
        System.out.println(x<=y);

        int vecums= 18;
        System.out.println(" Vai cilvēks var balsot(kļūdains variants)" + (vecums>18));
        System.out.println(" Vai cilvēks var balsot" + (vecums>=18));

        System.out.println(x>6 && z>y); //loģiskais "un"
        System.out.println(x>6 ||z>y);//loģiskais "vai"

        int age =13;
        boolean hasVoted =false;

        System.out.println("Paskaties cilvēka pasē");
        if( age>= 18 && hasVoted ==false);{
        System.out.println(" Drīkst balsot");}
        System.out.println("Tālākās darbības ");

        String animal=" DOG";
        String result;
        switch(animal){
            case"DOG" :
                result= "Domestic animal";
                break;
            case" CAT":
                result=" domestic animal";
                break;
            default:result="no exit aminal";
        }










    }
}
