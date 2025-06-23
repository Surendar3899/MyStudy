package MyTrys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoListEmployessWithoutDuplicate {
    // TCS Question
    public static void main(String[] args) {
        List<String> empList = new ArrayList<>(Arrays.asList("surendar","aravind","dinesh"));
        List<String> empList1 = Arrays.asList("susi","dinesh");


        for(String a:empList1){
            boolean duplicate = false;
            for(String b:empList){
                if(a==b){
                 duplicate = true;
                }
            }

            if(!duplicate){
                empList.add(a);
            }
        }

        System.out.println(empList);

        
    }

}
