public class Task1 {
    public static int get(int[][] arr){
        int a = arr.length / 2;

        int res = 0;

        For:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1){
                    if (i > a)  res += i - a;
                    else res += a - i;

                    if (j > a) res += j - a;
                    else res += a - j;

                    break For;
                }
            }
        }

        return res;
    }
}
