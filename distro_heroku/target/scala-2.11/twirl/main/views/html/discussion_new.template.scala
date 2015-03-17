
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
object discussion_new extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Person,play.twirl.api.HtmlFormat.Appendable] {

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

        angular.module('sseChat', ['sseChat.controllers']).filter('hasSameSubject', function()"""),format.raw/*18.95*/("""{"""),format.raw/*18.96*/("""
            """),format.raw/*19.13*/("""console.log("Inside filter");
            return function(subcomments, subject)"""),format.raw/*20.50*/("""{"""),format.raw/*20.51*/("""
                """),format.raw/*21.17*/("""var arrayToReturn = [];
                for (var i=0; i<subcomments.length; i++)"""),format.raw/*22.57*/("""{"""),format.raw/*22.58*/("""
                    """),format.raw/*23.21*/("""if (subcomments[i].subject == subject) """),format.raw/*23.60*/("""{"""),format.raw/*23.61*/("""
                        """),format.raw/*24.25*/("""arrayToReturn.push(subcomments[i]);
                    """),format.raw/*25.21*/("""}"""),format.raw/*25.22*/("""
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/("""
            """),format.raw/*27.13*/("""return arrayToReturn;
            """),format.raw/*28.13*/("""}"""),format.raw/*28.14*/(""";
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
        </script>
        <script id="controller" type="text/javascript">
        'use strict';
        /** Controllers */
        angular.module('sseChat.controllers', []).controller('ChatCtrl', function ($scope, $http) """),format.raw/*34.99*/("""{"""),format.raw/*34.100*/("""

            """),format.raw/*36.13*/("""$scope.projectids =[ ];
            $.ajax ( """),format.raw/*37.22*/("""{"""),format.raw/*37.23*/(""" """),format.raw/*37.24*/("""url : "/projectids", async : false, dataType : 'json', success : function ( response ) """),format.raw/*37.111*/("""{"""),format.raw/*37.112*/(""" """),format.raw/*37.113*/("""$scope.projectids = response """),format.raw/*37.142*/("""}"""),format.raw/*37.143*/(""" """),format.raw/*37.144*/("""}"""),format.raw/*37.145*/(""" """),format.raw/*37.146*/(""") ;
            $scope.lastpid = "";
            $.ajax ( """),format.raw/*39.22*/("""{"""),format.raw/*39.23*/(""" """),format.raw/*39.24*/("""url : "/projectid", async : false, dataType : 'json', success : function ( response ) """),format.raw/*39.110*/("""{"""),format.raw/*39.111*/(""" """),format.raw/*39.112*/("""$scope.lastpid = response """),format.raw/*39.138*/("""}"""),format.raw/*39.139*/(""" """),format.raw/*39.140*/("""}"""),format.raw/*39.141*/(""" """),format.raw/*39.142*/(""") ;
            $scope.comments =[ ] ;
            $.ajax ( """),format.raw/*41.22*/("""{"""),format.raw/*41.23*/(""" """),format.raw/*41.24*/("""url : "/comments", async : false, dataType : 'json', success : function ( response ) """),format.raw/*41.109*/("""{"""),format.raw/*41.110*/(""" """),format.raw/*41.111*/("""$scope.comments = response """),format.raw/*41.138*/("""}"""),format.raw/*41.139*/(""" """),format.raw/*41.140*/("""}"""),format.raw/*41.141*/(""" """),format.raw/*41.142*/(""") ;
            console.log("COMMENTS: " + JSON.stringify($scope.comments));
            $scope.subcomments =[ ] ;
            $.ajax ( """),format.raw/*44.22*/("""{"""),format.raw/*44.23*/(""" """),format.raw/*44.24*/("""url : "/subcomments", async : false, dataType : 'json', success : function ( response ) """),format.raw/*44.112*/("""{"""),format.raw/*44.113*/(""" """),format.raw/*44.114*/("""$scope.subcomments = response """),format.raw/*44.144*/("""}"""),format.raw/*44.145*/(""" """),format.raw/*44.146*/("""}"""),format.raw/*44.147*/(""" """),format.raw/*44.148*/(""") ;
            console.log("SUBCOMMENTS: " + JSON.stringify($scope.subcomments));

            $scope.message = """),format.raw/*47.30*/("""{"""),format.raw/*47.31*/(""" """),format.raw/*47.32*/("""}"""),format.raw/*47.33*/(""" """),format.raw/*47.34*/(""";
            $scope.message.subject = "" ;
            $scope.message.content = "" ;
            for(var i = 0; i < $scope.comments.length; i++)"""),format.raw/*50.60*/("""{"""),format.raw/*50.61*/("""
                """),format.raw/*51.17*/("""$scope.message["subcomment" + $scope.comments[i].cid] = "";
            """),format.raw/*52.13*/("""}"""),format.raw/*52.14*/("""

            """),format.raw/*54.13*/("""$scope.isChild = false ;
            $scope.currentProject = $.grep($scope.projectids, function(p)"""),format.raw/*55.74*/("""{"""),format.raw/*55.75*/("""return p.projectID === $scope.lastpid.projectID;"""),format.raw/*55.123*/("""}"""),format.raw/*55.124*/(""")[0 ];
            console.log("INITIAL ROOM: " + JSON.stringify($scope.currentProject));

            /** change current room, restart EventSource connection */
            $scope.setCurrentProject = function (pid) """),format.raw/*59.55*/("""{"""),format.raw/*59.56*/("""
                """),format.raw/*60.17*/("""$scope.currentProject = $.grep($scope.projectids, function(p)"""),format.raw/*60.78*/("""{"""),format.raw/*60.79*/("""return p.projectID === pid;"""),format.raw/*60.106*/("""}"""),format.raw/*60.107*/(""")[0 ];
                console.log("Current Project is set to: " + JSON.stringify($scope.currentProject));
                $scope.chatFeed.close();
                $scope.comments =[ ] ;
                $.ajax ( """),format.raw/*64.26*/("""{"""),format.raw/*64.27*/(""" """),format.raw/*64.28*/("""url : "/comments", async : false, dataType : 'json', success : function ( response ) """),format.raw/*64.113*/("""{"""),format.raw/*64.114*/(""" """),format.raw/*64.115*/("""$scope.comments = response """),format.raw/*64.142*/("""}"""),format.raw/*64.143*/(""" """),format.raw/*64.144*/("""}"""),format.raw/*64.145*/(""" """),format.raw/*64.146*/(""") ;
                console.log("COMMENTS: " + JSON.stringify($scope.comments));
                $scope.subcomments =[ ] ;
                $.ajax ( """),format.raw/*67.26*/("""{"""),format.raw/*67.27*/(""" """),format.raw/*67.28*/("""url : "/subcomments", async : false, dataType : 'json', success : function ( response ) """),format.raw/*67.116*/("""{"""),format.raw/*67.117*/(""" """),format.raw/*67.118*/("""$scope.subcomments = response """),format.raw/*67.148*/("""}"""),format.raw/*67.149*/(""" """),format.raw/*67.150*/("""}"""),format.raw/*67.151*/(""" """),format.raw/*67.152*/(""") ;
                console.log("SUBCOMMENTS: " + JSON.stringify($scope.subcomments));
                $scope.listen();
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/(""";

            /** change current subject, restart EventSource connection */
            $scope.setCurrentSubjectAndisChild = function (subject, isChild) """),format.raw/*73.78*/("""{"""),format.raw/*73.79*/("""
                """),format.raw/*74.17*/("""$scope.message.subject = subject;
                $scope.isChild = isChild;
                console.log("Current Subject and isChild is set to: " + $scope.message.subject + ", " + $scope.isChild);
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/(""";

            $scope.reset = function () """),format.raw/*79.40*/("""{"""),format.raw/*79.41*/("""
                """),format.raw/*80.17*/("""$scope.message = """),format.raw/*80.34*/("""{"""),format.raw/*80.35*/("""}"""),format.raw/*80.36*/(""";
                $scope.message.subject = "";
                $scope.message.content = "";
                for(var i = 0; i < $scope.comments.length; i++)"""),format.raw/*83.64*/("""{"""),format.raw/*83.65*/("""
                    """),format.raw/*84.21*/("""$scope.message["subcomment" + $scope.comments[i].cid] = "";
                """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/("""
                """),format.raw/*86.17*/("""console.log("input has been reset");
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/(""";

            $scope.setSubmessageAsContent = function (cid) """),format.raw/*89.60*/("""{"""),format.raw/*89.61*/("""
                """),format.raw/*90.17*/("""$scope.message.content = $scope.message["subcomment" + cid];
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/(""";

            /** posting chat text to server */
            $scope.submitMsg = function () """),format.raw/*94.44*/("""{"""),format.raw/*94.45*/("""
                """),format.raw/*95.17*/("""$http.post("/chat", """),format.raw/*95.37*/("""{"""),format.raw/*95.38*/(""" """),format.raw/*95.39*/("""subject: $scope.message.subject, content: $scope.message.content,
                                      date: (new Date()).toUTCString(), projectID: $scope.currentProject.projectID, isChild: $scope.isChild"""),format.raw/*96.140*/("""}"""),format.raw/*96.141*/(""");
                console.log("Message has been submitted");
               $scope.reset();
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/(""";

            /** handle incoming messages: add to messages array */
            $scope.addMsg = function (msg) """),format.raw/*102.44*/("""{"""),format.raw/*102.45*/("""
                """),format.raw/*103.17*/("""console.log("Adding message: " + JSON.stringify(JSON.parse(msg.data)));
                var newmessage = JSON.parse(msg.data);
                $scope.$apply(function () """),format.raw/*105.43*/("""{"""),format.raw/*105.44*/("""
                    """),format.raw/*106.21*/("""if(newmessage["isChild"] === true)"""),format.raw/*106.55*/("""{"""),format.raw/*106.56*/("""
                        """),format.raw/*107.25*/("""console.log("this was a subcomment.");
                        $scope.subcomments.push(newmessage);
                        console.log("SUBCOMMENTS: " + JSON.stringify($scope.subcomments));
                    """),format.raw/*110.21*/("""}"""),format.raw/*110.22*/(""" """),format.raw/*110.23*/("""else """),format.raw/*110.28*/("""{"""),format.raw/*110.29*/("""
                        """),format.raw/*111.25*/("""console.log("this was a regular comment.");
                        $scope.comments.push(newmessage);
                        console.log("COMMENTS: " + JSON.stringify($scope.comments));
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/("""
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/(""");
            """),format.raw/*116.13*/("""}"""),format.raw/*116.14*/(""";

            /** start listening on messages from selected room */
            $scope.listen = function () """),format.raw/*119.41*/("""{"""),format.raw/*119.42*/("""
                """),format.raw/*120.17*/("""console.log("Incoming message")
                if($scope.projectids.length > 0) """),format.raw/*121.50*/("""{"""),format.raw/*121.51*/("""
                    """),format.raw/*122.21*/("""$scope.chatFeed = new EventSource ( "/chatFeed/" + $scope.currentProject.projectID ) ;
                    $scope.chatFeed.addEventListener ( "message", $scope.addMsg, false ) ;
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/(""";

            $scope.listen();

            $scope.isEqual = function(subcomment, mainsubject)"""),format.raw/*129.63*/("""{"""),format.raw/*129.64*/("""
                """),format.raw/*130.17*/("""console.log("COMPARING " + JSON.stringify(subcomment) + " with " + mainsubject);
                return subcomment.subject == mainsubject;
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/("""
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/(""");
        </script>
        </head>
        <body>
            <div id="wrapper">
                """),_display_(/*138.18*/dashboard("discussion", currentUser)),format.raw/*138.54*/("""
                """),format.raw/*139.17*/("""<div id="page-wrapper">
                    """),_display_(/*140.22*/template/*140.30*/.headericon("fa fa-comment fa-5x")),format.raw/*140.64*/("""
                    """),format.raw/*141.21*/("""<div ng-app="sseChat">
                        <div ng-controller="ChatCtrl">
                            <div class="container-fluid" style="text-align: center; margin: 0 0 1% 0">
                                <div role="tabpanel">
                                    <ul class="nav nav-tabs">
                                    """),_display_(/*146.38*/for(p <- activeProjectList) yield /*146.65*/ {_display_(Seq[Any](format.raw/*146.67*/("""
                                        """),_display_(/*147.42*/if(p.equals(PersonData.getLastUsedProject))/*147.85*/ {_display_(Seq[Any](format.raw/*147.87*/("""
                                            """),format.raw/*148.45*/("""<li role="presentation" class="active" style="width : 18%; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                                                <a ng-click="setCurrentProject('"""),_display_(/*149.82*/p/*149.83*/.id),format.raw/*149.86*/("""')" href="#discussion"""),_display_(/*149.108*/p/*149.109*/.id),format.raw/*149.112*/("""" data-toggle="tab">"""),_display_(/*149.133*/p/*149.134*/.folder),format.raw/*149.141*/("""</a>
                                            </li>
                                        """)))}/*151.43*/else/*151.48*/{_display_(Seq[Any](format.raw/*151.49*/("""
                                            """),format.raw/*152.45*/("""<li role="presentation" style="width : 18%; overflow : hidden ; white-space : nowrap ; text-overflow : ellipsis">
                                                <a ng-click="setCurrentProject('"""),_display_(/*153.82*/p/*153.83*/.id),format.raw/*153.86*/("""')" href="#discussion"""),_display_(/*153.108*/p/*153.109*/.id),format.raw/*153.112*/("""" data-toggle="tab">"""),_display_(/*153.133*/p/*153.134*/.folder),format.raw/*153.141*/("""</a>
                                            </li>
                                        """)))}),format.raw/*155.42*/("""
                                    """)))}),format.raw/*156.38*/("""
                                    """),format.raw/*157.37*/("""</ul>
                                </div>
                            </div>
                            <div class="tab-content">
                            """),_display_(/*161.30*/for(p <- activeProjectList) yield /*161.57*/{_display_(Seq[Any](format.raw/*161.58*/("""
                                """),_display_(/*162.34*/if(p.equals(PersonData.getLastUsedProject))/*162.77*/{_display_(Seq[Any](format.raw/*162.78*/("""
                                    """),format.raw/*163.37*/("""<div class="tab-pane fade in active" id="discussion"""),_display_(/*163.89*/p/*163.90*/.id),format.raw/*163.93*/("""">
                                    """)))}/*164.39*/else/*164.44*/{_display_(Seq[Any](format.raw/*164.45*/("""
                                    """),format.raw/*165.37*/("""<div class="tab-pane fade" id="discussion"""),_display_(/*165.79*/p/*165.80*/.id),format.raw/*165.83*/("""">
                                    """)))}),format.raw/*166.38*/("""
                                        """),format.raw/*167.41*/("""<div class="row">
                                            <div class="col-xs-10">
                                                <h3 style="margin: 5px 0 0 30px;"><u>Discussions</u></h3>
                                            </div>
                                            <div class="col-xs-2">
                                                <button ng-click="setCurrentSubjectAndisChild('', false);" class="btn btn-success pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*172.188*/p/*172.189*/.id),format.raw/*172.192*/("""" style="margin: 0; margin-right: 30px;">Start new Discussion</button>
                                            </div>
                                        </div>
                                        <hr class="hr" style="margin: 15px 15px 0">
                                        <div id="comment"""),_display_(/*176.58*/p/*176.59*/.id),format.raw/*176.62*/("""" class="panel-footer collapse" style="margin-left: -30px; margin-right: -30px; padding: 15px 50px 50px">
                                            <div class="row" style="padding: 0; text-align: center">
                                                <button type="button" class="close pull-right" data-toggle="collapse" data-target="#comment"""),_display_(/*178.141*/p/*178.142*/.id),format.raw/*178.145*/("""" aria-label="Close"><span aria-hidden="true">&times;</span></button>
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
                                                data-toggle="collapse" data-target="#comment"""),_display_(/*201.94*/p/*201.95*/.id),format.raw/*201.98*/("""" type="button" style="width: 80px">Cancel</button>
                                                <button type="button" class="btn btn-success btn-sm" style="width: 80px"
                                                id="saySomething" data-toggle="collapse" data-target="#comment"""),_display_(/*203.112*/p/*203.113*/.id),format.raw/*203.116*/("""" ng-click="submitMsg()">Submit</button>
                                            </div>
                                        </div>
                                        <div class="panel-body" style="padding: 0">

                                            <ul class="timeline" style="margin-right: 30px; margin-bottom: 0; height: 80%">
                                                <li class=""""),format.raw/*209.60*/("""{"""),format.raw/*209.61*/("""{"""),format.raw/*209.62*/("""comment.who"""),format.raw/*209.73*/("""}"""),format.raw/*209.74*/("""}"""),format.raw/*209.75*/(""" """),format.raw/*209.76*/("""comment" ng-repeat="comment in comments | filter:"""),format.raw/*209.125*/("""{"""),format.raw/*209.126*/("""projectID: """),_display_(/*209.138*/p/*209.139*/.id),format.raw/*209.142*/("""}"""),format.raw/*209.143*/("""">
                                                    <div class="timeline-badge primary" ng-if="comment.role=='Owner'">
                                                        <i class="fa fa-user" style="margin-top: 13px"></i>
                                                    </div>
                                                    <div class="timeline-badge success" ng-if="comment.role=='Reviewer'">
                                                        <i class="fa fa-edit" style="margin-top: 13px"></i>
                                                    </div>
                                                    <div class="timeline-panel">
                                                        <div class="timeline-heading">
                                                            <a class="btn btn-info pull-right" data-toggle="collapse" href="#showSubCommentsOf"""),format.raw/*218.143*/("""{"""),format.raw/*218.144*/("""{"""),format.raw/*218.145*/("""comment.cid"""),format.raw/*218.156*/("""}"""),format.raw/*218.157*/("""}"""),format.raw/*218.158*/("""" aria-expanded="false" aria-controls="collapseExample">
                                                                Show
                                                            </a>
                                                            <h4 class="timeline-title" style="margin-left: 10px; margin-bottom: 0">
                                                                <u>"""),format.raw/*222.68*/("""{"""),format.raw/*222.69*/("""{"""),format.raw/*222.70*/("""comment.subject"""),format.raw/*222.85*/("""}"""),format.raw/*222.86*/("""}"""),format.raw/*222.87*/("""</u>
                                                                <br>
                                                                <p style="font-size: x-small; margin-bottom: 0; margin-top: 4px">(by """),format.raw/*224.134*/("""{"""),format.raw/*224.135*/("""{"""),format.raw/*224.136*/("""comment.username"""),format.raw/*224.152*/("""}"""),format.raw/*224.153*/("""}"""),format.raw/*224.154*/(""")</p>
                                                            </h4>
                                                        </div>
                                                        <div class="collapse" id="showSubCommentsOf"""),format.raw/*227.100*/("""{"""),format.raw/*227.101*/("""{"""),format.raw/*227.102*/("""comment.cid"""),format.raw/*227.113*/("""}"""),format.raw/*227.114*/("""}"""),format.raw/*227.115*/("""">
                                                            <hr class="hr" style="margin: 15px 0 10px">
                                                            <div class="container-fluid" style="margin-bottom: 20px; padding-right: 0">
                                                                <small class="pull-right text-muted" style="margin-right: 4px">
                                                                    <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*231.107*/("""{"""),format.raw/*231.108*/("""{"""),format.raw/*231.109*/("""comment.date"""),format.raw/*231.121*/("""}"""),format.raw/*231.122*/("""}"""),format.raw/*231.123*/(""""></i>
                                                                </small>
                                                                """),format.raw/*233.65*/("""{"""),format.raw/*233.66*/("""{"""),format.raw/*233.67*/("""comment.content"""),format.raw/*233.82*/("""}"""),format.raw/*233.83*/("""}"""),format.raw/*233.84*/("""
                                                            """),format.raw/*234.61*/("""</div>

                                                            <div class="container-fluid" ng-repeat="subcomment in subcomments | hasSameSubject:comment.subject" style="padding: 0">
                                                                <hr class="hr" style="margin: 5px 0">
                                                                <div class="container-fluid" style="padding-right: 0">
                                                                    <small class="pull-right text-muted" style="margin-top: 4px; margin-right: 4px">
                                                                        <i class="fa fa-clock-o fa-fw" title=""""),format.raw/*240.111*/("""{"""),format.raw/*240.112*/("""{"""),format.raw/*240.113*/("""subcomment.date"""),format.raw/*240.128*/("""}"""),format.raw/*240.129*/("""}"""),format.raw/*240.130*/(""""></i>
                                                                    </small>
                                                                    <b>"""),format.raw/*242.72*/("""{"""),format.raw/*242.73*/("""{"""),format.raw/*242.74*/("""subcomment.username"""),format.raw/*242.93*/("""}"""),format.raw/*242.94*/("""}"""),format.raw/*242.95*/("""</b> - """),format.raw/*242.102*/("""{"""),format.raw/*242.103*/("""{"""),format.raw/*242.104*/("""subcomment.content"""),format.raw/*242.122*/("""}"""),format.raw/*242.123*/("""}"""),format.raw/*242.124*/("""
                                                                """),format.raw/*243.65*/("""</div>
                                                            </div>
                                                            <div class="panel-footer" style="margin-left: -15px; margin-right: -15px; margin-bottom: -15px; margin-top: 5px">
                                                                <div class="input-group">
                                                                    <input id="btn-input" type="text" class="form-control input-sm" placeholder=""""),_display_(/*247.147*/currentUser/*247.158*/.name),format.raw/*247.163*/(""" """),format.raw/*247.164*/("""says..."
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
                                """)))}),format.raw/*260.34*/("""
                            """),format.raw/*261.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>

                <!--bootstrap-->
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

                <!--sb-Admin-->
            <script src=""""),_display_(/*271.27*/routes/*271.33*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*271.72*/(""""></script>

            <script src=""""),_display_(/*273.27*/routes/*273.33*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*273.93*/(""""></script>
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
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/discussion_new.scala.html
                  HASH: f7fafcf9b57bcf4fe3bfe71b78891850194f85d1
                  MATRIX: 739->1|862->36|889->38|938->79|998->102|1029->107|1100->152|1118->162|1155->179|1191->189|1263->235|1277->241|1344->287|1890->805|1919->806|1960->819|2067->898|2096->899|2141->916|2249->996|2278->997|2327->1018|2394->1057|2423->1058|2476->1083|2560->1139|2589->1140|2634->1157|2663->1158|2704->1171|2766->1205|2795->1206|2832->1216|2861->1217|3113->1441|3143->1442|3185->1456|3258->1501|3287->1502|3316->1503|3432->1590|3462->1591|3492->1592|3550->1621|3580->1622|3610->1623|3640->1624|3670->1625|3756->1683|3785->1684|3814->1685|3929->1771|3959->1772|3989->1773|4044->1799|4074->1800|4104->1801|4134->1802|4164->1803|4252->1863|4281->1864|4310->1865|4424->1950|4454->1951|4484->1952|4540->1979|4570->1980|4600->1981|4630->1982|4660->1983|4824->2119|4853->2120|4882->2121|4999->2209|5029->2210|5059->2211|5118->2241|5148->2242|5178->2243|5208->2244|5238->2245|5379->2358|5408->2359|5437->2360|5466->2361|5495->2362|5668->2507|5697->2508|5742->2525|5842->2597|5871->2598|5913->2612|6039->2710|6068->2711|6145->2759|6175->2760|6419->2976|6448->2977|6493->2994|6582->3055|6611->3056|6667->3083|6697->3084|6937->3296|6966->3297|6995->3298|7109->3383|7139->3384|7169->3385|7225->3412|7255->3413|7285->3414|7315->3415|7345->3416|7521->3564|7550->3565|7579->3566|7696->3654|7726->3655|7756->3656|7815->3686|7845->3687|7875->3688|7905->3689|7935->3690|8095->3822|8124->3823|8306->3977|8335->3978|8380->3995|8617->4204|8646->4205|8716->4247|8745->4248|8790->4265|8835->4282|8864->4283|8893->4284|9076->4439|9105->4440|9154->4461|9258->4537|9287->4538|9332->4555|9409->4604|9438->4605|9528->4667|9557->4668|9602->4685|9703->4758|9732->4759|9853->4852|9882->4853|9927->4870|9975->4890|10004->4891|10033->4892|10267->5097|10297->5098|10430->5203|10459->5204|10601->5317|10631->5318|10677->5335|10875->5504|10905->5505|10955->5526|11018->5560|11048->5561|11102->5586|11342->5797|11372->5798|11402->5799|11436->5804|11466->5805|11520->5830|11756->6037|11786->6038|11832->6055|11862->6056|11906->6071|11936->6072|12074->6181|12104->6182|12150->6199|12260->6280|12290->6281|12340->6302|12563->6496|12593->6497|12635->6510|12665->6511|12789->6606|12819->6607|12865->6624|13045->6775|13075->6776|13112->6785|13142->6786|13270->6886|13328->6922|13374->6939|13447->6984|13465->6992|13521->7026|13571->7047|13933->7381|13977->7408|14018->7410|14088->7452|14141->7495|14182->7497|14256->7542|14494->7752|14505->7753|14530->7756|14581->7778|14593->7779|14619->7782|14669->7803|14681->7804|14711->7811|14827->7908|14841->7913|14881->7914|14955->7959|15178->8154|15189->8155|15214->8158|15265->8180|15277->8181|15303->8184|15353->8205|15365->8206|15395->8213|15523->8309|15593->8347|15659->8384|15850->8547|15894->8574|15934->8575|15996->8609|16049->8652|16089->8653|16155->8690|16235->8742|16246->8743|16271->8746|16331->8787|16345->8792|16385->8793|16451->8830|16521->8872|16532->8873|16557->8876|16629->8916|16699->8957|17225->9454|17237->9455|17263->9458|17601->9768|17612->9769|17637->9772|18013->10119|18025->10120|18051->10123|20116->12160|20127->12161|20152->12164|20465->12448|20477->12449|20503->12452|20939->12859|20969->12860|20999->12861|21039->12872|21069->12873|21099->12874|21129->12875|21208->12924|21239->12925|21280->12937|21292->12938|21318->12941|21349->12942|22267->13830|22298->13831|22329->13832|22370->13843|22401->13844|22432->13845|22851->14235|22881->14236|22911->14237|22955->14252|22985->14253|23015->14254|23252->14461|23283->14462|23314->14463|23360->14479|23391->14480|23422->14481|23686->14715|23717->14716|23748->14717|23789->14728|23820->14729|23851->14730|24358->15207|24389->15208|24420->15209|24462->15221|24493->15222|24524->15223|24697->15367|24727->15368|24757->15369|24801->15384|24831->15385|24861->15386|24951->15447|25649->16115|25680->16116|25711->16117|25756->16132|25787->16133|25818->16134|26002->16289|26032->16290|26062->16291|26110->16310|26140->16311|26170->16312|26207->16319|26238->16320|26269->16321|26317->16339|26348->16340|26379->16341|26473->16406|26986->16890|27008->16901|27036->16906|27067->16907|28144->17952|28202->17981|28528->18279|28544->18285|28605->18324|28672->18363|28688->18369|28770->18429
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|46->18|46->18|47->19|48->20|48->20|49->21|50->22|50->22|51->23|51->23|51->23|52->24|53->25|53->25|54->26|54->26|55->27|56->28|56->28|57->29|57->29|62->34|62->34|64->36|65->37|65->37|65->37|65->37|65->37|65->37|65->37|65->37|65->37|65->37|65->37|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|75->47|75->47|75->47|75->47|75->47|78->50|78->50|79->51|80->52|80->52|82->54|83->55|83->55|83->55|83->55|87->59|87->59|88->60|88->60|88->60|88->60|88->60|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|95->67|95->67|95->67|95->67|95->67|95->67|95->67|95->67|98->70|98->70|101->73|101->73|102->74|105->77|105->77|107->79|107->79|108->80|108->80|108->80|108->80|111->83|111->83|112->84|113->85|113->85|114->86|115->87|115->87|117->89|117->89|118->90|119->91|119->91|122->94|122->94|123->95|123->95|123->95|123->95|124->96|124->96|127->99|127->99|130->102|130->102|131->103|133->105|133->105|134->106|134->106|134->106|135->107|138->110|138->110|138->110|138->110|138->110|139->111|142->114|142->114|143->115|143->115|144->116|144->116|147->119|147->119|148->120|149->121|149->121|150->122|152->124|152->124|153->125|153->125|157->129|157->129|158->130|160->132|160->132|161->133|161->133|166->138|166->138|167->139|168->140|168->140|168->140|169->141|174->146|174->146|174->146|175->147|175->147|175->147|176->148|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|179->151|179->151|179->151|180->152|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|183->155|184->156|185->157|189->161|189->161|189->161|190->162|190->162|190->162|191->163|191->163|191->163|191->163|192->164|192->164|192->164|193->165|193->165|193->165|193->165|194->166|195->167|200->172|200->172|200->172|204->176|204->176|204->176|206->178|206->178|206->178|229->201|229->201|229->201|231->203|231->203|231->203|237->209|237->209|237->209|237->209|237->209|237->209|237->209|237->209|237->209|237->209|237->209|237->209|237->209|246->218|246->218|246->218|246->218|246->218|246->218|250->222|250->222|250->222|250->222|250->222|250->222|252->224|252->224|252->224|252->224|252->224|252->224|255->227|255->227|255->227|255->227|255->227|255->227|259->231|259->231|259->231|259->231|259->231|259->231|261->233|261->233|261->233|261->233|261->233|261->233|262->234|268->240|268->240|268->240|268->240|268->240|268->240|270->242|270->242|270->242|270->242|270->242|270->242|270->242|270->242|270->242|270->242|270->242|270->242|271->243|275->247|275->247|275->247|275->247|288->260|289->261|299->271|299->271|299->271|301->273|301->273|301->273
                  -- GENERATED --
              */
          