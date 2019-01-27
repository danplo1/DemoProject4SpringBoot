package com.danplo.DemoProject4SpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daniel_D'AGE on 27.01.2019. Spring Boot by AK with Oskar P.
 */
@Controller
public class MainController {

    //      "/"

    @GetMapping("/")  //adnotacja, powiązująca/mapująca "jedną stroną z drugą stroną, zapytania z metodami" kod->strona
    //@ResponseBody   //adnotacja, która zwraca bezpośrednio ciało metody index, które użytkownik ma zobaczyć
    public String index() {
        return "index";

    }


    @GetMapping("/volvo")
    @ResponseBody
    public String volvo() {
        return "Hello Volvo!! Welcome home!";

    }


}
