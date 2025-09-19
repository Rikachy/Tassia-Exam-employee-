/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    private double paySalary;
    private double pay; 
    private double x ;
    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16) {
            System.out (fullname + "can drive");
        }
        else{
            System.out("You have to wait" +(16-age)+ "more years"); 
        
        }
        // to be completed
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double calculatepay = pay;
        double tax = 0.7 ;
        unpaidHours * hourlyWage = x;
        x * tax = pay;
        return pay;
    }
    

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){ 
    System.out (fullname + "has recieved a wire transfer of"+ pay+ "CAD");
    
    unpaidHours =0;
}
    
    public void setfullname() {
    name = fullname ;
}
    public String getfullname() {
        return fullname;
    }
}


