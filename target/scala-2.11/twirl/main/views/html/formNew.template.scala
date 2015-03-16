
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
object formNew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Person,Form[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,currentUser:Person)(eventForm: Form[Event]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitField/*3.15*/ = {{ FieldConstructor(fields.twoColumns.f) }};
Seq[Any](format.raw/*1.60*/("""
"""),format.raw/*3.60*/("""

"""),_display_(/*5.2*/layouts/*5.9*/.mainLayout("Create new event",currentUser )/*5.53*/{_display_(Seq[Any](format.raw/*5.54*/("""
"""),format.raw/*6.1*/("""<div class="container">
    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.CalendarData.add, 'id->"eventFormNew")/*7.72*/ {_display_(Seq[Any](format.raw/*7.74*/("""

        """),_display_(/*9.10*/inputText(eventForm("title"), args =
            '_label -> "Title",
            'size ->18,
            'placeholder -> "But not too long...",
            'class -> "required",
            'minlength -> "3"
        )),format.raw/*15.10*/("""

        """),_display_(/*17.10*/checkbox(field = eventForm("allDay"), args =
            '_label -> "All day event?",
            'placeholder -> "dd.mm.yyyy hh:mm"
        )),format.raw/*20.10*/("""


        """),_display_(/*23.10*/inputText(eventForm("start"), args =
            '_label -> "Start date",
            '_help -> "",
            'size ->18,
            'placeholder -> "dd.mm.yyyy hh:mm",
            'class -> "required"
        )),format.raw/*29.10*/("""

        """),_display_(/*31.10*/inputText(eventForm("end"), args =
            '_label -> "End date",
            '_help -> "",
            'size ->18,
            'placeholder -> "dd.mm.yyyy hh:mm"
        )),format.raw/*36.10*/("""

    """),format.raw/*38.5*/("""<script type="text/javascript">
        jQuery(document).ready(function()"""),format.raw/*39.42*/("""{"""),format.raw/*39.43*/("""
            """),format.raw/*40.13*/("""$("#eventFormNew").validate();
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""");
    </script>

    <div class="row">
        <div class="span8 offset2">
        <input type="submit" value="Create an event" class="btn primary"> or
        <a href=""""),_display_(/*47.19*/routes/*47.25*/.CalendarData.list(currentUser.id)),format.raw/*47.59*/("""" class="btn">Cancel</a>
        </div>
    </div>

    """)))}),format.raw/*51.6*/("""
"""),format.raw/*52.1*/("""</div>
""")))}),format.raw/*53.2*/("""

"""))}
  }

  def render(title:String,currentUser:Person,eventForm:Form[Event]): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser)(eventForm)

  def f:((String,Person) => (Form[Event]) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser) => (eventForm) => apply(title,currentUser)(eventForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/formNew.scala.html
                  HASH: bd9c0cd24de0e43e73679b2da30ff1ed07fa41f7
                  MATRIX: 744->1|897->78|918->91|993->59|1021->136|1049->139|1063->146|1115->190|1153->191|1180->192|1234->221|1248->227|1316->287|1355->289|1392->300|1630->517|1668->528|1831->670|1870->682|2105->896|2143->907|2340->1083|2373->1089|2474->1162|2503->1163|2544->1176|2610->1215|2639->1216|2837->1387|2852->1393|2907->1427|2994->1484|3022->1485|3060->1493
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|33->6|34->7|34->7|34->7|34->7|36->9|42->15|44->17|47->20|50->23|56->29|58->31|63->36|65->38|66->39|66->39|67->40|68->41|68->41|74->47|74->47|74->47|78->51|79->52|80->53
                  -- GENERATED --
              */
          