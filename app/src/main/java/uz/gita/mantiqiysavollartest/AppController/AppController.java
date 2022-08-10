package uz.gita.mantiqiysavollartest.AppController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.mantiqiysavollartest.R;
import uz.gita.mantiqiysavollartest.model.TestData;

public class AppController {
    private static AppController appController; // initially null

    public static AppController getInstance() {
        if(appController == null){
            appController = new AppController();
        }
        return appController;
    }

    // private Constructor
    private AppController(){
        loadData_logic();
        loadData_math();
        loadData_physics();
        loadData_chemistry();
    }

    private final List<TestData> logicTests = new ArrayList<>(30); // 50 taa aslida final emas
    private final List<TestData> mathTests = new ArrayList<>(30); // 50 taa aslida final emas
    private final List<TestData> physicsTests = new ArrayList<>(30); // 50 taa aslida final emas
    private final List<TestData> chemistryTests = new ArrayList<>(30); // 50 taa aslida final emas

    private void loadData_logic() {
        logicTests.add(new TestData(0, R.string.questions_1, R.string.variant_1_a, R.string.variant_1_b, R.string.variant_1_c, R.string.variant_1_d, R.string.answer_1));
        logicTests.add(new TestData(1, R.string.questions_2, R.string.variant_2_a, R.string.variant_2_b, R.string.variant_2_c, R.string.variant_2_d, R.string.answer_2));
        logicTests.add(new TestData(2, R.string.questions_3, R.string.variant_3_a, R.string.variant_3_b, R.string.variant_3_c, R.string.variant_3_d, R.string.answer_3));
        logicTests.add(new TestData(3, R.string.questions_4, R.string.variant_4_a, R.string.variant_4_b, R.string.variant_4_c, R.string.variant_4_d, R.string.answer_4));
        logicTests.add(new TestData(4, R.string.questions_5, R.string.variant_5_a, R.string.variant_5_b, R.string.variant_5_c, R.string.variant_5_d, R.string.answer_5));

        logicTests.add(new TestData(5, R.string.questions_6, R.string.variant_6_a, R.string.variant_6_b, R.string.variant_6_c, R.string.variant_6_d, R.string.answer_6));
        logicTests.add(new TestData(6, R.string.questions_7, R.string.variant_7_a, R.string.variant_7_b, R.string.variant_7_c, R.string.variant_7_d, R.string.answer_7));
        logicTests.add(new TestData(7, R.string.questions_8, R.string.variant_8_a, R.string.variant_8_b, R.string.variant_8_c, R.string.variant_8_d, R.string.answer_8));
        logicTests.add(new TestData(8, R.string.questions_9, R.string.variant_9_a, R.string.variant_9_b, R.string.variant_9_c, R.string.variant_9_d, R.string.answer_9));
        logicTests.add(new TestData(9, R.string.questions_10, R.string.variant_10_a, R.string.variant_10_b, R.string.variant_10_c, R.string.variant_10_d, R.string.answer_10));
        logicTests.add(new TestData(10, R.string.questions_11, R.string.variant_11_a, R.string.variant_11_b, R.string.variant_11_c, R.string.variant_11_d, R.string.answer_11));
        logicTests.add(new TestData(11, R.string.questions_12, R.string.variant_12_a, R.string.variant_12_b, R.string.variant_12_c, R.string.variant_12_d, R.string.answer_12));
        logicTests.add(new TestData(12, R.string.questions_13, R.string.variant_13_a, R.string.variant_13_b, R.string.variant_13_c, R.string.variant_13_d, R.string.answer_13));
        logicTests.add(new TestData(13, R.string.questions_14, R.string.variant_14_a, R.string.variant_14_b, R.string.variant_14_c, R.string.variant_14_d, R.string.answer_14));
        logicTests.add(new TestData(14, R.string.questions_15, R.string.variant_15_a, R.string.variant_15_b, R.string.variant_15_c, R.string.variant_15_d, R.string.answer_15));
        logicTests.add(new TestData(15, R.string.questions_16, R.string.variant_16_a, R.string.variant_16_b, R.string.variant_16_c, R.string.variant_16_d, R.string.answer_16));
        logicTests.add(new TestData(16, R.string.questions_17, R.string.variant_17_a, R.string.variant_17_b, R.string.variant_17_c, R.string.variant_17_d, R.string.answer_17));
        logicTests.add(new TestData(17, R.string.questions_18, R.string.variant_18_a, R.string.variant_18_b, R.string.variant_18_c, R.string.variant_18_d, R.string.answer_18));
        logicTests.add(new TestData(18, R.string.questions_19, R.string.variant_19_a, R.string.variant_19_b, R.string.variant_19_c, R.string.variant_19_d, R.string.answer_19));
        logicTests.add(new TestData(19, R.string.questions_20, R.string.variant_20_a, R.string.variant_20_b, R.string.variant_20_c, R.string.variant_20_d, R.string.answer_20));
        logicTests.add(new TestData(20, R.string.questions_21, R.string.variant_21_a, R.string.variant_21_b, R.string.variant_21_c, R.string.variant_21_d, R.string.answer_21));
        logicTests.add(new TestData(21, R.string.questions_22, R.string.variant_22_a, R.string.variant_22_b, R.string.variant_22_c, R.string.variant_22_d, R.string.answer_22));
        logicTests.add(new TestData(22, R.string.questions_23, R.string.variant_23_a, R.string.variant_23_b, R.string.variant_23_c, R.string.variant_23_d, R.string.answer_23));
        logicTests.add(new TestData(23, R.string.questions_24, R.string.variant_24_a, R.string.variant_24_b, R.string.variant_24_c, R.string.variant_24_d, R.string.answer_24));
        logicTests.add(new TestData(24, R.string.questions_25, R.string.variant_25_a, R.string.variant_25_b, R.string.variant_25_c, R.string.variant_25_d, R.string.answer_25));
        logicTests.add(new TestData(25, R.string.questions_26, R.string.variant_26_a, R.string.variant_26_b, R.string.variant_26_c, R.string.variant_26_d, R.string.answer_26));
        logicTests.add(new TestData(26, R.string.questions_27, R.string.variant_27_a, R.string.variant_27_b, R.string.variant_27_c, R.string.variant_27_d, R.string.answer_27));
        logicTests.add(new TestData(27, R.string.questions_28, R.string.variant_28_a, R.string.variant_28_b, R.string.variant_28_c, R.string.variant_28_d, R.string.answer_28));
        logicTests.add(new TestData(28, R.string.questions_29, R.string.variant_29_a, R.string.variant_29_b, R.string.variant_29_c, R.string.variant_29_d, R.string.answer_29));
        logicTests.add(new TestData(29, R.string.questions_30, R.string.variant_30_a, R.string.variant_30_b, R.string.variant_30_c, R.string.variant_30_d, R.string.answer_30));

        logicTests.add(new TestData(30, R.string.clock_q_1, R.string.clock_variant_q_1_a, R.string.clock_variant_q_1_b, R.string.clock_variant_q_1_c, R.string.clock_variant_q_1_d, R.string.clock_answer_q_1));
        logicTests.add(new TestData(31, R.string.clock_q_2, R.string.clock_variant_q_2_a, R.string.clock_variant_q_2_b, R.string.clock_variant_q_2_c, R.string.clock_variant_q_2_d, R.string.clock_answer_q_2));
        logicTests.add(new TestData(32, R.string.clock_q_3, R.string.clock_variant_q_3_a, R.string.clock_variant_q_3_b, R.string.clock_variant_q_3_c, R.string.clock_variant_q_3_d, R.string.clock_answer_q_3));
        logicTests.add(new TestData(33, R.string.clock_q_4, R.string.clock_variant_q_4_a, R.string.clock_variant_q_4_b, R.string.clock_variant_q_4_c, R.string.clock_variant_q_4_d, R.string.clock_answer_q_4));
        logicTests.add(new TestData(34, R.string.clock_q_5, R.string.clock_variant_q_5_a, R.string.clock_variant_q_5_b, R.string.clock_variant_q_5_c, R.string.clock_variant_q_5_d, R.string.clock_answer_q_5));
        logicTests.add(new TestData(35, R.string.clock_q_6, R.string.clock_variant_q_6_a, R.string.clock_variant_q_6_b, R.string.clock_variant_q_6_c, R.string.clock_variant_q_6_d, R.string.clock_answer_q_6));
        logicTests.add(new TestData(36, R.string.clock_q_7, R.string.clock_variant_q_7_a, R.string.clock_variant_q_7_b, R.string.clock_variant_q_7_c, R.string.clock_variant_q_7_d, R.string.clock_answer_q_7));
        logicTests.add(new TestData(37, R.string.clock_q_8, R.string.clock_variant_q_8_a, R.string.clock_variant_q_8_b, R.string.clock_variant_q_8_c, R.string.clock_variant_q_8_d, R.string.clock_answer_q_8));
        logicTests.add(new TestData(38, R.string.clock_q_9, R.string.clock_variant_q_9_a, R.string.clock_variant_q_9_b, R.string.clock_variant_q_9_c, R.string.clock_variant_q_9_d, R.string.clock_answer_q_9));
        logicTests.add(new TestData(39, R.string.clock_q_10, R.string.clock_variant_q_10_a, R.string.clock_variant_q_10_b, R.string.clock_variant_q_10_c, R.string.clock_variant_q_10_d, R.string.clock_answer_q_10));
        logicTests.add(new TestData(40, R.string.clock_q_11, R.string.clock_variant_q_11_a, R.string.clock_variant_q_11_b, R.string.clock_variant_q_11_c, R.string.clock_variant_q_11_d, R.string.clock_answer_q_11));
        logicTests.add(new TestData(41, R.string.clock_q_12, R.string.clock_variant_q_12_a, R.string.clock_variant_q_12_b, R.string.clock_variant_q_12_c, R.string.clock_variant_q_12_d, R.string.clock_answer_q_12));
        logicTests.add(new TestData(42, R.string.clock_q_13, R.string.clock_variant_q_13_a, R.string.clock_variant_q_13_b, R.string.clock_variant_q_13_c, R.string.clock_variant_q_13_d, R.string.clock_answer_q_13));
        logicTests.add(new TestData(43, R.string.clock_q_14, R.string.clock_variant_q_14_a, R.string.clock_variant_q_14_b, R.string.clock_variant_q_14_c, R.string.clock_variant_q_14_d, R.string.clock_answer_q_14));
        logicTests.add(new TestData(44, R.string.clock_q_15, R.string.clock_variant_q_15_a, R.string.clock_variant_q_15_b, R.string.clock_variant_q_15_c, R.string.clock_variant_q_15_d, R.string.clock_answer_q_15));

        logicTests.add(new TestData(45, R.string.probablity_q_1, R.string.probablity_variant_q_1_a, R.string.probablity_variant_q_1_b, R.string.probablity_variant_q_1_c, R.string.probablity_variant_q_1_d, R.string.probablity_answer_q_1));
        logicTests.add(new TestData(46, R.string.probablity_q_2, R.string.probablity_variant_q_2_a, R.string.probablity_variant_q_2_b, R.string.probablity_variant_q_2_c, R.string.probablity_variant_q_2_d, R.string.probablity_answer_q_2));
        logicTests.add(new TestData(47, R.string.probablity_q_3, R.string.probablity_variant_q_3_a, R.string.probablity_variant_q_3_b, R.string.probablity_variant_q_3_c, R.string.probablity_variant_q_3_d, R.string.probablity_answer_q_3));
        logicTests.add(new TestData(48, R.string.probablity_q_4, R.string.probablity_variant_q_4_a, R.string.probablity_variant_q_4_b, R.string.probablity_variant_q_4_c, R.string.probablity_variant_q_4_d, R.string.probablity_answer_q_4));
        logicTests.add(new TestData(49, R.string.probablity_q_5, R.string.probablity_variant_q_5_a, R.string.probablity_variant_q_5_b, R.string.probablity_variant_q_5_c, R.string.probablity_variant_q_5_d, R.string.probablity_answer_q_5));
        logicTests.add(new TestData(50, R.string.probablity_q_6, R.string.probablity_variant_q_6_a, R.string.probablity_variant_q_6_b, R.string.probablity_variant_q_6_c, R.string.probablity_variant_q_6_d, R.string.probablity_answer_q_6));
        logicTests.add(new TestData(51, R.string.probablity_q_7, R.string.probablity_variant_q_7_a, R.string.probablity_variant_q_7_b, R.string.probablity_variant_q_7_c, R.string.probablity_variant_q_7_d, R.string.probablity_answer_q_7));
        logicTests.add(new TestData(52, R.string.probablity_q_8, R.string.probablity_variant_q_8_a, R.string.probablity_variant_q_8_b, R.string.probablity_variant_q_8_c, R.string.probablity_variant_q_8_d, R.string.probablity_answer_q_8));
        logicTests.add(new TestData(53, R.string.probablity_q_9, R.string.probablity_variant_q_9_a, R.string.probablity_variant_q_9_b, R.string.probablity_variant_q_9_c, R.string.probablity_variant_q_9_d, R.string.probablity_answer_q_9));
        logicTests.add(new TestData(54, R.string.probablity_q_10, R.string.probablity_variant_q_10_a, R.string.probablity_variant_q_10_b, R.string.probablity_variant_q_10_c, R.string.probablity_variant_q_10_d, R.string.probablity_answer_q_10));
        logicTests.add(new TestData(55, R.string.probablity_q_11, R.string.probablity_variant_q_11_a, R.string.probablity_variant_q_11_b, R.string.probablity_variant_q_11_c, R.string.probablity_variant_q_11_d, R.string.probablity_answer_q_11));
        logicTests.add(new TestData(56, R.string.probablity_q_12, R.string.probablity_variant_q_12_a, R.string.probablity_variant_q_12_b, R.string.probablity_variant_q_12_c, R.string.probablity_variant_q_12_d, R.string.probablity_answer_q_12));
        logicTests.add(new TestData(57, R.string.probablity_q_13, R.string.probablity_variant_q_13_a, R.string.probablity_variant_q_13_b, R.string.probablity_variant_q_13_c, R.string.probablity_variant_q_13_d, R.string.probablity_answer_q_13));
        logicTests.add(new TestData(58, R.string.probablity_q_14, R.string.probablity_variant_q_14_a, R.string.probablity_variant_q_14_b, R.string.probablity_variant_q_14_c, R.string.probablity_variant_q_14_d, R.string.probablity_answer_q_14));
        logicTests.add(new TestData(59, R.string.probablity_q_15, R.string.probablity_variant_q_15_a, R.string.probablity_variant_q_15_b, R.string.probablity_variant_q_15_c, R.string.probablity_variant_q_15_d, R.string.probablity_answer_q_15));

    }

