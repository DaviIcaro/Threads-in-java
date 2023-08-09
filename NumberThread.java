class NumberThread extends Thread {
    private int start;
    private int end;

    public NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                boolean isPrime = true;

                if (i > 1) {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                } else {
                    isPrime = false;
                }

                if (isPrime) {
                    System.out.println("O numero " + i + " eh primo");
                } else {
                    System.out.println("O numero " + i + " nao eh primo");
                }

                Thread.sleep(700);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
