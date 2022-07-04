import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicateFromString {
    public static void main(String args[]){
        String name = "bhaskar";
        char[] c = name.toCharArray();
        Set hs = new TreeSet();
        for(int i = 0; i < c.length; i++){
            hs.add(c[i]);
        }
        System.out.println(hs);

    }
}
ignore yet to be done