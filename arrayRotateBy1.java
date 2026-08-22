class arrayRotateBy1 {
    public static void main(String[] args) {
        int[] arr = Array_Utility.arrayinput();

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int star = 0;
        int en = 0;
        while (star < en) {
            int tem = arr[star];
            arr[star] = arr[en];
            arr[en] = tem;
            star++;
            en--;
        }
        int sta = 1;
        int e = arr.length - 1;
        while (sta < e) {
            int te = arr[sta];
            arr[sta] = arr[e];
            arr[e] = te;
            sta++;
            e--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}