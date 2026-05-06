import java.util.HashSet;
import java.util.Set;

public class WalkingRobotSimulation_874 {
    public static void main(String[] args) {
        int[] commands = {4,-1,4,-2,4};
        int[][] obstacles = {{2,4}};
        int result = robotSim(commands,obstacles);
        System.out.println("result is "+result);
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        int ans = 0;
        int xDir = 0;
        int yDir = 1;
        int currentX = 0;
        int currentY = 0;

        Set<String> set = new HashSet<>();

        for(int[] obs : obstacles){
            set.add(obs[0]+":"+obs[1]);
        }

        for(int command : commands){
            if(command == -1){
                if(xDir == 0 && yDir == 1){
                    xDir = 1;
                    yDir = 0;
                }
                else if(xDir == 1 && yDir == 0){
                    xDir = 0;
                    yDir = -1;
                }
                else if(xDir == 0 && yDir == -1){
                    xDir = -1;
                    yDir = 0;
                }else if(xDir == -1 && yDir == 0){
                    xDir = 0;
                    yDir = 1;
                }
            }else if(command == -2){
                if(xDir == 0 && yDir == 1){
                    xDir = -1;
                    yDir = 0;
                }else if(xDir == -1 && yDir == 0){
                    xDir = 0;
                    yDir = -1;
                }else if(xDir == 0 && yDir == -1){
                    xDir = 1;
                    yDir = 0;
                }else if(xDir == 1 && yDir == 0){
                    xDir = 0;
                    yDir = 1;
                }
            }else{
                for(int i=1;i<=command;i++){
                    if(!set.contains((currentX+xDir)+":"+(currentY+yDir))){
                        currentX = currentX+xDir;
                        currentY = currentY+yDir;
                    }else{
                        break;
                    }
                }

                ans = Math.max(ans,((currentX*currentX) + (currentY*currentY)));
            }
        }



        return ans;
    }

}
