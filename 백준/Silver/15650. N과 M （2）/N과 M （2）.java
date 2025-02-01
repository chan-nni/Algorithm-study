import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, R;
    static int[] nums;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        nums = new int[R];
        perm(0, 0);
    }

    private static void perm(int cnt, int start) {
        if (cnt == R) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < R; i++) {
                sb.append(nums[i] + " ");
            }
            System.out.println(sb.toString());
            return;
        }
        for (int i = start; i < N; i++) {
            nums[cnt] = i+1;
            perm(cnt+1, i+1);
        }
    }
}
