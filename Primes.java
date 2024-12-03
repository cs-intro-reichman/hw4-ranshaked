public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Boolean[] P = new Boolean[N + 1];
        int counter = 0;

        for (int i = 0; i < P.length; i++) {
            if (i > 1) {
                P[i] = true;
            } else {
                P[i] = false;
            }
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (P[i]) {
                for (int j = i * i; j <= N; j += i) {
                    P[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + N + ":");
        for (int j = 0; j < P.length; j++) {
            if (P[j]) {
                counter++;
                System.out.println(j);
            }
        }

        double percentage = ((double) counter / N) * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)%n", counter, N, percentage);
    }
    }
