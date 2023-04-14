package co.develhope.firstapi3.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
@RequestMapping("/strings")
public class StringController {
    @GetMapping("/string{string1}{string2}")
    public String stringConcatenation(@RequestParam String string1,
                                      @RequestParam(required = false)  String string2){
        if (string2==null) string2 = "";
        return "first String is: " + string1 + " second String is: " +  string2;
    }
}