// @SOURCE:/Users/soheil/Documents/git/asistu/conf/routes
// @HASH:60cacd7f6e201d131aae07238bc66d4e9d92fd91
// @DATE:Tue Feb 17 22:25:10 CET 2015


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
        

// @LINE:13
private[this] lazy val controllers_TaskData_deleteTask4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/delete/"),DynamicPart("tid", """[^/]+""",true))))
private[this] lazy val controllers_TaskData_deleteTask4_invoker = createInvoker(
controllers.TaskData.deleteTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "deleteTask", Seq(classOf[Long]),"GET", """GET         /task/get                                   controllers.TaskData.getTasks()""", Routes.prefix + """task/delete/$tid<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_TaskData_doneTask5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/done/"),DynamicPart("tid", """[^/]+""",true))))
private[this] lazy val controllers_TaskData_doneTask5_invoker = createInvoker(
controllers.TaskData.doneTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "doneTask", Seq(classOf[Long]),"GET", """""", Routes.prefix + """task/done/$tid<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_TaskData_undoTask6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("task/undo/"),DynamicPart("tid", """[^/]+""",true))))
private[this] lazy val controllers_TaskData_undoTask6_invoker = createInvoker(
controllers.TaskData.undoTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "undoTask", Seq(classOf[Long]),"GET", """""", Routes.prefix + """task/undo/$tid<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_Authentication_login7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_login7_invoker = createInvoker(
controllers.Authentication.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Nil,"GET", """login""", Routes.prefix + """login"""))
        

// @LINE:19
private[this] lazy val controllers_Authentication_relogin8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_relogin8_invoker = createInvoker(
controllers.Authentication.relogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "relogin", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:20
private[this] lazy val controllers_Authentication_doLogin9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logingin"))))
private[this] lazy val controllers_Authentication_doLogin9_invoker = createInvoker(
controllers.Authentication.doLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "doLogin", Nil,"POST", """""", Routes.prefix + """logingin"""))
        

// @LINE:21
private[this] lazy val controllers_Signup_forgotPassword10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/forgotpassword"))))
private[this] lazy val controllers_Signup_forgotPassword10_invoker = createInvoker(
controllers.Signup.forgotPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Nil,"GET", """""", Routes.prefix + """login/forgotpassword"""))
        

// @LINE:22
private[this] lazy val controllers_Signup_doForgotPassword11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/doforgotpassword"))))
private[this] lazy val controllers_Signup_doForgotPassword11_invoker = createInvoker(
controllers.Signup.doForgotPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/doforgotpassword"""))
        

// @LINE:23
private[this] lazy val controllers_Signup_doResetPassword12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/doresetpassword"))))
private[this] lazy val controllers_Signup_doResetPassword12_invoker = createInvoker(
controllers.Signup.doResetPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """login/doresetpassword"""))
        

// @LINE:26
private[this] lazy val controllers_Authentication_signup13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Authentication_signup13_invoker = createInvoker(
controllers.Authentication.signup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "signup", Nil,"GET", """signup""", Routes.prefix + """signup"""))
        

