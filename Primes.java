public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Boolean[] P = new Boolean[N + 1];
        int counter = 0;

        for (int i = 0; i < P.length; i++) {
            P[i] = i > 1;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (P[i]) {
                for (int j = i * i; j <= N; j += i) {
                    P[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (P[i]) {
                counter++;
                System.out.println(i);
            }
        }

        double s = ((double) counter / (double) N) * 100;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)%n", counter, N, (int) s);
        }
    }
