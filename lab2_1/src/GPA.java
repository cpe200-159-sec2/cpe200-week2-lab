/**
 * Implement grading system.
 */
public class GPA {
    float allgrade = 0;
    float allcredit = 0;
    public void addGrade(int credit, float grade) {
        allgrade = allgrade + (grade*credit);
        allcredit = allcredit + credit;
    }

    public float get() {
        float mygpa = 0.0f;
        if(allcredit != 0) {
            mygpa = allgrade / allcredit;
        }
        return mygpa;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
