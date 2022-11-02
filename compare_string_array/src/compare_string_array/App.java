package compare_string_array;

public class App {

	public static void main(String[] args) {
		ArrayComparator ac = new ArrayComparator();
		String[] arr1 = {"Pero", "Krume", "Paca"};
		String[] arr2 = {"Krume", "Paca", "Pero"};
		boolean result = ac.equalsString(arr1, arr2);
		System.out.println(result);
	}

}
