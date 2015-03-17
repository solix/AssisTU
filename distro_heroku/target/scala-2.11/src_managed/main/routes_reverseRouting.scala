// @SOURCE:/Users/soheil/Documents/git/asistu/conf/routes
// @HASH:60cacd7f6e201d131aae07238bc66d4e9d92fd91
// @DATE:Tue Feb 17 22:25:10 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:108
// @LINE:107
// @LINE:100
// @LINE:95
// @LINE:94
// @LINE:91
// @LINE:90
// @LINE:89
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
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
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
// @LINE:51
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
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:107
class ReverseAssets {


// @LINE:107
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:26
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseAuthentication {


// @LINE:36
def OAuthLogout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:37
def OAuth(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                        

// @LINE:26
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:20
def doLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logingin")
}
                        

// @LINE:38
def OAuthDenied(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                        

// @LINE:19
def relogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:18
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:108
class ReverseWebJarAssets {


// @LINE:108
def at(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:100
class ReverseEmailer {


// @LINE:100
def sendWelcomeMessage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "send/email")
}
                        

}
                          

// @LINE:95
class ReverseSuggestionData {


// @LINE:95
def suggestion(subject:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestions/" + implicitly[PathBindable[String]].unbind("subject", dynamicString(subject)))
}
                        

}
                          

// @LINE:94
// @LINE:79
// @LINE:56
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def reroute(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "redirect")
}
                        

// @LINE:56
def project(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project")
}
                        

// @LINE:10
def task(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                        

// @LINE:94
def suggestions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestions")
}
                        

// @LINE:79
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
                          

// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:67
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
class ReverseProjectData {


// @LINE:89
def getOwnerIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ownerids")
}
                        

// @LINE:59
def project(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid))
}
                        

// @LINE:67
def removeMemberFromProject(uid:Long, pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/removeMember/" + implicitly[PathBindable[Long]].unbind("uid", uid))
}
                        

// @LINE:57
def createProjectPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/new")
}
                        

// @LINE:66
def leaveProject(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/leave")
}
                        

// @LINE:88
def getLastAccessedProjectIdAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "projectid")
}
                        

// @LINE:60
def editProjectPage(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/edit")
}
                        

// @LINE:63
def inviteMemberToProjectAs(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/addMember")
}
                        

// @LINE:65
def hasDeclined(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/declineinvitation")
}
                        

// @LINE:91
def getGuestIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "guestids")
}
                        

// @LINE:64
def hasAccepted(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/acceptinvitation")
}
                        

// @LINE:61
def editProject(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/editing")
}
                        

// @LINE:90
def getReviewerIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reviewerids")
}
                        

// @LINE:58
def createProject(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "project/create")
}
                        

// @LINE:62
def archiveProject(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/archive")
}
                        

// @LINE:87
def getProjectIdsAsJson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "projectids")
}
                        

}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseSignup {


// @LINE:33
def exists(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                        

// @LINE:27
def doSignup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signingup")
}
                        

// @LINE:31
def verify(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:30
def unverified(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                        

// @LINE:32
def resetPassword(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:21
def forgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login/forgotpassword")
}
                        

// @LINE:23
def doResetPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/doresetpassword")
}
                        

// @LINE:22
def doForgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/doforgotpassword")
}
                        

}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
class ReverseTaskData {


// @LINE:11
def addTask(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "task/new")
}
                        

// @LINE:14
def doneTask(tid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "task/done/" + implicitly[PathBindable[Long]].unbind("tid", tid))
}
                        

// @LINE:15
def undoTask(tid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "task/undo/" + implicitly[PathBindable[Long]].unbind("tid", tid))
}
                        

// @LINE:13
def deleteTask(tid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "task/delete/" + implicitly[PathBindable[Long]].unbind("tid", tid))
}
                        

}
                          

