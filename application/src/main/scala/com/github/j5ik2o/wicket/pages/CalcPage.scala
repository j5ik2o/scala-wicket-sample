package com.github.j5ik2o.wicket.pages

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.form.{Form, RequiredTextField}
import org.apache.wicket.markup.html.panel.FeedbackPanel
import org.apache.wicket.model.PropertyModel

import scala.beans.BeanProperty

@AuthorizeInstantiation(Array("ADMIN"))
class CalcPage extends BasePage {

  @BeanProperty
  var v1: Int = 0

  @BeanProperty
  var v2: Int = 0

  @BeanProperty
  var result: Int = 0

  private val form1 = new Form[Void]("form1") {

    override def onSubmit(): Unit = {
      result = v1 + v2
    }

  }

  private val feedbackPanel = new FeedbackPanel("feedback")
  private val value1Field = new RequiredTextField("value1", PropertyModel.of[Integer](this, "v1"))
  private val value2Field = new RequiredTextField("value2", PropertyModel.of[Integer](this, "v2"))
  private val resultLabel = new Label("result", new PropertyModel(this, "result"))

  add(form1)
  form1.add(feedbackPanel)
  form1.add(value1Field)
  form1.add(value2Field)
  add(resultLabel)

}
