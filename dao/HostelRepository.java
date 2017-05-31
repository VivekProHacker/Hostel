package com.coviam.college.college.dao;

//import jpa_example.entity.Department;
import org.springframework.data.repository.CrudRepository;

import com.coviam.college.college.enitity.Hostel;


/**
* Created by ppatchava on 1/11/17.
*/
public interface HostelRepository extends CrudRepository<Hostel,String> {
}
