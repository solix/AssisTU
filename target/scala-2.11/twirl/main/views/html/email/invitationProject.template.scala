
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
object invitationProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Person,Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(invitee:Person,host:Person,p : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<h2>Hello """),_display_(/*3.12*/invitee/*3.19*/.name),format.raw/*3.24*/("""</h2>
<p>host.name has invited you to join the Project </p>
<p>Project details:</p>
<ul>
  <li>Project title: """),_display_(/*7.23*/p/*7.24*/.name),format.raw/*7.29*/("""</li>
  <li>Project description: """),_display_(/*8.29*/p/*8.30*/.description),format.raw/*8.42*/("""</li>
</ul>

please click<a href="""),_display_(/*11.22*/routes/*11.28*/.Application.project()),format.raw/*11.50*/("""> here  </a>to go to the link.

Cheers,

assistU Team"""))}
  }

  def render(invitee:Person,host:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(invitee,host,p)

  def f:((Person,Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (invitee,host,p) => apply(invitee,host,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/invitationProject.scala.html
                  HASH: 8e49cfcd3c4b07a467c9cd2bcf6453494029e0ba
                  MATRIX: 756->1|884->41|912->43|949->54|964->61|989->66|1126->177|1135->178|1160->183|1220->217|1229->218|1261->230|1322->264|1337->270|1380->292
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11
                  -- GENERATED --
              */
          