// @LINE:51
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
class ReverseCalendarData {


// @LINE:48
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:44
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                        

// @LINE:49
def addByAjax(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + implicitly[PathBindable[Long]].unbind("id", id) + "/event-ajax")
}
                        

// @LINE:45
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                        

// @LINE:50
def move(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event-move")
}
                        

// @LINE:42
def list(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[Long]].unbind("id", id) + "/events")
}
                        

// @LINE:46
def add(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event")
}
                        

// @LINE:43
def json(start:Long, end:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "events.json" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("start", start)), Some(implicitly[QueryStringBindable[Long]].unbind("end", end)))))
}
                        

// @LINE:47
def blank(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/new")
}
                        

// @LINE:51
def resize(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event-resize")
}
                        

// @LINE:41
def calendar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "calendar")
}
                        

}
                          

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
class ReverseDocumentData {


// @LINE:70
def documentDiscussion(docId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/discuss/" + implicitly[PathBindable[Long]].unbind("docId", docId))
}
                        

// @LINE:73
def downloadTemplate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/downloadTemplate")
}
                        

// @LINE:71
def downloadDocument(fileid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/download/" + implicitly[PathBindable[Long]].unbind("fileid", fileid))
}
                        

// @LINE:68
def uploadDocument(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "project/upload" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("pid", pid)))))
}
                        

// @LINE:72
def deleteDocument(fileid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/delete/" + implicitly[PathBindable[Long]].unbind("fileid", fileid))
}
                        

// @LINE:74
def downloadOwnTemplate(fileid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/downloadownTemplate/" + implicitly[PathBindable[Long]].unbind("fileid", fileid))
}
                        

// @LINE:69
def uploadNewTemplate(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "project/uploadNewTemplate" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("pid", pid)))))
}
                        

}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
class ReverseDiscussionData {


// @LINE:85
def getComments(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "comments")
}
                        

// @LINE:84
def postExternalMessage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "postexternal")
}
                        

// @LINE:83
def deleteMessage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deletemessage")
}
                        

// @LINE:81
def chatFeed(project:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "chatFeed/" + implicitly[PathBindable[String]].unbind("project", dynamicString(project)))
}
                        

// @LINE:82
def postMessage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "chat")
}
                        

// @LINE:86
def getSubComments(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "subcomments")
}
                        

// @LINE:80
def discussion(pid:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "project/" + implicitly[PathBindable[Long]].unbind("pid", pid) + "/discussion")
}
                        

}
                          
}
                  


// @LINE:108
// @LINE:107
// @LINE:100
// @LINE:95
// @LINE:94
// @LINE:91
// @LINE:90
// @LINE:89
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
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
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
// @LINE:51
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
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:107
class ReverseAssets {


// @LINE:107
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:26
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseAuthentication {


// @LINE:36
def OAuthLogout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.OAuthLogout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:37
def OAuth : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.OAuth",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:26
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:20
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logingin"})
      }
   """
)
                        

// @LINE:38
def OAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.OAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:19
def relogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.relogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:18
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:108
class ReverseWebJarAssets {


// @LINE:108
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:100
class ReverseEmailer {


// @LINE:100
def sendWelcomeMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Emailer.sendWelcomeMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "send/email"})
      }
   """
)
                        

}
              

// @LINE:95
class ReverseSuggestionData {


// @LINE:95
def suggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionData.suggestion",
   """
      function(subject) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestions/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subject", encodeURIComponent(subject))})
      }
   """
)
                        

}
              

// @LINE:94
// @LINE:79
// @LINE:56
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
                        

// @LINE:56
def project : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.project",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project"})
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
                        

// @LINE:94
def suggestions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.suggestions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestions"})
      }
   """
)
                        

// @LINE:79
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
              

// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:67
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
class ReverseProjectData {


// @LINE:89
def getOwnerIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getOwnerIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ownerids"})
      }
   """
)
                        

