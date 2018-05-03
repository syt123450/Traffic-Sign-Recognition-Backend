package com.trafficsignrecognition.model.service.impl.generator;

import com.trafficsignrecognition.model.domain.ClassesPrecise;

import java.util.List;

/**
 * Created by ss on 2018/5/2.
 */
public class ClassesPreciseGenerator {

    public static ClassesPrecise generate(int epoch, List<Double> precises) {
        ClassesPrecise classesPrecise = new ClassesPrecise(
                epoch,
                precises.get(0),
                precises.get(1),
                precises.get(2),
                precises.get(3),
                precises.get(4),
                precises.get(5),
                precises.get(6),
                precises.get(7),
                precises.get(8),
                precises.get(9),
                precises.get(10),
                precises.get(11),
                precises.get(12),
                precises.get(13),
                precises.get(14),
                precises.get(15),
                precises.get(16),
                precises.get(17),
                precises.get(18),
                precises.get(19),
                precises.get(20),
                precises.get(21),
                precises.get(22),
                precises.get(23),
                precises.get(24),
                precises.get(25),
                precises.get(26),
                precises.get(27),
                precises.get(28),
                precises.get(29),
                precises.get(30),
                precises.get(31),
                precises.get(32),
                precises.get(33),
                precises.get(34),
                precises.get(35),
                precises.get(36),
                precises.get(37),
                precises.get(38),
                precises.get(39),
                precises.get(40),
                precises.get(41),
                precises.get(42)
        );

        return classesPrecise;
    }
}
