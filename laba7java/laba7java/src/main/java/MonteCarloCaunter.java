import java.util.ArrayList;
import java.util.Random;

public class MonteCarloCaunter {
    private double threads;
    private double iterations;
    private int radius = 1;
    ArrayList<Double> AllCou    ntedPi = new ArrayList<Double>();

    public MonteCarloCaunter(double Threads, double Iterations){
        this.threads = Threads;
        this.iterations = Iterations;
    }
    public void GetPiMonteCarlo( double iterations)
    {
        double dotsInCircleCount = 0;
        Random random = new Random();
        for (int i = 0; i < iterations; i++)
        {
            double x = random.nextDouble() ;
            double y = random.nextDouble() ;
            if ((y * y)  + (x * x) <= radius*radius)
                dotsInCircleCount++;
        }
        double pi = 4.0 * dotsInCircleCount / iterations;
        AllCountedPi.add(pi);
    }

    public void GetParallelPiMonteCarlo(){
        long time = System.currentTimeMillis();
        for(int i=1; i <= threads; i++){
            ThreadClass threadClass = new ThreadClass(iterations/threads, this);
            threadClass.start();
            try{threadClass.join();}
            catch(InterruptedException e){ System.out.println("Thread has been interrupted");}
        }
        GetInfo(time);
    }
    void GetInfo(long time){
        System.out.println("Pi is: " + MiddlePi());
        System.out.println("Threads: " + threads);
        System.out.println("Iterations: " + iterations);
        System.out.println("Time: " + (System.currentTimeMillis() - time));
    }


     double Middle(){
        double sum = 0;
        for(double d: AllCountedPi){
            sum+=d;
        }
        double pi = sum/(double)AllCountedPi.size();

        return pi;
    }
     void ShowAllCountedPi(){
        System.out.println("Counted Pi: ");
        for(double pi: AllCountedPi){
           System.out.print(pi + " ");
        }
         System.out.println("");
    }
}

