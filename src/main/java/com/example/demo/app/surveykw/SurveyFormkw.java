package com.example.demo.app.surveykw;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyFormkw {
  
//  @Size(min = 0, max=150, message = "Please Input less than 150")
  @Min(0)
  @Max(150)
  @NotNull
  private int age;
  
//  @Size(min = 1,max=5)
  @Min(1)
  @Max(5)
  @NotNull
  private int satisfaction;

  @Size(min = 0, max=200, message = "Please Input less than 200")
  @NotNull
  private String comment; 
  
  public SurveyFormkw() {
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSatisfaction() {
    return satisfaction;
  }

  public void setSatisfaction(int satisfaction) {
    this.satisfaction = satisfaction;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
}
