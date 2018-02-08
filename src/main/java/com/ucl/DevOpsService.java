package com.ucl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class DevOpsService {

	@Resource(name="team")	
	private List<String> team = new ArrayList<String>();
	
	
	public void setTeam(List<String> team){
		this.team = team;
	}
	
	public List<String> getTeam(){		
		return team;
	}
	
}
