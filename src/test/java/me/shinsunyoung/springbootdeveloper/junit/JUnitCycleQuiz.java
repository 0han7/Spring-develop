package me.shinsunyoung.springbootdeveloper.junit;

import org.junit.jupiter.api.*;

public class JUnitCycleQuiz {

    @BeforeEach
    public void hello() {
        System.out.println("Hello!");
    }

    @AfterEach
    public void bye() {
        System.out.println("Bye!");
    }

    @Test
    public void junitQuiz3() {
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4() {
        System.out.println("This is second test");
    }
}
