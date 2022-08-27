package BasicJava;

public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram=true;
        String str1="Ayush";
        String str2="bhAya";
        int arr[]=new int[256];
        if(str1.length()!=str2.length())
        {
            isAnagram=false;
        }else {
            for (char chh : str1.toCharArray()) {
                int index = (int) chh;
                arr[index]++;
            }
            for (char chh : str2.toCharArray()) {
                int index = (int) chh;
                arr[index]--;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if (isAnagram)
        {
            System.out.println("String are Anagram.");
        }
        else {
            System.out.println("String are not Anagram.");
        }
    }
}
