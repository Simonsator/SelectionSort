public class Selection {
	public static void selection(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int positionSmallestElement = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[positionSmallestElement] > a[j]) {
					positionSmallestElement = j;
				}
			}
			int elementAtI = a[i];
			a[i] = a[positionSmallestElement];
			a[positionSmallestElement] = elementAtI;
		}
	}

}
