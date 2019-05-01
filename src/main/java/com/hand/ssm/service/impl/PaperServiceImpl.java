package com.hand.ssm.service.impl;

import com.hand.ssm.dao.PaperDao;
import com.hand.ssm.dto.Paper;
import com.hand.ssm.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDao paperDao;

    @Override
    public List<Paper> getIndexPaperList() {
        List<Paper> result = null;
        try {
            result = paperDao.getPaperByPage(1, 4);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Paper getPaperById(long id) {
        return paperDao.getPaperByPrimaryKey(id);
    }
}
