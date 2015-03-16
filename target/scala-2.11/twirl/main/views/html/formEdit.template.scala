
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
implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(fields.twoColumns.f) }};
Seq[Any](format.raw/*1.84*/("""

"""),format.raw/*4.60*/("""

"""),_display_(/*6.2*/layouts/*6.9*/.mainLayout("Edit event: "+ event.title,currentUser)/*6.61*/{_display_(Seq[Any](format.raw/*6.62*/("""
"""),format.raw/*7.1*/("""<div class="container">

    <h3>Edit event: """),_display_(/*9.22*/event/*9.27*/.title),format.raw/*9.33*/(""" """),format.raw/*9.34*/("""</h3>

    """),_display_(/*11.6*/helper/*11.12*/.form(action = routes.CalendarData.update(id), 'id->"eventFormEdit")/*11.80*/ {_display_(Seq[Any](format.raw/*11.82*/("""

        """),_display_(/*13.10*/inputText(eventForm("title"), args =
            '_label -> "Title",
            'size ->18,
            'placeholder -> "event title",
            'class -> "required",
            'minlength -> "3"
        )),format.raw/*19.10*/("""

        """),_display_(/*21.10*/textarea(eventForm("description"), args =
            '_label -> "Description",
            'raws ->10,
            'placeholder -> "say what is it about",
            'class -> "required"
        )),format.raw/*26.10*/("""

        """),_display_(/*28.10*/checkbox(field = eventForm("allDay"), args =
            '_label -> "All day event?"
        )),format.raw/*30.10*/("""

        """),_display_(/*32.10*/inputText(eventForm("start"), args =
            '_label -> "Start date",
            '_help -> "",
            'size ->18,
            'placeholder -> "dd.mm.yyyy hh:mm",
            'placeholder -> "dd.mm.yyyy",
            'class -> "required"
        )),format.raw/*39.10*/("""

        """),_display_(/*41.10*/inputText(eventForm("end"), args =
            '_label -> "End date",
            '_help -> "",
            'size ->18,
            'placeholder -> "dd.mm.yyyy hh:mm"
        )),format.raw/*46.10*/("""

        """),format.raw/*48.9*/("""<div class="row" id="rowOf_submitbuttons">
            <div class="span8 offset2">
            <input type="submit" value="Save an event" class="btn primary"> or
            <a href=""""),_display_(/*51.23*/routes/*51.29*/.CalendarData.list(currentUser.id)),format.raw/*51.63*/("""" class="btn">Cancel</a>
            </div>
        </div>
        """)))}),format.raw/*54.10*/("""
"""),format.raw/*55.1*/("""</div>
""")))}),format.raw/*56.2*/("""

"""))}
  }

  def render(title:String,currentUser:Person,id:Long,eventForm:Form[Event],event:Event): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser)(id,eventForm,event)

  def f:((String,Person) => (Long,Form[Event],Event) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser) => (id,eventForm,event) => apply(title,currentUser)(id,eventForm,event)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/formEdit.scala.html
                  HASH: 0139d5b5b8c0311cd65457f172bd00ee9fd6db91
                  MATRIX: 756->1|933->103|954->116|1029->83|1058->161|1086->164|1100->171|1160->223|1198->224|1225->225|1297->271|1310->276|1336->282|1364->283|1402->295|1417->301|1494->369|1534->371|1572->382|1802->591|1840->602|2059->800|2097->811|2212->905|2250->916|2527->1172|2565->1183|2762->1359|2799->1369|3010->1553|3025->1559|3080->1593|3179->1661|3207->1662|3245->1670
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|33->6|34->7|36->9|36->9|36->9|36->9|38->11|38->11|38->11|38->11|40->13|46->19|48->21|53->26|55->28|57->30|59->32|66->39|68->41|73->46|75->48|78->51|78->51|78->51|81->54|82->55|83->56
                  -- GENERATED --
              */
          