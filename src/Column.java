import java.util.Scanner;
public class Column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column size:");
        int n=sc.nextInt();
        int  m=sc.nextInt();
        int sum = 0;
        int [][] a= new int[n][m];
        System.out.println("enter array ele");
        if (n > 0 && m > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
                for (int j = 0; j < m; j++) {
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += a[i][j];
                    }
                    System.out.print(sum + " ");
                }
            }


        else
            System.out.println("enter a valid array size");
    }
}
