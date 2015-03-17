
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


    """),format.raw/*39.5*/("""<script type="text/javascript">
        jQuery(document).ready(function()"""),format.raw/*40.42*/("""{"""),format.raw/*40.43*/("""
            """),format.raw/*41.13*/("""$("#eventFormNew").validate();
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""");
    </script>

    <div class="row">
        <div class="span8 offset2">
        <input type="submit" value="Create an event" class="btn primary"> or
        <a href=""""),_display_(/*48.19*/routes/*48.25*/.CalendarData.list(currentUser.id)),format.raw/*48.59*/("""" class="btn">Cancel</a>
        </div>
    </div>

    """)))}),format.raw/*52.6*/("""
"""),format.raw/*53.1*/("""</div>
""")))}),format.raw/*54.2*/("""

"""))}
  }

  def render(title:String,currentUser:Person,eventForm:Form[Event]): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser)(eventForm)

  def f:((String,Person) => (Form[Event]) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser) => (eventForm) => apply(title,currentUser)(eventForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/formNew.scala.html
                  HASH: 6e3ab73fa333dd217b1b80a6f17bdfa0f7bf23e5
                  MATRIX: 744->1|897->78|918->91|993->59|1021->136|1049->139|1063->146|1115->190|1153->191|1180->192|1234->221|1248->227|1316->287|1355->289|1392->300|1630->517|1668->528|1831->670|1870->682|2105->896|2143->907|2340->1083|2374->1090|2475->1163|2504->1164|2545->1177|2611->1216|2640->1217|2838->1388|2853->1394|2908->1428|2995->1485|3023->1486|3061->1494
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|33->6|34->7|34->7|34->7|34->7|36->9|42->15|44->17|47->20|50->23|56->29|58->31|63->36|66->39|67->40|67->40|68->41|69->42|69->42|75->48|75->48|75->48|79->52|80->53|81->54
                  -- GENERATED --
              */
          