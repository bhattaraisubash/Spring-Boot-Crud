package np.com.bsubash.springbootcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subash
 */
@Controller
public class RequestController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
