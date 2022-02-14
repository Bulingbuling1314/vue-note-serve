package com.first.note.data.service;

import com.first.note.common.ResultMap;
import com.first.note.data.dao.ThemeDo;
import com.first.note.data.entity.ThemeEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ThemeService {
    ResultMap resultMap = new ResultMap();

    @Resource
    private ThemeDo themeDo;
    public ResultMap findByFlag(int flag) {
        return resultMap.ok(themeDo.findByFlag(flag).getValue());
    }

    public ResultMap update(int id) {
        ThemeEntity themeEntityOne = themeDo.findByFlag(1);
        themeEntityOne.setFlag(0);
        themeDo.save(themeEntityOne);

        ThemeEntity themeEntityTwo = themeDo.findById(id);
        themeEntityTwo.setFlag(1);
        themeDo.save(themeEntityTwo);
        return resultMap.ok(themeEntityTwo);
    }

}
