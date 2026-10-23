class removeDuplicate {
    public static void main(String[] args) {
        int[] array = arrayUtility.arrayInput();

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
    }
}