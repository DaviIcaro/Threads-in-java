public class VerificaNumerosPrimos {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java VerificaNumerosPrimos <inicio> <fim>");
            return;
        }

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        NumberThread primeThread = new NumberThread(start, end);
        primeThread.start();
    }
}
