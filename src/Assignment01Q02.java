public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int N = Integer.parseInt(args[0]) ; 
        double mult = 0 ;
        for( int i = 0; i< N ; i++)
        {
            mult += (Math.pow(-1,i)*(1.0/(2*i+1)));
        }
        approxPi = 4*mult ;
        System.out.println(approxPi + " " + actualPi);
    }
}
