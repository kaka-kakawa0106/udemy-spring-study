package com.example.demo.app.inquirykw;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InquiryFormkw {
  
  @Size(min = 1, max=21, message = "Please Input 20 charactors or less")
  private String name;
  
  @NotNull
  @Email(message = "Invalid E-mail format")
  private String email;
  
  @NotNull
  private String contents;
  
  public InquiryFormkw() {
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }

}
