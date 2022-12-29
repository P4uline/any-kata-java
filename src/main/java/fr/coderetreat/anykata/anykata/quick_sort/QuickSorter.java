package fr.coderetreat.anykata.anykata.quick_sort;

public class QuickSorter {
    public void sort(int low, int high, int[] tab) {
        System.out.println("fonction quick-sort\n");
        if (low <= high) {
            int i = partition(low, high, tab);

            System.out.printf("Traitment du sous tableau gauche : %d %d\n", low, i-1);
            sort(low, i-1, tab);

            System.out.printf("Traitment du sous tableau droit : %d %d\n", i+1, high);
            sort(i+1, high, tab);
        }
        printTab(tab);
        System.out.println("fin\n");
    }

    private static int partition(int low, int high, int[] tab) {
        int pivot, i, j;
        pivot = tab[high];
        i = low - 1;
        j = low;
        System.out.printf("i=%d j=%d pivot=%d\n", i, j, pivot);
        for (j = low; j <= high - 1; j++) {

            if (tab[j] < pivot) {
                i++; // increment index of smaller element

                // swap
                int temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
        }

        // swap
        int temp = tab[i + 1];
        tab[i + 1] = tab[high];
        tab[high] = temp;
        return i+1;
    }

    protected void printTab(int[] tab) {
        StringBuilder sb = new StringBuilder();
        for (int t : tab) {
            sb.append(t).append(" ");
        }
        sb.append("\n");
        System.out.println(sb);
    }
}
