
package views.html.email.task

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
object task_due_soon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String, name_task: String, duedate: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.95*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    I would like to inform you that your task '"""),_display_(/*6.49*/name_task),format.raw/*6.58*/("""' is due on """),_display_(/*6.71*/duedate),format.raw/*6.78*/(""".
</p>
<p>
    If you have already completed the task, or want to cancel it, you can do so by following <a href=""""),_display_(/*9.104*/url),format.raw/*9.107*/("""">this link</a>.
</p>
<p>
    Have a nice day,<br />
    <i>your Personal Assistant</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String,name_task:String,duedate:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email,name_task,duedate)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email,name_task,duedate) => apply(url,token,name,email,name_task,duedate)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/email/task/task_due_soon.scala.html
                  HASH: c8409535d1ac0295b99611cdb638ec0df18e0d11
                  MATRIX: 777->1|958->94|985->95|1017->102|1041->106|1135->174|1164->183|1203->196|1230->203|1371->317|1395->320
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6|34->6|34->6|37->9|37->9
                  -- GENERATED --
              */
          