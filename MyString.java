public class MyString {
    public static void main(String[] args) {
         System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true



    }
    public static String lowerCase(String str) {
        if (str == null || str.length() == 0) {  return str;}
        char[]arr = new char [str.length()];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = str.charAt(i);
        }
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]!= 32)
            {
            if(arr[i]<97)
            {
                arr[i] =(char)(arr[i]+32);
            }
        }}
        return new String (arr);
    }

    public static boolean contains(String str1, String str2) {
        if (str1.equals("") && str2.equals("") || str2.equals("")) { return true; }
        if (str1.equals("") ) { return false; }
       for(int i = 0 ; i <= str1.length()-str2.length(); i++)
       {
       boolean b =  true;
            for(int j = 0 ; j < str2.length(); j++) 
            {  
               if(str2.charAt(j)!=str1.charAt(i+j))
               {
                b = false;
                break;
               } 
            }
        
        if (b) {
            return true;
        }
       }
       return false; 

    }}


 


