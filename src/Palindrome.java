public class Palindrome {
    public static void main (String[]args)
    {
        int x = 121;
        int sum = 0;
        int rem = 0;
        int temp = x;
        while(x>0){
            rem = x%10;
            sum = (sum*10)+rem;
            x/=10;
        }
        System.out.println(sum);
        if( temp == sum){
            System.out.println("palindrome");
        }
        else
            System.out.println("Not palindrome");
        }
       /* int num = 123456;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);*/
    }



