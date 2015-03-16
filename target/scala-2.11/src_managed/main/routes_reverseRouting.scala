// @SOURCE:/home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/conf/routes
// @HASH:eb6bdeed6f1473bc818eafae1de162d9ba9c5ba7
// @DATE:Mon Mar 09 23:14:20 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:104
// @LINE:103
// @LINE:99
// @LINE:98
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:99
// @LINE:98
class ReversePersonData {


// @LINE:98
def deleteAccount(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deleteaccount")
}
                        

// @LINE:99
def postMendeleyDocument(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "exportMendeleyDocument/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

}
                          

// @LINE:103
class ReverseAssets {


// @LINE:103
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:25
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseAuthentication {


// @LINE:35
def OAuthLogout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:36
def OAuth(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                        

// @LINE:25
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:19
def doLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logingin")
}
                        

// @LINE:18
def loginWithMessage(message:String, theme:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login/" + implicitly[PathBindable[String]].unbind("theme", dynamicString(theme)) + "/" + implicitly[PathBindable[String]].unbind("message", dynamicString(message)))
}
                        

// @LINE:37
def OAuthDenied(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                        

// @LINE:17
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:104
class ReverseWebJarAssets {


// @LINE:104
def at(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:91
// @LINE:75
// @LINE:55
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def reroute(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "redirect")
}
                        

// @LINE:55
def project(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "projects")
}
                        

// @LINE:10
def task(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                        

// @LINE:91
def suggestions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestions")
}
                        

// @LINE:75
def discussion(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "discussions")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
class ReverseProjectData {


// @LINE:86
def getOwnerIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ownerids")
}
                        

// @LINE:58
def project(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid))
}
                        

// @LINE:66
def removeMemberFromProject(uid:Long, pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/removemember/" + implicitly[PathBindable[Long]].unbind("uid", uid))
}
                        

// @LINE:56
def createProjectPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/new")
}
                        

// @LINE:65
def leaveProject(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/leave")
}
                        

// @LINE:85
def getLastAccessedProjectIdAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "projectid")
}
                        

// @LINE:59
def editProjectPage(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/edit")
}
                        

// @LINE:62
def inviteMemberToProjectAs(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/addmember")
}
                        

// @LINE:64
def hasDeclined(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/declineinvitation")
}
                        

// @LINE:88
def getGuestIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "guestids")
}
                        

// @LINE:63
def hasAccepted(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/acceptinvitation")
}
                        

// @LINE:60
def editProject(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/editing")
}
                        

// @LINE:87
def getReviewerIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reviewerids")
}
                        

// @LINE:57
def createProject(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "project/create")
}
                        

// @LINE:61
def archiveProject(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/archive")
}
                        

// @LINE:84
def getProjectIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "projectids")
}
                        

}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSignup {


// @LINE:32
def exists(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                        

// @LINE:26
def doSignup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signingup")
}
                        

// @LINE:30
def verify(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:29
def unverified(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                        

// @LINE:31
def resetPassword(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:20
def forgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login/forgotpassword")
}
                        

// @LINE:22
def doResetPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/doresetpassword")
}
                        

// @LINE:21
def doForgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/doforgotpassword")
}
                        

}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseTaskData {


// @LINE:11
def addTask(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "task/new")
}
                        

// @LINE:13
def doneTask(tid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "task/done/" + implicitly[PathBindable[Long]].unbind("tid", tid))
}
                        

// @LINE:14
def undoTask(tid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "task/undo/" + implicitly[PathBindable[Long]].unbind("tid", tid))
}
                        

// @LINE:12
def deleteTask(tid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "task/delete/" + implicitly[PathBindable[Long]].unbind("tid", tid))
}
                        

}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseCalendarData {


// @LINE:47
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:43
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:48
def addByAjax(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + implicitly[PathBindable[Long]].unbind("id", id) + "/event-ajax")
}
                        

// @LINE:44
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:49
def move(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event-move")
}
                        

// @LINE:41
def list(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[Long]].unbind("id", id) + "/events")
}
                        

// @LINE:45
def add(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event")
}
                        

// @LINE:42
def json(start:Long, end:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "events.json" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("start", start)), Some(implicitly[QueryStringBindable[Long]].unbind("end", end)))))
}
                        

// @LINE:46
def blank(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/new")
}
                        

// @LINE:50
def resize(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event-resize")
}
                        

