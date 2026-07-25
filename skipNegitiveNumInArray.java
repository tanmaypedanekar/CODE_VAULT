public class skipNegitiveNumInArray {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayInput();
        int answer = sumOfPositiveNums(array);
        System.out.println("SUM OF POSITIVE NUMS IN YOUR ARRAY IS :" + answer);
    }

    public static int sumOfPositiveNums(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            } else {
                answer += array[i];
            }
        }
        return answer;
    }
}