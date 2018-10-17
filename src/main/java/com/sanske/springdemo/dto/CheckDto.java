package com.sanske.springdemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * @author sanske
 * @date 2018/10/17 上午11:44
 **/
public class CheckDto {
   private String weight;
   @NotNull(message="不能为空")
   @NotBlank(message="身高不能为空")
   private String height;
   @Pattern(regexp="\\d+", message="年龄必须为数字")
   private String age;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
