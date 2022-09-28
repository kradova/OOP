public class Staff {

    private String nameOfStaff;
    private final int hourlyRate = 30;

    public int fieldOne;

    private int hoursWorked;

    public Staff() {
        this.nameOfStaff = "DEFAULT";
    }

    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("--------------------------");
    }

    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }

    public void printMessage() {
        System.out.println("Calculating Pay...");
    }

    public int calculatePay() {
        printMessage();
        int staffPay;
        staffPay = hoursWorked * hourlyRate;
        if (hoursWorked > 0) {
            return staffPay;
        } else {
            return -1;
        }
    }

    public int caculatePay(int bonus, int allowance) {
        printMessage();
        if (hoursWorked > 0) {
            return hoursWorked * hourlyRate + bonus + allowance;
        } else {
            return 0;
        }
    }

    public void setHoursWorked(int hours) {
        if (hours > 0) {
            hoursWorked = hours;
        } else {
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

}// Staff

