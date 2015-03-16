
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
object projectCreated extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:Person,p : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<h2>Hello """),_display_(/*3.12*/user/*3.16*/.name),format.raw/*3.21*/("""</h2>
  <p>You have successfully created a new project called """),_display_(/*4.58*/p/*4.59*/.name),format.raw/*4.64*/("""</p>
<p>what to do next:</p>
  <ul>
    <li>invite members and collaborates to the project</li>
    <li>read suggestions on how to begin an article</li>
    <li>make a complete planning using calendar</li>
    <li>Discuss a topic with fellow members</li>
    <li>Read the suggestion with handful of tips on how to write a scientific Article</li>
  </ul>


  Cheers,

  assistU Team
"""))}
  }

  def render(user:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(user,p)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (user,p) => apply(user,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/projectCreated.scala.html
                  HASH: 95ea591350f109856c4d637c0f6b6fa3e34f9a47
                  MATRIX: 746->1|859->26|887->28|924->39|936->43|961->48|1050->111|1059->112|1084->117
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|32->4|32->4|32->4
                  -- GENERATED --
              */
          