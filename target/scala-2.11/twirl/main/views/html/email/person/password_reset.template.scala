
package views.html.email.person

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
object password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You can follow <a href=""""),_display_(/*6.27*/url),format.raw/*6.30*/("""">this link</a> to reset your password.
</p>
<p>
	Have a nice day,<br />
	<i>your Personal Assistant</i>
</p>
<p>
	PS: In case you did not request this, you can ignore this message.
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/person/password_reset.scala.html
                  HASH: 840c5e1322aaac6e649f919704204affcd822ceb
                  MATRIX: 766->1|911->58|938->59|970->66|994->70|1066->116|1089->119
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6
                  -- GENERATED --
              */
          