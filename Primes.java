
public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Boolean[]P = new Boolean[N+1];
        int counter = 0;
        for (int i = 0; i <= N; i++) {
            if (i > 1) {
                P[i] = true; 
            } else {
                P[i] = false; 
            }
        }
        for (int f = 2; f * f <= N; f++) {
            if (P[f]) { 
                for (int k = f * f; k <= N; k += f) {
                    P[k] = false;
                }
            }
        }
        for(int j = 2; j<=N; j++)
        {
            if(P[j])
            {
                counter++;
                System.out.println(j);
            }
        }
        double s =((double)counter/(double)N)*100;
        System.out.println("There are " + counter + " primes between 2 and " + N + " (" + (int)s + "% are primes)");
    }
}
