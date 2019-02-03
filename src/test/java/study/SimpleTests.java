package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Набор простых тестов")
public class SimpleTests {

    @DisplayName("Проверить сложение")
    @Test
    void justAdd(){
        double a = 2;
        double b = 9;
        Calc calc = new Calc();
        double result = 11;
        assertEquals(result, calc.add(a,b), a + " + " + b + " = " + result);

    }
    @DisplayName("Проверить возведение в степень")
    @Test
    void justPower(){
        double a = 2;
        double b = 1;
        Calc calc = new Calc();
        double result = 2;
        assertTrue(result == calc.power(a,b), a + "in a power of" + b + " = " + result);

    }

    @DisplayName("Выпадание эксепшн")
    @Test
    void justExcep(){
        double a = 2;
        double b = 4;
        Calc calc = new Calc();
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calc.superCalc("%",10,10));
        System.out.println(exception.getMessage());
    }

    @DisplayName("Проверяем время выполнения функции Multiply")
    @Test
    void checkTime(){
        Calc calc = new Calc();
        assertTimeout(Duration.ofMillis(1), () -> calc.multiply(1000, 10000000));
    }

    @DisplayName("Проверка AssertAll")
    @Test
    void checkAll(){
        Calc calc = new Calc();
        assertAll(
                () -> assertEquals(10,calc.add(8,2)),
                () -> assertEquals(6,calc.substract(8,2)),
                () -> assertEquals(4,calc.divide(8,2)),
                () -> assertEquals(16,calc.multiply(8,2)),
                () -> assertEquals(4,calc.power(2,2))
        );
        System.out.println("1");
    }
}


