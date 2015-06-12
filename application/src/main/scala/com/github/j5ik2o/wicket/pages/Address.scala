package com.github.j5ik2o.wicket.pages

import scala.beans.BeanProperty

case class Address(@BeanProperty name: String, @BeanProperty address: String) extends Serializable

