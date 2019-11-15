
package stratagy;


public interface Currency {
    String purchase();
}
    


class ByBirr implements Currency{

    public String purchase() {

        return "purchasing with birr";

    }

}


class ByDollar implements Currency{

    public String purchase() {

        return "purchasing with dollar";

    }
}