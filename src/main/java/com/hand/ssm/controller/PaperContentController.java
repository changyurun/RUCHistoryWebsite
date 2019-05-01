package com.hand.ssm.controller;

import com.hand.ssm.dto.Paper;
import com.hand.ssm.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;

@Controller
public class PaperContentController {
    @Autowired
    private PaperService paperService;

    @RequestMapping("/paper/{id}")
    public ModelAndView paper(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView();
        String paperStr = new String();
        try {
            System.out.println("文章id:"+id);
            Paper paper = paperService.getPaperById(id);
            String paperContent = paper.getContent();
            System.out.println("文章主页路径："+ paperContent);
            File f = new File(paperContent);
            if(f.exists() && f.isFile()){
                paperStr = txt2Str(f);
            }else{
                throw new FileNotFoundException();
            }
            modelAndView.setViewName("paperContent");
            modelAndView.addObject("content",paperStr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    private String txt2Str(File f) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }
}
