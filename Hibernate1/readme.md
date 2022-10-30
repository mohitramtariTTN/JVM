Question 1 : Create an Employee Enity which contains following fields : Name, Id, Age and Location

Solution 1 : I have created an entity in the entities package by the name of Employee and it has the required fields mentioned in the question.

Question 2 : Set up EmployeeRepository with Spring Data JPA

Solution 2 : Created an EmployeeRepository in the repositories package by the name of EmployeeRepository.

Question 3 : Perform Create Operation on Entity using Spring Data JPA

Solution 3 : To perform the Create operation, I have created a PostMapping("/employees) in the EmployeeController file which is in Controller package. And then in that mapping I am calling the method createOrUpdateEmployee(), which is in EmployeeService file in services package. That method is calling the save method of EmplooyeeRepository, which is saving the Employee to the database.

Question 4 : Perform Update Operation on Entity using Spring Data JPA

Solution 4 : To perform the Update operation, I am using the same PostMapping("/employees) in the EmployeeController . And then in that mapping I am calling the same method createOrUpdateEmployee(), which is in EmployeeService file. That method is calling the save method of EmplooyeeRepository, which first search for the Employee and then if it exist, then updates the Employee to the database.

Question 5 : Perform Delete Operation on Entity using Spring Data JPA

Solution 5 : To perform the Delete operation, I have created a @DeleteMapping("/deleteEmployee/{id}") in the EmployeeController file which is in Controller package. And then in that mapping I am calling the method deleteEmployee(), which is in EmployeeService file in services package. That method is calling the deleteById() method of EmplooyeeRepository, which is deleting the Employee from the database.

Question 6 : Perform Read Operation on Entity using Spring Data JPA

Solution 6 : To perform the Read operation, I have created two Get mappings, one is  @GetMapping("/allEmployees)  and @GetMapping("/employees/{id}").First mapping is used to retrieve all employees in the database while second mapping is used to retrieve employee by the id in the database. And then in those mappings I am calling the method getAllEmployees() and getEmployeeById() respectively. These methods are calling findAll() and findById() methods of EmployeeRepository.

Question 7 : Implement Pagination and Sorting on the bases of Employee Age

Solution 7 : To implement this, i have created a method by the name of getEmployeesPaginated() in EmployeeService file. In that method, i am creating an object of pageRequest which includes page no., page size and sorting. This method is being called by the mapping of @GetMapping("/pagination) in EmployeeController file.

Question 8 : Create and use finder to find Employee by Name

Solution 8 : To create this finder, I have defined a method in EmployeeRepository by the name of findByName(). This method is called by the method getEmployeeByName() in EmployeeService file and then this method is called by @GetMapping("/employee/{name}") mapping in the EmployeeController file.

Question 9 : Create and use finder to find Employees starting with A character

Solution 9 : For this, I have defined a method in EmployeeRepository by the name of findByNameStartsWith() . This method is called by getEmployeeNameByCharacter() in EmployeeService and then this method is called by @GetMapping("/empchar/{chr}") mapping in EmployeeController file.

Question 10 : Create and use finder to find Employees Between the age of 28 to 32

Solution 10 : For this, I have defined a method in EmployeeRepository by the name of findByAgeBetween() . This method is called by getEmployeesByAgeBetween() in EmployeeService and then this method is called by @GetMapping("/employeesbyage") mapping in EmployeeController file.