// @LINE:59
def project : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.project",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid)})
      }
   """
)
                        

// @LINE:67
def removeMemberFromProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.removeMemberFromProject",
   """
      function(uid,pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/removeMember/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uid", uid)})
      }
   """
)
                        

// @LINE:57
def createProjectPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.createProjectPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/new"})
      }
   """
)
                        

// @LINE:66
def leaveProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.leaveProject",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/leave"})
      }
   """
)
                        

// @LINE:88
def getLastAccessedProjectIdAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getLastAccessedProjectIdAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectid"})
      }
   """
)
                        

// @LINE:60
def editProjectPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.editProjectPage",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/edit"})
      }
   """
)
                        

// @LINE:63
def inviteMemberToProjectAs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.inviteMemberToProjectAs",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/addMember"})
      }
   """
)
                        

// @LINE:65
def hasDeclined : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.hasDeclined",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/declineinvitation"})
      }
   """
)
                        

// @LINE:91
def getGuestIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getGuestIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "guestids"})
      }
   """
)
                        

// @LINE:64
def hasAccepted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.hasAccepted",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/acceptinvitation"})
      }
   """
)
                        

// @LINE:61
def editProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.editProject",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/editing"})
      }
   """
)
                        

// @LINE:90
def getReviewerIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getReviewerIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewerids"})
      }
   """
)
                        

// @LINE:58
def createProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.createProject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/create"})
      }
   """
)
                        

// @LINE:62
def archiveProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.archiveProject",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/archive"})
      }
   """
)
                        

// @LINE:87
def getProjectIdsAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectData.getProjectIdsAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectids"})
      }
   """
)
                        

}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseSignup {


// @LINE:33
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:27
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signingup"})
      }
   """
)
                        

// @LINE:31
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:30
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:32
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:21
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/forgotpassword"})
      }
   """
)
                        

// @LINE:23
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/doresetpassword"})
      }
   """
)
                        

// @LINE:22
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/doforgotpassword"})
      }
   """
)
                        

}
              

// @LINE:15
// @LINE:14
// @LINE:13
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
                        

// @LINE:14
def doneTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.doneTask",
   """
      function(tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/done/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid)})
      }
   """
)
                        

// @LINE:15
def undoTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.undoTask",
   """
      function(tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/undo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid)})
      }
   """
)
                        

// @LINE:13
def deleteTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TaskData.deleteTask",
   """
      function(tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid)})
      }
   """
)
                        

}
              

// @LINE:51
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
class ReverseCalendarData {


// @LINE:48
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:44
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:49
def addByAjax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.addByAjax",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/event-ajax"})
      }
   """
)
                        

// @LINE:45
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                        

// @LINE:50
def move : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.move",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event-move"})
      }
   """
)
                        

// @LINE:42
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.list",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/events"})
      }
   """
)
                        

// @LINE:46
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event"})
      }
   """
)
                        

// @LINE:43
def json : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.json",
   """
      function(start,end) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events.json" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("start", start), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("end", end)])})
      }
   """
)
                        

// @LINE:47
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/new"})
      }
   """
)
                        

// @LINE:51
def resize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.resize",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event-resize"})
      }
   """
)
                        

// @LINE:41
def calendar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CalendarData.calendar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar"})
      }
   """
)
                        

}
              

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
class ReverseDocumentData {


// @LINE:70
def documentDiscussion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.documentDiscussion",
   """
      function(docId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/discuss/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("docId", docId)})
      }
   """
)
                        

// @LINE:73
def downloadTemplate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.downloadTemplate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/downloadTemplate"})
      }
   """
)
                        

// @LINE:71
def downloadDocument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.downloadDocument",
   """
      function(fileid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/download/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fileid", fileid)})
      }
   """
)
                        

// @LINE:68
def uploadDocument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.uploadDocument",
   """
      function(pid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/upload" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("pid", pid)])})
      }
   """
)
                        

