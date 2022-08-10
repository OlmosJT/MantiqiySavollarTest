package uz.gita.mantiqiysavollartest.model;

public class TestData {
    private int id;
    private int question;
    private int variantA;
    private int variantB;
    private int variantC;
    private int variantD;
    private int answer;

    public TestData(int id, int question, int variantA, int variantB, int variantC, int variantD, int answer) {
        this.id = id;
        this.question = question;
        this.variantA = variantA;
        this.variantB = variantB;
        this.variantC = variantC;
        this.variantD = variantD;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public int getQuestion() {
        return question;
    }

    public int getVariantA() {
        return variantA;
    }

    public int getVariantB() {
        return variantB;
    }

    public int getVariantC() {
        return variantC;
    }

    public int getVariantD() {
        return variantD;
    }

    public int getAnswer() {
        return answer;
    }
}
