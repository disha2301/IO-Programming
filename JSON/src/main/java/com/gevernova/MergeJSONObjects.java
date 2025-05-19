package com.gevernova;


import org.json.JSONObject;

public class MergeJSONObjects {
    public static void main(String[] args){
        // first JSON OBJ
        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Disha");
        obj1.put("age",22);

        // second JSON OBJ
        JSONObject obj2 = new JSONObject();
        obj2.put("email", "dishay166@gmail.com");
        obj2.put("city", "Prayagraj");

        // merge obj2 into obj1 we get
        for(String key : obj2.keySet()){
            obj1.put(key, obj2.get(key));
        }

        // print merged JSON
        System.out.println("Merged JSON :\n"+obj1.toString(4));
    }
}
