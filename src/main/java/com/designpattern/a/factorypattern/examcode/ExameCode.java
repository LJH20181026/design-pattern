package com.designpattern.a.factorypattern.examcode;

import com.alibaba.fastjson.JSONObject;

public class ExameCode {

    public void setCurForm(Gw_exammingForm curForm, String parameters) {
        JSONObject jsonObj = new JSONObject(Boolean.parseBoolean(parameters));
        //试卷主键
        if (jsonObj.getString("examinationPaper_id") != null
                && (!jsonObj.getString("examinationPaper_id").equals(""))) {
            curForm.setExaminationPaperId(jsonObj.getLong("examinationPaper_id").toString());
        }
      /*  //剩余时间
        if (jsonObj.getString("leavTime") != null && (!jsonObj.getString("leavTime").equals("")))
            curForm.setLeavTime(jsonObj.getInt("leavTime"));
        //单位主键
        if (jsonObj.getString("organization_id") != null && (!jsonObj.getString("organization_id").equals("")))
            curForm.setOrganization_id(jsonObj.getLong("organization_id"));
        //考试主键
        if (jsonObj.getString("id") != null && (!jsonObj.getString("id").equals("")))
            curForm.setId(jsonObj.getLong("id"));
        //考场主键
        if (jsonObj.getString("examroom_id") != null && (!jsonObj.getString("examroom_id").equals("")))
            curForm.setExamroom_id(jsonObj.getLong("examroom_id"));
        //用户主键
        if (jsonObj.getString("user_id") != null && (!jsonObj.getString("user_id").equals("")))
            curForm.setUser_id(jsonObj.getLong("user_id"));
        //专业
        if (jsonObj.getString("specialtyCode") != null && (!jsonObj.getString("specialtyCode").equals("")))
            curForm.setSpecialtyCode(jsonObj.getLong("specialtyCode"));
        //岗位
        if (jsonObj.getString("postionCode") != null && (!jsonObj.getString("postionCode").equals("")))
            curForm.setPostionCode(jsonObj.getLong("postionCode"));
        //等级
        if (jsonObj.getString("gradeCode") != null && (!jsonObj.getString("gradeCode").equals("")))
            curForm.setGradeCode(jsonObj.getLong("gradeCode"));
        //考试开始时间

        curForm.setExamStartTime(jsonObj.getString("examStartTime"));
        //考试结束时间
        curForm.setExamEndTime(jsonObj.getString("examEndTime"));
        //单选题重要数量
        if (jsonObj.getString("single_selectionImpCount") != null &&
                (!jsonObj.getString("single_selectionImpCount").equals("")))
            curForm.setSingle_selectionImpCount(jsonObj.getInt("single_selectionImpCount"));
        //多选题重要数量
        if (jsonObj.getString("multi_selectionImpCount") != null &&
                (!jsonObj.getString("multi_selectionImpCount").equals("")))
            curForm.setMulti_selectionImpCount(jsonObj.getInt("multi_selectionImpCount"));
        //判断题重要数量

        if (jsonObj.getString("judgementImpCount") != null &&
                (!jsonObj.getString("judgementImpCount").equals("")))
            curForm.setJudgementImpCount(jsonObj.getInt("judgementImpCount"));
        //考试时间
        if (jsonObj.getString("examTime") != null && (!jsonObj.getString("examTime").equals("")))
            curForm.setExamTime(jsonObj.getInt("examTime"));
        //总分
        if (jsonObj.getString("fullScore") != null && (!jsonObj.getString("fullScore").equals("")))
            curForm.setFullScore(jsonObj.getLong("fullScore"));
        //及格分

        if (jsonObj.getString("passScore") != null && (!jsonObj.getString("passScore").equals("")))
            curForm.setPassScore(jsonObj.getLong("passScore"));
        //学员姓名
        curForm.setUserName(jsonObj.getString("user_name"));
        //分数
        if (jsonObj.getString("score") != null && (!jsonObj.getString("score").equals("")))
            curForm.setScore(jsonObj.getLong("score"));
        //是否及格
        curForm.setResult(jsonObj.getString("result"));
        curForm.setIsPassed(jsonObj.getString("result"));
        //单选答对数量

        if (jsonObj.getString("single_ok_count") != null && (!jsonObj.getString("single_ok_count").equals("")))
            curForm.setSingle_ok_count(jsonObj.getInt("single_ok_count"));
        //多选答对数量
        if (jsonObj.getString("multi_ok_count") != null && (!jsonObj.getString("multi_ok_count").equals("")))
            curForm.setMulti_ok_count(jsonObj.getInt("multi_ok_count"));
        //判断答对数量
        if (jsonObj.getString("judgement_ok_count") != null && (!jsonObj.getString("judgement_ok_count").equals("")))
            curForm.setJudgement_ok_count(jsonObj.getInt("judgement_ok_count"));*/
    }
}
