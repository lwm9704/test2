/**
 * Map类
 * LiangWeiMing
 * 2020/3/4-18:00
 */
import java.util.HashMap;

public class Map {
    public static void main(String[] args){
        java.util.Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        for(java.util.Map.Entry<String,String> entry:map.entrySet()){
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }
        for(String key : map.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        for(String value : map.values()){
            System.out.print(value+" ");
        }
    }
}
