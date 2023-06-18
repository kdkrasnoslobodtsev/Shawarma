package com.example.test.controllers;

import com.example.test.models.Order;
import com.example.test.models.Shawarma;
import com.example.test.services.OrderService;
import com.example.test.services.ShawarmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ShawarmaController {
    private final ShawarmaService shawarmaService;
    private final OrderService orderService;

    @GetMapping("/order")
    public String Shawarmas(Model model) {
        model.addAttribute("shawarmas", shawarmaService.listShawarmas());
        return "order";
    }

    @GetMapping("/order/shawarma/{id}")
    public String ShawarmaInfo(@PathVariable Long id, Model model) {
        model.addAttribute("shawarma", shawarmaService.getShawarmaById(id));
        return "shawarma-info";
    }

    @PostMapping("/order/add-shawarma")
    public String createShawarma(Shawarma Shawarma) {
        shawarmaService.saveShawarma(Shawarma);
        return "redirect:/order";
    }

    @PostMapping("/order/shawarma/delete/{id}")
    public String deleteShawarma(@PathVariable Long id) {
        shawarmaService.deleteShawarma(id);
        return "redirect:/order";
    }

    @PostMapping("/order/save")
    public String saveOrder() {
        for (Shawarma shawarma: shawarmaService.listShawarmas()) {
            Order order = new Order();
            order.setId(shawarma.getId());
            order.setBeef(shawarma.getBeef());
            order.setPork(shawarma.getPork());
            order.setChicken(shawarma.getChicken());
            order.setLavash(shawarma.getLavash());
            order.setTomato(shawarma.getTomato());
            order.setPepper(shawarma.getPepper());
            order.setSalad(shawarma.getSalad());
            orderService.saveOrder(order);
            shawarmaService.deleteShawarma(shawarma.getId());
        }
        return "redirect:/";
    }
}
