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
  
    public Employee(String fullname, int yearOfBirth, double hourlyWage, int unpaidtime){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = unpaidtime;
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
            System.out.println (fullname + "can drive");
            return true;
        }
        else{
            System.out.println ("You have to wait" + (16-age) + "more years"); 
            return false;
        
        }
    
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double notax = 0.7;
        pay = (hourlyWage*unpaidHours*notax);
        return pay;
    }
    

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){ 
    calculatePay();
    System.out.println (fullname + " has recieved a wire transfer of "+ pay+ " CAD");
    
    unpaidHours =0;
}
    
    public void setfullname(String name ) {
    fullname = name ;
}
    public String getfullname() {
        return fullname;
    }
    
public void setunpaidHours(int unpaidtime){
    unpaidHours = unpaidtime;
}

}