// @LINE:72
def deleteDocument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.deleteDocument",
   """
      function(fileid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fileid", fileid)})
      }
   """
)
                        

// @LINE:74
def downloadOwnTemplate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.downloadOwnTemplate",
   """
      function(fileid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/downloadownTemplate/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fileid", fileid)})
      }
   """
)
                        

// @LINE:69
def uploadNewTemplate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DocumentData.uploadNewTemplate",
   """
      function(pid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/uploadNewTemplate" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("pid", pid)])})
      }
   """
)
                        

}
              

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
class ReverseDiscussionData {


// @LINE:85
def getComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.getComments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
      }
   """
)
                        

// @LINE:84
def postExternalMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.postExternalMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postexternal"})
      }
   """
)
                        

// @LINE:83
def deleteMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.deleteMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletemessage"})
      }
   """
)
                        

// @LINE:81
def chatFeed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.chatFeed",
   """
      function(project) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatFeed/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("project", encodeURIComponent(project))})
      }
   """
)
                        

// @LINE:82
def postMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.postMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
      }
   """
)
                        

// @LINE:86
def getSubComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.getSubComments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subcomments"})
      }
   """
)
                        

// @LINE:80
def discussion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiscussionData.discussion",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid) + "/discussion"})
      }
   """
)
                        

}
              
}
        


// @LINE:108
// @LINE:107
// @LINE:100
// @LINE:95
// @LINE:94
// @LINE:91
// @LINE:90
// @LINE:89
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
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
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
// @LINE:51
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
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:107
class ReverseAssets {


// @LINE:107
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:26
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseAuthentication {


// @LINE:36
def OAuthLogout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.OAuthLogout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthLogout", Seq(), "GET", """OAuth2""", _prefix + """logout""")
)
                      

// @LINE:37
def OAuth(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.OAuth(provider), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuth", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

// @LINE:26
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "signup", Seq(), "GET", """signup""", _prefix + """signup""")
)
                      

// @LINE:20
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.doLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "doLogin", Seq(), "POST", """""", _prefix + """logingin""")
)
                      

// @LINE:38
def OAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.OAuthDenied(provider), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "OAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:19
def relogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.relogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "relogin", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:18
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Seq(), "GET", """login""", _prefix + """login""")
)
                      

}
                          

// @LINE:108
class ReverseWebJarAssets {


// @LINE:108
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      

}
                          

// @LINE:100
class ReverseEmailer {


// @LINE:100
def sendWelcomeMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Emailer.sendWelcomeMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Emailer", "sendWelcomeMessage", Seq(), "GET", """Email""", _prefix + """send/email""")
)
                      

}
                          

// @LINE:95
class ReverseSuggestionData {


// @LINE:95
def suggestion(subject:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SuggestionData.suggestion(subject), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionData", "suggestion", Seq(classOf[String]), "GET", """""", _prefix + """suggestions/$subject<[^/]+>""")
)
                      

}
                          

// @LINE:94
// @LINE:79
// @LINE:56
// @LINE:10
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def reroute(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reroute(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "reroute", Seq(), "GET", """""", _prefix + """redirect""")
)
                      

// @LINE:56
def project(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.project(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "project", Seq(), "GET", """project""", _prefix + """project""")
)
                      

// @LINE:10
def task(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.task(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "task", Seq(), "GET", """task""", _prefix + """tasks""")
)
                      

// @LINE:94
def suggestions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.suggestions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "suggestions", Seq(), "GET", """Suggestions""", _prefix + """suggestions""")
)
                      

// @LINE:79
def discussion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.discussion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "discussion", Seq(), "GET", """discussion""", _prefix + """discussions""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:67
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
class ReverseProjectData {


// @LINE:89
def getOwnerIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getOwnerIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getOwnerIdsAsJson", Seq(), "GET", """""", _prefix + """ownerids""")
)
                      

// @LINE:59
def project(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.project(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "project", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>""")
)
                      

// @LINE:67
def removeMemberFromProject(uid:Long, pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.removeMemberFromProject(uid, pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "removeMemberFromProject", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/removeMember/$uid<[^/]+>""")
)
                      

// @LINE:57
def createProjectPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.createProjectPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProjectPage", Seq(), "GET", """""", _prefix + """project/new""")
)
                      

// @LINE:66
def leaveProject(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.leaveProject(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "leaveProject", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/leave""")
)
                      

// @LINE:88
def getLastAccessedProjectIdAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getLastAccessedProjectIdAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getLastAccessedProjectIdAsJson", Seq(), "GET", """""", _prefix + """projectid""")
)
                      

// @LINE:60
def editProjectPage(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.editProjectPage(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProjectPage", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/edit""")
)
                      

