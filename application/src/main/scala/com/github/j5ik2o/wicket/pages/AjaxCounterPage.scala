package com.github.j5ik2o.wicket.pages

import org.apache.wicket.ajax.AjaxRequestTarget
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.Model

class AjaxCounterPage extends BasePage {

  val model = new Model[java.lang.Integer]() {
    private var counter = 0

    override def getObject(): java.lang.Integer = {
      counter += 1
      counter
    }
  }

  val label = new Label("counter", model)
  label.setOutputMarkupId(true)

  add(new AjaxFallbackLink("link") {
    override def onClick(target: AjaxRequestTarget): Unit = {
      if (target != null) {
        target.add(label)
      }
      // add the components that need to be updated to
      // the target
    }
  })

  add(label)

}
