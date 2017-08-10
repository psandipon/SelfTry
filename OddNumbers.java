import java.io.IOException;

public class Solution {

	public static void main(String[] args) throws IOException {

		int[] arr = oddNumbers(3, 7);

		for (int i : arr) {
			System.out.println(i);
		}
	}

	static int[] oddNumbers(int l, int r) {
		int size = 0;

		if (l == r) {
			size = 0;
		} else {
			if ((l%2==0) && (r%2 == 0)){
				size = (r-l)/2 ;
			}else{
				size = ((r-l)/2)+1 ;
			}
		}

		int[] array = new int[size];
		int c = 0;

		if (size != 0) {
			if (l % 2 == 0)
				l = l + 1;
			for (int i = l; i <= r; i = i + 2) {
				array[c++] = i;
			}

		}
		return array;

	}
}
