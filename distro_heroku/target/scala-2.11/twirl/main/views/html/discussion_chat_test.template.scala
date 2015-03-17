
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
object discussion_chat_test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.37*/("""
"""),_display_(/*2.2*/defining(PersonData.findActiveProjects())/*2.43*/ { activeProjectList =>_display_(Seq[Any](format.raw/*2.66*/("""
    """),format.raw/*3.5*/("""<html lang="en">
        <head>
            """),_display_(/*5.14*/linkLoader/*5.24*/.headlinks(title)),format.raw/*5.41*/("""

        """),format.raw/*7.9*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.at("../../public/css/discussions.css")),format.raw/*7.107*/("""">

            <!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.11/angular.min.js"></script>
        <script type="text/javascript">
        'use strict';
        /** app level module which depends on services and controllers */
        angular.module('sseChat', ['sseChat.controllers']);
        </script>
        <script id="controller" type="text/javascript">
        'use strict';
        /** Controllers */
        angular.module('sseChat.controllers', []).controller('ChatCtrl', function ($scope, $http) """),format.raw/*21.99*/("""{"""),format.raw/*21.100*/("""

        """),format.raw/*23.9*/("""$scope.projectids =[ ];
        $.ajax ( """),format.raw/*24.18*/("""{"""),format.raw/*24.19*/(""" """),format.raw/*24.20*/("""url : "/projectids", async : false, dataType : 'json', success : function ( response ) """),format.raw/*24.107*/("""{"""),format.raw/*24.108*/(""" """),format.raw/*24.109*/("""$scope.projectids = response """),format.raw/*24.138*/("""}"""),format.raw/*24.139*/(""" """),format.raw/*24.140*/("""}"""),format.raw/*24.141*/(""" """),format.raw/*24.142*/(""") ;
        $scope.lastpid = "";
        $.ajax ( """),format.raw/*26.18*/("""{"""),format.raw/*26.19*/(""" """),format.raw/*26.20*/("""url : "/projectid", async : false, dataType : 'json', success : function ( response ) """),format.raw/*26.106*/("""{"""),format.raw/*26.107*/(""" """),format.raw/*26.108*/("""$scope.lastpid = response """),format.raw/*26.134*/("""}"""),format.raw/*26.135*/(""" """),format.raw/*26.136*/("""}"""),format.raw/*26.137*/(""" """),format.raw/*26.138*/(""") ;
        $scope.comments =[ ] ;
        if($scope.projectids.length > 0) """),format.raw/*28.42*/("""{"""),format.raw/*28.43*/("""
        """),format.raw/*29.9*/("""$.ajax ( """),format.raw/*29.18*/("""{"""),format.raw/*29.19*/(""" """),format.raw/*29.20*/("""url : "/comments/" + $.grep($scope.projectids, function(p)"""),format.raw/*29.78*/("""{"""),format.raw/*29.79*/("""return p.projectID === $scope.lastpid.projectID;"""),format.raw/*29.127*/("""}"""),format.raw/*29.128*/(""")[0 ].projectID, async : false, dataType : 'json', success : function ( response ) """),format.raw/*29.211*/("""{"""),format.raw/*29.212*/(""" """),format.raw/*29.213*/("""$scope.comments = response """),format.raw/*29.240*/("""}"""),format.raw/*29.241*/(""" """),format.raw/*29.242*/("""}"""),format.raw/*29.243*/(""" """),format.raw/*29.244*/(""") ;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        """),format.raw/*31.9*/("""$scope.message = """),format.raw/*31.26*/("""{"""),format.raw/*31.27*/(""" """),format.raw/*31.28*/("""}"""),format.raw/*31.29*/(""" """),format.raw/*31.30*/(""";
        $scope.message.subject = "" ;
        $scope.message.content = "" ;
        for(var i = 0; i < $scope.comments.length; i++)"""),format.raw/*34.56*/("""{"""),format.raw/*34.57*/("""
        """),format.raw/*35.9*/("""$scope.message["subcomment" + $scope.comments[i].cid] = "";
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""$scope.uid = """"),_display_(/*37.24*/currentUser/*37.35*/.id),format.raw/*37.38*/("""";
        $scope.isChild = false ;
        if($scope.projectids.length > 0)"""),format.raw/*39.41*/("""{"""),format.raw/*39.42*/("""
        """),format.raw/*40.9*/("""$scope.currentProject = $.grep($scope.projectids, function(p)"""),format.raw/*40.70*/("""{"""),format.raw/*40.71*/("""return p.projectID === $scope.lastpid.projectID;"""),format.raw/*40.119*/("""}"""),format.raw/*40.120*/(""")[0 ];
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""

        """),format.raw/*43.9*/("""$scope.refresh = function () """),format.raw/*43.38*/("""{"""),format.raw/*43.39*/("""
        """),format.raw/*44.9*/("""$scope.projectids =[ ] ;
        $.ajax ( """),format.raw/*45.18*/("""{"""),format.raw/*45.19*/(""" """),format.raw/*45.20*/("""url : "/projectids", async : false, dataType : 'json', success : function ( response ) """),format.raw/*45.107*/("""{"""),format.raw/*45.108*/(""" """),format.raw/*45.109*/("""$scope.projectids = response """),format.raw/*45.138*/("""}"""),format.raw/*45.139*/(""" """),format.raw/*45.140*/("""}"""),format.raw/*45.141*/(""" """),format.raw/*45.142*/(""") ;
        $scope.comments =[ ] ;
        if($scope.projectids.length > 0) """),format.raw/*47.42*/("""{"""),format.raw/*47.43*/("""
        """),format.raw/*48.9*/("""$.ajax ( """),format.raw/*48.18*/("""{"""),format.raw/*48.19*/(""" """),format.raw/*48.20*/("""url : "/comments/" + $scope.currentProject.projectID, async : false, dataType : 'json', success : function ( response ) """),format.raw/*48.140*/("""{"""),format.raw/*48.141*/(""" """),format.raw/*48.142*/("""$scope.comments = response """),format.raw/*48.169*/("""}"""),format.raw/*48.170*/(""" """),format.raw/*48.171*/("""}"""),format.raw/*48.172*/(""" """),format.raw/*48.173*/(""") ;
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
        """),format.raw/*50.9*/("""for(var i = 0; i < $scope.comments.length; i++)"""),format.raw/*50.56*/("""{"""),format.raw/*50.57*/("""
        """),format.raw/*51.9*/("""$scope.message["subcomment" + $scope.comments[i].cid] = "";
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/("""
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""";
        /** change current room, restart EventSource connection */
        $scope.setCurrentProject = function (pid) """),format.raw/*55.51*/("""{"""),format.raw/*55.52*/("""
        """),format.raw/*56.9*/("""$scope.currentProject = $.grep($scope.projectids, function(p)"""),format.raw/*56.70*/("""{"""),format.raw/*56.71*/("""return p.projectID === pid;"""),format.raw/*56.98*/("""}"""),format.raw/*56.99*/(""")[0 ];
        //                console.log("Current Project is set to: " + JSON.stringify($scope.currentProject));
        $scope.chatFeed.close();
        $scope.comments = [];
        $.ajax("""),format.raw/*60.16*/("""{"""),format.raw/*60.17*/("""url: "/comments/" + pid, async: false, dataType: 'json', success: function(response)"""),format.raw/*60.101*/("""{"""),format.raw/*60.102*/(""" """),format.raw/*60.103*/("""$scope.comments = response"""),format.raw/*60.129*/("""}"""),format.raw/*60.130*/("""}"""),format.raw/*60.131*/(""");
        $scope.listen();
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""";
        /** change current subject, restart EventSource connection */
        $scope.setCurrentSubjectAndisChild = function (subject, isChild) """),format.raw/*64.74*/("""{"""),format.raw/*64.75*/("""
        """),format.raw/*65.9*/("""$scope.message.subject = subject;
        $scope.isChild = isChild;
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""";
        $scope.reset = function () """),format.raw/*68.36*/("""{"""),format.raw/*68.37*/("""
        """),format.raw/*69.9*/("""//                console.log("input has been reset");
        $scope.message = """),format.raw/*70.26*/("""{"""),format.raw/*70.27*/("""}"""),format.raw/*70.28*/(""";
        $scope.message.subject = "";
        $scope.message.content = "";
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/(""";
        $scope.setSubmessageAsContent = function (cid) """),format.raw/*74.56*/("""{"""),format.raw/*74.57*/("""
        """),format.raw/*75.9*/("""$scope.message.content = $scope.message["subcomment" + cid];
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/(""";
        /** posting chat text to server */
        $scope.submitMsg = function () """),format.raw/*78.40*/("""{"""),format.raw/*78.41*/("""
        """),format.raw/*79.9*/("""$http.post("/chat", """),format.raw/*79.29*/("""{"""),format.raw/*79.30*/(""" """),format.raw/*79.31*/("""uid: $scope.uid, subject: $scope.message.subject, content: $scope.message.content,
        date: (new Date()).toUTCString(), pid: $scope.currentProject, isChild: $scope.isChild"""),format.raw/*80.94*/("""}"""),format.raw/*80.95*/(""");
        //                console.log("Message has been submitted");
        $scope.reset();
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/(""";
        /** handle incoming messages: add to messages array */
        $scope.addMsg = function (msg) """),format.raw/*85.40*/("""{"""),format.raw/*85.41*/("""
        """),format.raw/*86.9*/("""$scope.$apply(function () """),format.raw/*86.35*/("""{"""),format.raw/*86.36*/("""
        """),format.raw/*87.9*/("""$scope.refresh();
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/(""");
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/(""";
        /** start listening on messages from selected room */
        $scope.listen = function () """),format.raw/*91.37*/("""{"""),format.raw/*91.38*/("""
        """),format.raw/*92.9*/("""if($scope.projectids.length > 0) """),format.raw/*92.42*/("""{"""),format.raw/*92.43*/("""
        """),format.raw/*93.9*/("""$scope.chatFeed = new EventSource ( "/chatFeed/" + $scope.currentProject.projectID ) ;
        $scope.chatFeed.addEventListener ( "message", $scope.addMsg, false ) ;
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/(""";
        $scope.listen();
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/(""");
        </script>
        </head>
        <body>
            <div id="wrapper">
                """),_display_(/*103.18*/dashboard("discussion", currentUser)),format.raw/*103.54*/("""
                """),format.raw/*104.17*/("""<div id="page-wrapper">
                    """),_display_(/*105.22*/template/*105.30*/.headericon("fa fa-comment fa-5x")),format.raw/*105.64*/("""
                    """),format.raw/*106.21*/("""<div ng-app="sseChat">
                        <div ng-controller="ChatCtrl">
                            <div class="container-fluid" style="text-align: center; margin: 0 0 1% 0">
                                <div role="tabpanel">
                                    <ul class="nav nav-tabs">
                                    """),_display_(/*111.38*/for(p <- activeProjectList) yield /*111.65*/ {_display_(Seq[Any](format.raw/*111.67*/("""
                                        """),_display_(/*112.42*/if(p.equals(PersonData.getLastUsedProject))/*112.85*/ {_display_(Seq[Any](format.raw/*112.87*/("""
                                            """),format.raw/*113.45*/("""<li role="presentation" class="active" style="width : 18%; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                                                <a ng-click="setCurrentProject('"""),_display_(/*114.82*/p/*114.83*/.id),format.raw/*114.86*/("""')" href="#discussion"""),_display_(/*114.108*/p/*114.109*/.id),format.raw/*114.112*/("""" data-toggle="tab">"""),_display_(/*114.133*/p/*114.134*/.folder),format.raw/*114.141*/("""</a>
                                            </li>
                                        """)))}/*116.43*/else/*116.48*/{_display_(Seq[Any](format.raw/*116.49*/("""
                                            """),format.raw/*117.45*/("""<li role="presentation" style="width : 18%; overflow : hidden ; white-space : nowrap ; text-overflow : ellipsis">
                                                <a ng-click="setCurrentProject('"""),_display_(/*118.82*/p/*118.83*/.id),format.raw/*118.86*/("""')" href="#discussion"""),_display_(/*118.108*/p/*118.109*/.id),format.raw/*118.112*/("""" data-toggle="tab">"""),_display_(/*118.133*/p/*118.134*/.folder),format.raw/*118.141*/("""</a>
                                            </li>
                                        """)))}),format.raw/*120.42*/("""
                                    """)))}),format.raw/*121.38*/("""
                                    """),format.raw/*122.37*/("""</ul>
                                </div>
                            </div>
                            <div class="tab-content">
                                """),_display_(/*126.34*/for(p <- activeProjectList) yield /*126.61*/{_display_(Seq[Any](format.raw/*126.62*/("""
                                    """),_display_(/*127.38*/if(p.equals(PersonData.getLastUsedProject))/*127.81*/{_display_(Seq[Any](format.raw/*127.82*/("""
                                        """),format.raw/*128.41*/("""<div class="tab-pane fade in active" id="discussion"""),_display_(/*128.93*/p/*128.94*/.id),format.raw/*128.97*/("""">
                                            <div class="row">
                                                <div class="col-xs-10">
                                                    <h3 style="margin: 5px 0 0 30px;">Discussions</h3>
                                                </div>
                                                <div class="col-xs-2">
                                                    <button ng-click="setCurrentSubjectAndisChild('', false);" class="btn btn-success pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*134.192*/p/*134.193*/.id),format.raw/*134.196*/("""" style="margin: 0; margin-right: 30px;">Start new Discussion</button>
                                                </div>
                                            </div>
                                            """),format.raw/*137.97*/("""
                                            """),format.raw/*138.45*/("""<div id="comment"""),_display_(/*138.62*/p/*138.63*/.id),format.raw/*138.66*/("""" class="panel-footer collapse" style="margin-left: -30px; margin-right: -30px; padding: 15px 50px 50px">
                                                <div class="row" style="padding: 0; text-align: center">
                                                    <button type="button" class="close pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*140.145*/p/*140.146*/.id),format.raw/*140.149*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                    <h3 style="padding: 0; margin: 0">Start a new Discussion</h3>
                                                </div>
                                                <div class="row" style="padding: 0 20px">
                                                    Subject:
                                                </div>
                                                <div class="row" style="padding: 0 20px 5px 20px;">
                                                    <span class="input-group-btn">
                                                        <input type="text" name="chat" id="textField" ng-model="message.subject"
                                                        placeholder="Your eye-catching subject title here..." class="ng-pristine ng-valid form-control input-sm"/>
                                                    </span>
                                                </div>
                                                <div class="row" style="padding: 0 20px">
                                                    Comment:
                                                </div>
                                                <div class="row" style="padding: 0 20px">
                                                    <span class="input-group-btn">
                                                        <input ng-submit="submitMsg()" type="text" name="chat" id="textField" ng-model="message.content"
                                                        placeholder="Your text here..." class="ng-pristine ng-valid form-control input-sm"/>
                                                    </span>
                                                </div>
                                                <div class="row pull-right" style="margin: 10px">
                                                    <button ng-click="reset();" class="btn btn-default btn-sm"
                                                    data-toggle="collapse" data-target="#comment"""),_display_(/*163.98*/p/*163.99*/.id),format.raw/*163.102*/("""" type="button" style="width: 80px">Cancel</button>
                                                    <button type="button" class="btn btn-success btn-sm" style="width: 80px"
                                                    id="saySomething" data-toggle="collapse" data-target="#comment"""),_display_(/*165.116*/p/*165.117*/.id),format.raw/*165.120*/("""" ng-click="submitMsg()">Submit</button>
                                                </div>
                                            </div>
                                            <div class="panel-body" style="padding: 5px 0 0">

                                                    <ul class="timeline" style="margin-right: 45px">
                                                        <li class=""""),format.raw/*171.68*/("""{"""),format.raw/*171.69*/("""{"""),format.raw/*171.70*/("""comment.who"""),format.raw/*171.81*/("""}"""),format.raw/*171.82*/("""}"""),format.raw/*171.83*/(""" """),format.raw/*171.84*/("""comment" ng-repeat="comment in comments">
                                                            <div class="timeline-badge primary"><i class="fa fa-user" style="margin-top: 13px"></i></div>
                                                            <div class="timeline-panel">
                                                                <div class="timeline-heading">
                                                                    <a class="btn btn-info pull-right" data-toggle="collapse" href="#subcomment"""),format.raw/*175.144*/("""{"""),format.raw/*175.145*/("""{"""),format.raw/*175.146*/("""comment.cid"""),format.raw/*175.157*/("""}"""),format.raw/*175.158*/("""}"""),format.raw/*175.159*/("""" aria-expanded="false" aria-controls="collapseExample">
                                                                        Show
                                                                    </a>
                                                                    <h4 class="timeline-title" style="margin-left: 10px; margin-bottom: 0">
                                                                        <u>"""),format.raw/*179.76*/("""{"""),format.raw/*179.77*/("""{"""),format.raw/*179.78*/("""comment.subject"""),format.raw/*179.93*/("""}"""),format.raw/*179.94*/("""}"""),format.raw/*179.95*/("""</u>
                                                                        <br>
                                                                        <p style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*181.142*/("""{"""),format.raw/*181.143*/("""{"""),format.raw/*181.144*/("""comment.username"""),format.raw/*181.160*/("""}"""),format.raw/*181.161*/("""}"""),format.raw/*181.162*/(""")</p>
                                                                    </h4>
                                                                </div>
                                                                <div class="collapse" id="subcomment"""),format.raw/*184.101*/("""{"""),format.raw/*184.102*/("""{"""),format.raw/*184.103*/("""comment.cid"""),format.raw/*184.114*/("""}"""),format.raw/*184.115*/("""}"""),format.raw/*184.116*/("""">
                                                                    <hr class="hr" style="margin: 15px 0 10px">
                                                                    <div class="container-fluid" style="margin-bottom: 20px">
                                                                        """),format.raw/*187.73*/("""{"""),format.raw/*187.74*/("""{"""),format.raw/*187.75*/("""comment.content"""),format.raw/*187.90*/("""}"""),format.raw/*187.91*/("""}"""),format.raw/*187.92*/("""
                                                                    """),format.raw/*188.69*/("""</div>

                                                                    <div class="container-fluid" ng-repeat="subcomment in comment.subcomments" style="padding: 0">
                                                                        <hr class="hr" style="margin: 5px 0">
                                                                        <div class="container-fluid">
                                                                            <small class="pull-right text-muted">
                                                                                <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*194.119*/("""{"""),format.raw/*194.120*/("""{"""),format.raw/*194.121*/("""subcomment.date"""),format.raw/*194.136*/("""}"""),format.raw/*194.137*/("""}"""),format.raw/*194.138*/(""""></i>
                                                                            </small>
                                                                            <b>"""),format.raw/*196.80*/("""{"""),format.raw/*196.81*/("""{"""),format.raw/*196.82*/("""subcomment.username"""),format.raw/*196.101*/("""}"""),format.raw/*196.102*/("""}"""),format.raw/*196.103*/("""</b> - """),format.raw/*196.110*/("""{"""),format.raw/*196.111*/("""{"""),format.raw/*196.112*/("""subcomment.content"""),format.raw/*196.130*/("""}"""),format.raw/*196.131*/("""}"""),format.raw/*196.132*/("""
                                                                        """),format.raw/*197.73*/("""</div>
                                                                    </div>
                                                                    <div class="panel-footer" style="margin-left: -15px; margin-right: -15px; margin-bottom: -15px; margin-top: 5px">
                                                                        <div class="input-group">
                                                                            <input id="btn-input" type="text" class="form-control input-sm" placeholder=""""),format.raw/*201.154*/("""{"""),format.raw/*201.155*/("""{"""),format.raw/*201.156*/("""comment.username"""),format.raw/*201.172*/("""}"""),format.raw/*201.173*/("""}"""),format.raw/*201.174*/(""" """),format.raw/*201.175*/("""says..."
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
                                        """)))}/*214.43*/else/*214.48*/{_display_(Seq[Any](format.raw/*214.49*/("""
                                        """),format.raw/*215.41*/("""<div class="tab-pane fade" id="discussion"""),_display_(/*215.83*/p/*215.84*/.id),format.raw/*215.87*/("""">
                                            <div class="row">
                                                <div class="col-xs-10">
                                                    <h3 style="margin: 5px 0 0 30px;">Discussions</h3>
                                                </div>
                                                <div class="col-xs-2">
                                                    <button ng-click="setCurrentSubjectAndisChild('', false);" class="btn btn-success pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*221.192*/p/*221.193*/.id),format.raw/*221.196*/("""" style="margin: 0; margin-right: 30px;">Start new Discussion</button>
                                                </div>
                                            </div>
                                            """),format.raw/*224.97*/("""
                                            """),format.raw/*225.45*/("""<div id="comment"""),_display_(/*225.62*/p/*225.63*/.id),format.raw/*225.66*/("""" class="panel-footer collapse" style="margin-left: -30px; margin-right: -30px; padding: 15px 50px 50px">
                                                <div class="row" style="padding: 0; text-align: center">
                                                    <button type="button" class="close pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*227.145*/p/*227.146*/.id),format.raw/*227.149*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                    <h3 style="padding: 0; margin: 0">Start a new Discussion</h3>
                                                </div>
                                                <div class="row" style="padding: 0 20px">
                                                    Subject:
                                                </div>
                                                <div class="row" style="padding: 0 20px 5px 20px;">
                                                    <span class="input-group-btn">
                                                        <input type="text" name="chat" id="textField" ng-model="message.subject"
                                                        placeholder="Your eye-catching subject title here..." class="ng-pristine ng-valid form-control input-sm"/>
                                                    </span>
                                                </div>
                                                <div class="row" style="padding: 0 20px">
                                                    Comment:
                                                </div>
                                                <div class="row" style="padding: 0 20px">
                                                    <span class="input-group-btn">
                                                        <input ng-submit="submitMsg()" type="text" name="chat" id="textField" ng-model="message.content"
                                                        placeholder="Your text here..." class="ng-pristine ng-valid form-control input-sm"/>
                                                    </span>
                                                </div>
                                                <div class="row pull-right" style="margin: 10px">
                                                    <button ng-click="reset();" class="btn btn-default btn-sm"
                                                    data-toggle="collapse" data-target="#comment"""),_display_(/*250.98*/p/*250.99*/.id),format.raw/*250.102*/("""" type="button" style="width: 80px">Cancel</button>
                                                    <button type="button" class="btn btn-success btn-sm" style="width: 80px"
                                                    id="saySomething" data-toggle="collapse" data-target="#comment"""),_display_(/*252.116*/p/*252.117*/.id),format.raw/*252.120*/("""" ng-click="submitMsg()">Submit</button>
                                                </div>
                                            </div>
                                            <div class="panel-body" style="padding: 5px 0 0">

                                                    <ul class="timeline" style="margin-right: 45px">
                                                        <li class=""""),format.raw/*258.68*/("""{"""),format.raw/*258.69*/("""{"""),format.raw/*258.70*/("""comment.who"""),format.raw/*258.81*/("""}"""),format.raw/*258.82*/("""}"""),format.raw/*258.83*/(""" """),format.raw/*258.84*/("""comment" ng-repeat="comment in comments">
                                                            <div class="timeline-badge primary"><i class="fa fa-user" style="margin-top: 13px"></i></div>
                                                            <div class="timeline-panel">
                                                                <div class="timeline-heading">
                                                                    <a class="btn btn-info pull-right" data-toggle="collapse" href="#subcomment"""),format.raw/*262.144*/("""{"""),format.raw/*262.145*/("""{"""),format.raw/*262.146*/("""comment.cid"""),format.raw/*262.157*/("""}"""),format.raw/*262.158*/("""}"""),format.raw/*262.159*/("""" aria-expanded="false" aria-controls="collapseExample">
                                                                        Show
                                                                    </a>
                                                                    <h4 class="timeline-title" style="margin-left: 10px; margin-bottom: 0">
                                                                        <u>"""),format.raw/*266.76*/("""{"""),format.raw/*266.77*/("""{"""),format.raw/*266.78*/("""comment.subject"""),format.raw/*266.93*/("""}"""),format.raw/*266.94*/("""}"""),format.raw/*266.95*/("""</u>
                                                                        <br>
                                                                        <p style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*268.142*/("""{"""),format.raw/*268.143*/("""{"""),format.raw/*268.144*/("""comment.username"""),format.raw/*268.160*/("""}"""),format.raw/*268.161*/("""}"""),format.raw/*268.162*/(""")</p>
                                                                    </h4>
                                                                </div>
                                                                <div class="collapse" id="subcomment"""),format.raw/*271.101*/("""{"""),format.raw/*271.102*/("""{"""),format.raw/*271.103*/("""comment.cid"""),format.raw/*271.114*/("""}"""),format.raw/*271.115*/("""}"""),format.raw/*271.116*/("""">
                                                                    <hr class="hr" style="margin: 15px 0 10px">
                                                                    <div class="container-fluid" style="margin-bottom: 20px">
                                                                        """),format.raw/*274.73*/("""{"""),format.raw/*274.74*/("""{"""),format.raw/*274.75*/("""comment.content"""),format.raw/*274.90*/("""}"""),format.raw/*274.91*/("""}"""),format.raw/*274.92*/("""
                                                                    """),format.raw/*275.69*/("""</div>

                                                                    <div class="container-fluid" ng-repeat="subcomment in comment.subcomments" style="padding: 0">
                                                                        <hr class="hr" style="margin: 5px 0">
                                                                        <div class="container-fluid">
                                                                            <small class="pull-right text-muted">
                                                                                <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*281.119*/("""{"""),format.raw/*281.120*/("""{"""),format.raw/*281.121*/("""subcomment.date"""),format.raw/*281.136*/("""}"""),format.raw/*281.137*/("""}"""),format.raw/*281.138*/(""""></i>
                                                                            </small>
                                                                            <b>"""),format.raw/*283.80*/("""{"""),format.raw/*283.81*/("""{"""),format.raw/*283.82*/("""subcomment.username"""),format.raw/*283.101*/("""}"""),format.raw/*283.102*/("""}"""),format.raw/*283.103*/("""</b> - """),format.raw/*283.110*/("""{"""),format.raw/*283.111*/("""{"""),format.raw/*283.112*/("""subcomment.content"""),format.raw/*283.130*/("""}"""),format.raw/*283.131*/("""}"""),format.raw/*283.132*/("""
                                                                        """),format.raw/*284.73*/("""</div>
                                                                    </div>
                                                                    <div class="panel-footer" style="margin-left: -15px; margin-right: -15px; margin-bottom: -15px; margin-top: 5px">
                                                                        <div class="input-group">
                                                                            <input id="btn-input" type="text" class="form-control input-sm" placeholder=""""),format.raw/*288.154*/("""{"""),format.raw/*288.155*/("""{"""),format.raw/*288.156*/("""comment.username"""),format.raw/*288.172*/("""}"""),format.raw/*288.173*/("""}"""),format.raw/*288.174*/(""" """),format.raw/*288.175*/("""says..."
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
                                        """)))}),format.raw/*301.42*/("""
                                    """)))}),format.raw/*302.38*/("""
                                """),format.raw/*303.33*/("""</div>
                            </div>
                        </div>
                    </div>
                </div>

                    <!--bootstrap-->
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

                    <!--sb-Admin-->
                <script src=""""),_display_(/*313.31*/routes/*313.37*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*313.76*/(""""></script>

                <script src=""""),_display_(/*315.31*/routes/*315.37*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*315.97*/(""""></script>
        </body>
    </html>
""")))}))}
  }

  def render(title:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)

  def f:((String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => apply(title)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/discussion_chat_test.scala.html
                  HASH: 69df5a2f90cd80065915d3bdc8ed9d598b79a767
                  MATRIX: 745->1|868->36|895->38|944->79|1004->102|1035->107|1106->152|1124->162|1161->179|1197->189|1269->235|1283->241|1350->287|2022->931|2052->932|2089->942|2158->983|2187->984|2216->985|2332->1072|2362->1073|2392->1074|2450->1103|2480->1104|2510->1105|2540->1106|2570->1107|2648->1157|2677->1158|2706->1159|2821->1245|2851->1246|2881->1247|2936->1273|2966->1274|2996->1275|3026->1276|3056->1277|3160->1353|3189->1354|3225->1363|3262->1372|3291->1373|3320->1374|3406->1432|3435->1433|3512->1481|3542->1482|3654->1565|3684->1566|3714->1567|3770->1594|3800->1595|3830->1596|3860->1597|3890->1598|3929->1610|3958->1611|3994->1620|4039->1637|4068->1638|4097->1639|4126->1640|4155->1641|4316->1774|4345->1775|4381->1784|4476->1852|4505->1853|4541->1862|4583->1877|4603->1888|4627->1891|4731->1967|4760->1968|4796->1977|4885->2038|4914->2039|4991->2087|5021->2088|5063->2103|5092->2104|5129->2114|5186->2143|5215->2144|5251->2153|5321->2195|5350->2196|5379->2197|5495->2284|5525->2285|5555->2286|5613->2315|5643->2316|5673->2317|5703->2318|5733->2319|5837->2395|5866->2396|5902->2405|5939->2414|5968->2415|5997->2416|6146->2536|6176->2537|6206->2538|6262->2565|6292->2566|6322->2567|6352->2568|6382->2569|6421->2581|6450->2582|6486->2591|6561->2638|6590->2639|6626->2648|6721->2716|6750->2717|6786->2726|6815->2727|6962->2846|6991->2847|7027->2856|7116->2917|7145->2918|7200->2945|7229->2946|7452->3141|7481->3142|7594->3226|7624->3227|7654->3228|7709->3254|7739->3255|7769->3256|7832->3292|7861->3293|8034->3438|8063->3439|8099->3448|8202->3524|8231->3525|8296->3562|8325->3563|8361->3572|8469->3652|8498->3653|8527->3654|8638->3738|8667->3739|8752->3796|8781->3797|8817->3806|8913->3875|8942->3876|9054->3960|9083->3961|9119->3970|9167->3990|9196->3991|9225->3992|9429->4168|9458->4169|9589->4273|9618->4274|9750->4378|9779->4379|9815->4388|9869->4414|9898->4415|9934->4424|9987->4450|10016->4451|10054->4462|10083->4463|10211->4563|10240->4564|10276->4573|10337->4606|10366->4607|10402->4616|10603->4790|10632->4791|10668->4800|10697->4801|10759->4836|10788->4837|10916->4937|10974->4973|11020->4990|11093->5035|11111->5043|11167->5077|11217->5098|11579->5432|11623->5459|11664->5461|11734->5503|11787->5546|11828->5548|11902->5593|12140->5803|12151->5804|12176->5807|12227->5829|12239->5830|12265->5833|12315->5854|12327->5855|12357->5862|12473->5959|12487->5964|12527->5965|12601->6010|12824->6205|12835->6206|12860->6209|12911->6231|12923->6232|12949->6235|12999->6256|13011->6257|13041->6264|13169->6360|13239->6398|13305->6435|13500->6602|13544->6629|13584->6630|13650->6668|13703->6711|13743->6712|13813->6753|13893->6805|13904->6806|13929->6809|14515->7366|14527->7367|14553->7370|14803->7643|14877->7688|14922->7705|14933->7706|14958->7709|15342->8064|15354->8065|15380->8068|17537->10197|17548->10198|17574->10201|17895->10493|17907->10494|17933->10497|18372->10907|18402->10908|18432->10909|18472->10920|18502->10921|18532->10922|18562->10923|19115->11446|19146->11447|19177->11448|19218->11459|19249->11460|19280->11461|19731->11883|19761->11884|19791->11885|19835->11900|19865->11901|19895->11902|20148->12125|20179->12126|20210->12127|20256->12143|20287->12144|20318->12145|20599->12396|20630->12397|20661->12398|20702->12409|20733->12410|20764->12411|21106->12724|21136->12725|21166->12726|21210->12741|21240->12742|21270->12743|21368->12812|22013->13427|22044->13428|22075->13429|22120->13444|22151->13445|22182->13446|22382->13617|22412->13618|22442->13619|22491->13638|22522->13639|22553->13640|22590->13647|22621->13648|22652->13649|22700->13667|22731->13668|22762->13669|22864->13742|23409->14257|23440->14258|23471->14259|23517->14275|23548->14276|23579->14277|23610->14278|24771->15420|24785->15425|24825->15426|24895->15467|24965->15509|24976->15510|25001->15513|25587->16070|25599->16071|25625->16074|25875->16347|25949->16392|25994->16409|26005->16410|26030->16413|26414->16768|26426->16769|26452->16772|28609->18901|28620->18902|28646->18905|28967->19197|28979->19198|29005->19201|29444->19611|29474->19612|29504->19613|29544->19624|29574->19625|29604->19626|29634->19627|30187->20150|30218->20151|30249->20152|30290->20163|30321->20164|30352->20165|30803->20587|30833->20588|30863->20589|30907->20604|30937->20605|30967->20606|31220->20829|31251->20830|31282->20831|31328->20847|31359->20848|31390->20849|31671->21100|31702->21101|31733->21102|31774->21113|31805->21114|31836->21115|32178->21428|32208->21429|32238->21430|32282->21445|32312->21446|32342->21447|32440->21516|33085->22131|33116->22132|33147->22133|33192->22148|33223->22149|33254->22150|33454->22321|33484->22322|33514->22323|33563->22342|33594->22343|33625->22344|33662->22351|33693->22352|33724->22353|33772->22371|33803->22372|33834->22373|33936->22446|34481->22961|34512->22962|34543->22963|34589->22979|34620->22980|34651->22981|34682->22982|35855->24123|35925->24161|35987->24194|36345->24524|36361->24530|36422->24569|36493->24612|36509->24618|36591->24678
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|49->21|49->21|51->23|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|54->26|54->26|54->26|54->26|54->26|54->26|54->26|54->26|54->26|54->26|54->26|56->28|56->28|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|62->34|62->34|63->35|64->36|64->36|65->37|65->37|65->37|65->37|67->39|67->39|68->40|68->40|68->40|68->40|68->40|69->41|69->41|71->43|71->43|71->43|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|77->49|77->49|78->50|78->50|78->50|79->51|80->52|80->52|81->53|81->53|83->55|83->55|84->56|84->56|84->56|84->56|84->56|88->60|88->60|88->60|88->60|88->60|88->60|88->60|88->60|90->62|90->62|92->64|92->64|93->65|95->67|95->67|96->68|96->68|97->69|98->70|98->70|98->70|101->73|101->73|102->74|102->74|103->75|104->76|104->76|106->78|106->78|107->79|107->79|107->79|107->79|108->80|108->80|111->83|111->83|113->85|113->85|114->86|114->86|114->86|115->87|116->88|116->88|117->89|117->89|119->91|119->91|120->92|120->92|120->92|121->93|123->95|123->95|124->96|124->96|126->98|126->98|131->103|131->103|132->104|133->105|133->105|133->105|134->106|139->111|139->111|139->111|140->112|140->112|140->112|141->113|142->114|142->114|142->114|142->114|142->114|142->114|142->114|142->114|142->114|144->116|144->116|144->116|145->117|146->118|146->118|146->118|146->118|146->118|146->118|146->118|146->118|146->118|148->120|149->121|150->122|154->126|154->126|154->126|155->127|155->127|155->127|156->128|156->128|156->128|156->128|162->134|162->134|162->134|165->137|166->138|166->138|166->138|166->138|168->140|168->140|168->140|191->163|191->163|191->163|193->165|193->165|193->165|199->171|199->171|199->171|199->171|199->171|199->171|199->171|203->175|203->175|203->175|203->175|203->175|203->175|207->179|207->179|207->179|207->179|207->179|207->179|209->181|209->181|209->181|209->181|209->181|209->181|212->184|212->184|212->184|212->184|212->184|212->184|215->187|215->187|215->187|215->187|215->187|215->187|216->188|222->194|222->194|222->194|222->194|222->194|222->194|224->196|224->196|224->196|224->196|224->196|224->196|224->196|224->196|224->196|224->196|224->196|224->196|225->197|229->201|229->201|229->201|229->201|229->201|229->201|229->201|242->214|242->214|242->214|243->215|243->215|243->215|243->215|249->221|249->221|249->221|252->224|253->225|253->225|253->225|253->225|255->227|255->227|255->227|278->250|278->250|278->250|280->252|280->252|280->252|286->258|286->258|286->258|286->258|286->258|286->258|286->258|290->262|290->262|290->262|290->262|290->262|290->262|294->266|294->266|294->266|294->266|294->266|294->266|296->268|296->268|296->268|296->268|296->268|296->268|299->271|299->271|299->271|299->271|299->271|299->271|302->274|302->274|302->274|302->274|302->274|302->274|303->275|309->281|309->281|309->281|309->281|309->281|309->281|311->283|311->283|311->283|311->283|311->283|311->283|311->283|311->283|311->283|311->283|311->283|311->283|312->284|316->288|316->288|316->288|316->288|316->288|316->288|316->288|329->301|330->302|331->303|341->313|341->313|341->313|343->315|343->315|343->315
                  -- GENERATED --
              */
          