// @LINE:40
def calendar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "calendar")
}
                        

}
                          

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseDocumentData {


// @LINE:71
def documentDiscussion(docId:java.util.UUID): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/discuss/" + implicitly[PathBindable[java.util.UUID]].unbind("docId", docId))
}
                        

// @LINE:72
def deleteDocument(fileid:java.util.UUID): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/delete/" + implicitly[PathBindable[java.util.UUID]].unbind("fileid", fileid))
}
                        

// @LINE:70
def uploadNewTemplate(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "project/uploadNewTemplate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("pid", pid)))))
}
                        

// @LINE:69
def upload(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "project/upload" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("pid", pid)))))
}
                        

}
                          

// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
class ReverseDiscussionData {


// @LINE:82
def getComments(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "comments")
}
                        

// @LINE:81
def postExternalMessage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "postexternal")
}
                        

// @LINE:80
def deleteMessage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deletemessage")
}
                        

// @LINE:78
def chatFeed(project:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "chatFeed/" + implicitly[PathBindable[String]].unbind("project", dynamicString(project)))
}
                        

// @LINE:79
def postMessage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "chat")
}
                        

// @LINE:83
def getSubComments(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "subcomments")
}
                        

// @LINE:76
def seen(cid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "discussion/seen/" + implicitly[PathBindable[Long]].unbind("cid", cid))
}
                        

// @LINE:77
def discussion(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "discussion/" + implicitly[PathBindable[Long]].unbind("pid", pid))
}
                        

}
                          
}
                  


// @LINE:104
// @LINE:103
// @LINE:99
// @LINE:98
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:99
// @LINE:98
class ReversePersonData {


// @LINE:98
def deleteAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonData.deleteAccount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteaccount"})
      }
   """
)
                        

// @LINE:99
def postMendeleyDocument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PersonData.postMendeleyDocument",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportMendeleyDocument/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

}
              

// @LINE:103
class ReverseAssets {


// @LINE:103
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:25
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseAuthentication {


// @LINE:35
def OAuthLogout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.OAuthLogout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:36
def OAuth : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.OAuth",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:25
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:19
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logingin"})
      }
   """
)
                        

// @LINE:18
def loginWithMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.loginWithMessage",
   """
      function(message,theme) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("theme", encodeURIComponent(theme)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("message", encodeURIComponent(message))})
      }
   """
)
                        

// @LINE:37
def OAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.OAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:17
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:104
class ReverseWebJarAssets {


// @LINE:104
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:91
// @LINE:75
// @LINE:55
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def reroute : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.reroute",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirect"})
      }
   """
)
                        

// @LINE:55
def project : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.project",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects"})
      }
   """
)
                        

// @LINE:10
def task : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.task",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:91
def suggestions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.suggestions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestions"})
      }
   """
)
                        

// @LINE:75
def discussion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.discussion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discussions"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
class ReverseProjectData {


// @LINE:86
def getOwnerIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getOwnerIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ownerids"})
      }
   """
)
                        

// @LINE:58
def project : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.project",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid)})
      }
   """
)
                        

// @LINE:66
def removeMemberFromProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.removeMemberFromProject",
   """
      function(uid,pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/removemember/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uid", uid)})
      }
   """
)
                        

// @LINE:56
def createProjectPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.createProjectPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/new"})
      }
   """
)
                        

// @LINE:65
def leaveProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.leaveProject",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/leave"})
      }
   """
)
                        

// @LINE:85
def getLastAccessedProjectIdAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getLastAccessedProjectIdAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectid"})
      }
   """
)
                        

// @LINE:59
def editProjectPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.editProjectPage",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/edit"})
      }
   """
)
                        

// @LINE:62
def inviteMemberToProjectAs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.inviteMemberToProjectAs",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/addmember"})
      }
   """
)
                        

// @LINE:64
def hasDeclined : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.hasDeclined",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/declineinvitation"})
      }
   """
)
                        

// @LINE:88
def getGuestIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getGuestIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "guestids"})
      }
   """
)
                        

// @LINE:63
def hasAccepted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.hasAccepted",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/acceptinvitation"})
      }
   """
)
                        

// @LINE:60
def editProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.editProject",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/editing"})
      }
   """
)
                        

