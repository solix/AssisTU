
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
object calendar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Person,Form[Event],List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person,eventForm: Form[Event],events : List[Event] ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap

Seq[Any](format.raw/*1.82*/("""

  """),format.raw/*4.1*/("""  """),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<head>
  """),_display_(/*7.4*/linkLoader/*7.14*/.headlinks(title)),format.raw/*7.31*/("""
  """),format.raw/*8.3*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*8.48*/routes/*8.54*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*8.116*/("""'>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
  <script src='"""),_display_(/*11.17*/routes/*11.23*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*11.72*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*12.17*/routes/*12.23*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*12.88*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*13.17*/routes/*13.23*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*13.66*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*14.17*/routes/*14.23*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*14.72*/("""' type="text/javascript"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js" type="text/javascript"></script>
</head>
<body>

<div id="wrapper">

  """),_display_(/*21.4*/dashboard("calendar", currentUser)),format.raw/*21.38*/("""
    """),format.raw/*22.5*/("""<div id="page-wrapper">
        """),_display_(/*23.10*/template/*23.18*/.headericon("fa fa-calendar fa-5x")),format.raw/*23.53*/("""

  """),format.raw/*25.3*/("""<a  class="btn btn-default btn=sm" href=""""),_display_(/*25.45*/routes/*25.51*/.CalendarData.list(currentUser.id)),format.raw/*25.85*/("""">
    <span class="fa fa-bars"></span> View as List
  </a>

    <hr class="hr" style="margin-top: 10px">

        <div style="display: none;">
          <form action=""""),_display_(/*32.26*/routes/*32.32*/.CalendarData.addByAjax(currentUser.id)),format.raw/*32.71*/("""" method="POST" id="eventFormNew">
            <input type="text" name="title" id="newTitle"/>
            <input type="text" name="description" id="newDescription"/>
            <input type="text" name="start" id="newStart"/>
            <input type="text" name="end" id="newEnd"/>
            <input type="text" name="allDay" id="newAllDay"/>
          </form>

          <br/>

          <form action=""""),_display_(/*42.26*/routes/*42.32*/.CalendarData.move()),format.raw/*42.52*/("""" method="POST" id="eventFormMove">
            <input type="text" name="id" id="moveId"/>
            <input type="text" name="dayDelta" id="moveDayDelta"/>
            <input type="text" name="minuteDelta" id="moveMinuteDelta"/>
            <input type="text" name="allDay" id="moveAllDay"/>
          </form>

          <form action=""""),_display_(/*49.26*/routes/*49.32*/.CalendarData.resize()),format.raw/*49.54*/("""" method="POST" id="eventFormResize">
            <input type="text" name="id" id="resizeId"/>
            <input type="text" name="dayDelta" id="resizeDayDelta"/>
            <input type="text" name="minuteDelta" id="resizeMinuteDelta"/>
          </form>

        </div>

        <div id='calendar'></div>
    </div>

</div>

<!--bootstrap-->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<!--sb-Admin-->
<script src=""""),_display_(/*65.15*/routes/*65.21*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*65.60*/(""""></script>
<script src=""""),_display_(/*66.15*/routes/*66.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*66.81*/(""""></script>

</body>
"""))}
  }

  def render(title:String,currentUser:Person,eventForm:Form[Event],events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser,eventForm,events)

  def f:((String) => (Person,Form[Event],List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser,eventForm,events) => apply(title)(currentUser,eventForm,events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:14 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/calendar.scala.html
                  HASH: da01d873e510476f049fc1d25547a47fba0c18ba
                  MATRIX: 757->1|971->81|1001->102|1029->136|1056->137|1091->147|1109->157|1146->174|1175->177|1246->222|1260->228|1343->290|1623->543|1638->549|1708->598|1786->649|1801->655|1887->720|1965->771|1980->777|2044->820|2122->871|2137->877|2207->926|2441->1134|2496->1168|2528->1173|2588->1206|2605->1214|2661->1249|2692->1253|2761->1295|2776->1301|2831->1335|3027->1504|3042->1510|3102->1549|3535->1955|3550->1961|3591->1981|3956->2319|3971->2325|4014->2347|4502->2808|4517->2814|4577->2853|4630->2879|4645->2885|4726->2945
                  LINES: 26->1|30->1|32->4|32->5|33->6|34->7|34->7|34->7|35->8|35->8|35->8|35->8|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|48->21|48->21|49->22|50->23|50->23|50->23|52->25|52->25|52->25|52->25|59->32|59->32|59->32|69->42|69->42|69->42|76->49|76->49|76->49|92->65|92->65|92->65|93->66|93->66|93->66
                  -- GENERATED --
              */
          