package service;

import entity.CaseTemp;

import java.util.List;

public class Test {
    public static void main(String arg[]){
        CaseGet caseGet=new CaseGet();
        List<CaseTemp> list=caseGet.paramDeal();
        for (CaseTemp caseTemp:list){
            System.out.println("测试用例名称："+caseTemp.getCaseName()+";测试用例步骤："+caseTemp.getCaseSteps()+";结果预期："+caseTemp.getCaseThink());
        }
    }
}
