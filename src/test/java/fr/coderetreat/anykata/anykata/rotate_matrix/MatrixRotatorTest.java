package fr.coderetreat.anykata.anykata.rotate_matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixRotatorTest {

    @Test
    public void should_rotate_matrix() {

        int[][] mat = {
                {1,   2,  3,  4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };

        int[][] expected = {
                {13, 14, 15, 16, 1},
                {12, 23, 24, 17, 2},
                {11, 22, 25, 18, 3},
                {10, 21, 20, 19, 4},
                { 9,  8,  7,  6, 5}
        };

        Matrix matrix = new Matrix(mat);
        int[][] result = matrix.rotate();

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_rotate_odd_matrix() {

        int[][] mat = {
                { 1, 2, 3 },
                { 8, 9, 4 },
                { 7, 6, 5 }
        };

        int[][] expected = {
                { 7, 8, 1 },
                { 6, 9, 2 },
                { 5, 4, 3 }
        };

        Matrix matrix = new Matrix(mat);
        int[][] result = matrix.rotate();

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_rotate_even_matrix() {

        int[][] mat = {
                {  1,  2,  3, 4 },
                { 12, 13, 14, 5 },
                { 11, 16, 15, 6 },
                { 10,  9, 8,  7 }
        };

        int[][] expected = {
                { 10, 11, 12, 1 },
                {  9, 16, 13, 2 },
                {  8, 15, 14, 3 },
                {  7,  6,  5, 4 }
        };

        Matrix matrix = new Matrix(mat);
        int[][] result = matrix.rotate();

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_rotate_bigger_simple_matrix() {

        int[][] mat = {
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2, 11, 11, 11, 11, 11, 11, 9, 10 },
                { 1, 2, 11, 11, 11, 11, 11, 11, 9, 10 },
                { 1, 2, 11, 11, 11, 11, 11, 11, 9, 10 },
                { 1, 2, 11, 11, 11, 11, 11, 11, 9, 10 },
                { 1, 2, 11, 11, 11, 11, 11, 11, 9, 10 },
                { 1, 2, 11, 11, 11, 11, 11, 11, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 }
        };

        int[][] expected = {
                {  1,  1,   1,  1,  1,  1,  1,  1,  1, 1},
                {  2,  2,   2,  2,  2,  2,  2,  2,  2, 2},
                {  3,  3,  11, 11, 11, 11, 11, 11,  3, 3},
                {  4,  4,  11, 11, 11, 11, 11, 11,  4, 4},
                {  5,  5,  11, 11, 11, 11, 11, 11,  5, 5},
                {  6,  6,  11, 11, 11, 11, 11, 11,  6, 6},
                {  7,  7,  11, 11, 11, 11, 11, 11,  7, 7},
                {  8,  8,  11, 11, 11, 11, 11, 11,  8, 8},
                {  9,  9,   9,  9,  9,  9,  9,  9,  9, 9},
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}
        };

        Matrix matrix = new Matrix(mat);
        int[][] result = matrix.rotate();

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_rotate_bigger_simple_matrix_2() {

        int[][] mat = {
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3, 11, 11, 11, 11,  8, 9, 10 },
                { 1, 2,  3, 11, 11, 11, 11,  8, 9, 10 },
                { 1, 2,  3, 11, 11, 11, 11,  8, 9, 10 },
                { 1, 2,  3, 11, 11, 11, 11,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 },
                { 1, 2,  3,  4,  5,  6,  7,  8, 9, 10 }
        };

        int[][] expected = {
                {  1,  1,   1,  1,  1,  1,  1,  1,  1, 1},
                {  2,  2,   2,  2,  2,  2,  2,  2,  2, 2},
                {  3,  3,   3,  3,  3,  3,  3,  3,  3, 3},
                {  4,  4,   4, 11, 11, 11, 11,  4,  4, 4},
                {  5,  5,   5, 11, 11, 11, 11,  5,  5, 5},
                {  6,  6,   6, 11, 11, 11, 11,  6,  6, 6},
                {  7,  7,   7, 11, 11, 11, 11,  7,  7, 7},
                {  8,  8,   8,  8,  8,  8,  8,  8,  8, 8},
                {  9,  9,   9,  9,  9,  9,  9,  9,  9, 9},
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}
        };

        Matrix matrix = new Matrix(mat);
        int[][] result = matrix.rotate();

        Assertions.assertThat(result).isEqualTo(expected);
    }


    @Test
    public void should_rotate_bigger_matrix() {

        int[][] mat = {
                { 1,  2,  3,   4,   5,  6,  7,  8,  9, 10},
                {36, 37, 38,  39,  40, 41, 42, 43, 44, 11},
                {35, 64, 65,  66,  67, 68, 69, 70, 45, 12},
                {34, 63, 84,  85,  86, 87, 88, 71, 46, 13},
                {33, 62, 83,  96,  97, 98, 89, 72, 47, 14},
                {32, 61, 82,  95, 100, 99, 90, 73, 48, 15},
                {31, 60, 81,  94,  93, 92, 91, 74, 49, 16},
                {30, 59, 80,  79,  78, 77, 76, 75, 50, 17},
                {29, 58, 57,  56,  55, 54, 53, 52, 51, 18},
                {28, 27, 26,  25,  24, 23, 22, 21, 20, 19}
        };

        int[][] expected = {
                { 28, 29, 30, 31,  32, 33, 34, 35, 36, 1},
                { 27, 58, 59, 60,  61, 62, 63, 64, 37, 2},
                { 26, 57, 80, 81,  82, 83, 84, 65, 38, 3},
                { 25, 56, 79, 94,  95, 96, 85, 66, 39, 4},
                { 24, 55, 78, 93, 100, 97, 86, 67, 40, 5},
                { 23, 54, 77, 92,  99, 98, 87, 68, 41, 6},
                { 22, 53, 76, 91,  90, 89, 88, 69, 42, 7},
                { 21, 52, 75, 74,  73, 72, 71, 70, 43, 8},
                { 20, 51, 50, 49,  48, 47, 46, 45, 44, 9},
                { 19, 18, 17, 16,  15, 14, 13, 12, 11, 10}
        };

        Matrix matrix = new Matrix(mat);
        int[][] result = matrix.rotate();

        Assertions.assertThat(result).isEqualTo(expected);
    }
}
