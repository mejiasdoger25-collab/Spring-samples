package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileQuery implements Query{

	@Value("${query.file.message}")
	private String message;
	
	@Override
	public List<String> fetchData() {
//		return List.of("fetchiing", "data", "from", "file");
		return List.of(message);
	}

}
