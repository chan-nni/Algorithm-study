import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, R;
    static int[] nums;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        nums = new int[R];
        perm(1, 0);
        System.out.print(result);
    }

    private static void perm(int start, int cnt) {
        if (cnt == R) {
            for (int i = 0; i < R; i++) {
                result.append(nums[i]).append(" ");
            }
            result.append("\n");
            return;
        }
        for (int i = start; i <= N; i++) {
            nums[cnt] = i;
            perm(i, cnt + 1);
        }
    }
}