package ss16_io_textFile.thuc_hanh.maxNumber;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Codegym module 2\\src\\ss16_io_textFile\\thuc_hanh\\maxNumber\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Codegym module 2\\src\\ss16_io_textFile\\thuc_hanh\\maxNumber\\result.txt", maxValue);
    }
}
