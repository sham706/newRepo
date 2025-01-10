package com.shamanth.InterviewStreams.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstQuestion {

	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};

        // Convert the array to an ArrayList
        ArrayList intArrayList = new ArrayList(Arrays.asList(intArray));

        // Print the ArrayList
        System.out.println(intArrayList);
        
        String[] array = {"Apple", "Banana", "Apple", "Cherry", "Banana", "Date"};

        // Remove duplicates using streams and collect to a LinkedHashSet to maintain order
         Arrays.stream(array)
                .distinct().forEach(System.out::print);	
         
         Integer[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6};
         
        Arrays.stream(arr).distinct().forEach(System.out::println);
          List<Integer> lala = Arrays.stream(arr).distinct().toList();
          System.out.println(lala+"hi");
        
        Integer[] arrayy = {1, 2, 3, 1, 4, 2, 5, 3, 6};

        Integer[] uniqueArray = Arrays.stream(arrayy)
                .distinct() // Remove duplicates
                .toArray(Integer[]::new);
	}

}
