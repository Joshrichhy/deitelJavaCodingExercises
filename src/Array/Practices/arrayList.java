package Array.Practices;

import java.util.ArrayList;

// A generic class is a class that can take some other class as an arguement.
//An arrayList is a data structure and class  in java that auto expands as you add elements to it of the same time
//it also take some other type as an arguement.
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList <>();
        list.add ("Eniola");
        list.add("Burna Boy");
        list.add("Wike");
        list.add("Chibuzor");

        System.out.println(list);

    }
}