// @LINE:87
def getReviewerIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getReviewerIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewerids"})
      }
   """
)
                        

// @LINE:57
def createProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.createProject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/create"})
      }
   """
)
                        

// @LINE:61
def archiveProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.archiveProject",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/archive"})
      }
   """
)
                        

// @LINE:84
def getProjectIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getProjectIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectids"})
      }
   """
)
                        

}
              

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSignup {


// @LINE:32
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:26
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signingup"})
      }
   """
)
                        

// @LINE:30
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:29
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:31
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:20
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/forgotpassword"})
      }
   """
)
                        

// @LINE:22
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/doresetpassword"})
      }
   """
)
                        

// @LINE:21
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/doforgotpassword"})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseTaskData {


// @LINE:11
def addTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.addTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "task/new"})
      }
   """
)
                        

// @LINE:13
def doneTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.doneTask",
   """
      function(tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/done/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid)})
      }
   """
)
                        

// @LINE:14
def undoTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.undoTask",
   """
      function(tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/undo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid)})
      }
   """
)
                        

// @LINE:12
def deleteTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.deleteTask",
   """
      function(tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid)})
      }
   """
)
                        

}
              

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseCalendarData {


// @LINE:47
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:43
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:48
def addByAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.addByAjax",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/event-ajax"})
      }
   """
)
                        

// @LINE:44
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:49
def move : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.move",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event-move"})
      }
   """
)
                        

// @LINE:41
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.list",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/events"})
      }
   """
)
                        

// @LINE:45
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event"})
      }
   """
)
                        

// @LINE:42
def json : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.json",
   """
      function(start,end) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events.json" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("start", start), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("end", end)])})
      }
   """
)
                        

// @LINE:46
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/new"})
      }
   """
)
                        

// @LINE:50
def resize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.resize",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event-resize"})
      }
   """
)
                        

// @LINE:40
def calendar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.calendar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar"})
      }
   """
)
                        

}
              

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseDocumentData {


// @LINE:71
def documentDiscussion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.documentDiscussion",
   """
      function(docId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/discuss/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("docId", docId)})
      }
   """
)
                        

// @LINE:72
def deleteDocument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.deleteDocument",
   """
      function(fileid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/delete/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("fileid", fileid)})
      }
   """
)
                        

// @LINE:70
def uploadNewTemplate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.uploadNewTemplate",
   """
      function(pid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/uploadNewTemplate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("pid", pid)])})
      }
   """
)
                        

// @LINE:69
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.upload",
   """
      function(pid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/upload" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("pid", pid)])})
      }
   """
)
                        

}
              

// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
class ReverseDiscussionData {


// @LINE:82
def getComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.getComments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
      }
   """
)
                        

// @LINE:81
def postExternalMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.postExternalMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postexternal"})
      }
   """
)
                        

// @LINE:80
def deleteMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.deleteMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletemessage"})
      }
   """
)
                        

// @LINE:78
def chatFeed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.chatFeed",
   """
      function(project) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatFeed/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("project", encodeURIComponent(project))})
      }
   """
)
                        

// @LINE:79
def postMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.postMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
      }
   """
)
                        

// @LINE:83
def getSubComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.getSubComments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subcomments"})
      }
   """
)
                        

// @LINE:76
def seen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.seen",
   """
      function(cid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discussion/seen/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("cid", cid)})
      }
   """
)
                        

