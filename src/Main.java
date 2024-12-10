import Generic.GenericClass;
import Generic.GenericMethodDemo;
import Interface.GenericInterface;
import Interface.InterfaceImpl.GenericInterfaceImpl;
import Models.Employee;
import Models.SalariedEmployee;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Step 1:
        Employee employee = new Employee(1, "John Doe");
        SalariedEmployee SalaryEmployed = new SalariedEmployee(2, "Jane smith", 85000.0);

        //Step 2:
        GenericClass<Employee> genericClass = new GenericClass<>(employee);
        genericClass.displayEmployeeDetails();
        GenericClass<SalariedEmployee> genericClass1 = new GenericClass<>(SalaryEmployed);
        genericClass1.displayEmployeeDetails();

        //Step 3:
        GenericInterface<Employee> employeeGenericInterface = new GenericInterfaceImpl<>();
        employeeGenericInterface.print(employee);

        GenericInterfaceImpl<SalariedEmployee> SalaryEmployed1 = new GenericInterfaceImpl<>();
        SalaryEmployed1.print(SalaryEmployed);

        // Step 4:
        //GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        //genericMethodDemo.printArray((employee));

        GenericMethodDemo.printList(Arrays.asList(employee, SalaryEmployed));


        //Generic Method
        //GenericMethodDemo  genericMethoddemo =new GenericMethodDemo<>();
        //genericMethoddemo.printArray();


    }
}


