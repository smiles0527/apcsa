import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataProcessor {

    public double findAverage(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        double sum = 0.0;
        int count = 0;

        while (reader.hasNextDouble()) {
            double value = reader.nextDouble();
            sum += value;
            count++;
        }

        reader.close();

        if (count == 0) {
            return 0.0;
        }

        return sum / count;
    }
}
