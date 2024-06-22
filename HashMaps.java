import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("John",12345);
        hm.put("Carl",54321);
        hm.put("Jerry",8675309);
        System.out.println(hm);
        System.out.println(hm.get("Carl"));
        System.out.println(hm.containsKey("George"));
        System.out.println(hm.containsValue(8675309));
        hm.put("John",98765);
        System.out.println(hm);
        hm.replace("Kramer",777);
        System.out.println(hm);
        hm.putIfAbsent("Steve",222);
        System.out.println(hm);
        hm.remove("steve");
        System.out.println(hm);
    }
}
