/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dynamicarray;

/**
 *
 * @author leecampbell
 * @param <T>
 */
@SuppressWarnings("unchecked")

public class DynamicArray<T> implements Iterable<T> {

    private T arr[];
    private int len = 0; //length user thinks size is
    private int capacity = 0; //actual array size

    public DynamicArray() {
        this(16); //initalise the size of 16
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity]; //setting the capacity and initalize and cast to type T
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T elem) {
        arr[index] = elem;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            arr[i] = null;
            len = 0;
        }
    }

    public void add(T elem) {
        //time to resize

        if (len + 1 >= capacity) { //if length + 1 is bigger than the capacity

            if (capacity == 0) {
                capacity = 1;
            } else {
                capacity *= 2; //doubles the size of static array
            }

            T[] newArr = (T[]) new Object[capacity]; //need to create new array with new capacity

             System.arraycopy(arr, 0, newArr, 0, len);

                arr = newArr; //pass everything in from old values into new array
            }
        arr[len++] = elem; //copy new value into our array.
        }

    

    public T removeAt(int removeIndex) { //removes particular value at a particular index
        if (removeIndex >= len && removeIndex < 0) {
            throw new IndexOutOfBoundsException(); //check if valid
        }

        T data = arr[removeIndex]; //grab data at remove index

        T[] newArr = (T[]) new Object[len - 1]; // make new array of size length - 1

        //now copy everything into the new array except for when its at remove index.
        for (int i = 0, j = 0; i < len; i++, j++) {

            if (i == removeIndex) {
                j--;
                //let i skip the remove index, but let j delete it
                //later we make the new arrays equal each other
            } else {
                newArr[j] = arr[i];
            }
        }
        arr = newArr; //set array to new regenerated array
        capacity = --len; //reset length
        return data;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;

    }

    public int indexOf(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {

            int index = 0;

            @Override // elements exist if index is less than len
            public boolean hasNext() {
                return index < len;
            }

            @Override //returns next element in array
            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        if (len == 1) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder(len).append(" [ ");

            for (int i = 0; i < len - 1; i++) {
                sb.append(arr[i]).append(", ");
            }

            return sb.append(arr[len - 1]).append(" ] ").toString();
        }
    }

}
