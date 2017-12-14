import java.util.List;

public class Assessment {

    public int square(int i) {
        return i * i;
    }


    public int sum(int num1, int num2) {
        return num1 + num2;

    }

    public double average(List <Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
       }
       return sum;
    }
}

