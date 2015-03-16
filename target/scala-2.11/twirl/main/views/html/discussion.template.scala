
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object discussion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person)(project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""
    """),_display_(/*2.6*/defining(PersonData.findActiveProjects())/*2.47*/ { activeProjectList =>_display_(Seq[Any](format.raw/*2.70*/("""
        """),format.raw/*3.9*/("""<html lang="en">
            <head>
                """),_display_(/*5.18*/linkLoader/*5.28*/.headlinks(title)),format.raw/*5.45*/("""
                """),format.raw/*6.17*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*6.63*/routes/*6.69*/.Assets.at("css/message.css")),format.raw/*6.98*/("""">
                <link rel="stylesheet" type="text/css" href=""""),_display_(/*7.63*/routes/*7.69*/.Assets.at("css/discussions.css")),format.raw/*7.102*/("""">

                <!-- jQuery -->
                <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

                <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.11/angular.min.js"></script>
                <script type="text/javascript" src=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("javascripts/discussions/app.js")),format.raw/*13.104*/(""""></script>
                <script type="text/javascript" src=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("javascripts/discussions/controller.js")),format.raw/*14.111*/(""""></script>
            </head>
            <body>
                <div id="wrapper">
                    """),_display_(/*18.22*/dashboard("discussion", currentUser)),format.raw/*18.58*/("""
                    """),format.raw/*19.21*/("""<div id="page-wrapper">
                        """),_display_(/*20.26*/template/*20.34*/.headericon("fa fa-comments fa-5x")),format.raw/*20.69*/("""
                        """),format.raw/*21.25*/("""<div ng-app="sseChat">
                            <div ng-controller="ChatCtrl">
                                <div class="container-fluid" style="text-align: center; margin: 0 0 1% 0">
                                    <div role="tabpanel">
                                        <ul class="nav nav-tabs">
                                            """),_display_(/*26.46*/for(p <- activeProjectList) yield /*26.73*/ {_display_(Seq[Any](format.raw/*26.75*/("""
                                                """),format.raw/*27.49*/("""<li role="presentation" """),_display_(/*27.74*/if(p.id == project.id)/*27.96*/{_display_(Seq[Any](format.raw/*27.97*/("""class="active"""")))}),format.raw/*27.112*/(""" """),format.raw/*27.113*/("""style="width: 18%; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                                                    <a ng-click="setCurrentProject('"""),_display_(/*28.86*/p/*28.87*/.id),format.raw/*28.90*/("""')" href="#discussion"""),_display_(/*28.112*/p/*28.113*/.id),format.raw/*28.116*/("""" data-toggle="tab">"""),_display_(/*28.137*/p/*28.138*/.folder),format.raw/*28.145*/("""</a>
                                                </li>
                                            """)))}),format.raw/*30.46*/("""
                                        """),format.raw/*31.41*/("""</ul>
                                    </div>
                                </div>
                                """),_display_(/*34.34*/if(project == null)/*34.53*/{_display_(Seq[Any](format.raw/*34.54*/("""
                                    """),format.raw/*35.37*/("""<div class="row">
                                        <div class="col-lg-4 col-lg-offset-4">
                                            <div class="alert alert-success" role="alert" style="text-align: center; margin-top: 150px">
                                                <p>You need to be part of a project before you can discuss</p>
                                                <br>
                                                <div class="btn-group" role="group">
                                                    <a style="width: 175px" type="button" class="btn btn-success"  href=""""),_display_(/*41.123*/routes/*41.129*/.ProjectData.createProjectPage()),format.raw/*41.161*/("""">Create a new project</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                """)))}),format.raw/*46.34*/("""
                                """),format.raw/*47.33*/("""<div class="tab-content">
                                    """),_display_(/*48.38*/for(p <- activeProjectList) yield /*48.65*/{_display_(Seq[Any](format.raw/*48.66*/("""
                                        """),format.raw/*49.41*/("""<div class="tab-pane fade """),_display_(/*49.68*/if(p.id == project.id)/*49.90*/{_display_(Seq[Any](format.raw/*49.91*/("""active in""")))}),format.raw/*49.101*/("""" id="discussion"""),_display_(/*49.118*/p/*49.119*/.id),format.raw/*49.122*/("""">
                                            <div class="row">
                                                <div class="col-xs-10">
                                                    <p style="font-size: 15pt; margin: 5px 0 0 30px;"><a href=""""),_display_(/*52.113*/routes/*52.119*/.ProjectData.project(p.id)),format.raw/*52.145*/("""">"""),_display_(/*52.148*/p/*52.149*/.name),format.raw/*52.154*/("""</a></p>
                                                </div>
                                                <div class="col-xs-2">
                                                    <button ng-click="setCurrentSubjectAndisChild('', false);" class="btn btn-success pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*55.192*/p/*55.193*/.id),format.raw/*55.196*/("""" style="margin: 0; margin-right: 30px;">Post new Message</button>
                                                </div>
                                            </div>
                                            <hr class="hr" style="margin: 15px 15px 0">
                                            <div id="comment"""),_display_(/*59.62*/p/*59.63*/.id),format.raw/*59.66*/("""" class="panel-footer collapse" style="margin: -1px -30px 0; padding: 15px 50px 40px; border-bottom: 1px solid #DDDDDD">
                                                <div class="row" style="text-align: center">
                                                    <button type="button" class="close pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*61.145*/p/*61.146*/.id),format.raw/*61.149*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                    <h3 style="padding: 0; margin: 0">Post a new Message</h3>
                                                </div>
                                                <ul class="message" style="padding: 10px 50px 0 10px; margin: 0;">
                                                    <li>
                                                        """),_display_(/*66.58*/defining(Role.find.where().eq("project",p).eq("person",currentUser).findUnique().role)/*66.144*/ { role =>_display_(Seq[Any](format.raw/*66.154*/("""
                                                            """),_display_(/*67.62*/if(role.equals(Role.OWNER))/*67.89*/{_display_(Seq[Any](format.raw/*67.90*/("""
                                                                """),format.raw/*68.65*/("""<div class="message-badge primary">
                                                                    <i class="fa fa-mortar-board" style="margin-top: 15px"></i>
                                                                </div>
                                                            """)))}),format.raw/*71.62*/("""
                                                            """),_display_(/*72.62*/if(role.equals(Role.REVIEWER))/*72.92*/{_display_(Seq[Any](format.raw/*72.93*/("""
                                                                """),format.raw/*73.65*/("""<div class="message-badge danger">
                                                                    <i class="fa fa-edit" style="margin-left: 4px; margin-top: 15px"></i>
                                                                </div>
                                                            """)))}),format.raw/*76.62*/("""
                                                            """),_display_(/*77.62*/if(role.equals(Role.GUEST))/*77.89*/{_display_(Seq[Any](format.raw/*77.90*/("""
                                                                """),format.raw/*78.65*/("""<div class="message-badge info">
                                                                    <i class="fa fa-suitcase" style="margin-left: 4px; margin-top: 15px"></i>
                                                                </div>
                                                            """)))}),format.raw/*81.62*/("""
                                                        """)))}),format.raw/*82.58*/("""
                                                        """),format.raw/*83.57*/("""<div class="message-panel" style="margin-left: 40px; background-color: white">
                                                            <div class="message-heading">
                                                                <input type="text" name="subject" ng-model="message.subject"
                                                                placeholder="Your subject here..." class="ng-pristine ng-valid form-control input-sm">
                                                                <hr class="hr" style="margin: 15px 0 10px">
                                                                <textarea type="text" class="ng-pristine ng-valid form-control input-sm" name="content" rows="5"
                                                                placeholder="Your message here..." ng-model="message.content"></textarea>
                                                            </div>
                                                        </div>
                                                    </li>
                                                </ul>
                                                <div class="row pull-right" style="padding: 0 50px 0 0;margin: 0">
                                                    <button ng-click="reset();" class="btn btn-default btn-sm"
                                                    data-toggle="collapse" data-target="#comment"""),_display_(/*96.98*/p/*96.99*/.id),format.raw/*96.102*/("""" type="button" style="width: 80px">Cancel</button>
                                                    <button type="button" class="btn btn-warning btn-sm" style="width: 80px" ng-if="message.subject == '' || message.content == ''"
                                                    id="saySomething">Submit</button>
                                                    <button type="button" class="btn btn-warning btn-sm" style="width: 80px" ng-if="message.subject != '' && message.content != ''"
                                                    id="saySomething" data-toggle="collapse" data-target="#comment"""),_display_(/*100.116*/p/*100.117*/.id),format.raw/*100.120*/("""" ng-click="submitMsg()">Submit</button>
                                                </div>
                                            </div>
                                            <div class="panel-body" style="padding: 0">
                                                <ul class="timeline" style="margin-right: 30px; margin-bottom: 0; height: 80%">
                                                    <li class=""""),format.raw/*105.64*/("""{"""),format.raw/*105.65*/("""{"""),format.raw/*105.66*/("""comment.who"""),format.raw/*105.77*/("""}"""),format.raw/*105.78*/("""}"""),format.raw/*105.79*/(""" """),format.raw/*105.80*/("""comment" ng-repeat="comment in comments | filter:"""),format.raw/*105.129*/("""{"""),format.raw/*105.130*/("""projectID: """),_display_(/*105.142*/p/*105.143*/.id),format.raw/*105.146*/("""}"""),format.raw/*105.147*/("""">
                                                        <div class="timeline-badge primary" ng-if="comment.role=='Owner'">
                                                            <i class="fa fa-mortar-board" style="margin-top: 15px"></i>
                                                        </div>
                                                        <div class="timeline-badge danger" ng-if="comment.role=='Reviewer'">
                                                            <i class="fa fa-edit" style="margin-left: 4px; margin-top: 15px"></i>
                                                        </div>
                                                        <div class="timeline-badge info" ng-if="comment.role=='Guest'">
                                                            <i class="fa fa-suitcase" style="margin-top: 15px"></i>
                                                        </div>
                                                        <div class="timeline-panel">   """),format.raw/*115.169*/("""
                                                            """),format.raw/*116.61*/("""<div class="timeline-heading">
                                                                """),_display_(/*117.66*/if(ProjectData.findAllOwners(p.id).contains(currentUser))/*117.123*/ {_display_(Seq[Any](format.raw/*117.125*/("""
                                                                    """),format.raw/*118.69*/("""<a class="pull-right" href="#" ng-if="comment.role == 'Guest' || comment.uid == """),_display_(/*118.150*/currentUser/*118.161*/.id),format.raw/*118.164*/(""""
                                                                    style="color : red ; font-size : large ; padding : 8px 8px 0 20px" ng-click="deleteMsg(comment)">
                                                                        <i class="fa fa-close"></i>
                                                                    </a>
                                                                """)))}/*122.67*/else/*122.72*/{_display_(Seq[Any](format.raw/*122.73*/("""
                                                                    """),format.raw/*123.69*/("""<a class="pull-right" href="#" ng-if="comment.uid == """),_display_(/*123.123*/currentUser/*123.134*/.id),format.raw/*123.137*/(""""
                                                                    style="color : red ; font-size : large ; padding : 8px 8px 0 20px" ng-click="deleteMsg(comment)">
                                                                        <i class="fa fa-close"></i>
                                                                    </a>
                                                                """)))}),format.raw/*127.66*/("""
                                                                """),format.raw/*128.65*/("""<a class="btn btn-info pull-right" data-toggle="collapse" href="#showSubCommentsOf"""),format.raw/*128.147*/("""{"""),format.raw/*128.148*/("""{"""),format.raw/*128.149*/("""comment.cid"""),format.raw/*128.160*/("""}"""),format.raw/*128.161*/("""}"""),format.raw/*128.162*/("""" aria-expanded="false" aria-controls="collapseExample">
                                                                    Show/Hide
                                                                </a>
                                                                <h4 class="timeline-title" style="margin-left: 10px; margin-bottom: 0">
                                                                    <u>"""),format.raw/*132.72*/("""{"""),format.raw/*132.73*/("""{"""),format.raw/*132.74*/("""comment.subject"""),format.raw/*132.89*/("""}"""),format.raw/*132.90*/("""}"""),format.raw/*132.91*/("""</u>
                                                                    <br>
                                                                    <p ng-if="!comment.hasAttachment" style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*134.169*/("""{"""),format.raw/*134.170*/("""{"""),format.raw/*134.171*/("""comment.username"""),format.raw/*134.187*/("""}"""),format.raw/*134.188*/("""}"""),format.raw/*134.189*/(""")</p>
                                                                    <p ng-if="comment.hasAttachment" style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*135.168*/("""{"""),format.raw/*135.169*/("""{"""),format.raw/*135.170*/("""comment.username"""),format.raw/*135.186*/("""}"""),format.raw/*135.187*/("""}"""),format.raw/*135.188*/(""", about <a href=""""),_display_(/*135.206*/routes/*135.212*/.ProjectData.project(p.id)),format.raw/*135.238*/("""">"""),format.raw/*135.240*/("""{"""),format.raw/*135.241*/("""{"""),format.raw/*135.242*/("""comment.attachment"""),format.raw/*135.260*/("""}"""),format.raw/*135.261*/("""}"""),format.raw/*135.262*/("""</a>)</p>
                                                                </h4>
                                                            </div>
                                                            <div class="collapse" id="showSubCommentsOf"""),format.raw/*138.104*/("""{"""),format.raw/*138.105*/("""{"""),format.raw/*138.106*/("""comment.cid"""),format.raw/*138.117*/("""}"""),format.raw/*138.118*/("""}"""),format.raw/*138.119*/("""">
                                                                <hr class="hr" style="margin: 15px 0 10px">
                                                                <div class="container-fluid" style="min-height: 80px; padding-right: 0">
                                                                    <small class="pull-right text-muted" style="margin-right: 4px">
                                                                        <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*142.111*/("""{"""),format.raw/*142.112*/("""{"""),format.raw/*142.113*/("""comment.date"""),format.raw/*142.125*/("""}"""),format.raw/*142.126*/("""}"""),format.raw/*142.127*/(""""></i>
                                                                    </small>
                                                                    """),format.raw/*144.69*/("""{"""),format.raw/*144.70*/("""{"""),format.raw/*144.71*/("""comment.content"""),format.raw/*144.86*/("""}"""),format.raw/*144.87*/("""}"""),format.raw/*144.88*/("""
                                                                """),format.raw/*145.65*/("""</div>

                                                                <div class="container-fluid" ng-repeat="subcomment in subcomments | hasSameSubject:comment.subject" style="padding: 0">
                                                                    <hr class="hr" style="margin: 5px 0">
                                                                    <div class="container-fluid" style="padding-right: 0">
                                                                        <small class="pull-right text-muted" style="margin-top: 4px; margin-right: 4px">
                                                                            <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*151.115*/("""{"""),format.raw/*151.116*/("""{"""),format.raw/*151.117*/("""subcomment.date"""),format.raw/*151.132*/("""}"""),format.raw/*151.133*/("""}"""),format.raw/*151.134*/(""""></i>
                                                                        </small>
                                                                        <b>"""),format.raw/*153.76*/("""{"""),format.raw/*153.77*/("""{"""),format.raw/*153.78*/("""subcomment.username"""),format.raw/*153.97*/("""}"""),format.raw/*153.98*/("""}"""),format.raw/*153.99*/("""</b> - """),format.raw/*153.106*/("""{"""),format.raw/*153.107*/("""{"""),format.raw/*153.108*/("""subcomment.content"""),format.raw/*153.126*/("""}"""),format.raw/*153.127*/("""}"""),format.raw/*153.128*/("""
                                                                    """),format.raw/*154.69*/("""</div>
                                                                </div>
                                                                <div class="panel-footer" style="margin-left: -15px; margin-right: -15px; margin-bottom: -15px; margin-top: 5px">
                                                                    <div class="input-group">
                                                                        <input id="btn-input" type="text" class="form-control input-sm" placeholder=""""),_display_(/*158.151*/currentUser/*158.162*/.name),format.raw/*158.167*/(""" """),format.raw/*158.168*/("""says..."
                                                                        ng-click="setCurrentSubjectAndisChild(comment.subject, true)" ng-model="message['subcomment' + comment.cid]"/>
                                                                        <span class="input-group-btn">
                                                                            <button class="btn btn-warning btn-sm" ng-click="setSubmessageAsContent(comment.cid);submitMsg()">React!</button>
                                                                        </span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    """)))}),format.raw/*171.38*/("""
                                """),format.raw/*172.33*/("""</div>
                            </div>
                        </div>
                    </div>
                </div>
                    <!--bootstrap-->


                            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>    
                         

                            <!--sb-Admin-->
                    <script src=""""),_display_(/*184.35*/routes/*184.41*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*184.80*/(""""></script>

                    <script src=""""),_display_(/*186.35*/routes/*186.41*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*186.101*/(""""></script>

            </body>
        </html>
    """)))}))}
  }

  def render(title:String,currentUser:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)(project)

  def f:((String) => (Person) => (Project) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => (project) => apply(title)(currentUser)(project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/discussion.scala.html
                  HASH: 65854de4379b011c06c579e98c85af4100dbdaff
                  MATRIX: 743->1|884->54|915->60|964->101|1024->124|1059->133|1138->186|1156->196|1193->213|1237->230|1309->276|1323->282|1372->311|1463->376|1477->382|1531->415|1858->715|1873->721|1939->765|2031->830|2046->836|2119->887|2253->994|2310->1030|2359->1051|2435->1100|2452->1108|2508->1143|2561->1168|2946->1526|2989->1553|3029->1555|3106->1604|3158->1629|3189->1651|3228->1652|3275->1667|3305->1668|3506->1842|3516->1843|3540->1846|3590->1868|3601->1869|3626->1872|3675->1893|3686->1894|3715->1901|3850->2005|3919->2046|4067->2167|4095->2186|4134->2187|4199->2224|4832->2829|4848->2835|4902->2867|5189->3123|5250->3156|5340->3219|5383->3246|5422->3247|5491->3288|5545->3315|5576->3337|5615->3338|5657->3348|5702->3365|5713->3366|5738->3369|6015->3618|6031->3624|6079->3650|6110->3653|6121->3654|6148->3659|6502->3985|6513->3986|6538->3989|6887->4311|6897->4312|6921->4315|7307->4673|7318->4674|7343->4677|7834->5141|7930->5227|7979->5237|8068->5299|8104->5326|8143->5327|8236->5392|8563->5688|8652->5750|8691->5780|8730->5781|8823->5846|9159->6151|9248->6213|9284->6240|9323->6241|9416->6306|9754->6613|9843->6671|9928->6728|11372->8145|11382->8146|11407->8149|12049->8762|12061->8763|12087->8766|12542->9192|12572->9193|12602->9194|12642->9205|12672->9206|12702->9207|12732->9208|12811->9257|12842->9258|12883->9270|12895->9271|12921->9274|12952->9275|13995->10369|14085->10430|14209->10526|14277->10583|14319->10585|14417->10654|14527->10735|14549->10746|14575->10749|15001->11156|15015->11161|15055->11162|15153->11231|15236->11285|15258->11296|15284->11299|15722->11705|15816->11770|15928->11852|15959->11853|15990->11854|16031->11865|16062->11866|16093->11867|16533->12278|16563->12279|16593->12280|16637->12295|16667->12296|16697->12297|16973->12543|17004->12544|17035->12545|17081->12561|17112->12562|17143->12563|17346->12736|17377->12737|17408->12738|17454->12754|17485->12755|17516->12756|17563->12774|17580->12780|17629->12806|17661->12808|17692->12809|17723->12810|17771->12828|17802->12829|17833->12830|18113->13080|18144->13081|18175->13082|18216->13093|18247->13094|18278->13095|18798->13585|18829->13586|18860->13587|18902->13599|18933->13600|18964->13601|19145->13753|19175->13754|19205->13755|19249->13770|19279->13771|19309->13772|19403->13837|20121->14525|20152->14526|20183->14527|20228->14542|20259->14543|20290->14544|20482->14707|20512->14708|20542->14709|20590->14728|20620->14729|20650->14730|20687->14737|20718->14738|20749->14739|20797->14757|20828->14758|20859->14759|20957->14828|21486->15328|21508->15339|21536->15344|21567->15345|22687->16433|22749->16466|23168->16857|23184->16863|23245->16902|23320->16949|23336->16955|23419->17015
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|47->19|48->20|48->20|48->20|49->21|54->26|54->26|54->26|55->27|55->27|55->27|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|58->30|59->31|62->34|62->34|62->34|63->35|69->41|69->41|69->41|74->46|75->47|76->48|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|80->52|80->52|80->52|80->52|80->52|80->52|83->55|83->55|83->55|87->59|87->59|87->59|89->61|89->61|89->61|94->66|94->66|94->66|95->67|95->67|95->67|96->68|99->71|100->72|100->72|100->72|101->73|104->76|105->77|105->77|105->77|106->78|109->81|110->82|111->83|124->96|124->96|124->96|128->100|128->100|128->100|133->105|133->105|133->105|133->105|133->105|133->105|133->105|133->105|133->105|133->105|133->105|133->105|133->105|143->115|144->116|145->117|145->117|145->117|146->118|146->118|146->118|146->118|150->122|150->122|150->122|151->123|151->123|151->123|151->123|155->127|156->128|156->128|156->128|156->128|156->128|156->128|156->128|160->132|160->132|160->132|160->132|160->132|160->132|162->134|162->134|162->134|162->134|162->134|162->134|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|163->135|166->138|166->138|166->138|166->138|166->138|166->138|170->142|170->142|170->142|170->142|170->142|170->142|172->144|172->144|172->144|172->144|172->144|172->144|173->145|179->151|179->151|179->151|179->151|179->151|179->151|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|182->154|186->158|186->158|186->158|186->158|199->171|200->172|212->184|212->184|212->184|214->186|214->186|214->186
                  -- GENERATED --
              */
          