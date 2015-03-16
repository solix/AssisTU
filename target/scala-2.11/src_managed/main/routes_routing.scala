// @SOURCE:/home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/conf/routes
// @HASH:eb6bdeed6f1473bc818eafae1de162d9ba9c5ba7
// @DATE:Mon Mar 09 23:14:20 CET 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_reroute1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("redirect"))))
private[this] lazy val controllers_Application_reroute1_invoker = createInvoker(
controllers.Application.reroute(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "reroute", Nil,"GET", """""", Routes.prefix + """redirect"""))
        

// @LINE:10
private[this] lazy val controllers_Application_task2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
private[this] lazy val controllers_Application_task2_invoker = createInvoker(
controllers.Application.task(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "task", Nil,"GET", """task""", Routes.prefix + """tasks"""))
        

// @LINE:11
private[this] lazy val controllers_TaskData_addTask3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/new"))))
private[this] lazy val controllers_TaskData_addTask3_invoker = createInvoker(
controllers.TaskData.addTask(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "addTask", Nil,"POST", """""", Routes.prefix + """task/new"""))
        

// @LINE:12
private[this] lazy val controllers_TaskData_deleteTask4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/delete/"),DynamicPart("tid", """[^/]+""",true))))
private[this] lazy val controllers_TaskData_deleteTask4_invoker = createInvoker(
controllers.TaskData.deleteTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "deleteTask", Seq(classOf[Long]),"GET", """""", Routes.prefix + """task/delete/$tid<[^/]+>"""))
        

// @LINE:13
private[this] lazy val controllers_TaskData_doneTask5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/done/"),DynamicPart("tid", """[^/]+""",true))))
private[this] lazy val controllers_TaskData_doneTask5_invoker = createInvoker(
controllers.TaskData.doneTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "doneTask", Seq(classOf[Long]),"GET", """""", Routes.prefix + """task/done/$tid<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_TaskData_undoTask6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/undo/"),DynamicPart("tid", """[^/]+""",true))))
private[this] lazy val controllers_TaskData_undoTask6_invoker = createInvoker(
controllers.TaskData.undoTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "undoTask", Seq(classOf[Long]),"GET", """""", Routes.prefix + """task/undo/$tid<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_Authentication_login7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_login7_invoker = createInvoker(
controllers.Authentication.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Nil,"GET", """login""", Routes.prefix + """login"""))
        

// @LINE:18
private[this] lazy val controllers_Authentication_loginWithMessage8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"),DynamicPart("theme", """[^/]+""",true),StaticPart("/"),DynamicPart("message", """[^/]+""",true))))
private[this] lazy val controllers_Authentication_loginWithMessage8_invoker = createInvoker(
controllers.Authentication.loginWithMessage(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "loginWithMessage", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """login/$theme<[^/]+>/$message<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_Authentication_doLogin9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logingin"))))
private[this] lazy val controllers_Authentication_doLogin9_invoker = createInvoker(
controllers.Authentication.doLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "doLogin", Nil,"POST", """""", Routes.prefix + """logingin"""))
        

// @LINE:20
private[this] lazy val controllers_Signup_forgotPassword10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/forgotpassword"))))
private[this] lazy val controllers_Signup_forgotPassword10_invoker = createInvoker(
controllers.Signup.forgotPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Nil,"GET", """""", Routes.prefix + """login/forgotpassword"""))
        

