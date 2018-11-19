import java.util.Scanner;

/**
 * @ClassName B1002
 * @Description TODO
 * @Author xj
 * @Date 2018/11/18 22:49
 * @Version 1.0
 */
public class Main {

  /**
   * @Description:
   * @Param: [args]
   * @return: void
   * @Author: xiaojian
   * @Date: 2018/11/18
   */
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    char[] in = scan.next().toCharArray();
    String map[] = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    Integer sum = 0;
    for (char c : in
    ) {
      sum += (int) c - '0';
    }
    char[] out = sum.toString().toCharArray();

    for (int i = 0; i < out.length; i++) {
      char c = out[i];
      System.out.print(map[(int) c - '0']);
      if (i != out.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.print("\n");
  }

}