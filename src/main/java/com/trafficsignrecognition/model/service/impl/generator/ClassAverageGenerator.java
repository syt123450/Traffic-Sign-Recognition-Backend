package com.trafficsignrecognition.model.service.impl.generator;

import com.trafficsignrecognition.model.domain.ClassesPrecise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/2.
 */
public class ClassAverageGenerator {

    public static List<Double> generate(List<ClassesPrecise> classesPrecises) {

        List<Double> averages = new ArrayList<>();

        for (int i = 0; i < 43; i++) {
            averages.add(0.0);
        }

        for (int i = 0; i < 5; i++) {

            ClassesPrecise classesPrecise = classesPrecises.get(i);
            averages.set(0, averages.get(0) + classesPrecise.getClass0());
            averages.set(1, averages.get(1) + classesPrecise.getClass1());
            averages.set(2, averages.get(2) + classesPrecise.getClass2());
            averages.set(3, averages.get(3) + classesPrecise.getClass3());
            averages.set(4, averages.get(4) + classesPrecise.getClass4());
            averages.set(5, averages.get(5) + classesPrecise.getClass5());
            averages.set(6, averages.get(6) + classesPrecise.getClass6());
            averages.set(7, averages.get(7) + classesPrecise.getClass7());
            averages.set(8, averages.get(8) + classesPrecise.getClass8());
            averages.set(9, averages.get(9) + classesPrecise.getClass9());
            averages.set(10, averages.get(10) + classesPrecise.getClass10());
            averages.set(11, averages.get(11) + classesPrecise.getClass11());
            averages.set(12, averages.get(12) + classesPrecise.getClass12());
            averages.set(13, averages.get(13) + classesPrecise.getClass13());
            averages.set(14, averages.get(14) + classesPrecise.getClass14());
            averages.set(15, averages.get(15) + classesPrecise.getClass15());
            averages.set(16, averages.get(16) + classesPrecise.getClass16());
            averages.set(17, averages.get(17) + classesPrecise.getClass17());
            averages.set(18, averages.get(18) + classesPrecise.getClass18());
            averages.set(19, averages.get(19) + classesPrecise.getClass19());
            averages.set(20, averages.get(20) + classesPrecise.getClass20());
            averages.set(21, averages.get(21) + classesPrecise.getClass21());
            averages.set(22, averages.get(22) + classesPrecise.getClass22());
            averages.set(23, averages.get(23) + classesPrecise.getClass23());
            averages.set(24, averages.get(24) + classesPrecise.getClass24());
            averages.set(25, averages.get(25) + classesPrecise.getClass25());
            averages.set(26, averages.get(26) + classesPrecise.getClass26());
            averages.set(27, averages.get(27) + classesPrecise.getClass27());
            averages.set(28, averages.get(28) + classesPrecise.getClass28());
            averages.set(29, averages.get(29) + classesPrecise.getClass29());
            averages.set(30, averages.get(30) + classesPrecise.getClass30());
            averages.set(31, averages.get(31) + classesPrecise.getClass31());
            averages.set(32, averages.get(32) + classesPrecise.getClass32());
            averages.set(33, averages.get(33) + classesPrecise.getClass33());
            averages.set(34, averages.get(34) + classesPrecise.getClass34());
            averages.set(35, averages.get(35) + classesPrecise.getClass35());
            averages.set(36, averages.get(36) + classesPrecise.getClass36());
            averages.set(37, averages.get(37) + classesPrecise.getClass37());
            averages.set(38, averages.get(38) + classesPrecise.getClass38());
            averages.set(39, averages.get(39) + classesPrecise.getClass39());
            averages.set(40, averages.get(40) + classesPrecise.getClass40());
            averages.set(41, averages.get(41) + classesPrecise.getClass41());
            averages.set(42, averages.get(42) + classesPrecise.getClass42());

        }

        for (int i = 0; i < 43; i++) {
            averages.set(i, averages.get(i) / 5);
        }

        return averages;
    }
}