// @LINE:63
def inviteMemberToProjectAs(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.inviteMemberToProjectAs(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "inviteMemberToProjectAs", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/addMember""")
)
                      

// @LINE:65
def hasDeclined(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.hasDeclined(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasDeclined", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/declineinvitation""")
)
                      

// @LINE:91
def getGuestIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getGuestIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getGuestIdsAsJson", Seq(), "GET", """""", _prefix + """guestids""")
)
                      

// @LINE:64
def hasAccepted(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.hasAccepted(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "hasAccepted", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/acceptinvitation""")
)
                      

// @LINE:61
def editProject(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.editProject(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "editProject", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/editing""")
)
                      

// @LINE:90
def getReviewerIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getReviewerIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getReviewerIdsAsJson", Seq(), "GET", """""", _prefix + """reviewerids""")
)
                      

// @LINE:58
def createProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.createProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "createProject", Seq(), "POST", """""", _prefix + """project/create""")
)
                      

// @LINE:62
def archiveProject(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.archiveProject(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "archiveProject", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/archive""")
)
                      

// @LINE:87
def getProjectIdsAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectData.getProjectIdsAsJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectData", "getProjectIdsAsJson", Seq(), "GET", """""", _prefix + """projectids""")
)
                      

}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseSignup {


// @LINE:33
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:27
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doSignup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doSignup", Seq(), "POST", """""", _prefix + """signingup""")
)
                      

// @LINE:31
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:30
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Seq(), "GET", """Local Login Account routes""", _prefix + """accounts/unverified""")
)
                      

// @LINE:32
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:21
def forgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Seq(), "GET", """""", _prefix + """login/forgotpassword""")
)
                      

// @LINE:23
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """login/doresetpassword""")
)
                      

// @LINE:22
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/doforgotpassword""")
)
                      

}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
class ReverseTaskData {


// @LINE:11
def addTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.addTask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "addTask", Seq(), "POST", """""", _prefix + """task/new""")
)
                      

// @LINE:14
def doneTask(tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.doneTask(tid), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "doneTask", Seq(classOf[Long]), "GET", """""", _prefix + """task/done/$tid<[^/]+>""")
)
                      

// @LINE:15
def undoTask(tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.undoTask(tid), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "undoTask", Seq(classOf[Long]), "GET", """""", _prefix + """task/undo/$tid<[^/]+>""")
)
                      

// @LINE:13
def deleteTask(tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TaskData.deleteTask(tid), HandlerDef(this.getClass.getClassLoader, "", "controllers.TaskData", "deleteTask", Seq(classOf[Long]), "GET", """GET         /task/get                                   controllers.TaskData.getTasks()""", _prefix + """task/delete/$tid<[^/]+>""")
)
                      

}
                          

// @LINE:51
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
class ReverseCalendarData {


// @LINE:48
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """event/$id<[^/]+>/delete""")
)
                      

// @LINE:44
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """event/$id<[^/]+>/edit""")
)
                      

// @LINE:49
def addByAjax(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.addByAjax(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "addByAjax", Seq(classOf[Long]), "POST", """""", _prefix + """$id<[^/]+>/event-ajax""")
)
                      

