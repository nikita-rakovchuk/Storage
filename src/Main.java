import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(new File("INPUT.txt"));

            int[] storage = new int[6];
            int i = 0;

            while (scanner.hasNext()) {
                storage[i++] = scanner.nextInt();
            }
            int bolt, nut;
            int k = 0;
            bolt = storage[k] - storage[k] / 100 * storage[k + 1];
            nut = storage[k + 3] - storage[k + 3] / 100 * storage[k + 4];
            int difference = nut - bolt;
            if (difference < 0) {
                bolt += difference;
            } else {
                nut -= difference;
            }

            int damage = (storage[k] - bolt) * storage[k + 2] + (storage[k + 3] - nut) * storage[k + 5];

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("OUTPUT.txt"), "UTF-8"));
            out.write(Integer.toString(damage));
            out.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
