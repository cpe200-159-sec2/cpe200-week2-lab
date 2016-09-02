/**
 * Implement grading system.
 */
public class GPA {
    private float gpa=0;
    private float sum=0;
    private float cr=0;
    public void addGrade(int credit, float grade) {
        if(grade==0){
            System.out.println("Got F for "+credit+" credits class");
        }else if(grade==1){
            System.out.println("Got D for "+credit+" credits class");
        }else if(grade==1.5){
            System.out.println("Got D+ for "+credit+" credits class");
        }else if(grade==2){
            System.out.println("Got C for "+credit+" credits class");
        }else if(grade==2.5){
            System.out.println("Got C+ for "+credit+" credits class");
        }else if(grade==3){
            System.out.println("Got B for "+credit+" credits class");
        }else if(grade==3.5){
            System.out.println("Got B+ for "+credit+" credits class");
        }else if(grade==4)
            System.out.println("Got A for "+credit+" credits class");
        sum+=credit*grade;
        cr+=credit;
        gpa=sum/cr;
    }


    public float get() {
        return gpa;
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
