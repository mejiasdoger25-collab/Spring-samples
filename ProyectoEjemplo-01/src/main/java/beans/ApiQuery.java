package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiQuery implements Query{

	@Value("${query.api.message:Fetchign data from externarl api}")
	private String message;
	
	public ApiQuery() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> fetchData() {
		// TODO Auto-generated method stub
		return null;
	}

}
