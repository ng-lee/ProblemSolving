import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n, m;
	static int[] result;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		result = new int[m];

		comb(0, 0);

		System.out.println(sb);

	}

	private static void comb(int curr, int start) {
		if (curr == m) {
			for (int num : result) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i < n; i++) {
			result[curr] = i + 1;
			comb(curr + 1, i + 1);
		}
	}
}