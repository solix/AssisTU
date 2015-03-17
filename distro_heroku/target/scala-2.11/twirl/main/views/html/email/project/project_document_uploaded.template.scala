
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
object project_document_uploaded extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String, project_name: String, document_name: String, name_uploader: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.127*/("""
"""),format.raw/*2.1*/("""Hello """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    I would like to inform you that """),_display_(/*6.38*/name_uploader),format.raw/*6.51*/(""" """),format.raw/*6.52*/("""has uploaded a new file called '"""),_display_(/*6.85*/document_name),format.raw/*6.98*/("""' to your project '"""),_display_(/*6.118*/project_name),format.raw/*6.130*/("""'.
</p>
<p>
    You can go have a look at it by going to <a href=""""),_display_(/*9.56*/url),format.raw/*9.59*/("""">this link</a>.
</p>
<p>
    Have a nice day,<br />
    <i>your Personal Assistant</i>
</p>"""))}
  }

  def render(url:String,token:String,name:String,email:String,project_name:String,document_name:String,name_uploader:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email,project_name,document_name,name_uploader)

  def f:((String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email,project_name,document_name,name_uploader) => apply(url,token,name,email,project_name,document_name,name_uploader)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/email/project/project_document_uploaded.scala.html
                  HASH: 16929f75008c5a80d65efcab28de7af643bf5f0a
                  MATRIX: 799->1|1013->126|1040->127|1072->134|1096->138|1179->195|1212->208|1240->209|1299->242|1332->255|1379->275|1412->287|1505->354|1528->357
                  LINES: 26->1|29->1|30->2|30->2|30->2|34->6|34->6|34->6|34->6|34->6|34->6|34->6|37->9|37->9
                  -- GENERATED --
              */
          