// @LINE:27
private[this] lazy val controllers_Signup_doSignup14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signingup"))))
private[this] lazy val controllers_Signup_doSignup14_invoker = createInvoker(
controllers.Signup.doSignup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doSignup", Nil,"POST", """""", Routes.prefix + """signingup"""))
        

// @LINE:30
private[this] lazy val controllers_Signup_unverified15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
private[this] lazy val controllers_Signup_unverified15_invoker = createInvoker(
controllers.Signup.unverified,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Nil,"GET", """Local Login Account routes""", Routes.prefix + """accounts/unverified"""))
        

// @LINE:31
private[this] lazy val controllers_Signup_verify16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_verify16_invoker = createInvoker(
controllers.Signup.verify(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_Signup_resetPassword17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_resetPassword17_invoker = createInvoker(
controllers.Signup.resetPassword(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_Signup_exists18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
private[this] lazy val controllers_Signup_exists18_invoker = createInvoker(
controllers.Signup.exists,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
        

// @LINE:36
private[this] lazy val controllers_Authentication_OAuthLogout19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Authentication_OAuthLogout19_invoker = createInvoker(
controllers.Authentication.OAuthLogout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthLogout", Nil,"GET", """OAuth2""", Routes.prefix + """logout"""))
        

// @LINE:37
private[this] lazy val controllers_Authentication_OAuth20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val controllers_Authentication_OAuth20_invoker = createInvoker(
controllers.Authentication.OAuth(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuth", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_Authentication_OAuthDenied21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
private[this] lazy val controllers_Authentication_OAuthDenied21_invoker = createInvoker(
controllers.Authentication.OAuthDenied(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
        

// @LINE:41
private[this] lazy val controllers_CalendarData_calendar22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("calendar"))))
private[this] lazy val controllers_CalendarData_calendar22_invoker = createInvoker(
controllers.CalendarData.calendar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "calendar", Nil,"GET", """calendar""", Routes.prefix + """calendar"""))
        

// @LINE:42
private[this] lazy val controllers_CalendarData_list23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/events"))))
private[this] lazy val controllers_CalendarData_list23_invoker = createInvoker(
controllers.CalendarData.list(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "list", Seq(classOf[Long]),"GET", """""", Routes.prefix + """$id<[^/]+>/events"""))
        

// @LINE:43
private[this] lazy val controllers_CalendarData_json24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events.json"))))
private[this] lazy val controllers_CalendarData_json24_invoker = createInvoker(
controllers.CalendarData.json(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "json", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """events.json"""))
        

// @LINE:44
private[this] lazy val controllers_CalendarData_edit25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_CalendarData_edit25_invoker = createInvoker(
controllers.CalendarData.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """event/$id<[^/]+>/edit"""))
        

// @LINE:45
private[this] lazy val controllers_CalendarData_update26_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/"),DynamicPart("id", """[^/]+""",true),StaticPart("/update"))))
private[this] lazy val controllers_CalendarData_update26_invoker = createInvoker(
controllers.CalendarData.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """event/$id<[^/]+>/update"""))
        

// @LINE:46
private[this] lazy val controllers_CalendarData_add27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event"))))
private[this] lazy val controllers_CalendarData_add27_invoker = createInvoker(
controllers.CalendarData.add(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "add", Nil,"POST", """""", Routes.prefix + """event"""))
        

// @LINE:47
private[this] lazy val controllers_CalendarData_blank28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/new"))))
private[this] lazy val controllers_CalendarData_blank28_invoker = createInvoker(
controllers.CalendarData.blank(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "blank", Nil,"GET", """""", Routes.prefix + """event/new"""))
        

// @LINE:48
private[this] lazy val controllers_CalendarData_delete29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_CalendarData_delete29_invoker = createInvoker(
controllers.CalendarData.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """event/$id<[^/]+>/delete"""))
        

// @LINE:49
private[this] lazy val controllers_CalendarData_addByAjax30_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/event-ajax"))))
private[this] lazy val controllers_CalendarData_addByAjax30_invoker = createInvoker(
controllers.CalendarData.addByAjax(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "addByAjax", Seq(classOf[Long]),"POST", """""", Routes.prefix + """$id<[^/]+>/event-ajax"""))
        

// @LINE:50
private[this] lazy val controllers_CalendarData_move31_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event-move"))))
private[this] lazy val controllers_CalendarData_move31_invoker = createInvoker(
controllers.CalendarData.move(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "move", Nil,"POST", """""", Routes.prefix + """event-move"""))
        

// @LINE:51
private[this] lazy val controllers_CalendarData_resize32_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event-resize"))))
private[this] lazy val controllers_CalendarData_resize32_invoker = createInvoker(
controllers.CalendarData.resize(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "resize", Nil,"POST", """""", Routes.prefix + """event-resize"""))
        

// @LINE:56
private[this] lazy val controllers_Application_project33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project"))))
private[this] lazy val controllers_Application_project33_invoker = createInvoker(
controllers.Application.project(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "project", Nil,"GET", """project""", Routes.prefix + """project"""))
        

// @LINE:57
private[this] lazy val controllers_ProjectData_createProjectPage34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/new"))))
private[this] lazy val controllers_ProjectData_createProjectPage34_invoker = createInvoker(
controllers.ProjectData.createProjectPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProjectPage", Nil,"GET", """""", Routes.prefix + """project/new"""))
        

// @LINE:58
private[this] lazy val controllers_ProjectData_createProject35_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/create"))))
private[this] lazy val controllers_ProjectData_createProject35_invoker = createInvoker(
controllers.ProjectData.createProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProject", Nil,"POST", """""", Routes.prefix + """project/create"""))
        

// @LINE:59
private[this] lazy val controllers_ProjectData_project36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true))))
private[this] lazy val controllers_ProjectData_project36_invoker = createInvoker(
controllers.ProjectData.project(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "project", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>"""))
        

// @LINE:60
private[this] lazy val controllers_ProjectData_editProjectPage37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_ProjectData_editProjectPage37_invoker = createInvoker(
controllers.ProjectData.editProjectPage(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProjectPage", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/edit"""))
        

// @LINE:61
private[this] lazy val controllers_ProjectData_editProject38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/editing"))))
private[this] lazy val controllers_ProjectData_editProject38_invoker = createInvoker(
controllers.ProjectData.editProject(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProject", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/editing"""))
        

