package com.necer.painter;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;

import com.necer.entity.NDate;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by necer on 2019/1/3.
 */
public interface CalendarPainter {


    //绘制今天的日期
    void onDrawToday(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> selectedDateList);

    //绘制当前月或周的日期
    void onDrawCurrentMonthOrWeek(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> selectedDateList);

    //绘制上一月，下一月的日期，周日历不须实现
    void onDrawLastOrNextMonth(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> selectedDateList);

    //绘制不可用的日期，和方法setDateInterval(startFormatDate, endFormatDate)对应
    void onDrawDisableDate(Canvas canvas, RectF rectF, LocalDate localDate);


}
