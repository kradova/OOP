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

    }//main
}//MyCollections
