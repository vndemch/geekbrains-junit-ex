package geekbrains.junit.arrays;

public class ArrayWork {

    public static void main(String[] args) {
    }

    public static int[] arrayCheckEx(int[] arr) {
        if(arr != null) {
            for (int i=arr.length;i>0;i--) {
                if (arr[i-1] == 4) {
                    int[] res = new int[arr.length-i];
                    System.arraycopy(arr,i,res,0,arr.length-i);
                    return res;
                }
            }
            throw new RuntimeException("В массиве нет ни одной 4");
        }
        return null;
    }

    public static boolean checkArrayNums(int[] arr) {
        boolean is1 = false;
        boolean is4 = false;
        boolean noOther = true;
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i-1] == 1) is1 = true;
            if (arr[i-1] == 4) is4 = true;
            if ((arr[i-1] != 1) && (arr[i-1] != 4)) noOther = false;
        }
        return is1 & is4 & noOther;
    }

}
