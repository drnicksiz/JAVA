
package Buldugum_Sorular;

public class Insertion_Sort{
public static void Insertion_Sort(int arr[]) {
	
   for(int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > value) {
         arr[j + 1] = arr[j];
         j = j - 1;
      }
      arr[j + 1] = value;
   }
}

public static void main(String [] args) {
	
	int [] sayilar = {1,2,4,3,6,2,1};
	
	Insertion_Sort(sayilar);
	
	for(int i : sayilar) {
		
		System.out.println(i);
	}
}
}