// @LINE:21
private[this] lazy val controllers_Signup_doForgotPassword11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/doforgotpassword"))))
private[this] lazy val controllers_Signup_doForgotPassword11_invoker = createInvoker(
controllers.Signup.doForgotPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/doforgotpassword"""))
        

// @LINE:22
private[this] lazy val controllers_Signup_doResetPassword12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/doresetpassword"))))
private[this] lazy val controllers_Signup_doResetPassword12_invoker = createInvoker(
controllers.Signup.doResetPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """login/doresetpassword"""))
        

// @LINE:25
private[this] lazy val controllers_Authentication_signup13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Authentication_signup13_invoker = createInvoker(
controllers.Authentication.signup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "signup", Nil,"GET", """signup""", Routes.prefix + """signup"""))
        

// @LINE:26
private[this] lazy val controllers_Signup_doSignup14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signingup"))))
private[this] lazy val controllers_Signup_doSignup14_invoker = createInvoker(
controllers.Signup.doSignup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doSignup", Nil,"POST", """""", Routes.prefix + """signingup"""))
        

// @LINE:29
private[this] lazy val controllers_Signup_unverified15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
private[this] lazy val controllers_Signup_unverified15_invoker = createInvoker(
controllers.Signup.unverified,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Nil,"GET", """Local Login Account routes""", Routes.prefix + """accounts/unverified"""))
        

// @LINE:30
private[this] lazy val controllers_Signup_verify16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_verify16_invoker = createInvoker(
controllers.Signup.verify(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_Signup_resetPassword17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_resetPassword17_invoker = createInvoker(
controllers.Signup.resetPassword(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_Signup_exists18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
private[this] lazy val controllers_Signup_exists18_invoker = createInvoker(
controllers.Signup.exists,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
        

// @LINE:35
private[this] lazy val controllers_Authentication_OAuthLogout19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Authentication_OAuthLogout19_invoker = createInvoker(
controllers.Authentication.OAuthLogout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthLogout", Nil,"GET", """OAuth2""", Routes.prefix + """logout"""))
        

// @LINE:36
private[this] lazy val controllers_Authentication_OAuth20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val controllers_Authentication_OAuth20_invoker = createInvoker(
controllers.Authentication.OAuth(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuth", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_Authentication_OAuthDenied21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
private[this] lazy val controllers_Authentication_OAuthDenied21_invoker = createInvoker(
controllers.Authentication.OAuthDenied(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
        

// @LINE:40
private[this] lazy val controllers_CalendarData_calendar22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("calendar"))))
private[this] lazy val controllers_CalendarData_calendar22_invoker = createInvoker(
controllers.CalendarData.calendar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "calendar", Nil,"GET", """calendar""", Routes.prefix + """calendar"""))
        

// @LINE:41
private[this] lazy val controllers_CalendarData_list23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/events"))))
private[this] lazy val controllers_CalendarData_list23_invoker = createInvoker(
controllers.CalendarData.list(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "list", Seq(classOf[Long]),"GET", """""", Routes.prefix + """$id<[^/]+>/events"""))
        

// @LINE:42
private[this] lazy val controllers_CalendarData_json24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events.json"))))
private[this] lazy val controllers_CalendarData_json24_invoker = createInvoker(
controllers.CalendarData.json(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "json", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """events.json"""))
        

// @LINE:43
private[this] lazy val controllers_CalendarData_edit25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_CalendarData_edit25_invoker = createInvoker(
controllers.CalendarData.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """event/$id<[^/]+>/edit"""))
        

// @LINE:44
private[this] lazy val controllers_CalendarData_update26_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_CalendarData_update26_invoker = createInvoker(
controllers.CalendarData.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """event/$id<[^/]+>/update"""))
        

// @LINE:45
private[this] lazy val controllers_CalendarData_add27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event"))))
private[this] lazy val controllers_CalendarData_add27_invoker = createInvoker(
controllers.CalendarData.add(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "add", Nil,"POST", """""", Routes.prefix + """event"""))
        

// @LINE:46
private[this] lazy val controllers_CalendarData_blank28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/new"))))
private[this] lazy val controllers_CalendarData_blank28_invoker = createInvoker(
controllers.CalendarData.blank(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "blank", Nil,"GET", """""", Routes.prefix + """event/new"""))
        

// @LINE:47
private[this] lazy val controllers_CalendarData_delete29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_CalendarData_delete29_invoker = createInvoker(
controllers.CalendarData.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """event/$id<[^/]+>/delete"""))
        

// @LINE:48
private[this] lazy val controllers_CalendarData_addByAjax30_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/event-ajax"))))
private[this] lazy val controllers_CalendarData_addByAjax30_invoker = createInvoker(
controllers.CalendarData.addByAjax(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "addByAjax", Seq(classOf[Long]),"POST", """""", Routes.prefix + """$id<[^/]+>/event-ajax"""))
        

// @LINE:49
private[this] lazy val controllers_CalendarData_move31_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event-move"))))
private[this] lazy val controllers_CalendarData_move31_invoker = createInvoker(
controllers.CalendarData.move(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "move", Nil,"POST", """""", Routes.prefix + """event-move"""))
        

// @LINE:50
private[this] lazy val controllers_CalendarData_resize32_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event-resize"))))
private[this] lazy val controllers_CalendarData_resize32_invoker = createInvoker(
controllers.CalendarData.resize(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "resize", Nil,"POST", """""", Routes.prefix + """event-resize"""))
        

// @LINE:55
private[this] lazy val controllers_Application_project33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects"))))
private[this] lazy val controllers_Application_project33_invoker = createInvoker(
controllers.Application.project(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "project", Nil,"GET", """project""", Routes.prefix + """projects"""))
        

// @LINE:56
private[this] lazy val controllers_ProjectData_createProjectPage34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/new"))))
private[this] lazy val controllers_ProjectData_createProjectPage34_invoker = createInvoker(
controllers.ProjectData.createProjectPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProjectPage", Nil,"GET", """""", Routes.prefix + """project/new"""))
        

// @LINE:57
private[this] lazy val controllers_ProjectData_createProject35_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/create"))))
private[this] lazy val controllers_ProjectData_createProject35_invoker = createInvoker(
controllers.ProjectData.createProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProject", Nil,"POST", """""", Routes.prefix + """project/create"""))
        

// @LINE:58
private[this] lazy val controllers_ProjectData_project36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true))))
private[this] lazy val controllers_ProjectData_project36_invoker = createInvoker(
controllers.ProjectData.project(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "project", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_ProjectData_editProjectPage37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_ProjectData_editProjectPage37_invoker = createInvoker(
controllers.ProjectData.editProjectPage(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProjectPage", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/edit"""))
        

