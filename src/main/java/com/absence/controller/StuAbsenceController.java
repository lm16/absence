package com.absence.controller;

import com.absence.domain.StuAbsence;
import com.absence.domain.StuAbsenceConfirm;
import com.absence.domain.TeacherAbsence;
import com.absence.domain.TeacherAbsenceConfirm;
import com.absence.mapper.StuAbsenceConfirmMapper;
import com.absence.mapper.StuAbsenceMapper;
import com.absence.mapper.TeacherAbsenceConfirmMapper;
import com.absence.mapper.TeacherAbsenceMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu/absence")
public class StuAbsenceController {

    private StuAbsenceMapper stuAbsenceMapper;

    private StuAbsenceConfirmMapper stuAbsenceConfirmMapper;

    @Autowired
    public StuAbsenceController(StuAbsenceMapper stuAbsenceMapper, StuAbsenceConfirmMapper stuAbsenceConfirmMapper, TeacherAbsenceMapper teacherAbsenceMapper, TeacherAbsenceConfirmMapper teacherAbsenceConfirmMapper) {
        this.stuAbsenceMapper = stuAbsenceMapper;
        this.stuAbsenceConfirmMapper = stuAbsenceConfirmMapper;
    }

    @GetMapping()
    public IPage<StuAbsence> getStu(@RequestParam("current") int current, @RequestParam("size") int size) {
        return stuAbsenceMapper.selectPage(new Page<>(current, size), null);
    }
    @PostMapping()
    public int postStu(@RequestBody StuAbsence stuAbsence) {
        return stuAbsenceMapper.insert(stuAbsence);
    }

    @GetMapping("/{id}")
    public List<StuAbsenceConfirm> getStuId(@PathVariable int id) {
        return stuAbsenceConfirmMapper.selectList(new QueryWrapper<StuAbsenceConfirm>().eq("stu_absence_id", id));
    }

    @PostMapping("/{id}")
    public int postTeacherAbsenceConfirm(@RequestBody StuAbsenceConfirm stuAbsenceConfirm){
        return stuAbsenceConfirmMapper.insert(stuAbsenceConfirm);
    }
}
