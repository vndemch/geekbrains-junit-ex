package geekbrains.junit.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest extends ArrayWork {

    @MethodSource(value = "chkArrNum")
    @ParameterizedTest
    public void chkArrNumsTest(int[] arr, boolean res) {
        assertEquals(res, checkArrayNums(arr));
    }

    public static Stream<Arguments> chkArrNum() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 1, 1, 4, 4, 1, 4, 4}, true ),
                Arguments.arguments(new int[] {1,1,1,1,1,1}, false),
                Arguments.arguments(new int[] {4,4,4,4}, false ),
                Arguments.arguments(new int[] {1,4,4,1,1,4,3}, false)

        );
    }


    @MethodSource(value = "mtdSrc")
    @ParameterizedTest
    public void arrayCheckTest(int[] arr, int[] expres){
        assertArrayEquals(expres,arrayCheckEx(arr));
    }

    public static Stream<Arguments> mtdSrc() {
        return Stream.of(
                Arguments.arguments(new int[] {1,2,3,1,5,1,7,8,4,1,3}, new int[] {1, 3}),
                Arguments.arguments(new int[] {1,2,3,1,5,1,7,8,4,1,4}, new int[] {}),
                Arguments.arguments(new int[] {1,2,3,1,5,1,7,8,1,1,3}, new int[] {1,2,3,1,5,1,7,8,1,1,3}),
                Arguments.arguments(new int[] {4,2,3,1,5,1,7,8,1,1,3}, new int[] {2,3,1,5,1,7,8,1,1,3})
        );
    }



}
