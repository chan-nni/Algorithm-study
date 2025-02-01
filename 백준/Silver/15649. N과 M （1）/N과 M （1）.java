import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, R;
    static int[] nums;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        nums = new int[R];
        visited = new boolean[N];
        perm(0);
    }

    private static void perm(int cnt) {
        if (R == cnt) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < R; i++) {
                sb.append(nums[i] + " ");
            }
            System.out.println(sb.toString());
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            nums[cnt] = i+1;
            perm(cnt+1);
            nums[cnt] = 0;
            visited[i] = false;
        }
    }
}