package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        ArrayList<Integer> userAgeList = new ArrayList<>();
        ArrayList<String> userNameList = new ArrayList<>();
        List<String> userNameList2 = new ArrayList<>();

        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);

        System.out.println(userAgeList);

        userAgeList.add(2, 51);

        System.out.println(userAgeList);

        userAgeList.set(3, 49);
        System.out.println(userAgeList);

        userAgeList.remove(3);
        System.out.println(userAgeList);

        System.out.println(userAgeList.get(2));

        System.out.println(userAgeList.size());

        System.out.println(userAgeList.contains(51));
        System.out.println(userAgeList.contains(22));

        System.out.println(userAgeList.indexOf(53));
        System.out.println(userAgeList.indexOf(12));

        Object[] myArray = userAgeList.toArray();
        System.out.println(myArray);

        System.out.println("=============================");
        System.out.println("Print all el-ts of userAgeList:");
        userAgeList.forEach((n) -> System.out.println(n));
        System.out.println("=============================");

        Integer[] myIntArray = userAgeList.toArray(new Integer[0]);
        System.out.println(myIntArray);

        userAgeList.clear();
        System.out.println(userAgeList);

       //LinkedList
        System.out.println("========================================");
        System.out.println("==============LinkedList===============");
        System.out.println("========================================");
        LinkedList<Integer> userAgeLinkedList = new LinkedList<>();
        List<Integer> userAgeLinkedList2 = new LinkedList<>();

        //The same methods as for ArrayList
        userAgeLinkedList.add(40);
        userAgeLinkedList.add(53);
        userAgeLinkedList.add(45);
        userAgeLinkedList.add(53);

        System.out.println(userAgeLinkedList.poll());
        System.out.println(userAgeLinkedList);

        System.out.println(userAgeLinkedList.peek());


    }//main
}//MyCollections
