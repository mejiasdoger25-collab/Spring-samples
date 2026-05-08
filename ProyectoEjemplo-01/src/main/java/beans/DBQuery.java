package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
//@Component
public class DBQuery implements Query{

	@Value("${query.db.message}")
	private String message;

	
	@Override
	public List<String> fetchData() {
//		return List.of("fetchiing", "data", "from", "database");
		return List.of(message);

	}

}
