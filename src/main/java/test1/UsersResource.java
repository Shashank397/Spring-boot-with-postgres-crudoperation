package test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UsersResource {
	
	@Autowired
	private UsersRepository ur;
	
	@GetMapping(value="/name")
	public List<Users> getName()
	{
		return ur.findAll();
	}

}
