package com.example.demo.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusScheduleController {

    private BusScheduleService scheduleService;

    public BusScheduleController(BusScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/Bus")
    public String index(Model model) {
        model.addAttribute("bus", scheduleService.getBusList());
        return "index";
    }


    @GetMapping("/Bus/{id}")
    public String deleteBus(@PathVariable Long id) {
        scheduleService.deleteBusById(id);
        return "redirect:/Bus";
    }

    @GetMapping("/Bus/new")
    public String createForm(Model model) {
        Bus bus = new Bus();
        model.addAttribute("bus", bus);
        return "create_bus";
    }

    @PostMapping("/Bus")
    public String AddBus(@ModelAttribute("bus") Bus bus) {
        scheduleService.addBus(bus);
        return "redirect:/Bus";
    }
}
