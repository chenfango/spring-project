package com.imooc.controller;


import com.imooc.properities.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenfan
 * 2019-05-01
 */


@RestController
//@Controller
//@ResponseBody
@RequestMapping("/hello")
public class HelloController {

//    // 使用注解注入
//    @Value("${cpuSize}")
//    private String cpuSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;



    /**
     * @PathVariable: 获取url中的数据
     * @RequestParam: 获取请求参数的值
     * @GetMapping: 组合注解
     *
     *
     * @GetMapping:
     *
     *
     */

//    @RequestMapping(value = "/say" , method = RequestMethod.GET)
    @GetMapping(value = "/say")
    // @PathVariable("id") Integer id
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
        return "id: " +id;
//        return girlProperties.getCpuSize();
    }


}
