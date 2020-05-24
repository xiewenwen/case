package entity;

import java.util.HashMap;

public class Params {
    private String caseType;
    private HashMap<String,String> caseParam;
    private String id;

    public Params() {
    }

    public Params(String caseType, HashMap<String, String> caseParam) {
        this.caseType = caseType;
        this.caseParam = caseParam;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public HashMap<String, String> getCaseParam() {
        return caseParam;
    }

    public void setCaseParam(HashMap<String, String> caseParam) {
        this.caseParam = caseParam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
