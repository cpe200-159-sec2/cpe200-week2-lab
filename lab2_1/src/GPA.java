/**
 * Implement grading system.
 */
public class GPA {

    float[] gr = new float[50];
    float[] cr = new float[50];
    float g=0,c=0;
    int n=0;
    public void addGrade(int credit, float grade) {
            g+=grade*credit;
            c+=credit;
            gr[n]=grade;
            cr[n]=credit;
            n++;
    }


    public float get() {
        if(cr[0]==0) {
            return 0.0f;
        }else{
            return g/c;
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
