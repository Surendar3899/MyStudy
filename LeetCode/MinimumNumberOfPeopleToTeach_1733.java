import java.util.*;
public class MinimumNumberOfPeopleToTeach_1733 {
    public static void main(String[] args) {
        // int n = 2;
        // int[][] languages = {{1},{2},{1,2}};
        // int[][] friendships = {{1,2},{1,3},{2,3}};

        int n = 3;
        int[][] languages = {{2},{1,3},{1,2},{3}};
        int[][] friendships = {{1,4},{1,2},{3,4},{2,3}};
        int result = minimumTeachings(n,languages,friendships);
        System.out.println("result is "+result);

    }

    public static int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int ans = 0;

        Map<Integer,Set<Integer>> userLanguageMap = new HashMap<>();
        for(int i=0;i<languages.length;i++){
          userLanguageMap.put(i+1,new HashSet<>());
          for(int a:languages[i]){
            userLanguageMap.get(i+1).add(a);
          }
        }

        System.out.println(userLanguageMap);


        Set<Integer> usersCannotCommunicate = new HashSet<>();

        for(int[] a:friendships){
            boolean canCommunicate = false;
            for(int b:userLanguageMap.get(a[0])){
               if(userLanguageMap.get(a[1]).contains(b)){
                canCommunicate = true;
                break;
               }
            }
            if(!canCommunicate){
                usersCannotCommunicate.add(a[0]);
                usersCannotCommunicate.add(a[1]);
            }
        }
        System.out.println(usersCannotCommunicate);
        
        Map<Integer,Integer> languageCount = new HashMap<>();

        for(int i=1;i<=n;i++){
            for(int a:usersCannotCommunicate){
                if(userLanguageMap.get(a).contains(i)){
                    int count = languageCount.getOrDefault(i,0);
                    languageCount.put(i,count+1);
                }
            }
        }

        System.out.println(languageCount);

        int maxSpeakCount = 0;
        for(int a:languageCount.keySet()){
            maxSpeakCount = Math.max(maxSpeakCount,languageCount.get(a));
        }


        System.out.println(maxSpeakCount);



        return usersCannotCommunicate.size()-maxSpeakCount;
    }

}
