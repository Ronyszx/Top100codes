import java.util.Scanner;

public class countVowCon {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        char[] c = ss.toCharArray();
        int vowel = 0;
        int cons = 0;

        for(int i = 0; i < ss.length(); i++){
            if(ss.charAt(i)== 'a' | ss.charAt(i)== 'e' | ss.charAt(i)== 'i' | ss.charAt(i)== 'o'| ss.charAt(i)== 'u' ){
                vowel++;
                System.out.println(vowel);
            }
            if(ss.charAt(i)!= 'a' | ss.charAt(i)!= 'e' | ss.charAt(i)!= 'i' | ss.charAt(i)!= 'o'| ss.charAt(i) != 'u'){
                cons++;
                System.out.println(cons);
            }
        }
    }
}
