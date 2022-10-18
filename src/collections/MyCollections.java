package collections;

import java.util.ArrayList;
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

        Integer[] myIntArray = userAgeList.toArray(new Integer[0]);
        System.out.println(myIntArray);

        userAgeList.clear();
        System.out.println(userAgeList);


    }//main
}//MyCollections
