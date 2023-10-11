package exam02;

import org.junit.jupiter.api.*;

public class TDDTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }
    @Test
    void test1() {
        System.out.println("test1");
    }
    @Test
    void test2(){
        System.out.println("test2");
    }
}
