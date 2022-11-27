package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRinkis {
    @Test
    public void testRekinatLaukumu() {
        System.out.println(" Mans pirmais tests");
        Rinkis mansRinkis = new Rinkis(4.5);
        //expectedResult- sagadamais rezultats
        //actualResult- realais rezultats


        double expectedArea = 63.62;
        double actualArea = mansRinkis.rekinatLaukumu();

        //assert// assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);


    }

    @Test
    public void testRekinatLaukumuVeselsSkaitlis() {
        System.out.println(" Mans pirmais tests");
        Rinkis mansRinkis = new Rinkis(4);
        //expectedResult- sagadamais rezultats
        //actualResult- realais rezultats


        double expectedArea = 50.24;
        double actualArea = mansRinkis.rekinatLaukumu();

        //assert// assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }
// Uzrakstit vairakus testus saistitus ar rinka liniju


    @Test
    public void testRekinatRinkaLinijuNulle () {
        System.out.println(" Mans pirmais tests");
        Rinkis mansRinkis = new Rinkis(0);
        //expectedResult- sagadamais rezultats
        //actualResult- realais rezultats


        double expectedArea = 0;
        double actualArea = mansRinkis.rekinatLaukumu();

        //assert// assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }

    @BeforeMethod
    public void sagavatosanas(){ //setup
        System.out.println("Šī metode tiek izpildīta pirms katra testa");}

    @AfterMethod
    public void pecDarbibas(){ //tearDown
        System.out.println("Šī metode tiek izpildīta pirms katra testa");
    }
  @BeforeTest
  public void pirmsTesta (){
      System.out.println( " Šī ir pimrs testa anotācija");
  }

  @AfterTest
  public void pecTesta(){
      System.out.println("Šī ir pēc testa anotacija");
  }
    //uztaisit testus rinka linijai


    @Test
    public void testRekinatRinkaLiniju() {

        Rinkis mansRinkis = new Rinkis(4.5);
        //expectedResult- sagadamais rezultats
        //actualResult- realais rezultats


        double expectedLine = 28.27;
        double actualLine = mansRinkis.rekinatLaukumu();

        //assert// assertion - pārbaudes
        Assert.assertEquals(actualLine, expectedLine);

    }
    @Test
    public void testRekinatRinkaLinijuVeselsSkaitlis() {

        Rinkis mansRinkis = new Rinkis(6);
        //expectedResult- sagadamais rezultats
        //actualResult- realais rezultats


        double expectedLine = 37.70;
        double actualLine = mansRinkis.rekinatLaukumu();

        //assert// assertion - pārbaudes
        Assert.assertEquals(actualLine, expectedLine);
    }


}