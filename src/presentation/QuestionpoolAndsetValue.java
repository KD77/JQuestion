package presentation;

import logic.JQuestions;
import logic.QuestionPool;
import presentation.JQuestionsEditor;
import presentation.JQuestionsGUI;

import javax.swing.*;


public class QuestionpoolAndsetValue extends JDialog implements IQuestion {
    // The main GUI
    // The presentation.JQuestionsEditor application
    private JQuestionsEditor jqEditor;

    // The logic.JQuestions application
    private JQuestions jQuestions;

    private JQuestionsGUI jqGUI;
    // The current logic.Question Pool.
    private QuestionPool qPool;
    private boolean pressedOK = false;

    private JRadioButton yesChangeButton;

    private JScrollPane descriptionScrollPane;
    private JTextPane descriptionTextPane;
    private JRadioButton noChangeButton;
    private JPanel modePanel;
    private JRadioButton examButton;
    private JRadioButton quizButton;
    private JPanel timedPanel;
    private JRadioButton noTimedButton;
    private JRadioButton timedButton;
    private JSpinner minutesSpinner;
    private JLabel label1;
    private JPanel onCompletionPanel;
    private JLabel displayFinalScoreLabel;
    private JLabel label2;
    private JRadioButton finalScoreYesButton;
    private JRadioButton finalScoreNoButton;
    private JRadioButton printOptionYesButton;
    private JRadioButton printOptionNoButton;
    private JButton saveButton;
    private JButton cancelButton;
    private JPanel numberOfQuestionsPanel;
    private JLabel containsQsLabel;
    private JLabel howManyQuestionsLabel;
    private JSpinner questionsSpinner;
    private JLabel maxQsLabel;


    public QuestionpoolAndsetValue() {

    }


    @Override
    public void getQuestionpoolAndsetValue(Object parent) {
        if (parent instanceof JQuestionsGUI) {
            jqGUI = (JQuestionsGUI) parent;
            jQuestions = jqGUI.getJQuestions();
            qPool = JQuestions.getQuestionPool();


        }
        // Set the values for the Conf Window.
        setValues(qPool.getDescriptionText(),
                qPool.getIsChangeAllowed(),
                qPool.getIsExam(),
                qPool.getTimed(),
                qPool.getTimeLimit(),
                qPool.getDisplayFinalScore(),
                qPool.getDisplayPrintOption(),
                qPool.getNumberOfQuestions()
        );


    }

    public void setQ(Object q) {
        this.qPool = (QuestionPool) q;

    }

    public String getQ() {
        return String.valueOf(qPool);
    }

    /*
     * General set values method.
     */
    public void setValues(String descText, Boolean isChangeAllowed, Boolean isExam, Boolean isTimed,
                          Integer timeLimit, Boolean displayFinalScore,
                          Boolean displayPrintOption, Integer nQuestions) {
        this.setDescriptionText(descText);
        this.setIsChangeAllowed(isChangeAllowed);
        this.setIsExam(isExam);
        this.setTimed(isTimed);
        this.setTimeLimit(timeLimit);
        this.setDisplayFinalScore(displayFinalScore);
        this.setDisplayPrintOption(displayPrintOption);
        this.setNumberOfQuestions(nQuestions);
    }

    public void setIsChangeAllowed(Boolean isExam) {
        yesChangeButton.setSelected(isExam);
        noChangeButton.setSelected(!isExam);
    }


    public void setIsExam(Boolean isExam) {
        examButton.setSelected(isExam);
        quizButton.setSelected(!isExam);
    }


    public void setTimed(Boolean b) {
        timedButton.setSelected(b);
        noTimedButton.setSelected(!b);

        if (b) {
            minutesSpinner.setEnabled(true);
            label1.setEnabled(true);
        } else {
            minutesSpinner.setEnabled(false);
            label1.setEnabled(false);
        }
    }


    public void setDisplayFinalScore(Boolean b) {
        finalScoreYesButton.setSelected(b);
        finalScoreNoButton.setSelected(!b);
    }

    public void setDisplayPrintOption(Boolean b) {
        printOptionYesButton.setSelected(b);
        printOptionNoButton.setSelected(!b);
    }

    public void setTimeLimit(Integer timeLimit) {
        minutesSpinner.setValue(timeLimit);
    }


    public void setNumberOfQuestions(Integer nQuestions) {
        questionsSpinner.setValue(nQuestions);
    }

    public void setPressedOK(Boolean b) {
        pressedOK = b;
    }


    public void setVisible(boolean b) {
        updateContainsQsLabel();
        updateMaxQsLabel();
        super.setVisible(b);
    }

    public void setDescriptionText(String descText) {
        descriptionTextPane.setText(descText);
        descriptionTextPane.setCaretPosition(0);
    }

    public void updateContainsQsLabel() {
        int nQuestions = 0;
        // Get the logic.Question Pool instance, if exists.
        if (jqEditor != null) {
            qPool = jqEditor.getQuestionPool();
        }

        if (qPool != null) {
            nQuestions = qPool.getSize();
        }
        containsQsLabel.setText("This file contains " + nQuestions + " questions.");
    }

    public void updateMaxQsLabel() {
        int nQuestions = 0;
        // Get the logic.Question Pool instance, if exists.
        if (jqEditor != null) {
            qPool = jqEditor.getQuestionPool();
        }

        if (qPool != null) {
            nQuestions = qPool.getSize();
        }
        maxQsLabel.setText("(Max. " + nQuestions + ")");
    }


}
