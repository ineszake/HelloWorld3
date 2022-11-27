package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker= new Faker();
         String vards= faker.name().firstName();
        System.out.println(" Mani sauc"+ vards);
        System.out.println(faker.shakespeare().romeoAndJulietQuote());
        System.out.println(faker.address().cityName());
        for (int i=0; i<10; i++)
        System.out.println(faker.cat().name());

        System.out.println(faker.address().streetAddress()+ faker.address().cityName()+faker.address().zipCode()+
                faker.address().country());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.name().lastName());
        System.out.println(faker.avatar().image());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.chuckNorris().fact());

    }
}
