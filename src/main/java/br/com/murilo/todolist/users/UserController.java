package br.com.murilo.todolist.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  
  @PostMapping("/")
  public void create(@RequestBody UserModal userModal) {
    System.out.println(userModal.name);
  }
}
