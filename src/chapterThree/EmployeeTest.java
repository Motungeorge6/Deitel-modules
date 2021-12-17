package chapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee myStaff = new Employee("Motunrayo", "Idowu", 1000000);
        Employee Dave = new Employee("Dave", "George", 10000000);


        System.out.printf("%s %s is earning # %.2f monthly which is # %.2f annually %n",
                myStaff.getFirstName(),
                myStaff.getLastName(),myStaff.getMonthlySalary(),myStaff.getyearlySalary());

        System.out.printf("%s %s is earning # %.2f monthly after getting a 10 percent raise %n", myStaff.getFirstName(),
                myStaff.getLastName(), myStaff.getTenPercentRaise());
        System.out.printf("%s %s is earning # %.2f yearly after getting a 10 percent raise%n%n", myStaff.getFirstName(),
                myStaff.getLastName(), myStaff.getYearlySalaryAfterTenPercentRaise());

        System.out.printf("%s %s is earning # %.2f monthly which is # %.2f annually %n",
                Dave.getFirstName(),
                Dave.getLastName(),Dave.getMonthlySalary(),Dave.getyearlySalary());

        System.out.printf("%s %s is earning # %.2f monthly after getting a 10 percent raise %n", Dave.getFirstName(),
                Dave.getLastName(), Dave.getTenPercentRaise());
        System.out.printf("%s %s is earning # %.2f yearly after getting a 10 percent raise", Dave.getFirstName(),
                Dave.getLastName(), Dave.getYearlySalaryAfterTenPercentRaise());

    }

}
