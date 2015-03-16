
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
object project_joined_2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(joineduser : Person,p : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.1*/("""<br />
<br />
<h2>Hi """),_display_(/*4.9*/joineduser/*4.19*/.name),format.raw/*4.24*/("""</h2>
<p>
  you have successfully joined '"""),_display_(/*6.34*/p/*6.35*/.name),format.raw/*6.40*/("""'.
</p>
<p>
  If you would like to go and see your project, please go to <a href="""),_display_(/*9.71*/routes/*9.77*/.ProjectData.project(p.id)),format.raw/*9.103*/("""> this link</a>.
</p>


Cheers,
assistU team"""))}
  }

  def render(joineduser:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(joineduser,p)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (joineduser,p) => apply(joineduser,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/project_joined_2.scala.html
                  HASH: 2e49009fc266b9e7c20720d50eaef871d76eb92d
                  MATRIX: 748->1|869->34|896->35|943->57|961->67|986->72|1055->115|1064->116|1089->121|1197->203|1211->209|1258->235
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|34->6|34->6|34->6|37->9|37->9|37->9
                  -- GENERATED --
              */
          