    private void loadData_math() {
        mathTests.add(new TestData(0, R.string.number_q_1, R.string.number_variant_q_1_a, R.string.number_variant_q_1_b, R.string.number_variant_q_1_c, R.string.number_variant_q_1_d, R.string.number_answer_q_1));
        mathTests.add(new TestData(1, R.string.number_q_2, R.string.number_variant_q_2_a, R.string.number_variant_q_2_b, R.string.number_variant_q_2_c, R.string.number_variant_q_2_d, R.string.number_answer_q_2));
        mathTests.add(new TestData(2, R.string.number_q_3, R.string.number_variant_q_3_a, R.string.number_variant_q_3_b, R.string.number_variant_q_3_c, R.string.number_variant_q_3_d, R.string.number_answer_q_3));
        mathTests.add(new TestData(3, R.string.number_q_4, R.string.number_variant_q_4_a, R.string.number_variant_q_4_b, R.string.number_variant_q_4_c, R.string.number_variant_q_4_d, R.string.number_answer_q_4));
        mathTests.add(new TestData(4, R.string.number_q_5, R.string.number_variant_q_5_a, R.string.number_variant_q_5_b, R.string.number_variant_q_5_c, R.string.number_variant_q_5_d, R.string.number_answer_q_5));

        mathTests.add(new TestData(5, R.string.questionm_1, R.string.variantm_1_a, R.string.variantm_1_b, R.string.variantm_1_c, R.string.variantm_1_d, R.string.answerm1));
        mathTests.add(new TestData(6, R.string.questionm_2, R.string.variantm_2_a, R.string.variantm_2_b, R.string.variantm_2_c, R.string.variantm_2_d, R.string.answerm2));
        mathTests.add(new TestData(7, R.string.questionm_3, R.string.variantm_3_a, R.string.variantm_3_b, R.string.variantm_3_c, R.string.variantm_3_d, R.string.answerm3));
        mathTests.add(new TestData(8, R.string.questionm_4, R.string.variantm_4_a, R.string.variantm_4_b, R.string.variantm_4_c, R.string.variantm_4_d, R.string.answerm4));
        mathTests.add(new TestData(9, R.string.questionm_5, R.string.variantm_5_a, R.string.variantm_5_b, R.string.variantm_5_c, R.string.variantm_5_d, R.string.answerm5));
        mathTests.add(new TestData(10, R.string.questionm_6, R.string.variantm_6_a, R.string.variantm_6_b, R.string.variantm_6_c, R.string.variantm_6_d, R.string.answerm6));
        mathTests.add(new TestData(11, R.string.questionm_7, R.string.variantm_7_a, R.string.variantm_7_b, R.string.variantm_7_c, R.string.variantm_7_d, R.string.answerm7));
        mathTests.add(new TestData(12, R.string.questionm_8, R.string.variantm_8_a, R.string.variantm_8_b, R.string.variantm_8_c, R.string.variantm_8_d, R.string.answerm8));
        mathTests.add(new TestData(13, R.string.questionm_9, R.string.variantm_9_a, R.string.variantm_9_b, R.string.variantm_9_c, R.string.variantm_9_d, R.string.answerm9));
        mathTests.add(new TestData(14, R.string.questionm_10, R.string.variantm_10_a, R.string.variantm_10_b, R.string.variantm_10_c, R.string.variantm_10_d, R.string.answerm10));
        mathTests.add(new TestData(15, R.string.questionm_11, R.string.variantm_11_a, R.string.variantm_11_b, R.string.variantm_11_c, R.string.variantm_11_d, R.string.answerm11));
        mathTests.add(new TestData(16, R.string.questionm_12, R.string.variantm_12_a, R.string.variantm_12_b, R.string.variantm_12_c, R.string.variantm_12_d, R.string.answerm12));
        mathTests.add(new TestData(17, R.string.questionm_13, R.string.variantm_13_a, R.string.variantm_13_b, R.string.variantm_13_c, R.string.variantm_13_d, R.string.answerm13));
        mathTests.add(new TestData(18, R.string.questionm_14, R.string.variantm_14_a, R.string.variantm_14_b, R.string.variantm_14_c, R.string.variantm_14_d, R.string.answerm14));
        mathTests.add(new TestData(19, R.string.questionm_15, R.string.variantm_15_a, R.string.variantm_15_b, R.string.variantm_15_c, R.string.variantm_15_d, R.string.answerm15));
        mathTests.add(new TestData(20, R.string.questionm_16, R.string.variantm_16_a, R.string.variantm_16_b, R.string.variantm_16_c, R.string.variantm_16_d, R.string.answerm16));
        mathTests.add(new TestData(21, R.string.questionm_17, R.string.variantm_17_a, R.string.variantm_17_b, R.string.variantm_17_c, R.string.variantm_17_d, R.string.answerm17));
        mathTests.add(new TestData(22, R.string.questionm_18, R.string.variantm_18_a, R.string.variantm_18_b, R.string.variantm_18_c, R.string.variantm_18_d, R.string.answerm18));
        mathTests.add(new TestData(23, R.string.questionm_19, R.string.variantm_19_a, R.string.variantm_19_b, R.string.variantm_19_c, R.string.variantm_19_d, R.string.answerm19));
        mathTests.add(new TestData(24, R.string.questionm_20, R.string.variantm_20_a, R.string.variantm_20_b, R.string.variantm_20_c, R.string.variantm_20_d, R.string.answerm20));
        mathTests.add(new TestData(25, R.string.questionm_21, R.string.variantm_21_a, R.string.variantm_21_b, R.string.variantm_21_c, R.string.variantm_21_d, R.string.answerm21));
        mathTests.add(new TestData(26, R.string.questionm_22, R.string.variantm_22_a, R.string.variantm_22_b, R.string.variantm_22_c, R.string.variantm_22_d, R.string.answerm22));
        mathTests.add(new TestData(27, R.string.questionm_23, R.string.variantm_23_a, R.string.variantm_23_b, R.string.variantm_23_c, R.string.variantm_23_d, R.string.answerm23));
        mathTests.add(new TestData(28, R.string.questionm_24, R.string.variantm_24_a, R.string.variantm_24_b, R.string.variantm_24_c, R.string.variantm_24_d, R.string.answerm24));
        mathTests.add(new TestData(29, R.string.questionm_25, R.string.variantm_25_a, R.string.variantm_25_b, R.string.variantm_25_c, R.string.variantm_25_d, R.string.answerm25));
        mathTests.add(new TestData(30, R.string.questionm_26, R.string.variantm_26_a, R.string.variantm_26_b, R.string.variantm_26_c, R.string.variantm_26_d, R.string.answerm26));
        mathTests.add(new TestData(31, R.string.questionm_27, R.string.variantm_27_a, R.string.variantm_27_b, R.string.variantm_27_c, R.string.variantm_27_d, R.string.answerm27));
        mathTests.add(new TestData(32, R.string.questionm_28, R.string.variantm_28_a, R.string.variantm_28_b, R.string.variantm_28_c, R.string.variantm_28_d, R.string.answerm28));
        mathTests.add(new TestData(33, R.string.questionm_29, R.string.variantm_29_a, R.string.variantm_29_b, R.string.variantm_29_c, R.string.variantm_29_d, R.string.answerm29));
        mathTests.add(new TestData(34, R.string.questionm_30, R.string.variantm_30_a, R.string.variantm_30_b, R.string.variantm_30_c, R.string.variantm_30_d, R.string.answerm30));
    }

