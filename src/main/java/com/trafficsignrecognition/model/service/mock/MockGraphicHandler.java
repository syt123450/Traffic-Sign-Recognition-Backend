package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.beans.ComboDataBean;
import com.trafficsignrecognition.model.beans.HighChartDataBean;
import com.trafficsignrecognition.model.beans.LineDataBean;
import com.trafficsignrecognition.model.domain.ClassesPrecise;
import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import com.trafficsignrecognition.model.service.GraphicHandler;
import com.trafficsignrecognition.model.service.impl.generator.ClassAverageGenerator;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("mock")
public class MockGraphicHandler implements GraphicHandler {
    @Override
    public HighChartDataBean getData() {

        HighChartDataBean highChartDataBean = new HighChartDataBean();

        LineDataBean lineDataBean = new LineDataBean();
        List<ModelPreciseUnit> preciseUnits = new ArrayList<>();
        ModelPreciseUnit modelPreciseUnit1 = new ModelPreciseUnit(1, 0.6);
        ModelPreciseUnit modelPreciseUnit2 = new ModelPreciseUnit(2, 0.65);
        ModelPreciseUnit modelPreciseUnit3 = new ModelPreciseUnit(3, 0.7);
        ModelPreciseUnit modelPreciseUnit4 = new ModelPreciseUnit(4, 0.75);
        ModelPreciseUnit modelPreciseUnit5 = new ModelPreciseUnit(5, 0.8);
        ModelPreciseUnit modelPreciseUnit6 = new ModelPreciseUnit(6, 0.85);
        preciseUnits.add(modelPreciseUnit1);
        preciseUnits.add(modelPreciseUnit2);
        preciseUnits.add(modelPreciseUnit3);
        preciseUnits.add(modelPreciseUnit4);
        preciseUnits.add(modelPreciseUnit5);
        preciseUnits.add(modelPreciseUnit6);
        lineDataBean.setAveragePrecises(preciseUnits);

        ComboDataBean comboDataBean = new ComboDataBean();
        List<ClassesPrecise> classesPrecises = new ArrayList<>();
        ClassesPrecise classesPrecise1 = new ClassesPrecise(
                1,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6,
                0.6
        );
        ClassesPrecise classesPrecise2 = (ClassesPrecise) classesPrecise1.clone();
        classesPrecise2.setEpoch(2);
        ClassesPrecise classesPrecise3 = (ClassesPrecise) classesPrecise1.clone();
        classesPrecise3.setEpoch(3);
        ClassesPrecise classesPrecise4 = (ClassesPrecise) classesPrecise1.clone();
        classesPrecise4.setEpoch(4);
        ClassesPrecise classesPrecise5 = (ClassesPrecise) classesPrecise1.clone();
        classesPrecise5.setEpoch(5);

        classesPrecises.add(classesPrecise1);
        classesPrecises.add(classesPrecise2);
        classesPrecises.add(classesPrecise3);
        classesPrecises.add(classesPrecise4);
        classesPrecises.add(classesPrecise5);

        List<Double> precisesAverages = ClassAverageGenerator.generate(classesPrecises);

        comboDataBean.setClassesPrecises(classesPrecises);
        comboDataBean.setAverages(precisesAverages);

        highChartDataBean.setComboDataBean(comboDataBean);
        highChartDataBean.setLineDataBean(lineDataBean);

        return highChartDataBean;
    }
}
