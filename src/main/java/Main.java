import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

import static java.util.Collections.singletonList;

public class Main {

  public static void main(String [] args) {

    test t = new test();
    t.val = 100;

    List<Integer> i = new LinkedList<>();
    i.add(1);
    i.add(2);

    Set<Integer> s = new HashSet<>();
    s.add(null);
    s.add(1);
    s.add(3);

    s.removeAll(i);

    System.out.println("s "+s);


    System.out.println(String.format("koko %s %s",new Date(), System.currentTimeMillis()));
    System.out.println(String.format("dd %s",System.currentTimeMillis()));
    System.out.println("done");
  }
  public static boolean check(Long duration) {
    return (duration == null || duration >= 0);
  }
}