    private void loadData_physics() {
        physicsTests.add(new TestData(0, R.string.questionf_1, R.string.variantf_1_a, R.string.variantf_1_b, R.string.variantf_1_c, R.string.variantf_1_d, R.string.answerf1));
        physicsTests.add(new TestData(1, R.string.questionf_2, R.string.variantf_2_a, R.string.variantf_2_b, R.string.variantf_2_c, R.string.variantf_2_d, R.string.answerf2));
        physicsTests.add(new TestData(2, R.string.questionf_3, R.string.variantf_3_a, R.string.variantf_3_b, R.string.variantf_3_c, R.string.variantf_3_d, R.string.answerf3));
        physicsTests.add(new TestData(3, R.string.questionf_4, R.string.variantf_4_a, R.string.variantf_4_b, R.string.variantf_4_c, R.string.variantf_4_d, R.string.answerf4));
        physicsTests.add(new TestData(4, R.string.questionf_5, R.string.variantf_5_a, R.string.variantf_5_b, R.string.variantf_5_c, R.string.variantf_5_d, R.string.answerf5));
        physicsTests.add(new TestData(5, R.string.questionf_6, R.string.variantf_6_a, R.string.variantf_6_b, R.string.variantf_6_c, R.string.variantf_6_d, R.string.answerf6));
        physicsTests.add(new TestData(6, R.string.questionf_7, R.string.variantf_7_a, R.string.variantf_7_b, R.string.variantf_7_c, R.string.variantf_7_d, R.string.answerf7));
        physicsTests.add(new TestData(7, R.string.questionf_8, R.string.variantf_8_a, R.string.variantf_8_b, R.string.variantf_8_c, R.string.variantf_8_d, R.string.answerf8));
        physicsTests.add(new TestData(8, R.string.questionf_9, R.string.variantf_9_a, R.string.variantf_9_b, R.string.variantf_9_c, R.string.variantf_9_d, R.string.answerf9));
        physicsTests.add(new TestData(9, R.string.questionf_10, R.string.variantf_10_a, R.string.variantf_10_b, R.string.variantf_10_c, R.string.variantf_10_d, R.string.answerf10));
        physicsTests.add(new TestData(10, R.string.questionf_11, R.string.variantf_11_a, R.string.variantf_11_b, R.string.variantf_11_c, R.string.variantf_11_d, R.string.answerf11));
        physicsTests.add(new TestData(11, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        physicsTests.add(new TestData(12, R.string.questionf_13, R.string.variantf_13_a, R.string.variantf_13_b, R.string.variantf_13_c, R.string.variantf_13_d, R.string.answerf13));
        physicsTests.add(new TestData(13, R.string.questionf_14, R.string.variantf_14_a, R.string.variantf_14_b, R.string.variantf_14_c, R.string.variantf_14_d, R.string.answerf14));
        physicsTests.add(new TestData(14, R.string.questionf_15, R.string.variantf_15_a, R.string.variantf_15_b, R.string.variantf_15_c, R.string.variantf_15_d, R.string.answerf15));
        physicsTests.add(new TestData(15, R.string.questionf_16, R.string.variantf_16_a, R.string.variantf_16_b, R.string.variantf_16_c, R.string.variantf_16_d, R.string.answerf16));
        physicsTests.add(new TestData(16, R.string.questionf_17, R.string.variantf_17_a, R.string.variantf_17_b, R.string.variantf_17_c, R.string.variantf_17_d, R.string.answerf17));
        physicsTests.add(new TestData(17, R.string.questionf_18, R.string.variantf_18_a, R.string.variantf_18_b, R.string.variantf_18_c, R.string.variantf_18_d, R.string.answerf18));
        physicsTests.add(new TestData(18, R.string.questionf_19, R.string.variantf_19_a, R.string.variantf_19_b, R.string.variantf_19_c, R.string.variantf_19_d, R.string.answerf19));
        physicsTests.add(new TestData(19, R.string.questionf_20, R.string.variantf_20_a, R.string.variantf_20_b, R.string.variantf_20_c, R.string.variantf_20_d, R.string.answerf20));
        physicsTests.add(new TestData(20, R.string.questionf_21, R.string.variantf_21_a, R.string.variantf_21_b, R.string.variantf_21_c, R.string.variantf_21_d, R.string.answerf21));
        physicsTests.add(new TestData(21, R.string.questionf_22, R.string.variantf_22_a, R.string.variantf_22_b, R.string.variantf_22_c, R.string.variantf_22_d, R.string.answerf22));
        physicsTests.add(new TestData(22, R.string.questionf_23, R.string.variantf_23_a, R.string.variantf_23_b, R.string.variantf_23_c, R.string.variantf_23_d, R.string.answerf23));
        physicsTests.add(new TestData(23, R.string.questionf_24, R.string.variantf_24_a, R.string.variantf_24_b, R.string.variantf_24_c, R.string.variantf_24_d, R.string.answerf24));
        physicsTests.add(new TestData(24, R.string.questionf_25, R.string.variantf_25_a, R.string.variantf_25_b, R.string.variantf_25_c, R.string.variantf_25_d, R.string.answerf25));
        physicsTests.add(new TestData(25, R.string.questionf_26, R.string.variantf_26_a, R.string.variantf_26_b, R.string.variantf_26_c, R.string.variantf_26_d, R.string.answerf26));
        physicsTests.add(new TestData(26, R.string.questionf_27, R.string.variantf_27_a, R.string.variantf_27_b, R.string.variantf_27_c, R.string.variantf_27_d, R.string.answerf27));
        physicsTests.add(new TestData(27, R.string.questionf_28, R.string.variantf_28_a, R.string.variantf_28_b, R.string.variantf_28_c, R.string.variantf_28_d, R.string.answerf28));
        physicsTests.add(new TestData(28, R.string.questionf_29, R.string.variantf_29_a, R.string.variantf_29_b, R.string.variantf_29_c, R.string.variantf_29_d, R.string.answerf29));
        physicsTests.add(new TestData(29, R.string.questionf_30, R.string.variantf_30_a, R.string.variantf_30_b, R.string.variantf_30_c, R.string.variantf_30_d, R.string.answerf30));
    }

    private void loadData_chemistry() {
        chemistryTests.add(new TestData(0, R.string.questionch_1, R.string.variantch_1_a, R.string.variantch_1_b, R.string.variantch_1_c, R.string.variantch_1_d, R.string.answerch1));
        chemistryTests.add(new TestData(1, R.string.questionch_2, R.string.variantch_2_a, R.string.variantch_2_b, R.string.variantch_2_c, R.string.variantch_2_d, R.string.answerch2));
        chemistryTests.add(new TestData(2, R.string.questionch_3, R.string.variantch_3_a, R.string.variantch_3_b, R.string.variantch_3_c, R.string.variantch_3_d, R.string.answerch3));
        chemistryTests.add(new TestData(3, R.string.questionch_4, R.string.variantch_4_a, R.string.variantch_4_b, R.string.variantch_4_c, R.string.variantch_4_d, R.string.answerch4));
        chemistryTests.add(new TestData(4, R.string.questionch_5, R.string.variantch_5_a, R.string.variantch_5_b, R.string.variantch_5_c, R.string.variantch_5_d, R.string.answerch5));
        chemistryTests.add(new TestData(5, R.string.questionch_6, R.string.variantch_6_a, R.string.variantch_6_b, R.string.variantch_6_c, R.string.variantch_6_d, R.string.answerch6));
        chemistryTests.add(new TestData(6, R.string.questionch_7, R.string.variantch_7_a, R.string.variantch_7_b, R.string.variantch_7_c, R.string.variantch_7_d, R.string.answerch7));
        chemistryTests.add(new TestData(7, R.string.questionch_8, R.string.variantch_8_a, R.string.variantch_8_b, R.string.variantch_8_c, R.string.variantch_8_d, R.string.answerch8));
        chemistryTests.add(new TestData(8, R.string.questionch_9, R.string.variantch_9_a, R.string.variantch_9_b, R.string.variantch_9_c, R.string.variantch_9_d, R.string.answerch9));
        chemistryTests.add(new TestData(9, R.string.questionch_10, R.string.variantch_10_a, R.string.variantch_10_b, R.string.variantch_10_c, R.string.variantch_10_d, R.string.answerch10));
        chemistryTests.add(new TestData(10, R.string.questionch_11, R.string.variantch_11_a, R.string.variantch_11_b, R.string.variantch_11_c, R.string.variantch_11_d, R.string.answerch11));
        chemistryTests.add(new TestData(11, R.string.questionch_12, R.string.variantch_12_a, R.string.variantch_12_b, R.string.variantch_12_c, R.string.variantch_12_d, R.string.answerch12));
        chemistryTests.add(new TestData(12, R.string.questionch_13, R.string.variantch_13_a, R.string.variantch_13_b, R.string.variantch_13_c, R.string.variantch_13_d, R.string.answerch13));
        chemistryTests.add(new TestData(13, R.string.questionch_14, R.string.variantch_14_a, R.string.variantch_14_b, R.string.variantch_14_c, R.string.variantch_14_d, R.string.answerch14));
        chemistryTests.add(new TestData(14, R.string.questionch_15, R.string.variantch_15_a, R.string.variantch_15_b, R.string.variantch_15_c, R.string.variantch_15_d, R.string.answerch15));
        chemistryTests.add(new TestData(15, R.string.questionch_16, R.string.variantch_16_a, R.string.variantch_16_b, R.string.variantch_16_c, R.string.variantch_16_d, R.string.answerch16));
        chemistryTests.add(new TestData(16, R.string.questionch_17, R.string.variantch_17_a, R.string.variantch_17_b, R.string.variantch_17_c, R.string.variantch_17_d, R.string.answerch17));
        chemistryTests.add(new TestData(17, R.string.questionch_18, R.string.variantch_18_a, R.string.variantch_18_b, R.string.variantch_18_c, R.string.variantch_18_d, R.string.answerch18));
        chemistryTests.add(new TestData(18, R.string.questionch_19, R.string.variantch_19_a, R.string.variantch_19_b, R.string.variantch_19_c, R.string.variantch_19_d, R.string.answerch19));
        chemistryTests.add(new TestData(19, R.string.questionch_20, R.string.variantch_20_a, R.string.variantch_20_b, R.string.variantch_20_c, R.string.variantch_20_d, R.string.answerch20));
        chemistryTests.add(new TestData(20, R.string.questionch_21, R.string.variantch_21_a, R.string.variantch_21_b, R.string.variantch_21_c, R.string.variantch_21_d, R.string.answerch21));
        chemistryTests.add(new TestData(21, R.string.questionch_22, R.string.variantch_22_a, R.string.variantch_22_b, R.string.variantch_22_c, R.string.variantch_22_d, R.string.answerch22));
        chemistryTests.add(new TestData(22, R.string.questionch_23, R.string.variantch_23_a, R.string.variantch_23_b, R.string.variantch_23_c, R.string.variantch_23_d, R.string.answerch23));
        chemistryTests.add(new TestData(23, R.string.questionch_24, R.string.variantch_24_a, R.string.variantch_24_b, R.string.variantch_24_c, R.string.variantch_24_d, R.string.answerch24));
        chemistryTests.add(new TestData(24, R.string.questionch_25, R.string.variantch_25_a, R.string.variantch_25_b, R.string.variantch_25_c, R.string.variantch_25_d, R.string.answerch25));
        chemistryTests.add(new TestData(25, R.string.questionch_26, R.string.variantch_26_a, R.string.variantch_26_b, R.string.variantch_26_c, R.string.variantch_26_d, R.string.answerch26));
        chemistryTests.add(new TestData(26, R.string.questionch_27, R.string.variantch_27_a, R.string.variantch_27_b, R.string.variantch_27_c, R.string.variantch_27_d, R.string.answerch27));
        chemistryTests.add(new TestData(27, R.string.questionch_28, R.string.variantch_28_a, R.string.variantch_28_b, R.string.variantch_28_c, R.string.variantch_28_d, R.string.answerch28));
        chemistryTests.add(new TestData(28, R.string.questionch_29, R.string.variantch_29_a, R.string.variantch_29_b, R.string.variantch_29_c, R.string.variantch_29_d, R.string.answerch29));
        chemistryTests.add(new TestData(29, R.string.questionch_30, R.string.variantch_30_a, R.string.variantch_30_b, R.string.variantch_30_c, R.string.variantch_30_d, R.string.answerch30));
    }

    public void shuffle(int category){
        if(category == 1)
            Collections.shuffle(logicTests);
        else if (category == 2)
            Collections.shuffle(mathTests);
        else if(category == 3)
            Collections.shuffle(physicsTests);
        else
            Collections.shuffle(chemistryTests);
    }

    public TestData getTestDataInPos(int category, int pos) {
        if(category == 1)
            return logicTests.get(pos);
        else if (category == 2)
            return mathTests.get(pos);
        else if(category == 3)
            return physicsTests.get(pos);
        else
            return chemistryTests.get(pos);

    }
}
