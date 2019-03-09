package md.bass.internship.bootcamp.controllers;

import md.bass.internship.bootcamp.entities.User;
import md.bass.internship.bootcamp.services.UsersServiceSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import md.bass.internship.bootcamp.services.UsersService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * This is the entry point for our hello route
 */
@Controller
class HelloController {

   /* @Autowired
    private UsersService usersService;*/
    @Autowired
    private UsersServiceSave usersServiceSave;

    @RequestMapping(method = GET, path = "/")
    public String root() {
        return "Spring Boot REST service running. It's hot in Melbourne "
                + getClass().getName();
    }

   /* @RequestMapping(method = GET, path = "/users")
    public List<User> getAllUsers(@PathVariable String name) {
        return usersService.getAllUsers();

    }*/
    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String fname
            , @RequestParam String lname,@RequestParam String username) {

        User user = new User();
        user.setLastName(fname);
        user.setFirstName(lname);
        user.setUsername(username);
        usersServiceSave.save(user);
        return "Saved";
    }

    @GetMapping(path="/allusers")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return usersServiceSave.findAll();
    }
   /* @GetMapping(path="/allusers/{fname}")
    public @ResponseBody
    User getAllUsersWithName(@RequestParam String fname) {
        return usersServiceSave.findByName(fname);
    }*/
}