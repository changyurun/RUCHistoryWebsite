package com.hand.ssm.service;

import com.hand.ssm.dto.Paper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaperService {
    /*
    * 首页获取文章列表*/
    List<Paper> getIndexPaperList();

    /*
    * 根据id获取文章相关信息*/
    Paper getPaperById(long id);
}
