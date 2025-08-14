import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFolders_1233 {
    public static void main(String[] args) {
        String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f/g"};
        List<String> result = removeSubfolders(folder);
        System.out.println("result is "+result);
    }

    public static List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        System.out.println(Arrays.toString(folder));

        String prev = "";

        Arrays.sort(folder);

        for (final String f : folder) {
            if (!prev.isEmpty() && f.startsWith(prev) && f.charAt(prev.length()) == '/'){
                continue;
            }    
            ans.add(f);
            prev = f;
        }
        return ans;
    }

}
