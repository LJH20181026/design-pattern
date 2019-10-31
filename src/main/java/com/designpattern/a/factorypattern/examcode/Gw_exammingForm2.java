package com.designpattern.a.factorypattern.examcode;

import com.alibaba.fastjson.JSONObject;

public class Gw_exammingForm2 {

    public void setCurForm(Gw_exammingForm2 curForm,String parameters) {
        try {
            JSONObject jsonObj = new JSONObject(Boolean.parseBoolean(parameters));
//            ExamPaper examPaper = JSONObject.parseObject(parameters, ExamPaper.class);

//            curForm = examPaper;

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
