
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
object testemail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*3.1*/("""<h2>Welcome Dear """),_display_(/*3.19*/user/*3.23*/.name),format.raw/*3.28*/("""</h2>

<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Culpa cumque ducimus et eveniet excepturi fugit iste, labore maxime nam odio odit, quod sunt temporibus! Deleniti iusto neque officiis porro repellat.</p>"""))}
  }

  def render(user:Person): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Person) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/email/testemail.scala.html
                  HASH: 0e6fbb9c2141b086340cb604c3afb772b945eec6
                  MATRIX: 733->1|834->14|862->16|906->34|918->38|943->43
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3
                  -- GENERATED --
              */
          