package com.github.j5ik2o.wicket.pages

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation

@AuthorizeInstantiation(Array("ADMIN"))
class AdminPage extends BasePage {

}
