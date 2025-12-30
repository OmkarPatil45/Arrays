import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(8);
        // list.add(5);
        // list.add(9000);
        // list.add(845);
        // list.add(12);
        // list.add(9645);
        
        // list.set(0,100); 
        // list.remove(3);
        // System.out.println(list);     
        // System.out.println(list.contains(6));

 

        // input
        for (int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        // get items at any index
        for (int i = 0; i<5; i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax wont work here

        }
        System.out.println(list);

    }
}