// @LINE:77
def discussion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.discussion",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discussion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid)})
      }
   """
)
                        

}
              
}
        


// @LINE:104
// @LINE:103
// @LINE:99
// @LINE:98
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:99
// @LINE:98
class ReversePersonData {


// @LINE:98
def deleteAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonData.deleteAccount(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonData", "deleteAccount", Seq(), "GET", """User""", _prefix + """deleteaccount""")
)
                      

// @LINE:99
def postMendeleyDocument(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PersonData.postMendeleyDocument(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PersonData", "postMendeleyDocument", Seq(classOf[String]), "GET", """""", _prefix + """exportMendeleyDocument/$id<[^/]+>""")
)
                      

}
                          

// @LINE:103
class ReverseAssets {


// @LINE:103
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:25
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseAuthentication {


// @LINE:35
def OAuthLogout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.OAuthLogout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthLogout", Seq(), "GET", """OAuth2""", _prefix + """logout""")
)
                      

// @LINE:36
def OAuth(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.OAuth(provider), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuth", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

// @LINE:25
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "signup", Seq(), "GET", """signup""", _prefix + """signup""")
)
                      

// @LINE:19
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.doLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "doLogin", Seq(), "POST", """""", _prefix + """logingin""")
)
                      

// @LINE:18
def loginWithMessage(message:String, theme:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.loginWithMessage(message, theme), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "loginWithMessage", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """login/$theme<[^/]+>/$message<[^/]+>""")
)
                      

// @LINE:37
def OAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.OAuthDenied(provider), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:17
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Seq(), "GET", """login""", _prefix + """login""")
)
                      

}
                          

// @LINE:104
class ReverseWebJarAssets {


// @LINE:104
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      

}
                          

// @LINE:91
// @LINE:75
// @LINE:55
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def reroute(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reroute(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "reroute", Seq(), "GET", """""", _prefix + """redirect""")
)
                      

// @LINE:55
def project(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.project(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "project", Seq(), "GET", """project""", _prefix + """projects""")
)
                      

// @LINE:10
def task(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.task(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "task", Seq(), "GET", """task""", _prefix + """tasks""")
)
                      

// @LINE:91
def suggestions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.suggestions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "suggestions", Seq(), "GET", """Suggestions""", _prefix + """suggestions""")
)
                      

// @LINE:75
def discussion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.discussion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "discussion", Seq(), "GET", """discussion""", _prefix + """discussions""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
class ReverseProjectData {


// @LINE:86
def getOwnerIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getOwnerIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getOwnerIdsAsJson", Seq(), "GET", """""", _prefix + """ownerids""")
)
                      

// @LINE:58
def project(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.project(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "project", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>""")
)
                      

// @LINE:66
def removeMemberFromProject(uid:Long, pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.removeMemberFromProject(uid, pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "removeMemberFromProject", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/removemember/$uid<[^/]+>""")
)
                      

// @LINE:56
def createProjectPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.createProjectPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProjectPage", Seq(), "GET", """""", _prefix + """project/new""")
)
                      

// @LINE:65
def leaveProject(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.leaveProject(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "leaveProject", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/leave""")
)
                      

// @LINE:85
def getLastAccessedProjectIdAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getLastAccessedProjectIdAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getLastAccessedProjectIdAsJson", Seq(), "GET", """""", _prefix + """projectid""")
)
                      

// @LINE:59
def editProjectPage(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.editProjectPage(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProjectPage", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/edit""")
)
                      

// @LINE:62
def inviteMemberToProjectAs(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.inviteMemberToProjectAs(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "inviteMemberToProjectAs", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/addmember""")
)
                      

// @LINE:64
def hasDeclined(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.hasDeclined(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasDeclined", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/declineinvitation""")
)
                      

// @LINE:88
def getGuestIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getGuestIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getGuestIdsAsJson", Seq(), "GET", """""", _prefix + """guestids""")
)
                      

// @LINE:63
def hasAccepted(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.hasAccepted(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasAccepted", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/acceptinvitation""")
)
                      

// @LINE:60
def editProject(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.editProject(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProject", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/editing""")
)
                      

// @LINE:87
def getReviewerIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getReviewerIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getReviewerIdsAsJson", Seq(), "GET", """""", _prefix + """reviewerids""")
)
                      

// @LINE:57
def createProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.createProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProject", Seq(), "POST", """""", _prefix + """project/create""")
)
                      

// @LINE:61
def archiveProject(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.archiveProject(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "archiveProject", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/archive""")
)
                      

// @LINE:84
def getProjectIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getProjectIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getProjectIdsAsJson", Seq(), "GET", """""", _prefix + """projectids""")
)
                      

}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSignup {


// @LINE:32
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:26
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doSignup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doSignup", Seq(), "POST", """""", _prefix + """signingup""")
)
                      

// @LINE:30
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:29
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Seq(), "GET", """Local Login Account routes""", _prefix + """accounts/unverified""")
)
                      

// @LINE:31
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:20
def forgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Seq(), "GET", """""", _prefix + """login/forgotpassword""")
)
                      

// @LINE:22
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """login/doresetpassword""")
)
                      

// @LINE:21
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/doforgotpassword""")
)
                      

}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseTaskData {


// @LINE:11
def addTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.addTask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "addTask", Seq(), "POST", """""", _prefix + """task/new""")
)
                      

