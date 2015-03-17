
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

            """),format.raw/*7.13*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.at("css/message.css")),format.raw/*7.94*/("""">
            <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("css/discussions.css")),format.raw/*8.98*/("""">

                <!-- jQuery -->
            <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

            <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.11/angular.min.js"></script>
            <script type="text/javascript" src=""""),_display_(/*14.50*/routes/*14.56*/.Assets.at("javascripts/discussions/app.js")),format.raw/*14.100*/(""""></script>
            <script type="text/javascript" src=""""),_display_(/*15.50*/routes/*15.56*/.Assets.at("javascripts/discussions/controller.js")),format.raw/*15.107*/(""""></script>
            </head>
            <body>
                <div id="wrapper">
                    """),_display_(/*19.22*/dashboard("discussion", currentUser)),format.raw/*19.58*/("""
                    """),format.raw/*20.21*/("""<div id="page-wrapper">
                        """),_display_(/*21.26*/template/*21.34*/.headericon("fa fa-comments fa-5x")),format.raw/*21.69*/("""
                        """),format.raw/*22.25*/("""<div ng-app="sseChat">
                            <div ng-controller="ChatCtrl">
                                <div class="container-fluid" style="text-align: center; margin: 0 0 1% 0">
                                    <div role="tabpanel">
                                        <ul class="nav nav-tabs">
                                        """),_display_(/*27.42*/for(p <- activeProjectList) yield /*27.69*/ {_display_(Seq[Any](format.raw/*27.71*/("""
                                            """),_display_(/*28.46*/if(project != null)/*28.65*/{_display_(Seq[Any](format.raw/*28.66*/("""
                                                """),_display_(/*29.50*/if(p.id == project.id)/*29.72*/ {_display_(Seq[Any](format.raw/*29.74*/("""
                                                    """),format.raw/*30.53*/("""<li role="presentation" class="active" style="width: 18%; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                                                        <a ng-click="setCurrentProject('"""),_display_(/*31.90*/p/*31.91*/.id),format.raw/*31.94*/("""')" href="#discussion"""),_display_(/*31.116*/p/*31.117*/.id),format.raw/*31.120*/("""" data-toggle="tab">"""),_display_(/*31.141*/p/*31.142*/.folder),format.raw/*31.149*/("""</a>
                                                    </li>
                                                """)))}/*33.51*/else/*33.56*/{_display_(Seq[Any](format.raw/*33.57*/("""
                                                    """),format.raw/*34.53*/("""<li role="presentation" style="width: 18%; overflow: hidden; white-space: nowrap ; text-overflow : ellipsis">
                                                        <a ng-click="setCurrentProject('"""),_display_(/*35.90*/p/*35.91*/.id),format.raw/*35.94*/("""')" href="#discussion"""),_display_(/*35.116*/p/*35.117*/.id),format.raw/*35.120*/("""" data-toggle="tab">"""),_display_(/*35.141*/p/*35.142*/.folder),format.raw/*35.149*/("""</a>
                                                    </li>
                                                """)))}),format.raw/*37.50*/("""
                                            """)))}/*38.47*/else/*38.52*/{_display_(Seq[Any](format.raw/*38.53*/("""
                                                """),_display_(/*39.50*/if(p.id == PersonData.getLastUsedProject.id)/*39.94*/ {_display_(Seq[Any](format.raw/*39.96*/("""
                                                    """),format.raw/*40.53*/("""<li role="presentation" class="active" style="width : 18% ; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                                                        <a ng-click="setCurrentProject('"""),_display_(/*41.90*/p/*41.91*/.id),format.raw/*41.94*/("""')" href="#discussion"""),_display_(/*41.116*/p/*41.117*/.id),format.raw/*41.120*/("""" data-toggle="tab">"""),_display_(/*41.141*/p/*41.142*/.folder),format.raw/*41.149*/("""</a>
                                                    </li>
                                                """)))}/*43.51*/else/*43.56*/{_display_(Seq[Any](format.raw/*43.57*/("""
                                                    """),format.raw/*44.53*/("""<li role="presentation" style="width : 18% ; overflow : hidden ; white-space : nowrap ; text-overflow : ellipsis">
                                                        <a ng-click="setCurrentProject('"""),_display_(/*45.90*/p/*45.91*/.id),format.raw/*45.94*/("""')" href="#discussion"""),_display_(/*45.116*/p/*45.117*/.id),format.raw/*45.120*/("""" data-toggle="tab">"""),_display_(/*45.141*/p/*45.142*/.folder),format.raw/*45.149*/("""</a>
                                                    </li>
                                                """)))}),format.raw/*47.50*/("""
                                            """)))}),format.raw/*48.46*/("""
                                        """)))}),format.raw/*49.42*/("""
                                        """),format.raw/*50.41*/("""</ul>
                                    </div>
                                </div>
                                <div class="tab-content">
                                    """),_display_(/*54.38*/for(p <- activeProjectList) yield /*54.65*/{_display_(Seq[Any](format.raw/*54.66*/("""
                                        """),_display_(/*55.42*/if(project != null)/*55.61*/{_display_(Seq[Any](format.raw/*55.62*/("""
                                            """),_display_(/*56.46*/if(p.id == project.id)/*56.68*/ {_display_(Seq[Any](format.raw/*56.70*/("""
                                                """),format.raw/*57.49*/("""<div class="tab-pane fade in active" id="discussion"""),_display_(/*57.101*/p/*57.102*/.id),format.raw/*57.105*/("""">
                                            """)))}/*58.47*/else/*58.52*/{_display_(Seq[Any](format.raw/*58.53*/("""
                                                """),format.raw/*59.49*/("""<div class="tab-pane fade" id="discussion"""),_display_(/*59.91*/p/*59.92*/.id),format.raw/*59.95*/("""">
                                            """)))}),format.raw/*60.46*/("""
                                        """)))}/*61.43*/else/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""
                                            """),_display_(/*62.46*/if(p.equals(PersonData.getLastUsedProject))/*62.89*/{_display_(Seq[Any](format.raw/*62.90*/("""
                                                """),format.raw/*63.49*/("""<div class="tab-pane fade in active" id="discussion"""),_display_(/*63.101*/p/*63.102*/.id),format.raw/*63.105*/("""">
                                            """)))}/*64.47*/else/*64.52*/{_display_(Seq[Any](format.raw/*64.53*/("""
                                                """),format.raw/*65.49*/("""<div class="tab-pane fade" id="discussion"""),_display_(/*65.91*/p/*65.92*/.id),format.raw/*65.95*/("""">
                                            """)))}),format.raw/*66.46*/("""
                                        """)))}),format.raw/*67.42*/("""
                                        """),format.raw/*68.41*/("""<div class="row">
                                            <div class="col-xs-10">
                                                <h3 style="margin: 5px 0 0 30px;">Discussions of project <a href=""""),_display_(/*70.116*/routes/*70.122*/.ProjectData.project(p.id)),format.raw/*70.148*/("""">"""),_display_(/*70.151*/p/*70.152*/.name),format.raw/*70.157*/("""</a></h3>
                                            </div>
                                            <div class="col-xs-2">
                                                <button ng-click="setCurrentSubjectAndisChild('', false);" class="btn btn-success pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*73.188*/p/*73.189*/.id),format.raw/*73.192*/("""" style="margin: 0; margin-right: 30px;">Post new Message</button>
                                            </div>
                                        </div>
                                        <hr class="hr" style="margin: 15px 15px 0">
                                        <div id="comment"""),_display_(/*77.58*/p/*77.59*/.id),format.raw/*77.62*/("""" class="panel-footer collapse" style="margin: -1px -30px 0; padding: 15px 50px 40px; border-bottom: 1px solid #DDDDDD">
                                            <div class="row" style="text-align: center">
                                                <button type="button" class="close pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*79.141*/p/*79.142*/.id),format.raw/*79.145*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                <h3 style="padding: 0; margin: 0">Post a new Message</h3>
                                            </div>
                                            <ul class="message" style="padding: 10px 50px 0 10px; margin: 0;">
                                                <li>
                                                    """),_display_(/*84.54*/defining(Role.find.where().eq("project",p).eq("person",currentUser).findUnique().role)/*84.140*/ { role =>_display_(Seq[Any](format.raw/*84.150*/("""
                                                        """),_display_(/*85.58*/if(role.equals(Role.OWNER))/*85.85*/{_display_(Seq[Any](format.raw/*85.86*/("""
                                                            """),format.raw/*86.61*/("""<div class="message-badge primary">
                                                                <i class="fa fa-mortar-board" style="margin-top: 15px"></i>
                                                            </div>
                                                        """)))}),format.raw/*89.58*/("""
                                                        """),_display_(/*90.58*/if(role.equals(Role.REVIEWER))/*90.88*/{_display_(Seq[Any](format.raw/*90.89*/("""
                                                            """),format.raw/*91.61*/("""<div class="message-badge danger">
                                                                <i class="fa fa-edit" style="margin-left: 4px; margin-top: 15px"></i>
                                                            </div>
                                                        """)))}),format.raw/*94.58*/("""
                                                        """),_display_(/*95.58*/if(role.equals(Role.GUEST))/*95.85*/{_display_(Seq[Any](format.raw/*95.86*/("""
                                                            """),format.raw/*96.61*/("""<div class="message-badge info">
                                                                <i class="fa fa-suitcase" style="margin-left: 4px; margin-top: 15px"></i>
                                                            </div>
                                                        """)))}),format.raw/*99.58*/("""
                                                    """)))}),format.raw/*100.54*/("""
                                                    """),format.raw/*101.53*/("""<div class="message-panel" style="margin-left: 40px; background-color: white">
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
                                                data-toggle="collapse" data-target="#comment"""),_display_(/*114.94*/p/*114.95*/.id),format.raw/*114.98*/("""" type="button" style="width: 80px">Cancel</button>
                                                <button type="button" class="btn btn-warning btn-sm" style="width: 80px" ng-if="message.subject == '' || message.content == ''"
                                                id="saySomething">Submit</button>
                                                <button type="button" class="btn btn-warning btn-sm" style="width: 80px" ng-if="message.subject != '' && message.content != ''"
                                                id="saySomething" data-toggle="collapse" data-target="#comment"""),_display_(/*118.112*/p/*118.113*/.id),format.raw/*118.116*/("""" ng-click="submitMsg()">Submit</button>
                                            </div>
                                        </div>
                                        <div class="panel-body" style="padding: 0">
                                            <ul class="timeline" style="margin-right: 30px; margin-bottom: 0; height: 80%">
                                                <li class=""""),format.raw/*123.60*/("""{"""),format.raw/*123.61*/("""{"""),format.raw/*123.62*/("""comment.who"""),format.raw/*123.73*/("""}"""),format.raw/*123.74*/("""}"""),format.raw/*123.75*/(""" """),format.raw/*123.76*/("""comment" ng-repeat="comment in comments | filter:"""),format.raw/*123.125*/("""{"""),format.raw/*123.126*/("""projectID: """),_display_(/*123.138*/p/*123.139*/.id),format.raw/*123.142*/("""}"""),format.raw/*123.143*/("""">
                                                    <div class="timeline-badge primary" ng-if="comment.role=='Owner'">
                                                        <i class="fa fa-mortar-board" style="margin-top: 15px"></i>
                                                    </div>
                                                    <div class="timeline-badge danger" ng-if="comment.role=='Reviewer'">
                                                        <i class="fa fa-edit" style="margin-left: 4px; margin-top: 15px"></i>
                                                    </div>
                                                    <div class="timeline-badge info" ng-if="comment.role=='Guest'">
                                                        <i class="fa fa-suitcase" style="margin-top: 15px"></i>
                                                    </div>
                                                    <div class="timeline-panel">   """),format.raw/*133.165*/("""
                                                        """),format.raw/*134.57*/("""<div class="timeline-heading">
                                                            """),_display_(/*135.62*/if(ProjectData.findAllOwners(p.id).contains(currentUser))/*135.119*/ {_display_(Seq[Any](format.raw/*135.121*/("""
                                                                """),format.raw/*136.65*/("""<a class="pull-right" href="#" ng-if="comment.role == 'Guest' || comment.uid == """),_display_(/*136.146*/currentUser/*136.157*/.id),format.raw/*136.160*/(""""
                                                                style="color : red ; font-size : large ; padding : 8px 8px 0 20px" ng-click="deleteMsg(comment)">
                                                                    <i class="fa fa-close"></i>
                                                                </a>
                                                            """)))}/*140.63*/else/*140.68*/{_display_(Seq[Any](format.raw/*140.69*/("""
                                                                """),format.raw/*141.65*/("""<a class="pull-right" href="#" ng-if="comment.uid == """),_display_(/*141.119*/currentUser/*141.130*/.id),format.raw/*141.133*/(""""
                                                                style="color : red ; font-size : large ; padding : 8px 8px 0 20px" ng-click="deleteMsg(comment)">
                                                                    <i class="fa fa-close"></i>
                                                                </a>
                                                            """)))}),format.raw/*145.62*/("""
                                                            """),format.raw/*146.61*/("""<a class="btn btn-info pull-right" data-toggle="collapse" href="#showSubCommentsOf"""),format.raw/*146.143*/("""{"""),format.raw/*146.144*/("""{"""),format.raw/*146.145*/("""comment.cid"""),format.raw/*146.156*/("""}"""),format.raw/*146.157*/("""}"""),format.raw/*146.158*/("""" aria-expanded="false" aria-controls="collapseExample">
                                                                Show/Hide
                                                            </a>
                                                            <h4 class="timeline-title" style="margin-left: 10px; margin-bottom: 0">
                                                                <u>"""),format.raw/*150.68*/("""{"""),format.raw/*150.69*/("""{"""),format.raw/*150.70*/("""comment.subject"""),format.raw/*150.85*/("""}"""),format.raw/*150.86*/("""}"""),format.raw/*150.87*/("""</u>
                                                                <br>
                                                                <p ng-if="!comment.hasAttachment" style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*152.165*/("""{"""),format.raw/*152.166*/("""{"""),format.raw/*152.167*/("""comment.username"""),format.raw/*152.183*/("""}"""),format.raw/*152.184*/("""}"""),format.raw/*152.185*/(""")</p>
                                                                <p ng-if="comment.hasAttachment" style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*153.164*/("""{"""),format.raw/*153.165*/("""{"""),format.raw/*153.166*/("""comment.username"""),format.raw/*153.182*/("""}"""),format.raw/*153.183*/("""}"""),format.raw/*153.184*/(""", about <a href=""""),_display_(/*153.202*/routes/*153.208*/.ProjectData.project(p.id)),format.raw/*153.234*/("""">"""),format.raw/*153.236*/("""{"""),format.raw/*153.237*/("""{"""),format.raw/*153.238*/("""comment.attachment"""),format.raw/*153.256*/("""}"""),format.raw/*153.257*/("""}"""),format.raw/*153.258*/("""</a>)</p>
                                                            </h4>
                                                        </div>
                                                        <div class="collapse" id="showSubCommentsOf"""),format.raw/*156.100*/("""{"""),format.raw/*156.101*/("""{"""),format.raw/*156.102*/("""comment.cid"""),format.raw/*156.113*/("""}"""),format.raw/*156.114*/("""}"""),format.raw/*156.115*/("""">
                                                            <hr class="hr" style="margin: 15px 0 10px">
                                                            <div class="container-fluid" style="min-height: 80px; padding-right: 0">
                                                                <small class="pull-right text-muted" style="margin-right: 4px">
                                                                    <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*160.107*/("""{"""),format.raw/*160.108*/("""{"""),format.raw/*160.109*/("""comment.date"""),format.raw/*160.121*/("""}"""),format.raw/*160.122*/("""}"""),format.raw/*160.123*/(""""></i>
                                                                </small>
                                                                """),format.raw/*162.65*/("""{"""),format.raw/*162.66*/("""{"""),format.raw/*162.67*/("""comment.content"""),format.raw/*162.82*/("""}"""),format.raw/*162.83*/("""}"""),format.raw/*162.84*/("""
                                                            """),format.raw/*163.61*/("""</div>

                                                            <div class="container-fluid" ng-repeat="subcomment in subcomments | hasSameSubject:comment.subject" style="padding: 0">
                                                                <hr class="hr" style="margin: 5px 0">
                                                                <div class="container-fluid" style="padding-right: 0">
                                                                    <small class="pull-right text-muted" style="margin-top: 4px; margin-right: 4px">
                                                                        <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*169.111*/("""{"""),format.raw/*169.112*/("""{"""),format.raw/*169.113*/("""subcomment.date"""),format.raw/*169.128*/("""}"""),format.raw/*169.129*/("""}"""),format.raw/*169.130*/(""""></i>
                                                                    </small>
                                                                    <b>"""),format.raw/*171.72*/("""{"""),format.raw/*171.73*/("""{"""),format.raw/*171.74*/("""subcomment.username"""),format.raw/*171.93*/("""}"""),format.raw/*171.94*/("""}"""),format.raw/*171.95*/("""</b> - """),format.raw/*171.102*/("""{"""),format.raw/*171.103*/("""{"""),format.raw/*171.104*/("""subcomment.content"""),format.raw/*171.122*/("""}"""),format.raw/*171.123*/("""}"""),format.raw/*171.124*/("""
                                                                """),format.raw/*172.65*/("""</div>
                                                            </div>
                                                            <div class="panel-footer" style="margin-left: -15px; margin-right: -15px; margin-bottom: -15px; margin-top: 5px">
                                                                <div class="input-group">
                                                                    <input id="btn-input" type="text" class="form-control input-sm" placeholder=""""),_display_(/*176.147*/currentUser/*176.158*/.name),format.raw/*176.163*/(""" """),format.raw/*176.164*/("""says..."
                                                                    ng-click="reset(); setCurrentSubjectAndisChild(comment.subject, true)" ng-model="message['subcomment' + comment.cid]"/>
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
                                    """)))}),format.raw/*189.38*/("""
                                """),format.raw/*190.33*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!--bootstrap-->
                    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

                        <!--sb-Admin-->
                    <script src=""""),_display_(/*200.35*/routes/*200.41*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*200.80*/(""""></script>

                    <script src=""""),_display_(/*202.35*/routes/*202.41*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*202.101*/(""""></script>
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
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/discussion.scala.html
                  HASH: 7eef177f028d0ad45b111805228bb0ebbc90114e
                  MATRIX: 743->1|884->54|915->60|964->101|1024->124|1059->133|1138->186|1156->196|1193->213|1234->227|1306->273|1320->279|1369->308|1456->369|1470->375|1523->408|1838->696|1853->702|1919->746|2007->807|2022->813|2095->864|2229->971|2286->1007|2335->1028|2411->1077|2428->1085|2484->1120|2537->1145|2918->1499|2961->1526|3001->1528|3074->1574|3102->1593|3141->1594|3218->1644|3249->1666|3289->1668|3370->1721|3614->1938|3624->1939|3648->1942|3698->1964|3709->1965|3734->1968|3783->1989|3794->1990|3823->1997|3954->2110|3967->2115|4006->2116|4087->2169|4313->2368|4323->2369|4347->2372|4397->2394|4408->2395|4433->2398|4482->2419|4493->2420|4522->2427|4665->2539|4730->2586|4743->2591|4782->2592|4859->2642|4912->2686|4952->2688|5033->2741|5279->2960|5289->2961|5313->2964|5363->2986|5374->2987|5399->2990|5448->3011|5459->3012|5488->3019|5619->3132|5632->3137|5671->3138|5752->3191|5983->3395|5993->3396|6017->3399|6067->3421|6078->3422|6103->3425|6152->3446|6163->3447|6192->3454|6335->3566|6412->3612|6485->3654|6554->3695|6764->3878|6807->3905|6846->3906|6915->3948|6943->3967|6982->3968|7055->4014|7086->4036|7126->4038|7203->4087|7283->4139|7294->4140|7319->4143|7386->4192|7399->4197|7438->4198|7515->4247|7584->4289|7594->4290|7618->4293|7697->4341|7758->4384|7771->4389|7810->4390|7883->4436|7935->4479|7974->4480|8051->4529|8131->4581|8142->4582|8167->4585|8234->4634|8247->4639|8286->4640|8363->4689|8432->4731|8442->4732|8466->4735|8545->4783|8618->4825|8687->4866|8916->5067|8932->5073|8980->5099|9011->5102|9022->5103|9049->5108|9392->5423|9403->5424|9428->5427|9761->5733|9771->5734|9795->5737|10173->6087|10184->6088|10209->6091|10680->6535|10776->6621|10825->6631|10910->6689|10946->6716|10985->6717|11074->6778|11389->7062|11474->7120|11513->7150|11552->7151|11641->7212|11965->7505|12050->7563|12086->7590|12125->7591|12214->7652|12540->7947|12626->8001|12708->8054|14101->9419|14112->9420|14137->9423|14763->10020|14775->10021|14801->10024|15236->10430|15266->10431|15296->10432|15336->10443|15366->10444|15396->10445|15426->10446|15505->10495|15536->10496|15577->10508|15589->10509|15615->10512|15646->10513|16649->11567|16735->11624|16855->11716|16923->11773|16965->11775|17059->11840|17169->11921|17191->11932|17217->11935|17627->12326|17641->12331|17681->12332|17775->12397|17858->12451|17880->12462|17906->12465|18328->12855|18418->12916|18530->12998|18561->12999|18592->13000|18633->13011|18664->13012|18695->13013|19119->13408|19149->13409|19179->13410|19223->13425|19253->13426|19283->13427|19551->13665|19582->13666|19613->13667|19659->13683|19690->13684|19721->13685|19920->13854|19951->13855|19982->13856|20028->13872|20059->13873|20090->13874|20137->13892|20154->13898|20203->13924|20235->13926|20266->13927|20297->13928|20345->13946|20376->13947|20407->13948|20675->14186|20706->14187|20737->14188|20778->14199|20809->14200|20840->14201|21344->14675|21375->14676|21406->14677|21448->14689|21479->14690|21510->14691|21683->14835|21713->14836|21743->14837|21787->14852|21817->14853|21847->14854|21937->14915|22635->15583|22666->15584|22697->15585|22742->15600|22773->15601|22804->15602|22988->15757|23018->15758|23048->15759|23096->15778|23126->15779|23156->15780|23193->15787|23224->15788|23255->15789|23303->15807|23334->15808|23365->15809|23459->15874|23972->16358|23994->16369|24022->16374|24053->16375|25134->17424|25196->17457|25586->17819|25602->17825|25663->17864|25738->17911|25754->17917|25837->17977
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|47->19|47->19|48->20|49->21|49->21|49->21|50->22|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|61->33|61->33|61->33|62->34|63->35|63->35|63->35|63->35|63->35|63->35|63->35|63->35|63->35|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|71->43|71->43|71->43|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|75->47|76->48|77->49|78->50|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|87->59|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|93->65|94->66|95->67|96->68|98->70|98->70|98->70|98->70|98->70|98->70|101->73|101->73|101->73|105->77|105->77|105->77|107->79|107->79|107->79|112->84|112->84|112->84|113->85|113->85|113->85|114->86|117->89|118->90|118->90|118->90|119->91|122->94|123->95|123->95|123->95|124->96|127->99|128->100|129->101|142->114|142->114|142->114|146->118|146->118|146->118|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|161->133|162->134|163->135|163->135|163->135|164->136|164->136|164->136|164->136|168->140|168->140|168->140|169->141|169->141|169->141|169->141|173->145|174->146|174->146|174->146|174->146|174->146|174->146|174->146|178->150|178->150|178->150|178->150|178->150|178->150|180->152|180->152|180->152|180->152|180->152|180->152|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|184->156|184->156|184->156|184->156|184->156|184->156|188->160|188->160|188->160|188->160|188->160|188->160|190->162|190->162|190->162|190->162|190->162|190->162|191->163|197->169|197->169|197->169|197->169|197->169|197->169|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|200->172|204->176|204->176|204->176|204->176|217->189|218->190|228->200|228->200|228->200|230->202|230->202|230->202
                  -- GENERATED --
              */
          