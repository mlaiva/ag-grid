// Repository to handle all CRUD operation performed in the MongoDB 
 
package com.SpringManagmentSystem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>{

}
 