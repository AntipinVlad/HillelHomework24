import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void testAvgArray() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(3.0, matrix.avgArray(array1), 0.0001);
    }

    @Test
    void testAvgZeroArray() {
        int[] array2 = {0, 0, 0, 0};
        assertEquals(0.0, matrix.avgArray(array2), 0.0001);
    }

    @Test
    void testIsMatrixSquare() {
        int[][] matrixData = new int[5][5];
        assertTrue(matrix.isMatrixSquare(matrixData));
    }

    @Test
    void testNonSquareMatrix() {
        int[][] matrixData = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        assertFalse(matrix.isMatrixSquare(matrixData));
    }

    @Test
    void testNullMatrix() {
        int[][] matrixData = null;
        assertFalse(matrix.isMatrixSquare(matrixData));
    }

    @Test
    void testEmptyMatrix() {
        int[][] matrixData = new int[0][0];
        assertFalse(matrix.isMatrixSquare(matrixData));
    }

    @Test
    void testNoSquareMatrix() {
        int[][] matrixData = new int[5][6];
        assertFalse(matrix.isMatrixSquare(matrixData));
    }
}