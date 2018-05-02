package com.trafficsignrecognition.model.service.impl;

import com.trafficsignrecognition.model.beans.ComboDataBean;
import com.trafficsignrecognition.model.beans.HighChartDataBean;
import com.trafficsignrecognition.model.beans.LineDataBean;
import com.trafficsignrecognition.model.dao.GraphicDao;
import com.trafficsignrecognition.model.domain.ClassesPrecise;
import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import com.trafficsignrecognition.model.service.GraphicHandler;
import com.trafficsignrecognition.model.service.impl.generator.ClassAverageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("dev")
public class GraphicHandlerImpl implements GraphicHandler {

    @Autowired
    private GraphicDao graphicDao;

    public HighChartDataBean getData() {

        HighChartDataBean highChartDataBean = new HighChartDataBean();

        LineDataBean lineDataBean = new LineDataBean();
        List<ModelPreciseUnit> precises = graphicDao.getModelPrecises();
        lineDataBean.setAveragePrecises(precises);

        ComboDataBean comboDataBean = new ComboDataBean();
        List<ClassesPrecise> classesPrecises = graphicDao.getClassPrecises();
        List<Double> precisesAverages = ClassAverageGenerator.generate(classesPrecises);
        comboDataBean.setClassesPrecises(classesPrecises);
        comboDataBean.setAverages(precisesAverages);

        highChartDataBean.setComboDataBean(comboDataBean);
        highChartDataBean.setLineDataBean(lineDataBean);

        return highChartDataBean;
    }
}
