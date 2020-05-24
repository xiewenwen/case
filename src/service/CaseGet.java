package service;

import com.sun.deploy.security.ValidationState;
import entity.CaseTemp;
import entity.Params;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CaseGet {
    //查询 手机号，姓名，住址，爱好（网球，篮球，足球），食物（奶茶，火锅，甜品）

    public Params paramGet(){
        Params params=new Params();
        params.setCaseType(PRO.TYPE_ADD);
        HashMap<String,String> maps=new HashMap<>();
        maps.put("info","新增个人信息");
        maps.put("input1","手机号,长度11-13,非空,唯一");
        maps.put("input2","姓名,非空,长度2-5");
        maps.put("input3","爱好,选择网球,选择篮球,选择足球");
        maps.put("input4","食物,选择奶茶,选择火锅,选择甜品");
        params.setCaseParam(maps);
        return params;

    }

    public List<CaseTemp> paramDeal(){
        List<CaseTemp> list=new ArrayList<>();
       Params params=paramGet();
       HashMap<String,String> hashMap=params.getCaseParam();
       if (params.getCaseType().equals(PRO.TYPE_ADD)){
       for (String v:hashMap.values() ){
           String[] p= v.split(",");
           for (int i=1;i<p.length;i++){
               //CaseTemp caseTemp=null;
               String inputName=p[0];
               CaseTemp caseTemp=new CaseTemp();
               if (p[i].contains("非空")){
                   //CaseTemp caseTemp=new CaseTemp();
                   caseTemp.setCaseName("新增的"+inputName+"非空验证");
                   caseTemp.setCaseParam("");
                   caseTemp.setCaseSteps(inputName+"输入参数");
                   caseTemp.setCaseThink(inputName+"为空不能"+params.getCaseType()+"成功");
                   //list.add(caseTemp);
               }
                if (p[i].contains("唯一")){
                    //CaseTemp caseTemp=new CaseTemp();
                   caseTemp.setCaseName("新增的"+inputName+"唯一验证");
                   //caseTemp.setCaseParam("");
                   caseTemp.setCaseSteps(inputName+"输入存在的参数");
                   caseTemp.setCaseThink(inputName+"具有唯一性不能存在重复");
                   //list.add(caseTemp);
               }
                if (p[i].contains("选择")){
                    //CaseTemp caseTemp=new CaseTemp();
                   caseTemp.setCaseName(inputName+p[i]);
                   caseTemp.setCaseSteps(inputName+p[i]);
                   caseTemp.setCaseThink(inputName+"选择"+p[i]+"时候能新增成功");
                   //list.add(caseTemp);
               }
                if (p[i].contains("长度")){
                    //CaseTemp caseTemp=new CaseTemp();
                    caseTemp.setCaseName(hashMap.get("info")+inputName+"长度校验");
                    caseTemp.setCaseSteps("输入的"+inputName+p[i]);
                    caseTemp.setCaseThink(inputName+p[i]+"可新增成功，超出范围给出提示信息");
                    //list.add(caseTemp);

                }
                list.add(caseTemp);

           }
       }
       }
       //if (PRO.TYPE_SEARCH=)
        return list;

    }


}
