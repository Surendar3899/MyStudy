import java.util.Arrays;

public class MaximumMatchingPlayers_2410 {

    public static void main(String[] args) {
        int[] players = {4,7,9}, trainers = {8,2,5,8};
        int result = matchPlayersAndTrainers(players, trainers);
        System.out.println("result is "+result);
        
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ans = 0;
       Arrays.sort(players);
       Arrays.sort(trainers);

       for(int i=0;i<trainers.length;i++){
          if(ans < players.length && trainers[i] >= players[ans] ){
            ans++;
          }
       }

       return ans;

    }

}
