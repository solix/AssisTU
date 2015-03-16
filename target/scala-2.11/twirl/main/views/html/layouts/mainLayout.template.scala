
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
object mainLayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Person,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,currentUser:Person)(content :Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap

Seq[Any](format.raw/*1.51*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""
    """),format.raw/*6.5*/("""<head>
        """),_display_(/*7.10*/linkLoader/*7.20*/.headlinks(title)),format.raw/*7.37*/("""
    """),format.raw/*8.5*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*8.50*/routes/*8.56*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*8.118*/("""'>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
    <script src='"""),_display_(/*11.19*/routes/*11.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*11.74*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*12.19*/routes/*12.25*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*12.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*13.19*/routes/*13.25*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*13.68*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*14.19*/routes/*14.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*14.74*/("""' type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js" type="text/javascript"></script>

    </head>
    <body>

        <div id="wrapper">
            """),_display_(/*21.14*/dashboard("calendar", currentUser)),format.raw/*21.48*/("""
        """),format.raw/*22.9*/("""<div id="page-wrapper">
            """),_display_(/*23.14*/template/*23.22*/.headericon("fa fa-calendar fa-5x")),format.raw/*23.57*/("""
            """),_display_(/*24.14*/content),format.raw/*24.21*/("""
        """),format.raw/*25.9*/("""</div>
        </div>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin-->
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*30.68*/(""""></script>

        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*32.89*/(""""></script>

    </body>
"""))}
  }

  def render(title:String,currentUser:Person,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser)(content)

  def f:((String,Person) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser) => (content) => apply(title,currentUser)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/layouts/mainLayout.scala.html
                  HASH: 05918ff80a21020507eecd1f10a9070b0c0ba331
                  MATRIX: 748->1|931->50|963->73|993->109|1024->114|1066->130|1084->140|1121->157|1152->162|1223->207|1237->213|1320->275|1606->534|1621->540|1691->589|1771->642|1786->648|1872->713|1952->766|1967->772|2031->815|2111->868|2126->874|2196->923|2459->1159|2514->1193|2550->1202|2614->1239|2631->1247|2687->1282|2728->1296|2756->1303|2792->1312|3014->1507|3029->1513|3089->1552|3151->1587|3166->1593|3247->1653
                  LINES: 26->1|30->1|32->4|32->5|33->6|34->7|34->7|34->7|35->8|35->8|35->8|35->8|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|48->21|48->21|49->22|50->23|50->23|50->23|51->24|51->24|52->25|57->30|57->30|57->30|59->32|59->32|59->32
                  -- GENERATED --
              */
          