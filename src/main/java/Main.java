import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "When you think you can or you think you can't, you're right";
        List<String> strList = Arrays.asList(s.split(" "));
        Map<String, Long> np = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(np);
        System.out.println(strList);
    }
}
