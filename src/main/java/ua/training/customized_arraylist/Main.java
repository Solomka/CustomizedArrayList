package ua.training.customized_arraylist;

import java.util.List;

import ua.training.customized_arraylist.model.CustomizedArrayList;

public class Main {

	/**
	 * CustomizedArrayList usage example
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new CustomizedArrayList<>();
		String test = "test";

		for (int i = 0; i < 15; i++) {
			list.add(test + i);
		}

		System.out.println("CustomizedArrayList: " + list.toString());
		System.out.println("CustomizedArrayList size: " + list.size());
		System.out.println("CustomizedArrayList isEmpty: " + list.isEmpty());
		System.out.println("CustomizedArrayList.get(0): " + list.get(0));

	}

}
