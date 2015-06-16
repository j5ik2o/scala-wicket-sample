package com.github.j5ik2o.wicket

import com.github.j5ik2o.wicket.pages._
import de.agilecoders.wicket.core.Bootstrap
import org.apache.wicket.Page
import org.apache.wicket.authroles.authentication.{AbstractAuthenticatedWebSession, AuthenticatedWebApplication}
import org.apache.wicket.markup.html.WebPage

class WicketApplication extends AuthenticatedWebApplication {

  override def init(): Unit = {
    super.init()
    mountPage("/hello-world", classOf[HelloWorldPage])
    mountPage("/list-view", classOf[ListViewPage])
    mountPage("/ajax-counter", classOf[AjaxCounterPage])
    getRequestCycleSettings.setResponseRequestEncoding("UTF-8")
    getMarkupSettings.setDefaultMarkupEncoding("UTF-8")
    Bootstrap.install(this)
  }

  override def getHomePage: Class[_ <: Page] = classOf[HomePage]

  override def getWebSessionClass: Class[_ <: AbstractAuthenticatedWebSession] = classOf[WebSession]

  override def getSignInPageClass: Class[_ <: WebPage] = classOf[SignInPage]

}
