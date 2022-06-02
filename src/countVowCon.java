import java.util.Scanner;

public class countVowCon {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        int vowel = 0;
        int cons = 0;
        String s1 = ss.toLowerCase();
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i)== 'a' | s1.charAt(i)== 'e' | s1.charAt(i)== 'i' | s1.charAt(i)== 'o'| s1.charAt(i)== 'u' ){
                vowel++;
            }
            if(s1.charAt(i)!= 'a' & s1.charAt(i)!= 'e' & s1.charAt(i)!= 'i' & s1.charAt(i)!= 'o'& s1.charAt(i) != 'u'){
                cons++;
            }
        }
        System.out.println("The number of vowels are:" +vowel);
        System.out.println("The Number if cons are: "+ cons);
    }
}
