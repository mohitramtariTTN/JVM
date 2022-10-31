package com.spring.Hibernate3.OneToOneMapping.Controller;

import com.spring.Hibernate3.OneToOneMapping.Service.AuthorService;
import com.spring.Hibernate3.OneToOneMapping.Entity.AuthorOneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*** Created a Rest Controller here for some required mappings ***/
@RestController
@RequestMapping(value = "/author")
public class AuthorController {

  @Autowired
  private AuthorService authorService;

  /*** Mapping to save author in the database ***/
  @RequestMapping(value = "/saveauthor", method = RequestMethod.POST)
  @ResponseBody
  public AuthorOneToOne saveAuthor(@RequestBody AuthorOneToOne author) {
    AuthorOneToOne authorResponse = authorService.saveAuthor(author);
    return authorResponse;
  }

  /*** Mapping to get Author details by the id passed in the url ***/
  @RequestMapping(value = "/{authorId}", method = RequestMethod.GET)
  @ResponseBody
  public AuthorOneToOne getAuthorDetails(@PathVariable int authorId) {
    AuthorOneToOne authorResponse = authorService.findAuthorByAuthorId(authorId);
    return authorResponse;
  }
}
