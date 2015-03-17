
package views.html.linkLoader

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
object calendarlinks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.3*/("""<!-- loading Full calendar stylesheet -->
  <link href=""""),_display_(/*2.16*/routes/*2.22*/.Assets.at("css/fullcalendar.css")),format.raw/*2.56*/("""" rel="stylesheet">
  <link href=""""),_display_(/*3.16*/routes/*3.22*/.Assets.at("css/fullcalendar.print.css")),format.raw/*3.62*/("""" rel="stylesheet" media='print'>
  <link href=""""),_display_(/*4.16*/routes/*4.22*/.Assets.at("css/basicCalendar.css")),format.raw/*4.57*/("""" rel="stylesheet">
  <link href=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("css/fullcalendar.min.css")),format.raw/*5.60*/("""" rel="stylesheet">


  <!-- jQuery -->
  <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
  <script src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*10.75*/(""""></script>
  <script src=""""),_display_(/*11.17*/routes/*11.23*/.Assets.at("javascripts/fullcalendar/fullcalendar.js")),format.raw/*11.77*/(""""></script>
  <script src=""""),_display_(/*12.17*/routes/*12.23*/.Assets.at("javascripts/fullcalendar/renderCal.js")),format.raw/*12.74*/(""""></script>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/linkLoader/calendarlinks.scala.html
                  HASH: 9c634ce6ddac5e7b2357ee531cdc0c3e3e9d2452
                  MATRIX: 817->2|900->59|914->65|968->99|1029->134|1043->140|1103->180|1178->229|1192->235|1247->270|1308->305|1322->311|1380->349|1549->491|1564->497|1637->549|1692->577|1707->583|1782->637|1837->665|1852->671|1924->722
                  LINES: 29->1|30->2|30->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12
                  -- GENERATED --
              */
          