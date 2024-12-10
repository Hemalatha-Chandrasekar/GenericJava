package Generic;

import Models.Employee;

public class GenericClass <T extends Employee>{
   private T employee;

   public GenericClass(T employee) {
      this.employee = employee;
   }

   public T getEmployee() {
      return employee;
   }

   public void setEmployee(T employee) {
      this.employee = employee;
   }
   public void displayEmployeeDetails() {
      System.out.println(employee);
   }
}

