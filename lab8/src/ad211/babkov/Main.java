package ad211.babkov;

public class Main {
    public static void main(String[] args){
        GenericClass<Integer> first = new GenericClass<>();
        first.addElement(-1,0,1,2,3,4,5,6,7,8,9,10);

        output(first);
        System.out.println("Even elements from first group: ");
        output(getEvenElementsFromFirstGroup(first));

    }

    static GenericClass<Integer> getEvenElementsFromFirstGroup(GenericClass<? extends Integer> one){
        GenericClass<Integer> result = new GenericClass<>();
        for(int i =0;i<one.getList().size();i++){
            if(one.getElement(i) % 2==0 && one.getElement(i)!=0 && one.getElement(i)>0){
                result.addElement(one.getElement(i));
            }
        }
        return result;
    }
    static void output(GenericClass<? extends Number> list) {
        if(list.getList().size()==0) {
            System.out.println("Nothing to show");
        }
        for (Object o: list.getList().toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
