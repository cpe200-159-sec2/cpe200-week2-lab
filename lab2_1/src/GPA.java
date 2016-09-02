/**
 * Implement grading system.
 */
public class GPA {
    double x=0.0,y=0.0;
    public void addGrade(int credit, float grade) {
        x+=credit;
        y+=(credit*grade);

    }


    public float get() {
        if(x==0&y==0) return 0;
        return (float)(y/x);
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
