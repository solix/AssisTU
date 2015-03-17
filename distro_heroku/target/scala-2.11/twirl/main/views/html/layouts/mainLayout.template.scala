
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

        """),_display_(/*8.10*/linkLoader/*8.20*/.headlinks(title)),format.raw/*8.37*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*9.50*/routes/*9.56*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*9.118*/("""'>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
        """),format.raw/*12.107*/("""
        """),format.raw/*13.101*/("""
    """),format.raw/*14.5*/("""<script src='"""),_display_(/*14.19*/routes/*14.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*14.74*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*15.19*/routes/*15.25*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*15.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*16.19*/routes/*16.25*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*16.68*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*17.19*/routes/*17.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*17.74*/("""' type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js" type="text/javascript"></script>

    </head>
    <body>

        <div id="wrapper">
            """),_display_(/*24.14*/dashboard("calendar", currentUser)),format.raw/*24.48*/("""
        """),format.raw/*25.9*/("""<div id="page-wrapper">
            """),_display_(/*26.14*/template/*26.22*/.headericon("fa fa-calendar fa-5x")),format.raw/*26.57*/("""
            """),_display_(/*27.14*/content),format.raw/*27.21*/("""
        """),format.raw/*28.9*/("""</div>
        </div>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin-->
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*33.68*/(""""></script>

        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*35.89*/(""""></script>

    </body>
"""))}
  }

  def render(title:String,currentUser:Person,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser)(content)

  def f:((String,Person) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser) => (content) => apply(title,currentUser)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/layouts/mainLayout.scala.html
                  HASH: 7fe3c6320afd2129dcf043e44c91f9390f851e25
                  MATRIX: 748->1|931->50|963->73|993->109|1024->114|1067->131|1085->141|1122->158|1153->163|1224->208|1238->214|1321->276|1599->623|1637->724|1669->729|1710->743|1725->749|1795->798|1875->851|1890->857|1976->922|2056->975|2071->981|2135->1024|2215->1077|2230->1083|2300->1132|2563->1368|2618->1402|2654->1411|2718->1448|2735->1456|2791->1491|2832->1505|2860->1512|2896->1521|3118->1716|3133->1722|3193->1761|3255->1796|3270->1802|3351->1862
                  LINES: 26->1|30->1|32->4|32->5|33->6|35->8|35->8|35->8|36->9|36->9|36->9|36->9|39->12|40->13|41->14|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|51->24|51->24|52->25|53->26|53->26|53->26|54->27|54->27|55->28|60->33|60->33|60->33|62->35|62->35|62->35
                  -- GENERATED --
              */
          