package com.example.demo.app.inquirykw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/inquirykw")
public class InquiryCntrollerkw {
  
  @GetMapping("/formkw")
  public String form(InquiryFormkw inquiryFormkw,@ModelAttribute("completekw") String complete ,Model model) {
    model.addAttribute("title", "Inquirykw Formkw");
    return "inquirykw/formkw";
  }

  @PostMapping("/formkw")
  public String formGoBack(InquiryFormkw inquiryFormkw, Model model) {
    model.addAttribute("title", "Inquirykw Formkw");
    return "inquirykw/formkw";
  }

  @PostMapping("/confirmkw")
  public String confirmkw(@Validated InquiryFormkw inquiryFormkw,BindingResult result,Model model) {
    if(result.hasErrors()) {
      model.addAttribute("title","Inquerykw Formkw");
      return "inquirykw/formkw";
    }
    
    model.addAttribute("title","Confirm Pagekw");
    return "inquirykw/confirmkw";
  }
  
  @PostMapping("/completekw")
  public String completekw(@Validated InquiryFormkw inquiryFormkw,BindingResult result,Model model,RedirectAttributes redirectAttributes) {
    if(result.hasErrors()) {
      model.addAttribute("title","Inquirykw Formkw");
      return "inquirykw/formkw";
    }
    //Flash Scope 一度表示されると削除
    redirectAttributes.addFlashAttribute("completekw", "Registeredkw");
    return "redirect:/inquirykw/formkw";
  }
  
}