// @LINE:60
private[this] lazy val controllers_ProjectData_editProject38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/editing"))))
private[this] lazy val controllers_ProjectData_editProject38_invoker = createInvoker(
controllers.ProjectData.editProject(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProject", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/editing"""))
        

// @LINE:61
private[this] lazy val controllers_ProjectData_archiveProject39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/archive"))))
private[this] lazy val controllers_ProjectData_archiveProject39_invoker = createInvoker(
controllers.ProjectData.archiveProject(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "archiveProject", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/archive"""))
        

// @LINE:62
private[this] lazy val controllers_ProjectData_inviteMemberToProjectAs40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/addmember"))))
private[this] lazy val controllers_ProjectData_inviteMemberToProjectAs40_invoker = createInvoker(
controllers.ProjectData.inviteMemberToProjectAs(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "inviteMemberToProjectAs", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/addmember"""))
        

// @LINE:63
private[this] lazy val controllers_ProjectData_hasAccepted41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/acceptinvitation"))))
private[this] lazy val controllers_ProjectData_hasAccepted41_invoker = createInvoker(
controllers.ProjectData.hasAccepted(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasAccepted", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/acceptinvitation"""))
        

// @LINE:64
private[this] lazy val controllers_ProjectData_hasDeclined42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/declineinvitation"))))
private[this] lazy val controllers_ProjectData_hasDeclined42_invoker = createInvoker(
controllers.ProjectData.hasDeclined(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasDeclined", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/declineinvitation"""))
        

// @LINE:65
private[this] lazy val controllers_ProjectData_leaveProject43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/leave"))))
private[this] lazy val controllers_ProjectData_leaveProject43_invoker = createInvoker(
controllers.ProjectData.leaveProject(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "leaveProject", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/leave"""))
        

// @LINE:66
private[this] lazy val controllers_ProjectData_removeMemberFromProject44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/removemember/"),DynamicPart("uid", """[^/]+""",true))))
private[this] lazy val controllers_ProjectData_removeMemberFromProject44_invoker = createInvoker(
controllers.ProjectData.removeMemberFromProject(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "removeMemberFromProject", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/removemember/$uid<[^/]+>"""))
        

// @LINE:69
private[this] lazy val controllers_DocumentData_upload45_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/upload"))))
private[this] lazy val controllers_DocumentData_upload45_invoker = createInvoker(
controllers.DocumentData.upload(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "upload", Seq(classOf[Long]),"POST", """FILE Upload/Download""", Routes.prefix + """project/upload"""))
        

// @LINE:70
private[this] lazy val controllers_DocumentData_uploadNewTemplate46_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/uploadNewTemplate"))))
private[this] lazy val controllers_DocumentData_uploadNewTemplate46_invoker = createInvoker(
controllers.DocumentData.uploadNewTemplate(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "uploadNewTemplate", Seq(classOf[Long]),"POST", """""", Routes.prefix + """project/uploadNewTemplate"""))
        

