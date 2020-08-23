package com.example.demo.edu.controller;



import com.example.Result.R;
import com.example.demo.edu.entity.Teacher;
import com.example.demo.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-08-23
 */
@Api(description="讲师管理")
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {
    //访问地址： localhost：8001/edu/teacher/findAll

    //1。测试，查询讲师所有数据
    @Autowired
    private TeacherService teacherService;
//1。测试，查询讲师所有数据
    //rest风格
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")//查询get //
    public R findAllTes(){
      List<Teacher> list= teacherService.list(null);
        return R.ok().data("items",list); //items-> key  list->valus
    }

//    @PathVariable  id需要通过路径进行传递
    /**
     * 浏览器测试不了delete
     *https://github.com/huaxiGit/hua_education.git
     * */
    @ApiOperation(value = "逻辑删除讲师")
    @DeleteMapping("{id}")
    public R removeTeacher(@ApiParam(name = "id", value = "讲师ID", required = true) @PathVariable String id){
      Boolean fiag=  teacherService.removeById(id);
      if (fiag){
          return  R.ok();
      }
        return R.error();
    }


}

