package MyTrys;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class EEEE {
    public static void main(String[] args) {
        
        
       String arr[] = {"5","23","4","E","2","1","E","E","E"};
       String prev = arr[0];
       String current = arr[0];
       ArrayList<String>  list = new ArrayList<>();
       PriorityQueue<Integer> quu = new PriorityQueue<>();
       for(int i=1;i<arr.length;i++){
        if ((! arr[i].equals("E"))){ 
           
            if(Integer.parseInt(current) > Integer.parseInt(arr[i]) ) {
            
                System.out.println("iffff" + arr[i]);
                prev = current;
                current = arr[i];
            }

        }else if(arr[i] == "E"){
            System.out.println("else if" + arr[i]);
            if(list.size() > 0 && list.get(list.size()-1) == current){
                list.add(prev);
            }else{
            list.add(current);
            }
            
        }


        /*if ((! arr[i].equals("E"))){ 
            int num = Integer.parseInt(arr[i]);
           
            
            quu.offer(num);
            System.out.println(quu);

        }else if(arr[i] == "E"){
            System.out.println("else if" + arr[i]);
            list.add(quu.poll());
        }*/



       }

       System.out.println(list);

    }
}
