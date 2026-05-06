import java.util.ArrayList;
import java.util.List;

public class Check3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<10;i++){
            list.add(i);
        }

        System.out.println("li1   "+list);

        // for(Integer i:list){
        //     if(i == 5){
        //         list.remove(i);
        //     }
        // }

        for(int i =0;i<list.size();i++){
            if(i == 5){
                list.remove(i);
            }
        }

        System.out.println("li2   "+list);


        System.out.println("done");
    }

}
