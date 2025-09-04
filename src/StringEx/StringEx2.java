package StringEx;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "Priyabrata";
        System.out.println(str.length());                 // length is a method in String
        String s = " Tech";
        System.out.println(s.length());
        System.out.println(str + s);
        System.out.println(str.concat(s));
        System.out.println(str.charAt(0));
        for (int i = 0 ; i<str.length(); i++ ){
            System.out.println(str.charAt(i));
        }
        char[] charArr = str.toCharArray();             // String str converts into a Array
        System.out.println(charArr);
        for (int i = 0 ; i < charArr.length ; i++){
            System.out.println(charArr[i]);                     // print character one by one

        }
        String s1 = "Priyabrata Sur";
        System.out.println(str.compareTo(s));
        System.out.println(str.compareTo(s1));
        System.out.println(s1.contains("Sur"));

        String phoneNumber = "+91 9867521978";
        String[] splitPhNum = phoneNumber.split(" ");               //split before " " and after " "
        String countryCode = splitPhNum[0];
        String number = splitPhNum[1];
        System.out.println(countryCode+"     "+number);

        for (String st:splitPhNum){
            System.out.println(st);             // print with for
        }

        String demo = "hello Mr. louris";
        System.out.println(demo.indexOf("l"));
        System.out.println(demo.lastIndexOf("l"));
        System.out.println(demo.toString());            // convert into String Object

        String rep = "Hello Java";
        System.out.println(rep);
        System.out.println(rep.replace("Java", "Python"));

    }
}
