package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
    for (int a = 0; a < strings.length; a++) {

      for (int b = a + 1; b < strings.length; b++) {
        if (strings[a].compareTo(strings[b]) < 0) {
          String temp = strings[b];
          strings[b] = strings[a];
          strings[a] = temp;
        }


      }


    }

    for (int k = 0; k < strings.length; k++) {

      System.out.println(strings[k]);

    }
  }
  public static void main(String[] args) {
    new Main();
  }
}
