import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class removeDuplicateFromString {
    public static void main(String args[]){
        String name = "bhaskar";
        char[] c = name.toCharArray();
        Set hs = new LinkedHashSet();
        for(int i = 0; i < c.length; i++){
            hs.add(c[i]);
        }
        System.out.println(hs.toArray().length);
    }
}
