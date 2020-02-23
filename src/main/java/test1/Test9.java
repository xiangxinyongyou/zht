package test1;

public class Test9 {
    public static void main(String[] args) {
      h:  for (int m = 0; m < 11; m++) {
           o: for (int i = 4; i <= 6; i++) {
              k:  for (int j = 5; j <= 10; j++) {
                    if (j % 4 == 0) {
                        break o;
                    }
                    System.out.print(j + ",");
                }
                System.out.println();
            }
        }


    }
}
