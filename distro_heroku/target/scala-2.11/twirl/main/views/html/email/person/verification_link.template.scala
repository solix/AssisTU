
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
object verification_link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String, name_project: String, name_role: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.100*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Welcome to the AssisTU initiative! I have been assigned to be your Personal Assistant that will guide and assist you through
    the writing and reviewing of scientific papers, articles, dissertations, and all other types of paperwork.
</p>
<p>
    First off, I will need you to verify yourself for security purposes. You can do so by clicking <a href=""""),_display_(/*10.110*/url),format.raw/*10.113*/("""">this link</a>.
    Once verified, I will give you a tour around our environment so you can get started.
</p>
<p>
    Hope to see you soon,<br />
    <i>your Personal Assistant</i>
</p>
<p>
    PS: If you did not sign up with us, you can ignore this email.
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String,name_project:String,name_role:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email,name_project,name_role)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email,name_project,name_role) => apply(url,token,name,email,name_project,name_role)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/email/person/verification_link.scala.html
                  HASH: dd6ef8e31401e4c83635dc377f2653e1223537ef
                  MATRIX: 783->1|970->99|997->100|1029->107|1053->111|1459->489|1484->492
                  LINES: 26->1|29->1|30->2|30->2|30->2|38->10|38->10
                  -- GENERATED --
              */
          