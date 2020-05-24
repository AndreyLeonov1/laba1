public class ThreadClass extends Thread  {

        private double iterations;
        private MonteCarloCaunter monteCounter;
    ThreadClass(double Iterations, MonteCarloCaunter MonteCounter) {
            this.iterations = Iterations;
            this.monteCounter = MonteCounter;
        }
        @Override
        public void run() {
              try {
                counter.GetPiMonteCarlo( iterations);
               } catch (Exception e) {}

        }

    }
