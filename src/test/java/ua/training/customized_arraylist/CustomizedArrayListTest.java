package ua.training.customized_arraylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import ua.training.customized_arraylist.model.CustomizedArrayList;

public class CustomizedArrayListTest {

	@Test
	public void testEmptyConstructor() {
		List<String> arrayList = new CustomizedArrayList<>();

		assertNotNull(arrayList);
	}

	@Test
	public void testConstructorWithInitialCapacity() {
		List<String> arrayList = new CustomizedArrayList<>(15);

		assertNotNull(arrayList);
	}

	@Test
	public void testConstructorWithInitialCollection() {
		List<String> initArrayList = Arrays.asList("a", "b", "c", "d");
		List<String> arrayList = new CustomizedArrayList<>(initArrayList);

		assertEquals(initArrayList, arrayList);
	}

	@Test
	public void testIsEmpty() {
		List<String> arrayList = new CustomizedArrayList<>();

		boolean expectedIsEmpty = true;
		boolean actualIsEmpty = arrayList.isEmpty();

		assertEquals(expectedIsEmpty, actualIsEmpty);

	}

	@Test
	public void testSize() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}

		int expectedSize = 5;
		int actualSize = arrayList.size();

		assertEquals(expectedSize, actualSize);
	}

	@Test
	public void testAdd() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}

		int expectedSize = 5;
		int actualSize = arrayList.size();
		assertEquals(expectedSize, actualSize);
	}

	@Test
	public void testGet() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}

		List<String> resultedList = new CustomizedArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			resultedList.add(arrayList.get(i));
		}

		assertEquals(arrayList, resultedList);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testAddAtIndex() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}

		arrayList.add(0, "blabla");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testSet() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}

		arrayList.set(0, "blabla");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemove() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}

		arrayList.remove(0);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveAll() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}
		arrayList.removeAll(Arrays.asList("bla0", "bla1"));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testClear() {
		List<String> arrayList = new CustomizedArrayList<>();
		String str = "bla";

		for (int i = 0; i < 5; i++) {
			arrayList.add(str + i);
		}
		arrayList.clear();
	}

}
