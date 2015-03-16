
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
object new_comment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Person,Person,Project,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reciever: Person, sender: Person, project: Project, comment: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/reciever/*2.16*/.name),format.raw/*2.21*/(""",
<br />
<br />
<p>
    I would like to inform you that """),_display_(/*6.38*/sender/*6.44*/.name),format.raw/*6.49*/(""" """),format.raw/*6.50*/("""has left a new message for you on the discussion page of your project """"),_display_(/*6.122*/project/*6.129*/.name),format.raw/*6.134*/("""".
</p>
<p>
    Here's what he has to say:
</p>
<p>
    """),_display_(/*12.6*/comment),format.raw/*12.13*/("""
"""),format.raw/*13.1*/("""</p>
<br>
"""),format.raw/*15.8*/("""
    """),format.raw/*16.121*/("""
"""),format.raw/*17.9*/("""
"""),format.raw/*18.1*/("""<p>
    Cheers,<br />
    <i>AssistU</i>
</p>"""))}
  }

  def render(reciever:Person,sender:Person,project:Project,comment:String): play.twirl.api.HtmlFormat.Appendable = apply(reciever,sender,project,comment)

  def f:((Person,Person,Project,String) => play.twirl.api.HtmlFormat.Appendable) = (reciever,sender,project,comment) => apply(reciever,sender,project,comment)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/discussion/new_comment.scala.html
                  HASH: 61308991acd82177de24c07ff8a4474bfd34c07c
                  MATRIX: 768->1|925->70|952->71|984->78|1000->86|1025->91|1108->148|1122->154|1147->159|1175->160|1274->232|1290->239|1316->244|1399->301|1427->308|1455->309|1492->326|1526->447|1554->456|1582->457
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|34->6|34->6|34->6|34->6|34->6|34->6|34->6|40->12|40->12|41->13|43->15|44->16|45->17|46->18
                  -- GENERATED --
              */
          