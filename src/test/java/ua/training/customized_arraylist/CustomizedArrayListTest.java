package ua.training.customized_arraylist;

import java.util.List;

import org.junit.Test;

import ua.training.customized_arraylist.model.CustomizedArrayList;

public class CustomizedArrayListTest {

	@Test
	public void testConstructor() {
		List<String> arrayList = new CustomizedArrayList<>();
		arrayList.remove(0);

	}

}
