
public class BubleSort {

	public static void main(String[] args) {
		int[] arr = {26,54,17,77,31,44,55,20,93};
		bubleSort(arr);
		System.out.println("the sorted elements are");
		for (int i:arr) {
			System.out.println(i);
		}

	}
	
	public static void bubleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int index=1;
			for (int j=i+1;j<arr.length;j++) {
				int smallNumber = arr[index];
				arr[index]=arr[i];
				arr[i]=smallNumber;
			}
		}
	}

}
