package com.company.designpatterns03;

public class ArrayCustomIterator implements MyIterator{
    private int[] array;
    private int index;
    public ArrayCustomIterator(int[] array){
        this.array = array;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        return array[index++];
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ArrayCustomIterator it = new ArrayCustomIterator(array);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
