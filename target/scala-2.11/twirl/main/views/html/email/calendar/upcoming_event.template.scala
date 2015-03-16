
package views.html.email.calendar

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
object upcoming_event extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String, name_project: String, name_event: String, date_event: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.121*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    I would like to inform you that you planned to start writing '"""),_display_(/*6.68*/name_event),format.raw/*6.78*/("""' of your project '"""),_display_(/*6.98*/name_project),format.raw/*6.110*/("""'
    on """),_display_(/*7.9*/date_event),format.raw/*7.19*/(""".
</p>
<p>
    If you would like to go and see your planning for this project, or maybe would like to adjust is, please head over to <a href=""""),_display_(/*10.133*/url),format.raw/*10.136*/("""">this link</a>.
</p>
<p>
    Have a nice day,<br />
    <i>your Personal Assistant</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String,name_project:String,name_event:String,date_event:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email,name_project,name_event,date_event)

  def f:((String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email,name_project,name_event,date_event) => apply(url,token,name,email,name_project,name_event,date_event)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/calendar/upcoming_event.scala.html
                  HASH: 0fdc5c5d7eafc1068b2fae0b171f14b86312002c
                  MATRIX: 789->1|997->120|1024->121|1056->128|1080->132|1193->219|1223->229|1269->249|1302->261|1337->271|1367->281|1538->424|1563->427
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6|34->6|34->6|35->7|35->7|38->10|38->10
                  -- GENERATED --
              */
          