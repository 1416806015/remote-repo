package d35_generics_class;
// 泛型类
public class MyArrayList<E> {
    private Object[] arr =new Object[10];
    private int size; // 记录当前位置


    public boolean add(E e){
        arr[size++] = e;
        return true;
    }

    public E get(int index){
        return (E) arr[index];
    }
}
