public class Palindrome {
    public static void main (String[]args)
    {
        int x = 121;
        int sum = 0;

        while(x>0){
            int rem = x%10;
            x/=10;
            sum = sum*10+rem;
        }
        System.out.println(sum);
        if(x == sum) {
            System.out.println("prime");
        }
        else
            System.out.println("Not prime");

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



