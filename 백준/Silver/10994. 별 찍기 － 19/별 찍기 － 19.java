import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[][] star;
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        //1 5 9 13 4n-3
        int size = 4*N-3;
        star = new int[size][size];

        draw(0, 0, size);

        print(size);
    }

    private static void print(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(star[i][j] == 1 ? "*" : " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void draw(int x, int y, int size) {
        if (size < 1) return;

        for (int i = 0; i < size; i++) {
           star[x][y+i] = 1;
           star[x+i][y] = 1;
           star[x+size-1][y+i] = 1;
           star[x+i][y+size-1] = 1;
        }

        draw(x+2, y+2, size-4);
    }
}