public class PracticeProblem {

	public static int linearSearch(int[] arr, int num) {
		int sequalLoops = 0;

		for (int i = 0; i < arr.length; i++) {
			sequalLoops++;
			if (arr[i] == num) {
				return sequalLoops;
			} 
		} return sequalLoops;
	}

	public static int binarySearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int binaryLoops = 0;
		int mid;

		while (left <= right) {
			binaryLoops++;
			mid = (left + right) / 2;

			if (num == arr[mid]) {
				return binaryLoops;
			}
			else if (num > arr[mid]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return binaryLoops;
	}

	public static int[] compareSearch(int[] array, int number) {
		int[] arr1 = {linearSearch(array, number), binarySearch(array, number)};
		return arr1;
		}

	public static int linearStringSearch(String[] arr, String word) {
		int sequalLoop = 0;
		for(int i = 0; i < arr.length; i++) {
			sequalLoop++;
			if (arr[i].equals(word)) {
				return sequalLoop;
			}
		}
		return sequalLoop;
	}

	public static int binaryStringSearch(String[] arr, String word) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		int binaryLoop = 0;

		for (int i = 0; i < arr.length; i++) {
			while (left <= right) {
				binaryLoop++;
				mid = (left + right) / 2;
				int compare = word.compareTo(arr[mid]);

				if (compare == 0) {
					return binaryLoop;
				}
				else if (compare > 0) {
					left = mid + 1;
				}
				else {
					right = mid - 1;
				}
			}
		}
		return binaryLoop;
	}

	public static int[] compareStringSearch(String[] array, String word) {
		int[] arr2 = {linearStringSearch(array, word), binaryStringSearch(array, word)};
		return arr2;
	}
		
		

	


	public static void main(String args[]) {
		int[] lst = {1, 3, 4, 2, 6, 9, 5};
		int[] result = compareSearch(lst, 1);
		System.out.println(result[0]);
		System.out.println(result[1]);

		String[] words = {"Hello", "bye", "no", "yes", "world", "Lamborghini"};
		int[] result2 = compareStringSearch(words, "Lamborghini");
		System.out.println(result2[0]);
		System.out.println(result2[1]);
	}
	
}
