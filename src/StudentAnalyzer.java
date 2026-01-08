import java.util.List;

public class StudentAnalyzer {
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (Double s : scores) {
            if (s != null && s >= 0 && s <= 10 && s >= 8.0) {
                count++;
            }
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        double sum = 0;
        int valid = 0;
        for (Double s : scores) {
            if (s != null && s >= 0 && s <= 10) {
                sum += s;
                valid++;
            }
        }
        return valid == 0 ? 0 : sum / valid;
    }
}
