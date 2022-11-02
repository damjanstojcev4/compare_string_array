package compare_string_array;

import java.util.Arrays;

public class ArrayComparator {
	public boolean equalsString(String[] a, String[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0; i < a.length; i++) {
			if(!a[i].equals(b[i])) {
				return false;
			}
		}
		
		return true;
	}
}