// @LINE:71
private[this] lazy val controllers_DocumentData_documentDiscussion47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/discuss/"),DynamicPart("docId", """[^/]+""",true))))
private[this] lazy val controllers_DocumentData_documentDiscussion47_invoker = createInvoker(
controllers.DocumentData.documentDiscussion(fakeValue[java.util.UUID]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "documentDiscussion", Seq(classOf[java.util.UUID]),"GET", """""", Routes.prefix + """project/discuss/$docId<[^/]+>"""))
        

// @LINE:72
private[this] lazy val controllers_DocumentData_deleteDocument48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/delete/"),DynamicPart("fileid", """[^/]+""",true))))
private[this] lazy val controllers_DocumentData_deleteDocument48_invoker = createInvoker(
controllers.DocumentData.deleteDocument(fakeValue[java.util.UUID]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "deleteDocument", Seq(classOf[java.util.UUID]),"GET", """""", Routes.prefix + """project/delete/$fileid<[^/]+>"""))
        

// @LINE:75
private[this] lazy val controllers_Application_discussion49_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discussions"))))
private[this] lazy val controllers_Application_discussion49_invoker = createInvoker(
controllers.Application.discussion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "discussion", Nil,"GET", """discussion""", Routes.prefix + """discussions"""))
        

// @LINE:76
private[this] lazy val controllers_DiscussionData_seen50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discussion/seen/"),DynamicPart("cid", """[^/]+""",true))))
private[this] lazy val controllers_DiscussionData_seen50_invoker = createInvoker(
controllers.DiscussionData.seen(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "seen", Seq(classOf[Long]),"GET", """""", Routes.prefix + """discussion/seen/$cid<[^/]+>"""))
        

// @LINE:77
private[this] lazy val controllers_DiscussionData_discussion51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discussion/"),DynamicPart("pid", """[^/]+""",true))))
private[this] lazy val controllers_DiscussionData_discussion51_invoker = createInvoker(
controllers.DiscussionData.discussion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "discussion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """discussion/$pid<[^/]+>"""))
        

// @LINE:78
private[this] lazy val controllers_DiscussionData_chatFeed52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chatFeed/"),DynamicPart("project", """[^/]+""",true))))
private[this] lazy val controllers_DiscussionData_chatFeed52_invoker = createInvoker(
controllers.DiscussionData.chatFeed(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "chatFeed", Seq(classOf[String]),"GET", """""", Routes.prefix + """chatFeed/$project<[^/]+>"""))
        

// @LINE:79
private[this] lazy val controllers_DiscussionData_postMessage53_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat"))))
private[this] lazy val controllers_DiscussionData_postMessage53_invoker = createInvoker(
controllers.DiscussionData.postMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postMessage", Nil,"POST", """""", Routes.prefix + """chat"""))
        

// @LINE:80
private[this] lazy val controllers_DiscussionData_deleteMessage54_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletemessage"))))
private[this] lazy val controllers_DiscussionData_deleteMessage54_invoker = createInvoker(
controllers.DiscussionData.deleteMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "deleteMessage", Nil,"POST", """""", Routes.prefix + """deletemessage"""))
        

// @LINE:81
private[this] lazy val controllers_DiscussionData_postExternalMessage55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postexternal"))))
private[this] lazy val controllers_DiscussionData_postExternalMessage55_invoker = createInvoker(
controllers.DiscussionData.postExternalMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postExternalMessage", Nil,"GET", """""", Routes.prefix + """postexternal"""))
        

// @LINE:82
private[this] lazy val controllers_DiscussionData_getComments56_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comments"))))
private[this] lazy val controllers_DiscussionData_getComments56_invoker = createInvoker(
controllers.DiscussionData.getComments(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getComments", Nil,"GET", """""", Routes.prefix + """comments"""))
        

// @LINE:83
private[this] lazy val controllers_DiscussionData_getSubComments57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subcomments"))))
private[this] lazy val controllers_DiscussionData_getSubComments57_invoker = createInvoker(
controllers.DiscussionData.getSubComments(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getSubComments", Nil,"GET", """""", Routes.prefix + """subcomments"""))
        

// @LINE:84
private[this] lazy val controllers_ProjectData_getProjectIdsAsJson58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectids"))))
private[this] lazy val controllers_ProjectData_getProjectIdsAsJson58_invoker = createInvoker(
controllers.ProjectData.getProjectIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getProjectIdsAsJson", Nil,"GET", """""", Routes.prefix + """projectids"""))
        

// @LINE:85
private[this] lazy val controllers_ProjectData_getLastAccessedProjectIdAsJson59_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectid"))))
private[this] lazy val controllers_ProjectData_getLastAccessedProjectIdAsJson59_invoker = createInvoker(
controllers.ProjectData.getLastAccessedProjectIdAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getLastAccessedProjectIdAsJson", Nil,"GET", """""", Routes.prefix + """projectid"""))
        

// @LINE:86
private[this] lazy val controllers_ProjectData_getOwnerIdsAsJson60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ownerids"))))
private[this] lazy val controllers_ProjectData_getOwnerIdsAsJson60_invoker = createInvoker(
controllers.ProjectData.getOwnerIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getOwnerIdsAsJson", Nil,"GET", """""", Routes.prefix + """ownerids"""))
        

// @LINE:87
private[this] lazy val controllers_ProjectData_getReviewerIdsAsJson61_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reviewerids"))))
private[this] lazy val controllers_ProjectData_getReviewerIdsAsJson61_invoker = createInvoker(
controllers.ProjectData.getReviewerIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getReviewerIdsAsJson", Nil,"GET", """""", Routes.prefix + """reviewerids"""))
        

// @LINE:88
private[this] lazy val controllers_ProjectData_getGuestIdsAsJson62_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guestids"))))
private[this] lazy val controllers_ProjectData_getGuestIdsAsJson62_invoker = createInvoker(
controllers.ProjectData.getGuestIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getGuestIdsAsJson", Nil,"GET", """""", Routes.prefix + """guestids"""))
        

// @LINE:91
private[this] lazy val controllers_Application_suggestions63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestions"))))
private[this] lazy val controllers_Application_suggestions63_invoker = createInvoker(
controllers.Application.suggestions(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "suggestions", Nil,"GET", """Suggestions""", Routes.prefix + """suggestions"""))
        

// @LINE:98
private[this] lazy val controllers_PersonData_deleteAccount64_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteaccount"))))
private[this] lazy val controllers_PersonData_deleteAccount64_invoker = createInvoker(
controllers.PersonData.deleteAccount(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonData", "deleteAccount", Nil,"GET", """User""", Routes.prefix + """deleteaccount"""))
        

// @LINE:99
private[this] lazy val controllers_PersonData_postMendeleyDocument65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("exportMendeleyDocument/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PersonData_postMendeleyDocument65_invoker = createInvoker(
controllers.PersonData.postMendeleyDocument(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonData", "postMendeleyDocument", Seq(classOf[String]),"GET", """""", Routes.prefix + """exportMendeleyDocument/$id<[^/]+>"""))
        

// @LINE:103
private[this] lazy val controllers_Assets_at66_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at66_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:104
private[this] lazy val controllers_WebJarAssets_at67_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_WebJarAssets_at67_invoker = createInvoker(
controllers.WebJarAssets.at(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """redirect""","""controllers.Application.reroute()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.task()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/new""","""controllers.TaskData.addTask()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/delete/$tid<[^/]+>""","""controllers.TaskData.deleteTask(tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/done/$tid<[^/]+>""","""controllers.TaskData.doneTask(tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/undo/$tid<[^/]+>""","""controllers.TaskData.undoTask(tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/$theme<[^/]+>/$message<[^/]+>""","""controllers.Authentication.loginWithMessage(message:String, theme:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logingin""","""controllers.Authentication.doLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/forgotpassword""","""controllers.Signup.forgotPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/doforgotpassword""","""controllers.Signup.doForgotPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/doresetpassword""","""controllers.Signup.doResetPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Authentication.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signingup""","""controllers.Signup.doSignup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.OAuthLogout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""controllers.Authentication.OAuth(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Authentication.OAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """calendar""","""controllers.CalendarData.calendar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/events""","""controllers.CalendarData.list(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events.json""","""controllers.CalendarData.json(start:Long, end:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/$id<[^/]+>/edit""","""controllers.CalendarData.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/$id<[^/]+>/update""","""controllers.CalendarData.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event""","""controllers.CalendarData.add()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/new""","""controllers.CalendarData.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/$id<[^/]+>/delete""","""controllers.CalendarData.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/event-ajax""","""controllers.CalendarData.addByAjax(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event-move""","""controllers.CalendarData.move()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event-resize""","""controllers.CalendarData.resize()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects""","""controllers.Application.project()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/new""","""controllers.ProjectData.createProjectPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/create""","""controllers.ProjectData.createProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>""","""controllers.ProjectData.project(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/edit""","""controllers.ProjectData.editProjectPage(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/editing""","""controllers.ProjectData.editProject(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/archive""","""controllers.ProjectData.archiveProject(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/addmember""","""controllers.ProjectData.inviteMemberToProjectAs(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/acceptinvitation""","""controllers.ProjectData.hasAccepted(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/declineinvitation""","""controllers.ProjectData.hasDeclined(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/leave""","""controllers.ProjectData.leaveProject(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/removemember/$uid<[^/]+>""","""controllers.ProjectData.removeMemberFromProject(uid:Long, pid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/upload""","""controllers.DocumentData.upload(pid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/uploadNewTemplate""","""controllers.DocumentData.uploadNewTemplate(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/discuss/$docId<[^/]+>""","""controllers.DocumentData.documentDiscussion(docId:java.util.UUID)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/delete/$fileid<[^/]+>""","""controllers.DocumentData.deleteDocument(fileid:java.util.UUID)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discussions""","""controllers.Application.discussion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discussion/seen/$cid<[^/]+>""","""controllers.DiscussionData.seen(cid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discussion/$pid<[^/]+>""","""controllers.DiscussionData.discussion(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chatFeed/$project<[^/]+>""","""controllers.DiscussionData.chatFeed(project:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat""","""controllers.DiscussionData.postMessage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletemessage""","""controllers.DiscussionData.deleteMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postexternal""","""controllers.DiscussionData.postExternalMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comments""","""controllers.DiscussionData.getComments()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subcomments""","""controllers.DiscussionData.getSubComments()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectids""","""controllers.ProjectData.getProjectIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectid""","""controllers.ProjectData.getLastAccessedProjectIdAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ownerids""","""controllers.ProjectData.getOwnerIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reviewerids""","""controllers.ProjectData.getReviewerIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guestids""","""controllers.ProjectData.getGuestIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestions""","""controllers.Application.suggestions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteaccount""","""controllers.PersonData.deleteAccount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """exportMendeleyDocument/$id<[^/]+>""","""controllers.PersonData.postMendeleyDocument(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_reroute1_route(params) => {
   call { 
        controllers_Application_reroute1_invoker.call(controllers.Application.reroute())
   }
}
        

// @LINE:10
case controllers_Application_task2_route(params) => {
   call { 
        controllers_Application_task2_invoker.call(controllers.Application.task())
   }
}
        

// @LINE:11
case controllers_TaskData_addTask3_route(params) => {
   call { 
        controllers_TaskData_addTask3_invoker.call(controllers.TaskData.addTask())
   }
}
        

// @LINE:12
case controllers_TaskData_deleteTask4_route(params) => {
   call(params.fromPath[Long]("tid", None)) { (tid) =>
        controllers_TaskData_deleteTask4_invoker.call(controllers.TaskData.deleteTask(tid))
   }
}
        

// @LINE:13
case controllers_TaskData_doneTask5_route(params) => {
   call(params.fromPath[Long]("tid", None)) { (tid) =>
        controllers_TaskData_doneTask5_invoker.call(controllers.TaskData.doneTask(tid))
   }
}
        

// @LINE:14
case controllers_TaskData_undoTask6_route(params) => {
   call(params.fromPath[Long]("tid", None)) { (tid) =>
        controllers_TaskData_undoTask6_invoker.call(controllers.TaskData.undoTask(tid))
   }
}
        

// @LINE:17
case controllers_Authentication_login7_route(params) => {
   call { 
        controllers_Authentication_login7_invoker.call(controllers.Authentication.login())
   }
}
        

// @LINE:18
case controllers_Authentication_loginWithMessage8_route(params) => {
   call(params.fromPath[String]("message", None), params.fromPath[String]("theme", None)) { (message, theme) =>
        controllers_Authentication_loginWithMessage8_invoker.call(controllers.Authentication.loginWithMessage(message, theme))
   }
}
        

// @LINE:19
case controllers_Authentication_doLogin9_route(params) => {
   call { 
        controllers_Authentication_doLogin9_invoker.call(controllers.Authentication.doLogin())
   }
}
        

// @LINE:20
case controllers_Signup_forgotPassword10_route(params) => {
   call { 
        controllers_Signup_forgotPassword10_invoker.call(controllers.Signup.forgotPassword())
   }
}
        

// @LINE:21
case controllers_Signup_doForgotPassword11_route(params) => {
   call { 
        controllers_Signup_doForgotPassword11_invoker.call(controllers.Signup.doForgotPassword())
   }
}
        

// @LINE:22
case controllers_Signup_doResetPassword12_route(params) => {
   call { 
        controllers_Signup_doResetPassword12_invoker.call(controllers.Signup.doResetPassword())
   }
}
        

// @LINE:25
case controllers_Authentication_signup13_route(params) => {
   call { 
        controllers_Authentication_signup13_invoker.call(controllers.Authentication.signup())
   }
}
        

// @LINE:26
case controllers_Signup_doSignup14_route(params) => {
   call { 
        controllers_Signup_doSignup14_invoker.call(controllers.Signup.doSignup())
   }
}
        

// @LINE:29
case controllers_Signup_unverified15_route(params) => {
   call { 
        controllers_Signup_unverified15_invoker.call(controllers.Signup.unverified)
   }
}
        

// @LINE:30
case controllers_Signup_verify16_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify16_invoker.call(controllers.Signup.verify(token))
   }
}
        

// @LINE:31
case controllers_Signup_resetPassword17_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword17_invoker.call(controllers.Signup.resetPassword(token))
   }
}
        

// @LINE:32
case controllers_Signup_exists18_route(params) => {
   call { 
        controllers_Signup_exists18_invoker.call(controllers.Signup.exists)
   }
}
        

// @LINE:35
case controllers_Authentication_OAuthLogout19_route(params) => {
   call { 
        controllers_Authentication_OAuthLogout19_invoker.call(controllers.Authentication.OAuthLogout())
   }
}
        

// @LINE:36
case controllers_Authentication_OAuth20_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Authentication_OAuth20_invoker.call(controllers.Authentication.OAuth(provider))
   }
}
        

