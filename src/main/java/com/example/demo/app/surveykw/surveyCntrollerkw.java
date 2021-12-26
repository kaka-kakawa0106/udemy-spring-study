package com.example.demo.app.surveykw;

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
@RequestMapping("/surveykw")
public class surveyCntrollerkw {
  
  @GetMapping("/formkw")
  public String form(SurveyFormkw SurveyFormkw,@ModelAttribute("completekw") String complete ,Model model) {
    model.addAttribute("title", "Surveykw Formkw");
    return "surveykw/formkw";
  }

  @PostMapping("/formkw")
  public String formGoBack(SurveyFormkw SurveyFormkw, Model model) {
    model.addAttribute("title", "Surveykw Formkw");
    return "surveykw/formkw";
  }

  @PostMapping("/confirmkw")
  public String confirmkw(@Validated SurveyFormkw SurveyFormkw,BindingResult result,Model model) {
    if(result.hasErrors()) {
      model.addAttribute("title","Inquerykw Formkw");
      return "surveykw/formkw";
    }
    
    model.addAttribute("title","Confirm Pagekw");
    return "surveykw/confirmkw";
  }
  
  @PostMapping("/completekw")
  public String completekw(@Validated SurveyFormkw SurveyFormkw,BindingResult result,Model model,RedirectAttributes redirectAttributes) {
    if(result.hasErrors()) {
      model.addAttribute("title","Surveykw Formkw");
      return "surveykw/formkw";
    }
    //Flash Scope 一度表示されると削除
    redirectAttributes.addFlashAttribute("completekw", "Registeredkw");
    return "redirect:/surveykw/formkw";
  }
  
}
