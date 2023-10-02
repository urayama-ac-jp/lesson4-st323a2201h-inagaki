package com.classroom.assignment.controller;

import java.util.ArrayList;
import java.util.List;
import com.classroom.assignment.model.request.Comment;
import com.classroom.assignment.model.request.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step4")
public class Step4Controller {

  @GetMapping
  public String index(Comment comment, Model model) {
    List<Student> studentList = new ArrayList<Student>();

    studentList.add(new Student("321A0001", "山田 太郎",Department:"プログラミング専攻"));
    studentList.add(new Student("321A0002", "田中 一郎",Department:"ロボット・Iot専攻"));
    studentList.add(new Student("321A0003", "佐藤 次郎"Department:"クラウド専攻"));
    // 課題 level2 step4
    // 所属学科を追加してください。

    model.addAttribute("studentList", studentList,studentList);

    return "step4/index";
  }
}
