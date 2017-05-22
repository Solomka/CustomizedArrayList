package ua.training.customized_arraylist.model;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CustomizedArrayList<E> extends AbstractList<E> implements List<E>{

	private transient Object[] elementData;
	private int size;

	public CustomizedArrayList(int initialCapacity) {
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		this.elementData = new Object[initialCapacity];
	}

	public CustomizedArrayList() {
		this(10);
	}

	public CustomizedArrayList(Collection<? extends E> c) {
		size = elementData.length;

		if (elementData.getClass() != Object[].class)
			elementData = Arrays.copyOf(elementData, size, Object[].class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		return (E) elementData[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

}