// @LINE:37
case controllers_Authentication_OAuthDenied21_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Authentication_OAuthDenied21_invoker.call(controllers.Authentication.OAuthDenied(provider))
   }
}
        

// @LINE:40
case controllers_CalendarData_calendar22_route(params) => {
   call { 
        controllers_CalendarData_calendar22_invoker.call(controllers.CalendarData.calendar())
   }
}
        

// @LINE:41
case controllers_CalendarData_list23_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_list23_invoker.call(controllers.CalendarData.list(id))
   }
}
        

// @LINE:42
case controllers_CalendarData_json24_route(params) => {
   call(params.fromQuery[Long]("start", None), params.fromQuery[Long]("end", None)) { (start, end) =>
        controllers_CalendarData_json24_invoker.call(controllers.CalendarData.json(start, end))
   }
}
        

// @LINE:43
case controllers_CalendarData_edit25_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_edit25_invoker.call(controllers.CalendarData.edit(id))
   }
}
        

// @LINE:44
case controllers_CalendarData_update26_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_update26_invoker.call(controllers.CalendarData.update(id))
   }
}
        

// @LINE:45
case controllers_CalendarData_add27_route(params) => {
   call { 
        controllers_CalendarData_add27_invoker.call(controllers.CalendarData.add())
   }
}
        

