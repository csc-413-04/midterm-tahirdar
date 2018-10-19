package midterm2018;

import com.google.gson.*;
import com.google.gson.JsonObject;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
            + "Host: localhost:1298\n"
            + "Connection: keep-alive\n"
            + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
            + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
            + "Referer: http://localhost:1298/\n"
            + "Accept-Encoding: gzip, deflate, br\n"
            + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{"
                    + "    “task” : “inc”,"
                    + "    “num” : 3"
        + "}";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        //System.out.println(question1and2);
        //System.out.println(question3);
        //System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host
        int n1 = question1and2.indexOf("Host:");
        int n2 = question1and2.indexOf("Connection:");
        String q1 = question1and2.substring(n1 + 6, n2);
        System.out.println(q1);


        // Question 2
        // return sum of a and b
        int n3 = question1and2.indexOf("a=");
        int n4 = question1and2.indexOf(" ", n3);

        String t = question1and2.substring(n3, n4).replace("&", " ");
        String [] t2 = t.split(" ");
        int val1 = Integer.parseInt((t2[0].split("=")[1]));
        int val2 = Integer.parseInt((t2[1].split("=")[1]));
        System.out.println("sum of a + b is " + (val1 + val2)) ;


        //
        // Question 3
        // convert to java object, increment num, convert back to json and return
        Gson gson = new Gson();
        JsonObject object = gson.fromJson(question3, JsonObject.class);
        int temp = Integer.parseInt(object.get("num").getAsString()) + 1; // Incrementing by 1
        object.addProperty("num", temp);  //Updated the property
        System.out.println(object.toString());

        // Question 5
        // return 2nd most common word
        //
        //
        //
    }
}
