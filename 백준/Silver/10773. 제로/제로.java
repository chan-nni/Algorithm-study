import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] stack = new int[K];
        int top = 0;

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                top--;
            } else {
                stack[top++] = num;
            }
        }

        int sum = 0;
        for (int i = 0; i < top; i++) {
            sum += stack[i];
        }

        System.out.println(sum);
    }
}
