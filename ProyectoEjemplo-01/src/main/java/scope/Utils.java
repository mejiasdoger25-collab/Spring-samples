package scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Utils {

	public Utils() {
		// TODO Auto-generated constructor stub
	}

}
