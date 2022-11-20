package ad211.babkov;

import java.util.Arrays;
import java.util.LinkedList;

public class GenericClass<T extends Integer> {
    private LinkedList<T> list;


    public GenericClass() {
        this.list = new LinkedList<>();
    }
            public LinkedList<T> getList(){
            return list;
        }
        public void setList(LinkedList<T> list){
        this.list.addAll(list);
        }

    @SafeVarargs
    public final void addElement(T... element) {
        list.addAll(Arrays.asList(element));
    }

    public void removeElement(int index) {
        list.remove(index);
    }

    public T getElement (int index) {
        return list.get(index);
    }

    public void clear () {
        list.clear();
    }


}
