import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMap {
    Map<String, String> m = new HashMap<String, String>();


    public void put(String key, String value){
        m.put(key,value);
    }

    public int count(){
        int counter=0;
        for (Map.Entry<String, String> entry : m.entrySet()) {
            Pattern p = Pattern.compile("yes.*");
            Matcher matcher = p.matcher(entry.getKey());
            if (matcher.matches()) {
                counter++;
            }
        }
        return counter;
    }
}
