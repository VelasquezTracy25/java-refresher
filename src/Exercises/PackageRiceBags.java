package Exercises;

//Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each), write a method that returns true if it is possible to make a package with goal kilos of rice.

public class PackageRiceBags {
    public static void main(String[] args) {
    }

    public Boolean packageRice(Integer big, Integer small, Integer goal) {

        boolean result = false;

        if (big * 5 >= goal) {
            if (small >= goal % 5)
                result = true;
        } else {
            if (small >= goal - big * 5) {
                result = true;
            }
        }
        return result;
    }

}
