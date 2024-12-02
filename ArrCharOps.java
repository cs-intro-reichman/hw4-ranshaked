/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

 
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static char charAt(char[] arr, int index) {
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(i == index)
            {
                return arr[i];
            }
        }
        return 0;
    }
    public static boolean equals(char[] arr1, char[] arr2) {
        for(int i = 0 ; i <arr1.length ; i++)
        {
            if(charAt(arr1,i) != charAt(arr2,i))
            {
                return false;
            }
        }
        return true;
    }
    public static int indexOf(char[] arr, char ch) {
            for(int i = 0 ; i < arr.length ; i++)
            {
                if(arr[i] == ch)
                {
                    return i;
                }
            }
        return -1;
    }
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for(int i = fromIndex ; i < arr.length ; i++)
        {
            if(arr[i] == ch)
            {
                return i;
            }
        }
        
    return -1;
}
    public static int lastIndexOf(char[] arr, char ch) {
     int i = arr.length-1;
     while(i>-1)
     {
        if(arr[i]==ch)
        {
            return i;
        }
        i--;
     }
        return -1;
    }
    public static char[] concat(char[] arr1, char[] arr2) {
        char arr3 [] = new char[arr1.length+arr2.length];
        for(int i = 0; i< arr1.length; i++)
        {
            arr3[i]=charAt(arr1,i);

        }
        int i = 0;
        for(int j = arr1.length; j < arr1.length+arr2.length; j++)
        {
            arr3[j] = charAt(arr2,i); 
            i++;
        }
        return arr3;
    }   
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] arr3 = new char[endIndex-beginIndex+1];
        int j = 0;
        for(int i = 0 ; i<arr.length; i++)
        {
            if(i>=beginIndex && i <endIndex)
            {
                arr3[j] = arr[i];
                j++;
            }
        }
        return arr3;
    }
    public static long hashCode(char[] arr) {
        if(arr.length== 0)
        {
        return 0;
        }
            long num = 0;
            int length = arr.length;
            for(int i = 0;i< arr.length;i++)
            {
                int arrnum = arr[i];
                num =num + (arrnum *(int)Math.pow(7, length-1));
                length--;

            }
        return num;
    }
    public static char[] arrToString(String str)
    {
        char[]arr = new char [str.length()];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static int compareTo(String str1, String str2) {
        char []arr1 = arrToString(str1);
        char []arr2 = arrToString(str2);
        if(str1 == "" || str2 == ""){return -2;}
        if(equals(arr1, arr2) &&arr1.length == arr2.length){return 0;}
        for(int i = 0 ; i < Math.min(arr1.length,arr2.length);i++)
        {
            if(arr1[i]!=arr2[i])
            {
            if(arr1[i] > arr2[i])
            {
                return 1;
            }
            if(arr1[i] < arr2[i])
            {
                return -1;
            }
             }
         }
        return -1;
    }
}
