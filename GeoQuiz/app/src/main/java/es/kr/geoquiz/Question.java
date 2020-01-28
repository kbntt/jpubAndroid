package es.kr.geoquiz;

public class Question {
    private int mTextResid;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResid = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResid() {
        return mTextResid;
    }

    public void setTextResid(int textResid) {
        mTextResid = textResid;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
