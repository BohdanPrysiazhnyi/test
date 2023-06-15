package home.work7;

public class Company {
    private Employee[] employee;

    public Company(Employee[] employee) {
        this.employee = employee;
    }
    public void giveEverbodyBonus(double companyBonus){
        for (Employee e: employee) {
            e.setBonus(companyBonus);
        }
    }

    public double totalToPay (){
        double result = 0;
        for (Employee e: employee) {
            result = e.toPay();
        }
        return result;
    }
    public String nameMaxSalary(){
        int index = 0;
        double maxSalary = employee[0].toPay();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].toPay()){
                maxSalary = employee[i].toPay();
                index = i;
            }
        }
        return employee[index].getName();
    }

}