// @LINE:13
def doneTask(tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.doneTask(tid), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "doneTask", Seq(classOf[Long]), "GET", """""", _prefix + """task/done/$tid<[^/]+>""")
)
                      

// @LINE:14
def undoTask(tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.undoTask(tid), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "undoTask", Seq(classOf[Long]), "GET", """""", _prefix + """task/undo/$tid<[^/]+>""")
)
                      

// @LINE:12
def deleteTask(tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.deleteTask(tid), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "deleteTask", Seq(classOf[Long]), "GET", """""", _prefix + """task/delete/$tid<[^/]+>""")
)
                      

}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseCalendarData {


// @LINE:47
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """event/$id<[^/]+>/delete""")
)
                      

// @LINE:43
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """event/$id<[^/]+>/edit""")
)
                      

// @LINE:48
def addByAjax(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.addByAjax(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "addByAjax", Seq(classOf[Long]), "POST", """""", _prefix + """$id<[^/]+>/event-ajax""")
)
                      

// @LINE:44
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "update", Seq(classOf[Long]), "POST", """""", _prefix + """event/$id<[^/]+>/update""")
)
                      

// @LINE:49
def move(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.move(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "move", Seq(), "POST", """""", _prefix + """event-move""")
)
                      

// @LINE:41
def list(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.list(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "list", Seq(classOf[Long]), "GET", """""", _prefix + """$id<[^/]+>/events""")
)
                      

// @LINE:45
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.add(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "add", Seq(), "POST", """""", _prefix + """event""")
)
                      

// @LINE:42
def json(start:Long, end:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.json(start, end), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "json", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """events.json""")
)
                      

// @LINE:46
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.blank(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "blank", Seq(), "GET", """""", _prefix + """event/new""")
)
                      

// @LINE:50
def resize(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.resize(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "resize", Seq(), "POST", """""", _prefix + """event-resize""")
)
                      

// @LINE:40
def calendar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.calendar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "calendar", Seq(), "GET", """calendar""", _prefix + """calendar""")
)
                      

}
                          

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseDocumentData {


// @LINE:71
def documentDiscussion(docId:java.util.UUID): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.documentDiscussion(docId), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "documentDiscussion", Seq(classOf[java.util.UUID]), "GET", """""", _prefix + """project/discuss/$docId<[^/]+>""")
)
                      

// @LINE:72
def deleteDocument(fileid:java.util.UUID): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.deleteDocument(fileid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "deleteDocument", Seq(classOf[java.util.UUID]), "GET", """""", _prefix + """project/delete/$fileid<[^/]+>""")
)
                      

// @LINE:70
def uploadNewTemplate(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.uploadNewTemplate(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "uploadNewTemplate", Seq(classOf[Long]), "POST", """""", _prefix + """project/uploadNewTemplate""")
)
                      

// @LINE:69
def upload(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.upload(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "upload", Seq(classOf[Long]), "POST", """FILE Upload/Download""", _prefix + """project/upload""")
)
                      

}
                          

// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
class ReverseDiscussionData {


// @LINE:82
def getComments(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.getComments(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getComments", Seq(), "GET", """""", _prefix + """comments""")
)
                      

// @LINE:81
def postExternalMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.postExternalMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postExternalMessage", Seq(), "GET", """""", _prefix + """postexternal""")
)
                      

// @LINE:80
def deleteMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.deleteMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "deleteMessage", Seq(), "POST", """""", _prefix + """deletemessage""")
)
                      

// @LINE:78
def chatFeed(project:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.chatFeed(project), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "chatFeed", Seq(classOf[String]), "GET", """""", _prefix + """chatFeed/$project<[^/]+>""")
)
                      

// @LINE:79
def postMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.postMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postMessage", Seq(), "POST", """""", _prefix + """chat""")
)
                      

// @LINE:83
def getSubComments(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.getSubComments(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getSubComments", Seq(), "GET", """""", _prefix + """subcomments""")
)
                      

// @LINE:76
def seen(cid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.seen(cid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "seen", Seq(classOf[Long]), "GET", """""", _prefix + """discussion/seen/$cid<[^/]+>""")
)
                      

// @LINE:77
def discussion(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.discussion(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "discussion", Seq(classOf[Long]), "GET", """""", _prefix + """discussion/$pid<[^/]+>""")
)
                      

}
                          
}
        
    