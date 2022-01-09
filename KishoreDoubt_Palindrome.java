public class MyClass {
    public static void main(String args[]) {
    
     String str="abba";
      
     System.out.print(checkPalindrome(str));
    }
  
  
    static boolean checkPalindrome(String str)
    {
        for (int first=0,last=str.length()-1;first<str.length();first++,last--)
        {
            if(str.charAt(first)!=str.charAt(last))
                 return false;
        }
        return true;
    }
  
}
