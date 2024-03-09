package _3_arrays_collections.exercise8;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        HashMap<String,String> People = new HashMap<String, String>();
        People.put("mathew","matt");
        People.put("michael","mix");
        People.put("arthur","arie");

        System.out.println(People.get("arthur"));

    }


}
