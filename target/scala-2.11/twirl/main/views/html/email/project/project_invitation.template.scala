
package views.html.email.project

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
object project_invitation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String, name_project: String, name_role: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.100*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    You have been invited to join project '"""),_display_(/*6.45*/name_project),format.raw/*6.57*/("""' as """),_display_(/*6.63*/if(name_role.equals(Role.OWNER))/*6.95*/{_display_(Seq[Any](format.raw/*6.96*/("""an""")))}/*6.100*/else/*6.105*/{_display_(Seq[Any](format.raw/*6.106*/("""a""")))}),format.raw/*6.108*/(""" """),_display_(/*6.110*/name_role),format.raw/*6.119*/(""".
</p>
<p>
    You can choose to either accept or decline this invitation by going to <a href=""""),_display_(/*9.86*/url),format.raw/*9.89*/("""">this link</a>, and click on 'invitations'.
</p>
<p>
    Have a nice day,<br />
    <i>AssisTU</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String,name_project:String,name_role:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email,name_project,name_role)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email,name_project,name_role) => apply(url,token,name,email,name_project,name_role)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/email/project/project_invitation.scala.html
                  HASH: 1ef6f0aef5685ead33912cc67b36ce4d2c16adaf
                  MATRIX: 785->1|972->99|999->100|1031->107|1055->111|1145->175|1177->187|1209->193|1249->225|1287->226|1309->230|1322->235|1361->236|1394->238|1423->240|1453->249|1575->345|1598->348
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|34->6|37->9|37->9
                  -- GENERATED --
              */
          