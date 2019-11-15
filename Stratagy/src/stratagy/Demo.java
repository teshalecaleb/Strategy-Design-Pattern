
package stratagy;


public class Demo {
     public static void main(String[] args){

        country abebe = new Ethiopia();
        country david = new USA();

        System.out.println("Ehiopian: " + abebe.tryToPurchase());

        System.out.println("USA: " + david.tryToPurchase());

        

    }

    
}
