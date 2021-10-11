
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,1,7,5,8,3,2,4,8,6,11,33,45,23,75,98,47,99,99};
		Sorter sorter = new Sorter();
//		sorter.selectionSort(a);
//		sorter.bubbleSort(a);
//		sorter.recursiveBubbleSort(a, a.length);
//		sorter.insertionSort(a);
		sorter.recursiveInsertionSort(a, a.length);
		
		
		for(int i:a){
			System.out.println(i);
		}
	}
}

class Sorter {
	public void recursiveInsertionSort(int[] a, int n) {
		
		if (n == 1) {
			return;
		}
		for (int i=1;i<n;i++){
			for (int j=i-1;j >= 0;j--){
				if (a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public void insertionSort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 1 ; i < a.length; i++){
			for (int j =  i - 1; j >=0 ; j--){
				if (a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	

	public void recursiveBubbleSort(int[] a, int n) {
		// TODO Auto-generated method stub
		
		if (n ==1){
			return;
		}

		for (int i = 0; i < n -1 ;i++){
			if (a[i] > a[i+1]){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		recursiveBubbleSort(a, n - 1);
	}
	
	
	


	public void selectionSort(int a[]){
		// Till second last element
		for (int i =0;i<a.length - 1;i++){
			int minIndex = i;
			for(int j=i+1;j<a.length;j++){
				if (a[j]<a[minIndex]){
					minIndex = j;
				}
			}
			if (i != minIndex){
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}

	public void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++){
			for (int j = 0;j < a.length - i - 1; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	}
}
