package com.github.j5ik2o.wicket

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession
import org.apache.wicket.authroles.authorization.strategies.role.Roles
import org.apache.wicket.request.Request

class WebSession(request: Request) extends AuthenticatedWebSession(request) {

  override def authenticate(user: String, password: String): Boolean = {
    user == "test" && password == "test"
  }

  override def getRoles: Roles = {
    if (isSignedIn)
      new Roles(Roles.ADMIN)
    else null
  }

}
