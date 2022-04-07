package com.code.RestaurantManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @RequestMapping("/")
    public String ViewRestaurants(Model model){
        List<Restaurant> listRestaurants=service.listAll();
        model.addAttribute("listRestaurants", listRestaurants);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewRestaurants(Model model){
        Restaurant restaurant= new Restaurant();
        model.addAttribute("Restaurant",restaurant);
        return "new restaurant";
    }

    @RequestMapping()
    public String saveRestaurant(@ModelAttribute("Restaurant") Restaurant restaurant){
        service.save(restaurant);
        return "redirect:/";
    }

    @RequestMapping("/view/{id}")
    public ModelAndView showEditRestaurantPage(@PathVariable(name="id") int id){
        ModelAndView mav=new ModelAndView("edit Restaurant");
        Restaurant restaurant=service.listAll().get(id);
        mav.addObject("restaurant",restaurant);
        return mav;
    }

    public String publishRestaurant(@PathVariable(name="id") int id){
        service.publish(id);
        return "Successfully published";
    }















}
