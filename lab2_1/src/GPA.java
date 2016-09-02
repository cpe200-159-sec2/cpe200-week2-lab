/**
 * Implement grading system.
 */
public class GPA {
    int size=0;
    float[] Grade =new float[10];
    int[] Credit=new int[10];

    public void addGrade(int credit, float grade) {
        Grade[size]=grade;
        Credit[size]=credit;
        size++;
    }


    public float get() {
        float SumGrade=0;
        int SumCredit=0;
        for(int i=0;i<size;i++)
        {
            SumGrade+=(Grade[i]*Credit[i]);
            SumCredit+=Credit[i];
        }
        float SumGPA=(SumGrade/SumCredit);
        return SumGPA;

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
