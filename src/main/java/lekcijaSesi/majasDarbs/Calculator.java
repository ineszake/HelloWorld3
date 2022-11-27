package lekcijaSesi.majasDarbs;
//polimorisms
public class Calculator {
    int result;
    public int add(int a, int b) {
        result=a+b;
         return result;
    }

    public int substract(int a, int b){
        result= a-b;
        return result;
    }

    public int multiply(int a, int b){
        result= a*b;
        return result;
    }

    public float divide(int a, int b){
        result= a/b;
        return result;
    }



}
