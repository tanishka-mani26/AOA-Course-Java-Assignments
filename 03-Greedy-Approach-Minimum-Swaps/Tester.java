class Tester {
	
	public static int findSwapCount(String inputString) {
		
		char arr[] = inputString.toCharArray();
		int n = arr.length;
		int balance = 0;
		int swaps = 0;
		
		for (int i = 0; i < n; i++) {
			
			if (arr[i] == '(') {
				balance++;
			} else {
				balance--;
			}
			
			// If balance becomes negative,
			// find the next '(' and move it to this position
			if (balance < 0) {
				
				int j = i + 1;
				
				while (j < n && arr[j] != '(') {
					j++;
				}
				
				if (j < n) {
					
					// Move '(' from position j to position i
					for (int k = j; k > i; k--) {
						arr[k] = arr[k - 1];
					}
					
					arr[i] = '(';
					
					// Number of adjacent swaps
					swaps = swaps + (j - i);
					
					balance = 1;
				}
			}
		}
		
		return swaps;
    } 
  
    public static void main(String args[]) { 
        String inputString = "())()("; 
        System.out.println("Number of swaps: " + findSwapCount(inputString)); 
    } 
}