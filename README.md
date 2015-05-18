# scala-wicket-sample

[![Join the chat at https://gitter.im/j5ik2o/scala-wicket-sample](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/j5ik2o/scala-wicket-sample?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://travis-ci.org/j5ik2o/scala-wicket-sample.svg?branch=develop)](https://travis-ci.org/j5ik2o/scala-wicket-sample)


## Usage

### Start the container by command line parameters

```sh
$ sbt ~container:start
[info] Loading project definition from /Users/cw-junichi/scala-wicket-sample/project
[info] Set current project to root (in build file:/Users/cw-junichi/scala-wicket-sample/)
> container:start
[info] starting server ...
[success] Total time: 0 s, completed 2015/05/18 9:00:08
> Adding Context  for /Users/cw-junichi/scala-wicket-sample/application/target/webapp
5 18, 2015 9:00:09 午前 org.apache.coyote.AbstractProtocol init
情報: Initializing ProtocolHandler ["http-nio-8080"]
5 18, 2015 9:00:09 午前 org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
情報: Using a shared selector for servlet write/read
5 18, 2015 9:00:09 午前 org.apache.catalina.core.StandardService startInternal
情報: Starting service Tomcat
5 18, 2015 9:00:09 午前 org.apache.catalina.core.StandardEngine startInternal
情報: Starting Servlet Engine: Apache Tomcat/7.0.34
5 18, 2015 9:00:09 午前 org.apache.catalina.startup.ContextConfig getDefaultWebXmlFragment
情報: No global web.xml found
log4j:WARN No appenders could be found for logger (org.apache.wicket.util.file.WebXmlFile).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
********************************************************************
*** WARNING: Wicket is running in DEVELOPMENT mode.              ***
***                               ^^^^^^^^^^^                    ***
*** Do NOT deploy to your live server(s) without changing this.  ***
*** See Application#getConfigurationType() for more information. ***
********************************************************************
5 18, 2015 9:00:11 午前 org.apache.coyote.AbstractProtocol start
情報: Starting ProtocolHandler ["http-nio-8080"]
```

### Start the container in the prompt mode.

```sh
$ sbt                                                                                                                 08:59:31
[info] Loading project definition from /Users/cw-junichi/scala-wicket-sample/project
[info] Set current project to root (in build file:/Users/cw-junichi/scala-wicket-sample/)
> container:start
[info] starting server ...
[success] Total time: 0 s, completed 2015/05/18 9:00:08
> Adding Context  for /Users/cw-junichi/scala-wicket-sample/application/target/webapp
5 18, 2015 9:00:09 午前 org.apache.coyote.AbstractProtocol init
情報: Initializing ProtocolHandler ["http-nio-8080"]
5 18, 2015 9:00:09 午前 org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
情報: Using a shared selector for servlet write/read
5 18, 2015 9:00:09 午前 org.apache.catalina.core.StandardService startInternal
情報: Starting service Tomcat
5 18, 2015 9:00:09 午前 org.apache.catalina.core.StandardEngine startInternal
情報: Starting Servlet Engine: Apache Tomcat/7.0.34
5 18, 2015 9:00:09 午前 org.apache.catalina.startup.ContextConfig getDefaultWebXmlFragment
情報: No global web.xml found
log4j:WARN No appenders could be found for logger (org.apache.wicket.util.file.WebXmlFile).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
********************************************************************
*** WARNING: Wicket is running in DEVELOPMENT mode.              ***
***                               ^^^^^^^^^^^                    ***
*** Do NOT deploy to your live server(s) without changing this.  ***
*** See Application#getConfigurationType() for more information. ***
********************************************************************
5 18, 2015 9:00:11 午前 org.apache.coyote.AbstractProtocol start
情報: Starting ProtocolHandler ["http-nio-8080"]
```

### Stop the container

```sh
$ sbt container:stop
```
