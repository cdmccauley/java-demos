/*
 * SpanishNumbers.java
 * java methods demonstration
 * by christopher mccauley
 */

package spanishnumbers;

public class SpanishNumbers {
    
    /**
    * prints strings of Spanish
    * post: return string to main()
    */
    public static void spanishNumbers(int i) {
        String enEspanol = new String();
        
        switch (i) {
            case 0:
                enEspanol = "uno";
                break;
            case 1:
                enEspanol = "dos";
                break;
            case 2:
                enEspanol = "tres";
                break;
            case 3:
                enEspanol = "cuatro";
                break;
            case 4:
                enEspanol = "cinco";
                break;
            case 5:
                enEspanol = "seis";
                break;
            case 6:
                enEspanol = "siete";
                break;
            case 7:
                enEspanol = "ocho";
                break;
            case 8:
                enEspanol = "nueve";
                break;
            case 9:
                enEspanol = "diez";
                break;
        }
        System.out.println(enEspanol);
    }

    /**
     * calls spanishNumbers
     */
    public static void main(String[] args) {
        String enEspanol = new String();
        
        for (int i = 0; i < 10; i++) {
            spanishNumbers(i);
        }
    }
}