// @LINE:46
case controllers_CalendarData_blank28_route(params) => {
   call { 
        controllers_CalendarData_blank28_invoker.call(controllers.CalendarData.blank())
   }
}
        

// @LINE:47
case controllers_CalendarData_delete29_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_delete29_invoker.call(controllers.CalendarData.delete(id))
   }
}
        

// @LINE:48
case controllers_CalendarData_addByAjax30_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_addByAjax30_invoker.call(controllers.CalendarData.addByAjax(id))
   }
}
        

// @LINE:49
case controllers_CalendarData_move31_route(params) => {
   call { 
        controllers_CalendarData_move31_invoker.call(controllers.CalendarData.move())
   }
}
        

// @LINE:50
case controllers_CalendarData_resize32_route(params) => {
   call { 
        controllers_CalendarData_resize32_invoker.call(controllers.CalendarData.resize())
   }
}
        

// @LINE:55
case controllers_Application_project33_route(params) => {
   call { 
        controllers_Application_project33_invoker.call(controllers.Application.project())
   }
}
        

// @LINE:56
case controllers_ProjectData_createProjectPage34_route(params) => {
   call { 
        controllers_ProjectData_createProjectPage34_invoker.call(controllers.ProjectData.createProjectPage())
   }
}
        

// @LINE:57
case controllers_ProjectData_createProject35_route(params) => {
   call { 
        controllers_ProjectData_createProject35_invoker.call(controllers.ProjectData.createProject())
   }
}
        

