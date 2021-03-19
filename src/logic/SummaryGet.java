package logic;

import logic.JQUserAnswer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class SummaryGet {


    private Boolean isChangeAllowed;
    private Boolean isExam;
    private Boolean isTimed;
    private Integer timeLimit;
    private Boolean displayFinalScore;
    private Boolean displayPrintOption;
    private String studentName;
    private Integer nQuestions;
    private Date startTime;
    public boolean isApplet = false;
    private final boolean isDemo = false;
    private JLabel countLabel, correctnessLabel, fileNameLabel;
    private ArrayList<JQUserAnswer> jQUserAnswers;
    private ArrayList<Integer> questionIds;

    public SummaryGet() {

    }

    public Boolean getIsExam() {
        return isExam;
    }

    public Boolean getTimed() {
        return isTimed;
    }

    //__
    public Integer getTimeLimit() {
        return timeLimit;
    }

    public Boolean getDisplayFinalScore() {
        return displayFinalScore;
    }

    public Boolean getDisplayPrintOption() {
        return displayPrintOption;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getNQuestions() {
        return nQuestions;
    }

    public String getFileName() {
        return fileNameLabel.getText();
    }

    public Date getStartTime() {
        return startTime;
    }

    public ArrayList<JQUserAnswer> getUserAnswers() {
        return jQUserAnswers;
    }

    public ArrayList<Integer> getQuestionIds() {
        return questionIds;
    }

}
