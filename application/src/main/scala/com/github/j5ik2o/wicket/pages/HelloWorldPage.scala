package com.github.j5ik2o.wicket.pages

import java.util.Date

import org.apache.wicket.markup.html.basic.Label

class HelloWorldPage extends BasePage {
  val date = new Date()
  val messageLabel = new Label("message", "Hello, World!!! " + date.toString)
  add(messageLabel)
}
