
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
object formEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Person,Long,Form[Event],Event,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,currentUser:Person)(id: Long, eventForm: Form[Event], event: Event):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitField/*5.15*/ = {{ FieldConstructor(fields.twoColumns.f) }};
Seq[Any](format.raw/*1.84*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.60*/("""

"""),_display_(/*7.2*/layouts/*7.9*/.mainLayout("Edit event: "+ event.title,currentUser)/*7.61*/{_display_(Seq[Any](format.raw/*7.62*/("""
"""),format.raw/*8.1*/("""<div class="container">

    <h3>Edit event: """),_display_(/*10.22*/event/*10.27*/.title),format.raw/*10.33*/(""" """),format.raw/*10.34*/("""</h3>

    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.CalendarData.update(id), 'id->"eventFormEdit")/*12.80*/ {_display_(Seq[Any](format.raw/*12.82*/("""

        """),_display_(/*14.10*/inputText(eventForm("title"), args =
            '_label -> "Title",
            'size ->18,
            'placeholder -> "event title",
            'class -> "required",
            'minlength -> "3"
        )),format.raw/*20.10*/("""

        """),_display_(/*22.10*/textarea(eventForm("description"), args =
            '_label -> "Description",
            'raws ->10,
            'placeholder -> "say what is it about",
            'class -> "required"
        )),format.raw/*27.10*/("""

        """),_display_(/*29.10*/checkbox(field = eventForm("allDay"), args =
            '_label -> "All day event?"
        )),format.raw/*31.10*/("""

        """),_display_(/*33.10*/inputText(eventForm("start"), args =
            '_label -> "Start date",
            '_help -> "",
            'size ->18,
            'placeholder -> "dd.mm.yyyy hh:mm",
            'placeholder -> "dd.mm.yyyy",
            'class -> "required"
        )),format.raw/*40.10*/("""

        """),_display_(/*42.10*/inputText(eventForm("end"), args =
            '_label -> "End date",
            '_help -> "",
            'size ->18,
            'placeholder -> "dd.mm.yyyy hh:mm"
        )),format.raw/*47.10*/("""

        """),format.raw/*49.9*/("""<div class="row" id="rowOf_submitbuttons">
            <div class="span8 offset2">
            <input type="submit" value="Save an event" class="btn primary"> or
            <a href=""""),_display_(/*52.23*/routes/*52.29*/.CalendarData.list(currentUser.id)),format.raw/*52.63*/("""" class="btn">Cancel</a>
            </div>
        </div>
        """)))}),format.raw/*55.10*/("""
"""),format.raw/*56.1*/("""</div>
""")))}),format.raw/*57.2*/("""

"""))}
  }

  def render(title:String,currentUser:Person,id:Long,eventForm:Form[Event],event:Event): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser)(id,eventForm,event)

  def f:((String,Person) => (Long,Form[Event],Event) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser) => (id,eventForm,event) => apply(title,currentUser)(id,eventForm,event)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/formEdit.scala.html
                  HASH: 2b2590a59302adf11981bb1c264ffbe2cdd5729f
                  MATRIX: 756->1|933->104|954->117|1029->83|1057->102|1085->162|1113->165|1127->172|1187->224|1225->225|1252->226|1325->272|1339->277|1366->283|1395->284|1433->296|1448->302|1525->370|1565->372|1603->383|1833->592|1871->603|2090->801|2128->812|2243->906|2281->917|2558->1173|2596->1184|2793->1360|2830->1370|3041->1554|3056->1560|3111->1594|3210->1662|3238->1663|3276->1671
                  LINES: 26->1|28->5|28->5|29->1|31->4|32->5|34->7|34->7|34->7|34->7|35->8|37->10|37->10|37->10|37->10|39->12|39->12|39->12|39->12|41->14|47->20|49->22|54->27|56->29|58->31|60->33|67->40|69->42|74->47|76->49|79->52|79->52|79->52|82->55|83->56|84->57
                  -- GENERATED --
              */
          