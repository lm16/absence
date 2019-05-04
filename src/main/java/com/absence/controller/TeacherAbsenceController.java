package com.absence.controller;

import com.absence.domain.TeacherAbsence;
import com.absence.domain.TeacherAbsenceConfirm;
import com.absence.mapper.TeacherAbsenceConfirmMapper;
import com.absence.mapper.TeacherAbsenceMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher/absence")
public class TeacherAbsenceController {

    private TeacherAbsenceMapper teacherAbsenceMapper;
    private TeacherAbsenceConfirmMapper teacherAbsenceConfirmMapper;

    @Autowired
    public TeacherAbsenceController(TeacherAbsenceMapper teacherAbsenceMapper, TeacherAbsenceConfirmMapper teacherAbsenceConfirmMapper) {
        this.teacherAbsenceMapper = teacherAbsenceMapper;
        this.teacherAbsenceConfirmMapper = teacherAbsenceConfirmMapper;
    }

    @GetMapping()
    public List<TeacherAbsence> listTeacherAbsence(@RequestParam("current") int current, @RequestParam("size") int size) {
        return teacherAbsenceMapper.selectPage(new Page<>(current, size), null).getRecords();
    }
    @PostMapping()
    public int postTeacher(@RequestBody TeacherAbsence teacherAbsence) {
        return teacherAbsenceMapper.insert(teacherAbsence);
    }

    @GetMapping("/{id}")
    public List<TeacherAbsenceConfirm> listTeacherAbsenceConfirm(@PathVariable int id){
        return teacherAbsenceConfirmMapper.selectList(new QueryWrapper<TeacherAbsenceConfirm>().eq("employee_absence_id", id));
    }

    @PostMapping("/{id}")
    public int postTeacherAbsenceConfirm(@RequestBody TeacherAbsenceConfirm teacherAbsenceConfirm){
        return teacherAbsenceConfirmMapper.insert(teacherAbsenceConfirm);
    }
}
