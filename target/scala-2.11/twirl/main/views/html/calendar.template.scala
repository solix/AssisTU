
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
  """),format.raw/*3.1*/("""  """),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<head>
  """),_display_(/*6.4*/linkLoader/*6.14*/.headlinks(title)),format.raw/*6.31*/("""
  """),format.raw/*7.3*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*7.48*/routes/*7.54*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*7.116*/("""'>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
  <script src='"""),_display_(/*10.17*/routes/*10.23*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*10.72*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*11.17*/routes/*11.23*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*11.88*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*12.17*/routes/*12.23*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*12.66*/("""' type="text/javascript"></script>
  <script src='"""),_display_(/*13.17*/routes/*13.23*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*13.72*/("""' type="text/javascript"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js" type="text/javascript"></script>
</head>
<body>

<div id="wrapper" >

  """),_display_(/*20.4*/dashboard("calendar", currentUser)),format.raw/*20.38*/("""
    """),format.raw/*21.5*/("""<div id="page-wrapper">
        """),_display_(/*22.10*/template/*22.18*/.headericon("fa fa-calendar fa-5x")),format.raw/*22.53*/("""

  """),format.raw/*24.3*/("""<a  class="btn btn-default btn=sm" href=""""),_display_(/*24.45*/routes/*24.51*/.CalendarData.list(currentUser.id)),format.raw/*24.85*/("""">
    <span class="fa fa-bars"></span> View as List
  </a>

    <hr class="hr" style="margin-top: 10px">

        <div style="display: none;">
          <form action=""""),_display_(/*31.26*/routes/*31.32*/.CalendarData.addByAjax(currentUser.id)),format.raw/*31.71*/("""" method="POST" id="eventFormNew">
            <input type="text" name="title" id="newTitle"/>
            <input type="text" name="description" id="newDescription"/>
            <input type="text" name="start_date" id="newStart"/>
            <input type="text" name="end_date" id="newEnd"/>
            <input type="text" name="allDay" id="newAllDay"/>
          </form>

          <br/>

          <form action=""""),_display_(/*41.26*/routes/*41.32*/.CalendarData.move()),format.raw/*41.52*/("""" method="POST" id="eventFormMove">
            <input type="text" name="id" id="moveId"/>
            <input type="text" name="dayDelta" id="moveDayDelta"/>
            <input type="text" name="minuteDelta" id="moveMinuteDelta"/>
            <input type="text" name="allDay" id="moveAllDay"/>
          </form>

          <form action=""""),_display_(/*48.26*/routes/*48.32*/.CalendarData.resize()),format.raw/*48.54*/("""" method="POST" id="eventFormResize">
            <input type="text" name="id" id="resizeId"/>
            <input type="text" name="dayDelta" id="resizeDayDelta"/>
            <input type="text" name="minuteDelta" id="resizeMinuteDelta"/>
          </form>

        </div>

        <div  id='calendar'></div>
    </div>

</div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!--sb-Admin-->
<script src=""""),_display_(/*64.15*/routes/*64.21*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*64.60*/(""""></script>
<script src=""""),_display_(/*65.15*/routes/*65.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*65.81*/(""""></script>

</body>
"""))}
  }

  def render(title:String,currentUser:Person,eventForm:Form[Event],events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser,eventForm,events)

  def f:((String) => (Person,Form[Event],List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser,eventForm,events) => apply(title)(currentUser,eventForm,events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/calendar.scala.html
                  HASH: 9f5061e42973711281e07d234094b3ece0d95bce
                  MATRIX: 757->1|971->81|1000->101|1028->135|1055->136|1090->146|1108->156|1145->173|1174->176|1245->221|1259->227|1342->289|1622->542|1637->548|1707->597|1785->648|1800->654|1886->719|1964->770|1979->776|2043->819|2121->870|2136->876|2206->925|2441->1134|2496->1168|2528->1173|2588->1206|2605->1214|2661->1249|2692->1253|2761->1295|2776->1301|2831->1335|3027->1504|3042->1510|3102->1549|3545->1965|3560->1971|3601->1991|3966->2329|3981->2335|4024->2357|4505->2811|4520->2817|4580->2856|4633->2882|4648->2888|4729->2948
                  LINES: 26->1|30->1|31->3|31->4|32->5|33->6|33->6|33->6|34->7|34->7|34->7|34->7|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|47->20|47->20|48->21|49->22|49->22|49->22|51->24|51->24|51->24|51->24|58->31|58->31|58->31|68->41|68->41|68->41|75->48|75->48|75->48|91->64|91->64|91->64|92->65|92->65|92->65
                  -- GENERATED --
              */
          