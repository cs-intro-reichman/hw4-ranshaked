
public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Boolean[]P = new Boolean[N+1];
        int counter = 0;
        for(int i = 0 ; i < P.length ; i++)
        {
            if(i>1)
            {
            P[i] = true;
            }else{
                P[i] = false;
            }
            for(int f = 2;f <= (int)Math.sqrt(P.length+1); f++)
            {
                if(i%f == 0 && i!=f)
                {
                    P[i] = false;
                }
            }
        }
        for(int j = 0; j<P.length; j++)
        {
            if(P[j])
            {
                counter++;
                System.out.println(j);
            }
        }
        double s =((double)counter/(double)N)*100;
        System.out.println("There are "+counter+" primes between 2 and "+N+" ("+ (int)s + "% are primes)");
    }
}
