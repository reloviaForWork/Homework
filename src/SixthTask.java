public class SixthTask {
    public static void main(String[] args) {
//      length
        String firstMethod = "Hello World!";
        int uzunluk = firstMethod.length();
        System.out.println("Uzunluk: " + uzunluk);

//      charAt
        String secondMethod = "Hello World!";
        char karakter = secondMethod.charAt(2); // 0'dan başlar.
        System.out.println("3. karakter: " + karakter);

//      toUpperCase
        String thirdMethod = "Hello World!";
        String convertUpper = thirdMethod.toUpperCase();
        System.out.println("Büyük harf: " + convertUpper);

//      toLowerCase
        String fourthMethod = "Hello World";
        String convertLower = fourthMethod.toLowerCase();
        System.out.println("Küçük harf: " + convertLower);

//      contains
        String fifthMethod = "Hello World";
        boolean isContain = fifthMethod.contains("Wor");
        System.out.println("Is contain? " + isContain);

//      concat
        String sixthMethod_1 = "Hello";
        String sixthMethod_2 = "World";
        System.out.println(sixthMethod_1.concat(sixthMethod_2));

//      equals
        String seventhMethod_1 = "Hello";
        String seventhMethod_2 = "Hello";
        System.out.println(seventhMethod_1.equals(seventhMethod_2));

//      indexOf
        String eighthMethod = "Hello World!";
        System.out.println(eighthMethod.indexOf("ld"));

//      trim
        String ninthMethod = "      Hello World!     ";
        System.out.println(ninthMethod.trim());
    }
}