// @LINE:62
private[this] lazy val controllers_ProjectData_archiveProject39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/archive"))))
private[this] lazy val controllers_ProjectData_archiveProject39_invoker = createInvoker(
controllers.ProjectData.archiveProject(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "archiveProject", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/archive"""))
        

// @LINE:63
private[this] lazy val controllers_ProjectData_inviteMemberToProjectAs40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/addMember"))))
private[this] lazy val controllers_ProjectData_inviteMemberToProjectAs40_invoker = createInvoker(
controllers.ProjectData.inviteMemberToProjectAs(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "inviteMemberToProjectAs", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/addMember"""))
        

// @LINE:64
private[this] lazy val controllers_ProjectData_hasAccepted41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/acceptinvitation"))))
private[this] lazy val controllers_ProjectData_hasAccepted41_invoker = createInvoker(
controllers.ProjectData.hasAccepted(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasAccepted", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/acceptinvitation"""))
        

// @LINE:65
private[this] lazy val controllers_ProjectData_hasDeclined42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/declineinvitation"))))
private[this] lazy val controllers_ProjectData_hasDeclined42_invoker = createInvoker(
controllers.ProjectData.hasDeclined(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasDeclined", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/declineinvitation"""))
        

// @LINE:66
private[this] lazy val controllers_ProjectData_leaveProject43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/leave"))))
private[this] lazy val controllers_ProjectData_leaveProject43_invoker = createInvoker(
controllers.ProjectData.leaveProject(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "leaveProject", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/leave"""))
        

// @LINE:67
private[this] lazy val controllers_ProjectData_removeMemberFromProject44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/removeMember/"),DynamicPart("uid", """[^/]+""",true))))
private[this] lazy val controllers_ProjectData_removeMemberFromProject44_invoker = createInvoker(
controllers.ProjectData.removeMemberFromProject(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "removeMemberFromProject", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/removeMember/$uid<[^/]+>"""))
        

// @LINE:68
private[this] lazy val controllers_DocumentData_uploadDocument45_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/upload"))))
private[this] lazy val controllers_DocumentData_uploadDocument45_invoker = createInvoker(
controllers.DocumentData.uploadDocument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "uploadDocument", Seq(classOf[Long]),"POST", """""", Routes.prefix + """project/upload"""))
        

// @LINE:69
private[this] lazy val controllers_DocumentData_uploadNewTemplate46_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/uploadNewTemplate"))))
private[this] lazy val controllers_DocumentData_uploadNewTemplate46_invoker = createInvoker(
controllers.DocumentData.uploadNewTemplate(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "uploadNewTemplate", Seq(classOf[Long]),"POST", """""", Routes.prefix + """project/uploadNewTemplate"""))
        

// @LINE:70
private[this] lazy val controllers_DocumentData_documentDiscussion47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/discuss/"),DynamicPart("docId", """[^/]+""",true))))
private[this] lazy val controllers_DocumentData_documentDiscussion47_invoker = createInvoker(
controllers.DocumentData.documentDiscussion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "documentDiscussion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/discuss/$docId<[^/]+>"""))
        

// @LINE:71
private[this] lazy val controllers_DocumentData_downloadDocument48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/download/"),DynamicPart("fileid", """[^/]+""",true))))
private[this] lazy val controllers_DocumentData_downloadDocument48_invoker = createInvoker(
controllers.DocumentData.downloadDocument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "downloadDocument", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/download/$fileid<[^/]+>"""))
        

// @LINE:72
private[this] lazy val controllers_DocumentData_deleteDocument49_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/delete/"),DynamicPart("fileid", """[^/]+""",true))))
private[this] lazy val controllers_DocumentData_deleteDocument49_invoker = createInvoker(
controllers.DocumentData.deleteDocument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "deleteDocument", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/delete/$fileid<[^/]+>"""))
        

// @LINE:73
private[this] lazy val controllers_DocumentData_downloadTemplate50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/downloadTemplate"))))
private[this] lazy val controllers_DocumentData_downloadTemplate50_invoker = createInvoker(
controllers.DocumentData.downloadTemplate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "downloadTemplate", Nil,"GET", """""", Routes.prefix + """project/downloadTemplate"""))
        

// @LINE:74
private[this] lazy val controllers_DocumentData_downloadOwnTemplate51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/downloadownTemplate/"),DynamicPart("fileid", """[^/]+""",true))))
private[this] lazy val controllers_DocumentData_downloadOwnTemplate51_invoker = createInvoker(
controllers.DocumentData.downloadOwnTemplate(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "downloadOwnTemplate", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/downloadownTemplate/$fileid<[^/]+>"""))
        

// @LINE:79
private[this] lazy val controllers_Application_discussion52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discussions"))))
private[this] lazy val controllers_Application_discussion52_invoker = createInvoker(
controllers.Application.discussion(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "discussion", Nil,"GET", """discussion""", Routes.prefix + """discussions"""))
        

