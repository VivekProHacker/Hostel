package com.coviam.college.college.service;

import com.coviam.college.college.enitity.Hostel;

public interface HostelService {
	 Hostel save(Hostel lab);
	 Hostel get(String name);
	 Hostel update(Hostel lab);
	 String delete(Hostel lab);
}
