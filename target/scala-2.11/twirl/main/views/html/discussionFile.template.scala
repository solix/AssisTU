
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
object discussionFile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,Person,Project,S3File,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person)(project: Project)(document: S3File)(message_form: Form[_])(info: Boolean, theme: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.143*/("""
"""),format.raw/*2.1*/("""<html lang="en">
    <head>
        """),_display_(/*4.10*/linkLoader/*4.20*/.headlinks(title)),format.raw/*4.37*/("""
        """),format.raw/*5.9*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*5.55*/routes/*5.61*/.Assets.at("css/message.css")),format.raw/*5.90*/("""">
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*9.14*/dashboard("project", currentUser)),format.raw/*9.47*/("""
            """),format.raw/*10.13*/("""<div id="page-wrapper">
                """),_display_(/*11.18*/template/*11.26*/.headericon("fa fa-file-text-o fa-5x")),format.raw/*11.64*/("""
                """),format.raw/*12.17*/("""<div class="row" style="text-align: center">
                    <h3>Create a new message about <br> """),_display_(/*13.58*/document/*13.66*/.name),format.raw/*13.71*/("""</h3>
                </div>
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                """),_display_(/*16.18*/if(info)/*16.26*/ {_display_(Seq[Any](format.raw/*16.28*/("""
                    """),_display_(/*17.22*/template/*17.30*/.alert(theme, message)),format.raw/*17.52*/("""
                """)))}),format.raw/*18.18*/("""
                """),format.raw/*19.17*/("""</div>
                """),_display_(/*20.18*/helper/*20.24*/.form(action = routes.DiscussionData.postExternalMessage())/*20.83*/ {_display_(Seq[Any](format.raw/*20.85*/("""
                    """),format.raw/*21.21*/("""<div class="row" style="margin-top: 30px; margin-right: 40px">
                        <div class="col-xs-8 col-xs-offset-2">
                            <ul class="message" style="padding: 0; margin: 0">
                                <li>
                                    """),_display_(/*25.38*/defining(Role.find.where().eq("project",project).eq("person",currentUser).findUnique().role)/*25.130*/ { role =>_display_(Seq[Any](format.raw/*25.140*/("""
                                        """),_display_(/*26.42*/if(role.equals(Role.OWNER))/*26.69*/{_display_(Seq[Any](format.raw/*26.70*/("""
                                            """),format.raw/*27.45*/("""<div class="message-badge primary">
                                                <i class="fa fa-mortar-board" style="margin-top: 15px"></i>
                                            </div>
                                        """)))}),format.raw/*30.42*/("""
                                        """),_display_(/*31.42*/if(role.equals(Role.REVIEWER))/*31.72*/{_display_(Seq[Any](format.raw/*31.73*/("""
                                            """),format.raw/*32.45*/("""<div class="message-badge danger">
                                                <i class="fa fa-edit" style="margin-left: 4px; margin-top: 15px"></i>
                                            </div>
                                        """)))}),format.raw/*35.42*/("""
                                        """),_display_(/*36.42*/if(role.equals(Role.GUEST))/*36.69*/{_display_(Seq[Any](format.raw/*36.70*/("""
                                            """),format.raw/*37.45*/("""<div class="message-badge info">
                                                <i class="fa fa-suitcase" style="margin-left: 4px; margin-top: 15px"></i>
                                            </div>
                                        """)))}),format.raw/*40.42*/("""
                                    """)))}),format.raw/*41.38*/("""
                                    """),format.raw/*42.37*/("""<div class="message-panel" style="margin-left: 40px">
                                        <div class="message-heading">
                                            <input type="text" name="subject" class="form-control" value=""""),_display_(/*44.108*/message_form("subject")/*44.131*/.value),format.raw/*44.137*/("""" placeholder="Your subject here...">
                                            <hr class="hr" style="margin: 15px 0 10px">
                                            <textarea class="form-control" name="content" rows="5" placeholder="Your message here...">"""),_display_(/*46.136*/message_form("content")/*46.159*/.value),format.raw/*46.165*/("""</textarea>
                                            <hr class="hr" style="margin: 15px 0 10px">
                                            <input type="hidden" name="attachment" value=""""),_display_(/*48.92*/document/*48.100*/.id),format.raw/*48.103*/("""">
                                            <input type="hidden" name="projectID" value=""""),_display_(/*49.91*/document/*49.99*/.project.id),format.raw/*49.110*/("""">
                                            <p style="margin: 0; font-size: small"><b>Attachment</b>: """),_display_(/*50.104*/document/*50.112*/.name),format.raw/*50.117*/("""</p>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <a type="button" class="btn btn-default col-xs-12" href=""""),_display_(/*59.87*/routes/*59.93*/.ProjectData.project(project.id)),format.raw/*59.125*/("""">Cancel</a>
                        </div>
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <button type="submit" class="btn btn-success col-xs-12">Post!</button>
                        </div>
                    </div>
                """)))}),format.raw/*65.18*/("""
            """),format.raw/*66.13*/("""</div>
        </div>
            <!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*73.68*/(""""></script>
            <!--MetisMenu javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*75.89*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tour/0.10.1/js/bootstrap-tour.min.js"></script>
        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.at("javascripts/walkthrough.js")),format.raw/*77.69*/(""""></script>
    </body>
</html>
"""))}
  }

  def render(title:String,currentUser:Person,project:Project,document:S3File,message_form:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},info:Boolean,theme:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)(project)(document)(message_form)(info,theme,message)

  def f:((String) => (Person) => (Project) => (S3File) => (Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => (Boolean,String,String) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => (project) => (document) => (message_form) => (info,theme,message) => apply(title)(currentUser)(project)(document)(message_form)(info,theme,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/discussionFile.scala.html
                  HASH: 385f2d7c1311f71813e72791a196b9d1086da80b
                  MATRIX: 855->1|1085->142|1112->143|1175->180|1193->190|1230->207|1265->216|1337->262|1351->268|1400->297|1492->363|1545->396|1586->409|1654->450|1671->458|1730->496|1775->513|1904->615|1921->623|1947->628|2100->754|2117->762|2157->764|2206->786|2223->794|2266->816|2315->834|2360->851|2411->875|2426->881|2494->940|2534->942|2583->963|2889->1242|2991->1334|3040->1344|3109->1386|3145->1413|3184->1414|3257->1459|3524->1695|3593->1737|3632->1767|3671->1768|3744->1813|4020->2058|4089->2100|4125->2127|4164->2128|4237->2173|4515->2420|4584->2458|4649->2495|4908->2726|4941->2749|4969->2755|5258->3016|5291->3039|5319->3045|5537->3236|5555->3244|5580->3247|5700->3340|5717->3348|5750->3359|5884->3465|5902->3473|5929->3478|6453->3975|6468->3981|6522->4013|6873->4333|6914->4346|7295->4700|7310->4706|7370->4745|7499->4847|7514->4853|7595->4913|7774->5065|7789->5071|7850->5111
                  LINES: 28->1|31->1|32->2|34->4|34->4|34->4|35->5|35->5|35->5|35->5|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|46->16|46->16|46->16|47->17|47->17|47->17|48->18|49->19|50->20|50->20|50->20|50->20|51->21|55->25|55->25|55->25|56->26|56->26|56->26|57->27|60->30|61->31|61->31|61->31|62->32|65->35|66->36|66->36|66->36|67->37|70->40|71->41|72->42|74->44|74->44|74->44|76->46|76->46|76->46|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|89->59|89->59|89->59|95->65|96->66|103->73|103->73|103->73|105->75|105->75|105->75|107->77|107->77|107->77
                  -- GENERATED --
              */
          