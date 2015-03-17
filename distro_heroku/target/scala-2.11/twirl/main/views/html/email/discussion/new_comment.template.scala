
package views.html.email.discussion

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
object new_comment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String, name_project: String, name_poster: String, comment: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.119*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    I would like to inform you that """),_display_(/*6.38*/name_poster),format.raw/*6.49*/(""" """),format.raw/*6.50*/("""has left a new message for you on the discussion page of your project """),_display_(/*6.121*/name_project),format.raw/*6.133*/(""".
</p>
<p>
    Here's what he has to say:
</p>
<p>
    """),_display_(/*12.6*/comment),format.raw/*12.13*/("""
"""),format.raw/*13.1*/("""</p>
<br>
<p>
    In case you would like to leave a reply on this, please follow <a href=""""),_display_(/*16.78*/url),format.raw/*16.81*/("""">this link</a> and see his message.
</p>
<p>
    Have a nice day,<br />
    <i>your Personal Assistant</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String,name_project:String,name_poster:String,comment:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email,name_project,name_poster,comment)

  def f:((String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email,name_project,name_poster,comment) => apply(url,token,name,email,name_project,name_poster,comment)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/email/discussion/new_comment.scala.html
                  HASH: f8dc65270e5a92bd15abdddf97e1e511fdffef8d
                  MATRIX: 788->1|994->118|1021->119|1053->126|1077->130|1160->187|1191->198|1219->199|1317->270|1350->282|1432->338|1460->345|1488->346|1606->437|1630->440
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6|34->6|34->6|34->6|40->12|40->12|41->13|44->16|44->16
                  -- GENERATED --
              */
          