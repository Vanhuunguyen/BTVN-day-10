package BTVNday10;
import java.util.*;
public class hashmap {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 chuoi van ban: ");
            String vanBan = sc.nextLine();
            String[] testHashMap = vanBan.split(" ");
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            for(int i=0;i<testHashMap.length;i++){
                String key = testHashMap[i];
                if(map.containsKey(key)){
                    Integer value = map.get(key);
                    map.remove(key);
                    map.put(key,value+1);
                }else {
                    map.put(key,1);
                }
            }

            Set set = map.keySet();
            Iterator i = set.iterator();
            while(i.hasNext()){
                String  key=(String)i.next();
                System.out.println("tu '"+key+"' xuat hien "+map.get(key)+ " lan");
            }




        }
}

