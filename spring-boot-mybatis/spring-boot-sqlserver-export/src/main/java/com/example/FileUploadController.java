package com.example;

import com.example.task.SchedulerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * describe:
 *
 * @author 陈超
 * @date 2019/08/19
 */
@RestController
public class FileUploadController {

    @Autowired
    private SchedulerTask schedulerTask;

    @RequestMapping("upload")
    @ResponseBody
    public Map<String,Object> uploadTableFile(){
        Map<String,Object> map = new HashMap<String,Object>(1);
        try {
            schedulerTask.process();
            map.put("msg","success");
        } catch (Exception e) {
            map.put("msg","failed");
        }
        return map;
    }
}
