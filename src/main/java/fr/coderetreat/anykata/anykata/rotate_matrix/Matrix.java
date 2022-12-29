package fr.coderetreat.anykata.anykata.rotate_matrix;

import java.util.Objects;

public class Matrix {
    private final int[][] mat;
    private int size;

    public Matrix(int[][] mat) {
        Objects.requireNonNull(mat);
        if (mat.length != mat[0].length) {
            throw new IllegalArgumentException("The matrix should be a square.");
        }
        this.mat = mat;
        this.size = mat.length;
    }

    public int size() {
        return size;
    }

    public int[][] rotate() {
        printMatrix();
        int sizeSquare = size;
        for (int i = 0; i < size - 1 && sizeSquare > 1; i++) {
            for (int j = i; j < size - 1; j++) {
                int coordSquare = i;
                System.out.println("Carré premier element index : " + coordSquare + " dernier element index : " + (sizeSquare - 1));
                rotateSquare(j, sizeSquare);
                sizeSquare = sizeSquare - 1;
                System.out.println("");

            }
        }
        return mat;
    }

    private void rotateSquare(int coordSquare, int sizeSquare) {
        int lastIndex = sizeSquare - 1;
        System.out.println("Carré de " + coordSquare + " " + lastIndex);
        for (int i = coordSquare; i < lastIndex; i++) {
            int save = mat[i][lastIndex];
            mat[i][lastIndex] = mat[coordSquare][i];
            System.out.println(save + "(" + i + "," + lastIndex + ") remplacé par " + mat[coordSquare][i]);

            int save2 = mat[lastIndex][lastIndex - i + coordSquare];
            mat[lastIndex][lastIndex - i + coordSquare] = save;
            System.out.println(save2 + "(" + lastIndex + "," + (lastIndex - i + coordSquare) + ") remplacé par " + save);

            int save3 = mat[lastIndex - i + coordSquare][coordSquare];
            mat[lastIndex - i + coordSquare][coordSquare] = save2;
            System.out.println(save3 + "(" + (lastIndex - i + coordSquare) + "," + coordSquare + ") remplacé par " + save2);

            int save4 = mat[coordSquare][i];
            mat[coordSquare][i] = save3;
            System.out.println(save4 + "(" + coordSquare + "," + i + ") remplacé par " + save3);
        }
    }

    private void printMatrix() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(mat[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
