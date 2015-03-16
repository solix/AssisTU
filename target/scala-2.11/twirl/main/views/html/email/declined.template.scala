
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
object declined extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Person,Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : Person, joineduser : Person,p : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<br />
<br />
<h2>Hi """),_display_(/*4.9*/user/*4.13*/.name),format.raw/*4.18*/("""</h2>
<p>
  you have invited """),_display_(/*6.21*/joineduser/*6.31*/.name),format.raw/*6.36*/(""" """),format.raw/*6.37*/("""to join """),_display_(/*6.46*/p/*6.47*/.name),format.raw/*6.52*/(""" """),format.raw/*6.53*/("""project. However """),_display_(/*6.71*/joineduser/*6.81*/.name),format.raw/*6.86*/(""" """),format.raw/*6.87*/("""has declined the invitation.
</p>



Cheers,
assistU team"""))}
  }

  def render(user:Person,joineduser:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(user,joineduser,p)

  def f:((Person,Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (user,joineduser,p) => apply(user,joineduser,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/declined.scala.html
                  HASH: dc289c07cfa9e7d431e32b3a2f3dcb4613f41f75
                  MATRIX: 747->1|883->49|910->50|957->72|969->76|994->81|1050->111|1068->121|1093->126|1121->127|1156->136|1165->137|1190->142|1218->143|1262->161|1280->171|1305->176|1333->177
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6
                  -- GENERATED --
              */
          