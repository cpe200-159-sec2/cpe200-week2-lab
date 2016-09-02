import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;

/**
 * Implement grading system.
 */
public class GPA {
    private float Tcredit=0,G=0,N=0;
    public void addGrade(int credit, float grade) {
        G+=(credit*grade);
        Tcredit+=credit;
    }
    public float get() {
        if(Tcredit!=0) N=G/Tcredit;
        else N=0;
        return N;
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
