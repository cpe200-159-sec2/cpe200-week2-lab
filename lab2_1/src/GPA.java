/**
 * Implement grading system.
 */
public class GPA {
    private float sumcd=0;
    private float sumgd=0;



    public void addGrade(int credit, float grade) {
            sumgd += credit * grade;
            sumcd += credit;

    }

    public float get() {
        float grade=0;

        grade = (float) sumgd/sumcd;
        if(grade>0)
            return grade;
        else{
            return 0;
        }


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
