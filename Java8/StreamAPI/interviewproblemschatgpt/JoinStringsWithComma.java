package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma {

    public static void main(String[] args) {
        String[] arr = {"ba","cd","ef","zzz"};
        List<String> list = Arrays.asList(arr);
        String result = list.stream().collect(Collectors.joining(","));
        System.out.println("result is "+result);
    }

}
