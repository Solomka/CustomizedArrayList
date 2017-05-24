package ua.training.customized_arraylist.model;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

public class CustomizedArrayList<E> extends AbstractList<E> {

	private static final int DEFAULT_INITIAL_CAPACITY = 10;

	private static final Object[] EMPTY_ELEMENT_DATA = {};

	private int size;

	private transient Object[] customizedArrayListData;

	public CustomizedArrayList(int initialCapacity) {
		super();
		if (initialCapacity > 0) {
			this.customizedArrayListData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.customizedArrayListData = EMPTY_ELEMENT_DATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}

	public CustomizedArrayList() {
		super();
		this.customizedArrayListData = EMPTY_ELEMENT_DATA;
	}

	public CustomizedArrayList(Collection<? extends E> c) {
		customizedArrayListData = c.toArray();
		if ((size = customizedArrayListData.length) != 0) {
			if (customizedArrayListData.getClass() != Object[].class)
				customizedArrayListData = Arrays.copyOf(customizedArrayListData, size, Object[].class);
		} else {
			this.customizedArrayListData = EMPTY_ELEMENT_DATA;
		}
	}

	@Override
	public boolean add(E e) {
		ensureCapacity(size + 1);
		customizedArrayListData[size++] = e;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException("array index out of bound exception with index at" + index);
		}
		return (E) customizedArrayListData[index];
	}

	@Override
	public int size() {
		return size;
	}

	private void ensureCapacity(int minCapacity) {
		if (customizedArrayListData == EMPTY_ELEMENT_DATA) {
			minCapacity = Math.max(DEFAULT_INITIAL_CAPACITY, minCapacity);
		}
		if (minCapacity - customizedArrayListData.length > 0)
			growCustomArrayList(minCapacity);
	}

	private void growCustomArrayList(int minCapacity) {
		int oldCapacity = customizedArrayListData.length;
		int newCapacity = oldCapacity + (oldCapacity / 2);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		customizedArrayListData = Arrays.copyOf(customizedArrayListData, newCapacity);
	}

}
