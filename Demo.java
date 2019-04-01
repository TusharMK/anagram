import java.util.Scanner;

public class Demo {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char [] arr;
        arr = a.toCharArray();
        for(int i = 0 ; i < a.length() ; i++)
        {
            for(int j = 0 ; j < a.length(); j++)
            {
                Character temp1 = Character.toLowerCase(arr[i]);
                Character temp2 = Character.toLowerCase(arr[j]);
                if(temp1.compareTo(temp2) >= 0)
                {
                    char c = arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;

                }
                
            }
        }

        String first = new String(arr);

    arr = b.toCharArray();
       for(int i = 0 ; i < b.length() ; i++)
        {
            for(int j = 0 ; j < b.length(); j++)
            {
                Character temp1 = Character.toLowerCase(arr[i]);
                Character temp2 = Character.toLowerCase(arr[j]);
                if(temp1.compareTo(temp2) > 0)
                {
                    char c = arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;

                }
                
            }
        }
        String second = new String(arr);

        if( first.equalsIgnoreCase(second))
        return true;
        else
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
