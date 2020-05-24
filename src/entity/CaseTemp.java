package entity;

public class CaseTemp {
    private  String id;
    private String caseName;
    private String caseBefore;
    private String caseSteps;
    private String caseParam;

    public CaseTemp() {
    }

    public CaseTemp(String caseName, String caseBefore, String caseSteps, String caseParam, String caseThink) {
        this.caseName = caseName;
        this.caseBefore = caseBefore;
        this.caseSteps = caseSteps;
        this.caseParam = caseParam;
        this.caseThink = caseThink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseBefore() {
        return caseBefore;
    }

    public void setCaseBefore(String caseBefore) {
        this.caseBefore = caseBefore;
    }

    public String getCaseSteps() {
        return caseSteps;
    }

    public void setCaseSteps(String caseSteps) {
        this.caseSteps = caseSteps;
    }

    public String getCaseParam() {
        return caseParam;
    }

    public void setCaseParam(String caseParam) {
        this.caseParam = caseParam;
    }

    public String getCaseThink() {
        return caseThink;
    }

    public void setCaseThink(String caseThink) {
        this.caseThink = caseThink;
    }

    private String caseThink;

}
