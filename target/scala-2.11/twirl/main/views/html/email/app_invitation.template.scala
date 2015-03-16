
package views.html.email

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
object app_invitation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(person_inviting: Person, project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""Hello there,
<br />
<br />
<p>
  You have been invited by """),_display_(/*6.29*/person_inviting/*6.44*/.name),format.raw/*6.49*/(""" """),format.raw/*6.50*/("""to join """),_display_(/*6.59*/project/*6.66*/.name),format.raw/*6.71*/(""".
</p>
<p>
  Before you can do this, please sign up at <a href="http://intense-stream-5056.herokuapp.com/">AssisTU</a>.
</p>
<p>
  Have a nice day,<br />
  <i>AssisTU</i>
</p>"""))}
  }

  def render(person_inviting:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(person_inviting,project)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (person_inviting,project) => apply(person_inviting,project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/app_invitation.scala.html
                  HASH: 39991d55cd0920eb69ff40eac66f2e1a6da12f73
                  MATRIX: 746->1|877->44|904->45|989->104|1012->119|1037->124|1065->125|1100->134|1115->141|1140->146
                  LINES: 26->1|29->1|30->2|34->6|34->6|34->6|34->6|34->6|34->6|34->6
                  -- GENERATED --
              */
          