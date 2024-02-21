import org.example.*;
import org.junit.jupiter.api.Test;

public class BaseTest {

    @Test
    public void firstTaskTest() {
        Task1.task1();
        Task1.task2();
        Task1.task3();
    }

    @Test
    public void secondTaskTest() {
        Task2.task4();
        Task2.task5();
    }

    @Test
    public void thirdTaskTest() {
        Task3.task6();
        Task3.task7();
        Task3.task8();
        Task3.task9();
        Task3.task10();
    }

    @Test
    public void fourthTaskTest() {
        Task4.task11();
        Task4.task12();
        Task4.task13();
    }

    @Test
    public void fifthTaskTest() {
        Task5.task14();
    }
}