// @LINE:58
case controllers_ProjectData_project36_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_project36_invoker.call(controllers.ProjectData.project(pid))
   }
}
        

// @LINE:59
case controllers_ProjectData_editProjectPage37_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_editProjectPage37_invoker.call(controllers.ProjectData.editProjectPage(pid))
   }
}
        

// @LINE:60
case controllers_ProjectData_editProject38_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_editProject38_invoker.call(controllers.ProjectData.editProject(pid))
   }
}
        

// @LINE:61
case controllers_ProjectData_archiveProject39_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_archiveProject39_invoker.call(controllers.ProjectData.archiveProject(pid))
   }
}
        

// @LINE:62
case controllers_ProjectData_inviteMemberToProjectAs40_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_inviteMemberToProjectAs40_invoker.call(controllers.ProjectData.inviteMemberToProjectAs(pid))
   }
}
        

// @LINE:63
case controllers_ProjectData_hasAccepted41_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_hasAccepted41_invoker.call(controllers.ProjectData.hasAccepted(pid))
   }
}
        

// @LINE:64
case controllers_ProjectData_hasDeclined42_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_hasDeclined42_invoker.call(controllers.ProjectData.hasDeclined(pid))
   }
}
        

// @LINE:65
case controllers_ProjectData_leaveProject43_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_leaveProject43_invoker.call(controllers.ProjectData.leaveProject(pid))
   }
}
        

// @LINE:66
case controllers_ProjectData_removeMemberFromProject44_route(params) => {
   call(params.fromPath[Long]("uid", None), params.fromPath[Long]("pid", None)) { (uid, pid) =>
        controllers_ProjectData_removeMemberFromProject44_invoker.call(controllers.ProjectData.removeMemberFromProject(uid, pid))
   }
}
        

// @LINE:69
case controllers_DocumentData_upload45_route(params) => {
   call(params.fromQuery[Long]("pid", None)) { (pid) =>
        controllers_DocumentData_upload45_invoker.call(controllers.DocumentData.upload(pid))
   }
}
        

// @LINE:70
case controllers_DocumentData_uploadNewTemplate46_route(params) => {
   call(params.fromQuery[Long]("pid", None)) { (pid) =>
        controllers_DocumentData_uploadNewTemplate46_invoker.call(controllers.DocumentData.uploadNewTemplate(pid))
   }
}
        

