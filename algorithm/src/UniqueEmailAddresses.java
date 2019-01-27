import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class UniqueEmailAddresses {
    public static String[] stringToStringArray(String line) {
        JSONArray jsonArray = JSON.parseArray(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).toString();
        }
        return arr;
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email: emails) {
            String[] arr = email.split("@");
            String local = arr[0];
            int index = local.indexOf("+");
            if(index >= 0) {
                local = local.substring(0, index);
            }
            local = local.replaceAll("\\.", "");
            System.out.println("Email : "+ local + "@" + arr[1]);
            set.add(local + "@" + arr[1]);
        }
        System.out.println("Result : "+ set.toString());
        return set.size();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] emails = stringToStringArray(line);

            int ret = new UniqueEmailAddresses().numUniqueEmails(emails);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}

