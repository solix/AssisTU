
package views.html.layouts

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
object calendarLayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Person,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(user: Person,content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
<head>
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png")),format.raw/*7.93*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*8.50*/routes/*8.56*/.Assets.at("bootstrap-2.0.2/css/bootstrap.min.css")),format.raw/*8.107*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css")),format.raw/*9.90*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*10.50*/routes/*10.56*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*10.118*/("""'>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
    <script src='"""),_display_(/*13.19*/routes/*13.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*13.74*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*14.19*/routes/*14.25*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*14.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*15.19*/routes/*15.25*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*15.68*/("""' type="text/javascript"></script>


</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="brand" href=""""),_display_(/*23.37*/routes/*23.43*/.CalendarData.calendar()),format.raw/*23.67*/("""">FullCalendar</a>

            <ul class="nav pull-right">
                <li >
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.CalendarData.list(user.id)),format.raw/*27.64*/("""">
                        <i class="icon-list icon-white"></i> Event's list</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="container-fluid">
    """),_display_(/*36.6*/content),format.raw/*36.13*/("""
"""),format.raw/*37.1*/("""</div>
</body>
</html>
"""))}
  }

  def render(title:String,user:Person,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(user,content)

  def f:((String) => (Person,Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (user,content) => apply(title)(user,content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/layouts/calendarLayout.scala.html
                  HASH: c238164856598fe1df67a1367204b5ecd071c80d
                  MATRIX: 752->1|883->44|910->45|979->88|1004->93|1093->156|1107->162|1159->194|1237->246|1251->252|1323->303|1401->355|1415->361|1469->395|1548->447|1563->453|1647->515|1933->774|1948->780|2018->829|2098->882|2113->888|2199->953|2279->1006|2294->1012|2358->1055|2580->1250|2595->1256|2640->1280|2779->1392|2794->1398|2842->1425|3058->1615|3086->1622|3114->1623
                  LINES: 26->1|29->1|30->2|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|51->23|51->23|51->23|55->27|55->27|55->27|64->36|64->36|65->37
                  -- GENERATED --
              */
          