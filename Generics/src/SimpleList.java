import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Arun on 1/2/16.
 */
public class SimpleList {
    public static void main(String[] args){
        List<String> simpleList = new ArrayList<String>();
        simpleList.add("item 1");
        simpleList.add("item 3");
        simpleList.add("item 2");

        for (String str : simpleList){
            System.out.println(str.toString());
        }

        Collections.sort(simpleList);

        //sorted list
        System.out.println("sorted list");
        for (String str : simpleList){
            System.out.println(str.toString());
        }
    }
}
