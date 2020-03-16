import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(3,"n");
        List<String> list2 = new ArrayList<>();
        list2.add("l");
        list2.add("w");
        list2.add("m");
        list2.add("o");
        list2.add("v");
        list.addAll(list2);
        int num=list.indexOf("e");
        list.remove(3);
        //String[] a = list.toArray(new String[list.size()]);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(num);
        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        for(Map.Entry<String,String> entry:map.entrySet()){
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }
        for(String key : map.keySet()){
            System.out.println(key);
        }
        for(String value : map.values()){
            System.out.println(value);
        }
    }

    public static void max(int x,int y){
        int max;


    }

}
