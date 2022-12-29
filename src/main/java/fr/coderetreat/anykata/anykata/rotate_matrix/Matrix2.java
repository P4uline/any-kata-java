package fr.coderetreat.anykata.anykata.rotate_matrix;

import java.util.Objects;

public class Matrix2 {
    private final int[][] mat;
    private int size;

    public Matrix2(int[][] mat) {
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

    /*
            1 2 3
            4 5 6
            7 8 9
     */
    public int[][] rotate() {
        printMatrix();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size - 1 - i; j++) {
                System.out.println(i + " " + j);
                Coordonnee depart = new Coordonnee(i, j);
                Coordonnee destination = calcDestination(i, j, size);
                int valeurDepart = mat[depart.i][depart.j];
                int valeurArrivee = mat[destination.i][destination.j];

                for (int k = 0;  k < 4; k ++) {
                    System.out.println(depart + " -> " + destination);
                    mat[destination.i][destination.j] = valeurDepart;
                    valeurDepart = valeurArrivee;
                    depart = destination;
                    destination = calcDestination(depart, size);
                    valeurArrivee = mat[destination.i][destination.j];
                }
            }
        }
        return mat;
    }

    static class Coordonnee {
        private int i;
        private int j;

        public Coordonnee(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public String toString() {
            return "(" + i + "," + j + ")";
        }
    }

    // i et j
    public Coordonnee calcDestination(int i, int j, int n) {
        return new Coordonnee(j, n - i - 1);
    }

    public Coordonnee calcDestination(Coordonnee c, int n) {
        return calcDestination(c.i, c.j, n);
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