// @LINE:80
private[this] lazy val controllers_DiscussionData_discussion53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("pid", """[^/]+""",true),StaticPart("/discussion"))))
private[this] lazy val controllers_DiscussionData_discussion53_invoker = createInvoker(
controllers.DiscussionData.discussion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "discussion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """project/$pid<[^/]+>/discussion"""))
        

// @LINE:81
private[this] lazy val controllers_DiscussionData_chatFeed54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chatFeed/"),DynamicPart("project", """[^/]+""",true))))
private[this] lazy val controllers_DiscussionData_chatFeed54_invoker = createInvoker(
controllers.DiscussionData.chatFeed(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "chatFeed", Seq(classOf[String]),"GET", """""", Routes.prefix + """chatFeed/$project<[^/]+>"""))
        

// @LINE:82
private[this] lazy val controllers_DiscussionData_postMessage55_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat"))))
private[this] lazy val controllers_DiscussionData_postMessage55_invoker = createInvoker(
controllers.DiscussionData.postMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postMessage", Nil,"POST", """""", Routes.prefix + """chat"""))
        

// @LINE:83
private[this] lazy val controllers_DiscussionData_deleteMessage56_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletemessage"))))
private[this] lazy val controllers_DiscussionData_deleteMessage56_invoker = createInvoker(
controllers.DiscussionData.deleteMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "deleteMessage", Nil,"POST", """""", Routes.prefix + """deletemessage"""))
        

// @LINE:84
private[this] lazy val controllers_DiscussionData_postExternalMessage57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postexternal"))))
private[this] lazy val controllers_DiscussionData_postExternalMessage57_invoker = createInvoker(
controllers.DiscussionData.postExternalMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postExternalMessage", Nil,"GET", """""", Routes.prefix + """postexternal"""))
        

// @LINE:85
private[this] lazy val controllers_DiscussionData_getComments58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comments"))))
private[this] lazy val controllers_DiscussionData_getComments58_invoker = createInvoker(
controllers.DiscussionData.getComments(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getComments", Nil,"GET", """""", Routes.prefix + """comments"""))
        

// @LINE:86
private[this] lazy val controllers_DiscussionData_getSubComments59_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subcomments"))))
private[this] lazy val controllers_DiscussionData_getSubComments59_invoker = createInvoker(
controllers.DiscussionData.getSubComments(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getSubComments", Nil,"GET", """""", Routes.prefix + """subcomments"""))
        

// @LINE:87
private[this] lazy val controllers_ProjectData_getProjectIdsAsJson60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectids"))))
private[this] lazy val controllers_ProjectData_getProjectIdsAsJson60_invoker = createInvoker(
controllers.ProjectData.getProjectIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getProjectIdsAsJson", Nil,"GET", """""", Routes.prefix + """projectids"""))
        

// @LINE:88
private[this] lazy val controllers_ProjectData_getLastAccessedProjectIdAsJson61_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectid"))))
private[this] lazy val controllers_ProjectData_getLastAccessedProjectIdAsJson61_invoker = createInvoker(
controllers.ProjectData.getLastAccessedProjectIdAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getLastAccessedProjectIdAsJson", Nil,"GET", """""", Routes.prefix + """projectid"""))
        

// @LINE:89
private[this] lazy val controllers_ProjectData_getOwnerIdsAsJson62_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ownerids"))))
private[this] lazy val controllers_ProjectData_getOwnerIdsAsJson62_invoker = createInvoker(
controllers.ProjectData.getOwnerIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getOwnerIdsAsJson", Nil,"GET", """""", Routes.prefix + """ownerids"""))
        

// @LINE:90
private[this] lazy val controllers_ProjectData_getReviewerIdsAsJson63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reviewerids"))))
private[this] lazy val controllers_ProjectData_getReviewerIdsAsJson63_invoker = createInvoker(
controllers.ProjectData.getReviewerIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getReviewerIdsAsJson", Nil,"GET", """""", Routes.prefix + """reviewerids"""))
        

// @LINE:91
private[this] lazy val controllers_ProjectData_getGuestIdsAsJson64_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guestids"))))
private[this] lazy val controllers_ProjectData_getGuestIdsAsJson64_invoker = createInvoker(
controllers.ProjectData.getGuestIdsAsJson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getGuestIdsAsJson", Nil,"GET", """""", Routes.prefix + """guestids"""))
        

// @LINE:94
private[this] lazy val controllers_Application_suggestions65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestions"))))
private[this] lazy val controllers_Application_suggestions65_invoker = createInvoker(
controllers.Application.suggestions(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "suggestions", Nil,"GET", """Suggestions""", Routes.prefix + """suggestions"""))
        

// @LINE:95
private[this] lazy val controllers_SuggestionData_suggestion66_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestions/"),DynamicPart("subject", """[^/]+""",true))))
private[this] lazy val controllers_SuggestionData_suggestion66_invoker = createInvoker(
controllers.SuggestionData.suggestion(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionData", "suggestion", Seq(classOf[String]),"GET", """""", Routes.prefix + """suggestions/$subject<[^/]+>"""))
        

// @LINE:100
private[this] lazy val controllers_Emailer_sendWelcomeMessage67_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("send/email"))))
private[this] lazy val controllers_Emailer_sendWelcomeMessage67_invoker = createInvoker(
controllers.Emailer.sendWelcomeMessage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Emailer", "sendWelcomeMessage", Nil,"GET", """Email""", Routes.prefix + """send/email"""))
        

// @LINE:107
private[this] lazy val controllers_Assets_at68_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at68_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:108
private[this] lazy val controllers_WebJarAssets_at69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_WebJarAssets_at69_invoker = createInvoker(
controllers.WebJarAssets.at(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """redirect""","""controllers.Application.reroute()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.task()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/new""","""controllers.TaskData.addTask()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/delete/$tid<[^/]+>""","""controllers.TaskData.deleteTask(tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/done/$tid<[^/]+>""","""controllers.TaskData.doneTask(tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """task/undo/$tid<[^/]+>""","""controllers.TaskData.undoTask(tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.relogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logingin""","""controllers.Authentication.doLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/forgotpassword""","""controllers.Signup.forgotPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/doforgotpassword""","""controllers.Signup.doForgotPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/doresetpassword""","""controllers.Signup.doResetPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Authentication.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signingup""","""controllers.Signup.doSignup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.OAuthLogout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""controllers.Authentication.OAuth(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Authentication.OAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """calendar""","""controllers.CalendarData.calendar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/events""","""controllers.CalendarData.list(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events.json""","""controllers.CalendarData.json(start:Long, end:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/$id<[^/]+>/edit""","""controllers.CalendarData.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/$id<[^/]+>/update""","""controllers.CalendarData.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event""","""controllers.CalendarData.add()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/new""","""controllers.CalendarData.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/$id<[^/]+>/delete""","""controllers.CalendarData.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/event-ajax""","""controllers.CalendarData.addByAjax(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event-move""","""controllers.CalendarData.move()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event-resize""","""controllers.CalendarData.resize()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project""","""controllers.Application.project()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/new""","""controllers.ProjectData.createProjectPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/create""","""controllers.ProjectData.createProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>""","""controllers.ProjectData.project(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/edit""","""controllers.ProjectData.editProjectPage(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/editing""","""controllers.ProjectData.editProject(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/archive""","""controllers.ProjectData.archiveProject(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/addMember""","""controllers.ProjectData.inviteMemberToProjectAs(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/acceptinvitation""","""controllers.ProjectData.hasAccepted(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/declineinvitation""","""controllers.ProjectData.hasDeclined(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/leave""","""controllers.ProjectData.leaveProject(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/removeMember/$uid<[^/]+>""","""controllers.ProjectData.removeMemberFromProject(uid:Long, pid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/upload""","""controllers.DocumentData.uploadDocument(pid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/uploadNewTemplate""","""controllers.DocumentData.uploadNewTemplate(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/discuss/$docId<[^/]+>""","""controllers.DocumentData.documentDiscussion(docId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/download/$fileid<[^/]+>""","""controllers.DocumentData.downloadDocument(fileid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/delete/$fileid<[^/]+>""","""controllers.DocumentData.deleteDocument(fileid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/downloadTemplate""","""controllers.DocumentData.downloadTemplate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/downloadownTemplate/$fileid<[^/]+>""","""controllers.DocumentData.downloadOwnTemplate(fileid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discussions""","""controllers.Application.discussion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$pid<[^/]+>/discussion""","""controllers.DiscussionData.discussion(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chatFeed/$project<[^/]+>""","""controllers.DiscussionData.chatFeed(project:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat""","""controllers.DiscussionData.postMessage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletemessage""","""controllers.DiscussionData.deleteMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postexternal""","""controllers.DiscussionData.postExternalMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comments""","""controllers.DiscussionData.getComments()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subcomments""","""controllers.DiscussionData.getSubComments()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectids""","""controllers.ProjectData.getProjectIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectid""","""controllers.ProjectData.getLastAccessedProjectIdAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ownerids""","""controllers.ProjectData.getOwnerIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reviewerids""","""controllers.ProjectData.getReviewerIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guestids""","""controllers.ProjectData.getGuestIdsAsJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestions""","""controllers.Application.suggestions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestions/$subject<[^/]+>""","""controllers.SuggestionData.suggestion(subject:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """send/email""","""controllers.Emailer.sendWelcomeMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:13
case controllers_TaskData_deleteTask4_route(params) => {
   call(params.fromPath[Long]("tid", None)) { (tid) =>
        controllers_TaskData_deleteTask4_invoker.call(controllers.TaskData.deleteTask(tid))
   }
}
        

// @LINE:14
case controllers_TaskData_doneTask5_route(params) => {
   call(params.fromPath[Long]("tid", None)) { (tid) =>
        controllers_TaskData_doneTask5_invoker.call(controllers.TaskData.doneTask(tid))
   }
}
        

// @LINE:15
case controllers_TaskData_undoTask6_route(params) => {
   call(params.fromPath[Long]("tid", None)) { (tid) =>
        controllers_TaskData_undoTask6_invoker.call(controllers.TaskData.undoTask(tid))
   }
}
        

// @LINE:18
case controllers_Authentication_login7_route(params) => {
   call { 
        controllers_Authentication_login7_invoker.call(controllers.Authentication.login())
   }
}
        

// @LINE:19
case controllers_Authentication_relogin8_route(params) => {
   call { 
        controllers_Authentication_relogin8_invoker.call(controllers.Authentication.relogin())
   }
}
        

// @LINE:20
case controllers_Authentication_doLogin9_route(params) => {
   call { 
        controllers_Authentication_doLogin9_invoker.call(controllers.Authentication.doLogin())
   }
}
        

// @LINE:21
case controllers_Signup_forgotPassword10_route(params) => {
   call { 
        controllers_Signup_forgotPassword10_invoker.call(controllers.Signup.forgotPassword())
   }
}
        

// @LINE:22
case controllers_Signup_doForgotPassword11_route(params) => {
   call { 
        controllers_Signup_doForgotPassword11_invoker.call(controllers.Signup.doForgotPassword())
   }
}
        

// @LINE:23
case controllers_Signup_doResetPassword12_route(params) => {
   call { 
        controllers_Signup_doResetPassword12_invoker.call(controllers.Signup.doResetPassword())
   }
}
        

// @LINE:26
case controllers_Authentication_signup13_route(params) => {
   call { 
        controllers_Authentication_signup13_invoker.call(controllers.Authentication.signup())
   }
}
        

// @LINE:27
case controllers_Signup_doSignup14_route(params) => {
   call { 
        controllers_Signup_doSignup14_invoker.call(controllers.Signup.doSignup())
   }
}
        

// @LINE:30
case controllers_Signup_unverified15_route(params) => {
   call { 
        controllers_Signup_unverified15_invoker.call(controllers.Signup.unverified)
   }
}
        

// @LINE:31
case controllers_Signup_verify16_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify16_invoker.call(controllers.Signup.verify(token))
   }
}
        

// @LINE:32
case controllers_Signup_resetPassword17_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword17_invoker.call(controllers.Signup.resetPassword(token))
   }
}
        

// @LINE:33
case controllers_Signup_exists18_route(params) => {
   call { 
        controllers_Signup_exists18_invoker.call(controllers.Signup.exists)
   }
}
        

// @LINE:36
case controllers_Authentication_OAuthLogout19_route(params) => {
   call { 
        controllers_Authentication_OAuthLogout19_invoker.call(controllers.Authentication.OAuthLogout())
   }
}
        

// @LINE:37
case controllers_Authentication_OAuth20_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Authentication_OAuth20_invoker.call(controllers.Authentication.OAuth(provider))
   }
}
        

// @LINE:38
case controllers_Authentication_OAuthDenied21_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Authentication_OAuthDenied21_invoker.call(controllers.Authentication.OAuthDenied(provider))
   }
}
        

// @LINE:41
case controllers_CalendarData_calendar22_route(params) => {
   call { 
        controllers_CalendarData_calendar22_invoker.call(controllers.CalendarData.calendar())
   }
}
        

// @LINE:42
case controllers_CalendarData_list23_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_list23_invoker.call(controllers.CalendarData.list(id))
   }
}
        

// @LINE:43
case controllers_CalendarData_json24_route(params) => {
   call(params.fromQuery[Long]("start", None), params.fromQuery[Long]("end", None)) { (start, end) =>
        controllers_CalendarData_json24_invoker.call(controllers.CalendarData.json(start, end))
   }
}
        

// @LINE:44
case controllers_CalendarData_edit25_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_edit25_invoker.call(controllers.CalendarData.edit(id))
   }
}
        

// @LINE:45
case controllers_CalendarData_update26_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_update26_invoker.call(controllers.CalendarData.update(id))
   }
}
        

// @LINE:46
case controllers_CalendarData_add27_route(params) => {
   call { 
        controllers_CalendarData_add27_invoker.call(controllers.CalendarData.add())
   }
}
        

// @LINE:47
case controllers_CalendarData_blank28_route(params) => {
   call { 
        controllers_CalendarData_blank28_invoker.call(controllers.CalendarData.blank())
   }
}
        

// @LINE:48
case controllers_CalendarData_delete29_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_delete29_invoker.call(controllers.CalendarData.delete(id))
   }
}
        

// @LINE:49
case controllers_CalendarData_addByAjax30_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CalendarData_addByAjax30_invoker.call(controllers.CalendarData.addByAjax(id))
   }
}
        

// @LINE:50
case controllers_CalendarData_move31_route(params) => {
   call { 
        controllers_CalendarData_move31_invoker.call(controllers.CalendarData.move())
   }
}
        

// @LINE:51
case controllers_CalendarData_resize32_route(params) => {
   call { 
        controllers_CalendarData_resize32_invoker.call(controllers.CalendarData.resize())
   }
}
        

// @LINE:56
case controllers_Application_project33_route(params) => {
   call { 
        controllers_Application_project33_invoker.call(controllers.Application.project())
   }
}
        

// @LINE:57
case controllers_ProjectData_createProjectPage34_route(params) => {
   call { 
        controllers_ProjectData_createProjectPage34_invoker.call(controllers.ProjectData.createProjectPage())
   }
}
        

// @LINE:58
case controllers_ProjectData_createProject35_route(params) => {
   call { 
        controllers_ProjectData_createProject35_invoker.call(controllers.ProjectData.createProject())
   }
}
        

// @LINE:59
case controllers_ProjectData_project36_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_project36_invoker.call(controllers.ProjectData.project(pid))
   }
}
        

// @LINE:60
case controllers_ProjectData_editProjectPage37_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_editProjectPage37_invoker.call(controllers.ProjectData.editProjectPage(pid))
   }
}
        

// @LINE:61
case controllers_ProjectData_editProject38_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_editProject38_invoker.call(controllers.ProjectData.editProject(pid))
   }
}
        

// @LINE:62
case controllers_ProjectData_archiveProject39_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_archiveProject39_invoker.call(controllers.ProjectData.archiveProject(pid))
   }
}
        

// @LINE:63
case controllers_ProjectData_inviteMemberToProjectAs40_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_inviteMemberToProjectAs40_invoker.call(controllers.ProjectData.inviteMemberToProjectAs(pid))
   }
}
        

// @LINE:64
case controllers_ProjectData_hasAccepted41_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_hasAccepted41_invoker.call(controllers.ProjectData.hasAccepted(pid))
   }
}
        

// @LINE:65
case controllers_ProjectData_hasDeclined42_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_hasDeclined42_invoker.call(controllers.ProjectData.hasDeclined(pid))
   }
}
        

// @LINE:66
case controllers_ProjectData_leaveProject43_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_ProjectData_leaveProject43_invoker.call(controllers.ProjectData.leaveProject(pid))
   }
}
        

// @LINE:67
case controllers_ProjectData_removeMemberFromProject44_route(params) => {
   call(params.fromPath[Long]("uid", None), params.fromPath[Long]("pid", None)) { (uid, pid) =>
        controllers_ProjectData_removeMemberFromProject44_invoker.call(controllers.ProjectData.removeMemberFromProject(uid, pid))
   }
}
        

// @LINE:68
case controllers_DocumentData_uploadDocument45_route(params) => {
   call(params.fromQuery[Long]("pid", None)) { (pid) =>
        controllers_DocumentData_uploadDocument45_invoker.call(controllers.DocumentData.uploadDocument(pid))
   }
}
        

// @LINE:69
case controllers_DocumentData_uploadNewTemplate46_route(params) => {
   call(params.fromQuery[Long]("pid", None)) { (pid) =>
        controllers_DocumentData_uploadNewTemplate46_invoker.call(controllers.DocumentData.uploadNewTemplate(pid))
   }
}
        

// @LINE:70
case controllers_DocumentData_documentDiscussion47_route(params) => {
   call(params.fromPath[Long]("docId", None)) { (docId) =>
        controllers_DocumentData_documentDiscussion47_invoker.call(controllers.DocumentData.documentDiscussion(docId))
   }
}
        

// @LINE:71
case controllers_DocumentData_downloadDocument48_route(params) => {
   call(params.fromPath[Long]("fileid", None)) { (fileid) =>
        controllers_DocumentData_downloadDocument48_invoker.call(controllers.DocumentData.downloadDocument(fileid))
   }
}
        

// @LINE:72
case controllers_DocumentData_deleteDocument49_route(params) => {
   call(params.fromPath[Long]("fileid", None)) { (fileid) =>
        controllers_DocumentData_deleteDocument49_invoker.call(controllers.DocumentData.deleteDocument(fileid))
   }
}
        

// @LINE:73
case controllers_DocumentData_downloadTemplate50_route(params) => {
   call { 
        controllers_DocumentData_downloadTemplate50_invoker.call(controllers.DocumentData.downloadTemplate())
   }
}
        

// @LINE:74
case controllers_DocumentData_downloadOwnTemplate51_route(params) => {
   call(params.fromPath[Long]("fileid", None)) { (fileid) =>
        controllers_DocumentData_downloadOwnTemplate51_invoker.call(controllers.DocumentData.downloadOwnTemplate(fileid))
   }
}
        

// @LINE:79
case controllers_Application_discussion52_route(params) => {
   call { 
        controllers_Application_discussion52_invoker.call(controllers.Application.discussion())
   }
}
        

// @LINE:80
case controllers_DiscussionData_discussion53_route(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        controllers_DiscussionData_discussion53_invoker.call(controllers.DiscussionData.discussion(pid))
   }
}
        

// @LINE:81
case controllers_DiscussionData_chatFeed54_route(params) => {
   call(params.fromPath[String]("project", None)) { (project) =>
        controllers_DiscussionData_chatFeed54_invoker.call(controllers.DiscussionData.chatFeed(project))
   }
}
        

// @LINE:82
case controllers_DiscussionData_postMessage55_route(params) => {
   call { 
        controllers_DiscussionData_postMessage55_invoker.call(controllers.DiscussionData.postMessage())
   }
}
        

// @LINE:83
case controllers_DiscussionData_deleteMessage56_route(params) => {
   call { 
        controllers_DiscussionData_deleteMessage56_invoker.call(controllers.DiscussionData.deleteMessage())
   }
}
        

// @LINE:84
case controllers_DiscussionData_postExternalMessage57_route(params) => {
   call { 
        controllers_DiscussionData_postExternalMessage57_invoker.call(controllers.DiscussionData.postExternalMessage())
   }
}
        

// @LINE:85
case controllers_DiscussionData_getComments58_route(params) => {
   call { 
        controllers_DiscussionData_getComments58_invoker.call(controllers.DiscussionData.getComments())
   }
}
        

// @LINE:86
case controllers_DiscussionData_getSubComments59_route(params) => {
   call { 
        controllers_DiscussionData_getSubComments59_invoker.call(controllers.DiscussionData.getSubComments())
   }
}
        

// @LINE:87
case controllers_ProjectData_getProjectIdsAsJson60_route(params) => {
   call { 
        controllers_ProjectData_getProjectIdsAsJson60_invoker.call(controllers.ProjectData.getProjectIdsAsJson())
   }
}
        

// @LINE:88
case controllers_ProjectData_getLastAccessedProjectIdAsJson61_route(params) => {
   call { 
        controllers_ProjectData_getLastAccessedProjectIdAsJson61_invoker.call(controllers.ProjectData.getLastAccessedProjectIdAsJson())
   }
}
        

// @LINE:89
case controllers_ProjectData_getOwnerIdsAsJson62_route(params) => {
   call { 
        controllers_ProjectData_getOwnerIdsAsJson62_invoker.call(controllers.ProjectData.getOwnerIdsAsJson())
   }
}
        

// @LINE:90
case controllers_ProjectData_getReviewerIdsAsJson63_route(params) => {
   call { 
        controllers_ProjectData_getReviewerIdsAsJson63_invoker.call(controllers.ProjectData.getReviewerIdsAsJson())
   }
}
        

// @LINE:91
case controllers_ProjectData_getGuestIdsAsJson64_route(params) => {
   call { 
        controllers_ProjectData_getGuestIdsAsJson64_invoker.call(controllers.ProjectData.getGuestIdsAsJson())
   }
}
        

// @LINE:94
case controllers_Application_suggestions65_route(params) => {
   call { 
        controllers_Application_suggestions65_invoker.call(controllers.Application.suggestions())
   }
}
        

// @LINE:95
case controllers_SuggestionData_suggestion66_route(params) => {
   call(params.fromPath[String]("subject", None)) { (subject) =>
        controllers_SuggestionData_suggestion66_invoker.call(controllers.SuggestionData.suggestion(subject))
   }
}
        

// @LINE:100
case controllers_Emailer_sendWelcomeMessage67_route(params) => {
   call { 
        controllers_Emailer_sendWelcomeMessage67_invoker.call(controllers.Emailer.sendWelcomeMessage())
   }
}
        

// @LINE:107
case controllers_Assets_at68_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at68_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:108
case controllers_WebJarAssets_at69_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at69_invoker.call(controllers.WebJarAssets.at(file))
   }
}
        
}

}
     