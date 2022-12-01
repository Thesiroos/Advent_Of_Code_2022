import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Better {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Elves.txt"));

        String intLine;
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        while (( intLine = reader.readLine()) !=null) {
            if (intLine.equals("")){   
                list.add(sum);
                sum = 0;
            }
            else{
                int inValue = Integer.parseInt(intLine);
                sum = sum +inValue;
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        int top3 = 0;
        for (int j=0; j<3; j++){
            top3 = top3 + list.get(j);
        }
        System.out.println(("Largest amount of Calories that an elf is carrying: " + Collections.max(list)));
        System.out.println("Calorie sum of the top3 elves: " + top3);
    }
}
