import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentAnalyzerTest {

    @Test
    void testCountExcellentStudents_normalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2,
                analyzer.countExcellentStudents(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                )
        );
    }

    @Test
    void testCountExcellentStudents_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
                analyzer.countExcellentStudents(Collections.emptyList())
        );
    }

    @Test
    void testCountExcellentStudents_boundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2,
                analyzer.countExcellentStudents(Arrays.asList(8.0, 10.0, 0.0))
        );
    }



    @Test
    void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        // Chỉ tính điểm hợp lệ: 9.0, 8.5, 7.0
        // Trung bình = (9 + 8.5 + 7) / 3 = 8.1667 ≈ 8.17
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }
    @Test
    void testCalculateValidAverage_normalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                ),
                0.01
        );
    }

    @Test
    void testCalculateValidAverage_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0,
                analyzer.calculateValidAverage(Collections.emptyList())
        );
    }

    @Test
    void testCalculateValidAverage_boundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(5.0,
                analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)),
                0.01
        );
    }

}
