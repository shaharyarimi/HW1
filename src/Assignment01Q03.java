public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int Fib1 = 0;
        int Fib2 = 1;
        int exchange;
        int numOdd = 0;
        for (int i = 0; i< x ; i++)
        {
            if (Fib2%2!=0)
                numOdd ++;
            System.out.print(Fib2 +" ");
            exchange = Fib2;
            Fib2 +=Fib1;
            Fib1 = exchange;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
