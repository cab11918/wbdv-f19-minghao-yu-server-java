package com.example.hw01.services;

import com.example.hw01.controllers.WidgetController;
import com.example.hw01.models.Widget;
import com.example.hw01.models.Widget.type;
import java.util.ArrayList;
import java.util.List;

public class WidgetService {

  List<Widget> widgets = new ArrayList<>();

  public WidgetService() {
    Widget w1 = new Widget(123, "widget1", 0, "text1", "source1", 1, type.HEADING);
    Widget w2 = new Widget(234, "widget2", 1, "text2", "source2", 1, type.PARAGRAPH);
    Widget w3 = new Widget(345, "widget3", 2, "text3", "source3", 1, type.LIST);
    Widget w4 = new Widget(456, "widget4", 3, "text4", "source4", 1, type.IMAGE);
    Widget w5 = new Widget(567, "widget5", 4, "text5", "source5", 1, type.LINK);

    widgets.add(w1);
    widgets.add(w2);
    widgets.add(w3);
    widgets.add(w4);
    widgets.add(w5);

  }

  public List<Widget> getWidgets() {
    return this.widgets;
  }

  public List<Widget> createWidget(Widget w) {
    return new WidgetController().createWidget(w);
  }

  public List<Widget> findAllWidgets() {
    return new WidgetController().findAllWidgets();
  }

  public Widget findWidgetById(int id) {
    return new WidgetController().findWidgetById(id);
  }

  public List<Widget> updateWidget(int id, Widget w) {
    return new WidgetController().updateWidget(id, w);
  }

  public List<Widget> deleteWidget(int id) {
    return new WidgetController().deleteWidget(id);
  }


}
