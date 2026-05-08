package scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio1 {

	@Autowired
	public Utils utils;
	
	public Servicio1() {
		// TODO Auto-generated constructor stub
	}

}
