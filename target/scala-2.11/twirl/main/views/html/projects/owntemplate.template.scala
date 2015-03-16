
package views.html.projects

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
object owntemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*2.1*/("""<div class="alert alert-info" role="alert">

<p><strong>Next step:</strong> upload your own template </p>
        """),_display_(/*5.10*/helper/*5.16*/.form(action = routes.DocumentData.uploadNewTemplate(p.id), 'enctype -> "multipart/form-data")/*5.110*/ {_display_(Seq[Any](format.raw/*5.112*/("""
          """),format.raw/*6.11*/("""<div class="form-inline">
            <div class="form-group">
              <input type="file" name="upload" id="js-upload-files" multiple>
            </div>
            <div class="form-group">
              <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">ok</button>
            </div>

          </div>
        """)))}),format.raw/*15.10*/("""

  """),format.raw/*17.3*/("""</div>"""))}
  }

  def render(p:Project): play.twirl.api.HtmlFormat.Appendable = apply(p)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (p) => apply(p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/projects/owntemplate.scala.html
                  HASH: 878dff1ccd9871256e6c3052eca862f4e0e8c66d
                  MATRIX: 739->1|839->13|866->14|1007->129|1021->135|1124->229|1164->231|1202->242|1577->586|1608->590
                  LINES: 26->1|29->1|30->2|33->5|33->5|33->5|33->5|34->6|43->15|45->17
                  -- GENERATED --
              */
          