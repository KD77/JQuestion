import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;



public class QuestionpoolAndsetValue implements IQuestion{
    // The main GUI
    private JQuestionsGUI jqGUI;

    // The JQuestions application
    private JQuestions jQuestions;

    // The current Question Pool.
    private QuestionPool qPool;


    private boolean pressedOK = false;

    public QuestionpoolAndsetValue(JQuestionsGUI jqGUI) {
        this.jqGUI = jqGUI;
    }



    @Override
    public String getQuestionpoolAndsetValue(Object parent) {
        if (parent instanceof JQuestionsGUI) {
            jqGUI = (JQuestionsGUI) parent;
            jQuestions = jqGUI.getJQuestions();
            qPool = jQuestions.getQuestionPool();


        }

return qPool.toString();


    }
    public void setQ( Object q){
        this.qPool= (QuestionPool) q;

    }
    public String getQ(){
        return String.valueOf(qPool);
    }




}
