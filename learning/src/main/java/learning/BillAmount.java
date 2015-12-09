package learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BillAmount {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int den[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

        System.out.print("Enter any Amount: ");
        int amount = Integer.parseInt(br.readLine());

        int copy = amount;
        int totalNotes = 0, count = 0;

        System.out.println("\nDENOMINATIONS: \n");

        for (int i = 0; i < 9; i++)

        {
            count = amount / den[i];
            if (count != 0)

            {
                System.out.println(den[i] + "\tx\t" + count + "\t= " + den[i] * count);
            }
            totalNotes = totalNotes + count;

            amount = amount % den[i];

        }

        System.out.println("--------------------------------");
        System.out.println("TOTAL\t\t\t= " + copy);
        System.out.println("--------------------------------");
        System.out.println("Total Number of Notes\t= " + totalNotes);

    }
}
