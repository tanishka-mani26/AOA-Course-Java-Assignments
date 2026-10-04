class Tester {

	public static int[][] multiply(int arr1[][], int arr2[][]) {
		
		int n = arr1.length;
		int arr3[][] = new int[n][n];

		for (int index1 = 0; index1 < n; index1++) {
			for (int index2 = 0; index2 < n; index2++) {
				for (int index3 = 0; index3 < n; index3++) {
					arr3[index1][index2] = arr3[index1][index2]
							+ arr1[index1][index3] * arr2[index3][index2];
				}
			}
		}

		return arr3;
	}
	
	public static void main(String[] args) {
		int arr1[][] = new int[][] {{2,4},{1,4}};
		int arr2[][] = new int[][] {{1,4},{1,3}};
		
		int[][] arr3 = multiply(arr1, arr2);
		
		for(int index1 = 0; index1 < arr3.length; index1++){
			for(int index2 = 0; index2 < arr3.length; index2++){
				System.out.print(arr3[index1][index2] + " ");
			}
			System.out.println();
		}
	}
}