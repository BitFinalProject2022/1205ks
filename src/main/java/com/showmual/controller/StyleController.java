package com.showmual.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.showmual.model.ManStyleVo;
import com.showmual.model.WomanStyleVo;
import com.showmual.service.StyleService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/closet")
public class StyleController {
    
    @Autowired
    StyleService styleService;
    
    @Autowired
    ManStyleVo manStyleVo;
    
    @Autowired
    WomanStyleVo womanStyleVo;
    
    List<ManStyleVo> manStyleList = new ArrayList<ManStyleVo>();
    List<WomanStyleVo> womanStyleList = new ArrayList<WomanStyleVo>();
    
    
    // 코디 페이지
//    @RequestMapping(value = "/coordinate", method = RequestMethod.GET)
//    public String coordinatePage(Model model) {
//
//        return "coordinate";
//    }
    
    
    
    // 남자스타일 페이지
    @RequestMapping(value = "/manCoordi", method = RequestMethod.GET)
    public String getCommunityList(Model model) {

//        manStyleList = styleService.listManStyles();
//
//        for (ManStyleVo m : manStyleList) {
//            System.out.println(m);
//        }
//
//        model.addAttribute("manStyleList", manStyleList);
        return "manCoordi";
    }
    
    // 여자스타일 페이지
    @RequestMapping(value = "/womanCoordi", method = RequestMethod.GET)
    public String getWomanStyleList(Model model) {
        
//        womanStyleList = styleService.listWomanStyles();
//                
//        for (WomanStyleVo w : womanStyleList) {
//            System.out.println(w);
//        }
//        
//        model.addAttribute("womanStyleList", womanStyleList);
        return "womanCoordi";
    }
    
}
