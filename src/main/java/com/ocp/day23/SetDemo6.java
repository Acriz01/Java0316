com.ocp.day23;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo6 {
    public static void main(String[] args) {
        Set<Integer>data=new HashSet<>();
        data.add(100);
        data.add(80);
        data.add(90);
        //利用TreeSet查詢資料
        //將HashSet轉TreeSet
        data=new TreeSet<>(data);
        System.out.println(data);
    }
}
