
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
object project_joined extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Person,Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : Person, joineduser : Person,p : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<br />
<br />
<h2>Hi """),_display_(/*4.9*/user/*4.13*/.name),format.raw/*4.18*/("""</h2>
<p>
    I would like to inform you that """),_display_(/*6.38*/joineduser/*6.48*/.name),format.raw/*6.53*/(""" """),format.raw/*6.54*/("""has joined your project '"""),_display_(/*6.80*/p/*6.81*/.name),format.raw/*6.86*/("""' .
</p>
<p>
    If you would like to go and see your project, please go to <a href="#">this link</a>.
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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/email/project_joined.scala.html
                  HASH: 848e90d076cf59fe06ea0354cee1ea6fa2dd4b27
                  MATRIX: 753->1|889->49|916->50|963->72|975->76|1000->81|1073->128|1091->138|1116->143|1144->144|1196->170|1205->171|1230->176
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|34->6|34->6|34->6|34->6|34->6|34->6|34->6
                  -- GENERATED --
              */
          