// @LINE:45
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "update", Seq(classOf[Long]), "POST", """""", _prefix + """event/$id<[^/]+>/update""")
)
                      

// @LINE:50
def move(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.move(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "move", Seq(), "POST", """""", _prefix + """event-move""")
)
                      

// @LINE:42
def list(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.list(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "list", Seq(classOf[Long]), "GET", """""", _prefix + """$id<[^/]+>/events""")
)
                      

// @LINE:46
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.add(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "add", Seq(), "POST", """""", _prefix + """event""")
)
                      

// @LINE:43
def json(start:Long, end:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.json(start, end), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "json", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """events.json""")
)
                      

// @LINE:47
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.blank(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "blank", Seq(), "GET", """""", _prefix + """event/new""")
)
                      

// @LINE:51
def resize(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.resize(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "resize", Seq(), "POST", """""", _prefix + """event-resize""")
)
                      

// @LINE:41
def calendar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CalendarData.calendar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CalendarData", "calendar", Seq(), "GET", """calendar""", _prefix + """calendar""")
)
                      

}
                          

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
class ReverseDocumentData {


// @LINE:70
def documentDiscussion(docId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.documentDiscussion(docId), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "documentDiscussion", Seq(classOf[Long]), "GET", """""", _prefix + """project/discuss/$docId<[^/]+>""")
)
                      

// @LINE:73
def downloadTemplate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.downloadTemplate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "downloadTemplate", Seq(), "GET", """""", _prefix + """project/downloadTemplate""")
)
                      

// @LINE:71
def downloadDocument(fileid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.downloadDocument(fileid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "downloadDocument", Seq(classOf[Long]), "GET", """""", _prefix + """project/download/$fileid<[^/]+>""")
)
                      

// @LINE:68
def uploadDocument(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.uploadDocument(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "uploadDocument", Seq(classOf[Long]), "POST", """""", _prefix + """project/upload""")
)
                      

// @LINE:72
def deleteDocument(fileid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.deleteDocument(fileid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "deleteDocument", Seq(classOf[Long]), "GET", """""", _prefix + """project/delete/$fileid<[^/]+>""")
)
                      

// @LINE:74
def downloadOwnTemplate(fileid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.downloadOwnTemplate(fileid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "downloadOwnTemplate", Seq(classOf[Long]), "GET", """""", _prefix + """project/downloadownTemplate/$fileid<[^/]+>""")
)
                      

// @LINE:69
def uploadNewTemplate(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DocumentData.uploadNewTemplate(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DocumentData", "uploadNewTemplate", Seq(classOf[Long]), "POST", """""", _prefix + """project/uploadNewTemplate""")
)
                      

}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
class ReverseDiscussionData {


// @LINE:85
def getComments(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.getComments(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getComments", Seq(), "GET", """""", _prefix + """comments""")
)
                      

// @LINE:84
def postExternalMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.postExternalMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postExternalMessage", Seq(), "GET", """""", _prefix + """postexternal""")
)
                      

// @LINE:83
def deleteMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.deleteMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "deleteMessage", Seq(), "POST", """""", _prefix + """deletemessage""")
)
                      

// @LINE:81
def chatFeed(project:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.chatFeed(project), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "chatFeed", Seq(classOf[String]), "GET", """""", _prefix + """chatFeed/$project<[^/]+>""")
)
                      

// @LINE:82
def postMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.postMessage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "postMessage", Seq(), "POST", """""", _prefix + """chat""")
)
                      

// @LINE:86
def getSubComments(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.getSubComments(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "getSubComments", Seq(), "GET", """""", _prefix + """subcomments""")
)
                      

// @LINE:80
def discussion(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiscussionData.discussion(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.DiscussionData", "discussion", Seq(classOf[Long]), "GET", """""", _prefix + """project/$pid<[^/]+>/discussion""")
)
                      

}
                          
}
        
    