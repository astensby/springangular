package io.monokkel.springangular.controller;

import io.monokkel.springangular.domain.Beer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by astensby on 24/08/14.
 */
@Controller
public class AwesomeRestController {

    @RequestMapping("/javabeer")
    public
    @ResponseBody
    List<Beer> beer() {
        List<Beer> listOfBeer = new ArrayList<Beer>();
        listOfBeer.add(new Beer(1L, "IPA", "Brought to you by Monokkel!"));
        listOfBeer.add(new Beer(2L, "Stout", "For metalmen!"));
        listOfBeer.add(new Beer(3L, "Pils", "For whimps!"));
        return listOfBeer;

    }

    @RequestMapping("/mybeer")
    public
    @ResponseBody
    Beer beer(@RequestParam(value = "beername", required = false, defaultValue = "IPA")
                    String beername
    ) {
        Beer beer = new Beer(1L, beername, "Brought to you by Monokkel!");
        return beer;

    }

}
