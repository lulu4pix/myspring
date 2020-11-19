package com.readspring.bean;
import java.util.List;
import java.util.Map;



import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
@Controller
public class Mouse {
    private String mouseName;
    private Food food;
    private List<String> alias;
    private List<Food> foods;
    private Map<String, Food> sortFoods;
}
