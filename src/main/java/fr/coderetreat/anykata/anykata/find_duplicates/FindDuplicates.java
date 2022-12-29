package fr.coderetreat.anykata.anykata.find_duplicates;

public class FindDuplicates {
    public int tortoiseAndHareAlgo(Integer[] array) {
        int tortoise = array[0];
        int hare = array[0];
        int count = 0;
        while (true) {
            tortoise = array[tortoise];
            hare = array[array[hare]];

            System.out.println("tortoise :" + tortoise);
            System.out.println("hare :    " + hare);

            if (tortoise == hare)
                // Cycle
                break;

            count++;
            if (count >= array.length) {
                // No duplicates
                throw new IllegalStateException("No duplicates");
            }
        }

        int ptr1 = array[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = array[ptr1];
            ptr2 = array[ptr2];
        }
        return ptr1;
    }

    static class LinkedListPointer<T> {
        T value;
        LinkedListPointer next;

        public LinkedListPointer(T value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            LinkedListPointer copy = this;
            while (copy != null) {
                sb.append(copy.value);

                if (copy.next != null)
                    sb.append(", ");

                copy = copy.next;
            }
            return sb.toString();
        }
    }

    public int tortoiseAndHareAlgoWithLinkedList(LinkedListPointer<Integer> root) {
        // TODO
        return 0;
    }
}
