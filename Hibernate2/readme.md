Question 1 : Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.

Solution 1 : I have written a query for it in the EmployeeRepository file. And this query initiates when findAllUsers() method is called. I have called this method in greaterThanAverageSalary() method in EmployeeService file. And then that method is called by @GetMapping("/greater_than_average") mapping in EmployeeController file.


Question 2 : Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.

Solution 2 : To solve this, first I have created a mapping in EmployeeRepository file by name of @PutMapping("/update/{salary}"). Then this mapping is calling updateSalary() method in EmployeeService file. Then that method is calling updateSalary method of EmployeeRepository where I have attached a query with that method.

Question 3 : Delete all employees with minimum salary.

Solution 3 : To solve this, first I have created a mapping in EmployeeRepository file by name of @DeleteMapping("/deleteMinimum"). Then this mapping is calling deleteMinimum() method in EmployeeService file. Then that method is calling deleteMinimum method of EmployeeRepository where I have attached a query with that method.

Question 4 : Display the id, first name, age of all employees where last name ends with "singh"

Solution 4 : To solve this, first I have created a mapping in EmployeeRepository file by name of @GetMapping("/ends_with_singh"). Then this mapping is calling lastNameEndsWithSingh() method in EmployeeService file. Then that method is calling lastNameEndsWithSingh method of EmployeeRepository where I have attached a query with that method.

Question 5 : Delete all employees with age greater than 45(Should be passed as a parameter)

Solution 5 : To solve this, first I have created a mapping @DeleteMapping("/delete_greater_than/{value}"). In this mapping value is passed in url which will be used to compare employee age. Then this mapping is calling deleteGreaterThan() method of EmployeeService. Then that method is calling deleteGreaterThan() method of EmployeeRepository which has a query attached to it to perform necessaary operation.

Question 6 : Implement and demonstrate Single Table strategy.

Solution 6 : In this approach, instances of the multiple entity classes are stored as attributes in a single table only. Solution is in SingleTableStrategy package. Here I have created two classes FourWheeler and TwoWheeler which extend Vehicle class. In the Vehicle class, I have defined the @DiscriminatorColumn, which is used to store values which will help to determine between TwoWheeler and FourWheeler class. And in the TwoWheeler and FourWheeler classes, I have added @DiscriminatorValue, which provides the values for the differentiation between FourWheeler and TwoWheeler.

Question 7 : Implement and demonstrate Joined strategy.

Solution 7 : The joined table approach maps each class of the inheritance hierarchy to its own database table. This sounds similar to the table per class strategy. But here, the abstract superclass also gets mapped to a database table. I have given the solution for it in JoinedStrategy package where I have created two classes Rectangle and Square which extend shape class and a table will be created for all three classes. In the shape class, I have provided InheritanceType.Joined. 

Question 8 : Implement and demonstrate Table Per Class strategy.

Solution 8 : In table-per-class strategy, for each sub entity class a separate table is generated. Unlike joined strategy, no separate table is generated for parent entity class in table-per-class strategy. Solutiion is provided in the TablePerClass package where I have created three Entities namely Employees, FullTimeEmployee and PartTimeEmployee. FullTimeEmployee and PartTimeEmployee extends Employees class. In Employees class, I have given InheritancType.TablePerClass to it. Here two tables will be created, one for FullTimeEmployees and one for PartTimeEmployees.

Question 9 : Implement and demonstrate Embedded mapping using employee table having following fields: id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.

Solution 9 : Solution for this Question is in ComponentMapping package. In this package, I have Created two classes Employeee and EmployeeSalary. EmployeeSalary is embeaddable class and Employeee class has EmployeeSalary's embedded object.