// @LINE:71
case controllers_DocumentData_documentDiscussion47_route(params) => {
   call(params.fromPath[java.util.UUID]("docId", None)) { (docId) =>
        controllers_DocumentData_documentDiscussion47_invoker.call(controllers.DocumentData.documentDiscussion(docId))
   }
}
        

// @LINE:72
case controllers_DocumentData_deleteDocument48_route(params) => {
   call(params.fromPath[java.util.UUID]("fileid", None)) { (fileid) =>
        controllers_DocumentData_deleteDocument48_invoker.call(controllers.DocumentData.deleteDocument(fileid))
   }
}
        

// @LINE:75
case controllers_Application_discussion49_route(params) => {
   call { 
        controllers_Application_discussion49_invoker.call(controllers.Application.discussion())
   }
}
        

// @LINE:76
case controllers_DiscussionData_seen50_route(params) => {
   call(params.fromPath[Long]("cid", None)) { (cid) =>
        controllers_DiscussionData_seen50_invoker.call(controllers.DiscussionData.seen(cid))
   }
}
        

// @LINE:77
case controllers_DiscussionData_discussion51_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_DiscussionData_discussion51_invoker.call(controllers.DiscussionData.discussion(pid))
   }
}
        

// @LINE:78
case controllers_DiscussionData_chatFeed52_route(params) => {
   call(params.fromPath[String]("project", None)) { (project) =>
        controllers_DiscussionData_chatFeed52_invoker.call(controllers.DiscussionData.chatFeed(project))
   }
}
        

// @LINE:79
case controllers_DiscussionData_postMessage53_route(params) => {
   call { 
        controllers_DiscussionData_postMessage53_invoker.call(controllers.DiscussionData.postMessage())
   }
}
        

// @LINE:80
case controllers_DiscussionData_deleteMessage54_route(params) => {
   call { 
        controllers_DiscussionData_deleteMessage54_invoker.call(controllers.DiscussionData.deleteMessage())
   }
}
        

// @LINE:81
case controllers_DiscussionData_postExternalMessage55_route(params) => {
   call { 
        controllers_DiscussionData_postExternalMessage55_invoker.call(controllers.DiscussionData.postExternalMessage())
   }
}
        

// @LINE:82
case controllers_DiscussionData_getComments56_route(params) => {
   call { 
        controllers_DiscussionData_getComments56_invoker.call(controllers.DiscussionData.getComments())
   }
}
        

// @LINE:83
case controllers_DiscussionData_getSubComments57_route(params) => {
   call { 
        controllers_DiscussionData_getSubComments57_invoker.call(controllers.DiscussionData.getSubComments())
   }
}
        

// @LINE:84
case controllers_ProjectData_getProjectIdsAsJson58_route(params) => {
   call { 
        controllers_ProjectData_getProjectIdsAsJson58_invoker.call(controllers.ProjectData.getProjectIdsAsJson())
   }
}
        

// @LINE:85
case controllers_ProjectData_getLastAccessedProjectIdAsJson59_route(params) => {
   call { 
        controllers_ProjectData_getLastAccessedProjectIdAsJson59_invoker.call(controllers.ProjectData.getLastAccessedProjectIdAsJson())
   }
}
        

// @LINE:86
case controllers_ProjectData_getOwnerIdsAsJson60_route(params) => {
   call { 
        controllers_ProjectData_getOwnerIdsAsJson60_invoker.call(controllers.ProjectData.getOwnerIdsAsJson())
   }
}
        

// @LINE:87
case controllers_ProjectData_getReviewerIdsAsJson61_route(params) => {
   call { 
        controllers_ProjectData_getReviewerIdsAsJson61_invoker.call(controllers.ProjectData.getReviewerIdsAsJson())
   }
}
        

// @LINE:88
case controllers_ProjectData_getGuestIdsAsJson62_route(params) => {
   call { 
        controllers_ProjectData_getGuestIdsAsJson62_invoker.call(controllers.ProjectData.getGuestIdsAsJson())
   }
}
        

// @LINE:91
case controllers_Application_suggestions63_route(params) => {
   call { 
        controllers_Application_suggestions63_invoker.call(controllers.Application.suggestions())
   }
}
        

// @LINE:98
case controllers_PersonData_deleteAccount64_route(params) => {
   call { 
        controllers_PersonData_deleteAccount64_invoker.call(controllers.PersonData.deleteAccount())
   }
}
        

// @LINE:99
case controllers_PersonData_postMendeleyDocument65_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonData_postMendeleyDocument65_invoker.call(controllers.PersonData.postMendeleyDocument(id))
   }
}
        

// @LINE:103
case controllers_Assets_at66_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at66_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:104
case controllers_WebJarAssets_at67_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at67_invoker.call(controllers.WebJarAssets.at(file))
   }
}
        
}

}
     