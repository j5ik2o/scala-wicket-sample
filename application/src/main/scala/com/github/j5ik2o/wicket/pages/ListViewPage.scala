package com.github.j5ik2o.wicket.pages

import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.list.{ListItem, ListView}
import org.apache.wicket.model.PropertyModel

import scala.collection.JavaConverters._

class ListViewPage extends BasePage {

  val items = Seq(
    Address("加藤潤一","東京都荒川区"),
    Address("上野正大", "大阪のどこか？")
  ).asJava

  val listView = new ListView("addressListView", items) {
    override def populateItem(item: ListItem[Address]): Unit = {
      val addr = item.getModelObject
      item.add(new Label("name", new PropertyModel[String](addr, "name")))
      item.add(new Label("address", new PropertyModel[String](addr, "address")))
    }
  }

  add(listView)
}
