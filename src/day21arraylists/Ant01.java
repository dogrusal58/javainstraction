package day21arraylists;

import java.util.Arrays;
import java.util.List;

public class Ant01 {

	public static void main(String[] args) {
		int arr1[][] = { {1, 2, 3}, {4, 5}, {6, 7}, {8}};

		int arr2[] = new int[arr1.length];
		System.out.println(Arrays.toString(arr2));
		arr2[0] =1;
		arr2[1]=7;
		arr2[2]=4;
		arr2[3]=9;
		System.out.println(Arrays.toString(arr2));
	}

}
