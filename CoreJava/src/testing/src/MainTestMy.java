package Testing.src;

import Generics.ArrayList;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTestMy {

    @BeforeClass
    public static void setUp(){
        System.out.println("before class setup");
    }

    @Before
    public void  setUpThis(){
        System.out.println("miyav miyav");
    }

    @After
    public void tearThis(){
        System.out.println(" hav hav ");
    }

    @AfterClass
    public void tear(){
        System.out.println(" sevgi gi gi gi gi");
    }

    @Test
    public void method() {
        org.junit.Assert.assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void add() {
    }
}