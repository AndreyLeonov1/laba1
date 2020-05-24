import static org.junit.jupiter.api.Assertions.*;

class MonteCarloCaunterTest {

    @org.junit.jupiter.api.Test
    void GetParallelPiMonteCarlo_1_thread() {
        MonteCarloCaunter counter = new MonteCarloCaunter(1, 1000000);
        counter.GetParallelPiMonteCarlo();
    }
    @org.junit.jupiter.api.Test
    void GetParallelPiMonteCarlo_2_threads() {
        MonteCarloCaunter counter = new MonteCarloCaunter(2, 1000000);
        counter.GetParallelPiMonteCarlo();
    }
    @org.junit.jupiter.api.Test
    void GetParallelPiMonteCarlo_3_threads() {
        MonteCarloCaunter counter = new MonteCarloCaunter(3, 1000000);
        counter.GetParallelPiMonteCarlo();
    }
    @org.junit.jupiter.api.Test
    void GetParallelPiMonteCarlo_4_threads() {
        MonteCarloCaunter counter = new MonteCarloCaunter(4, 1000000);
        counter.GetParallelPiMonteCarlo();
    }
    @org.junit.jupiter.api.Test
    void GetParallelPiMonteCarlo_5_threads() {
        MonteCarloCaunter counter = new MonteCarloCaunter(5, 1000000);
        counter.GetParallelPiMonteCarlo();
    }
}